package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.Node;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import java.lang.reflect.Method;
import com.google.javascript.rhino.JSDocInfo;
import java.util.HashMap;
import com.google.javascript.rhino.ErrorReporter;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.ArrayList;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.testing.EmptyScope;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.testing.TestErrorReporter;
import java.util.HashSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_rhino_jstype_FunctionTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): True}
 *  */
    @Test
    public void testEquals_NotThatIsFunctionType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        boolean actual = functionType.equals(noObjectType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): True}
 *  */
    @Test
    public void testEquals_ReturnFalse() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): True}
 * @utbot.executesCondition {@code (that.isConstructor()): True}
 * @utbot.returnsFrom {@code return this == that;}
 *  */
    @Test
    public void testEquals_EqualsThat() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.equals(functionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): True}
 * @utbot.executesCondition {@code (that.isConstructor()): True}
 * @utbot.returnsFrom {@code return this == that;}
 *  */
    @Test
    public void testEquals_NotEqualsThat() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): True}
 *  */
    @Test
    public void testEquals_ThatIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.equals(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): True}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 *  */
    @Test
    public void testEquals_NotThatIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): True}
 * @utbot.executesCondition {@code (that.isConstructor()): False}
 *  */
    @Test
    public void testEquals_NotThatIsConstructor() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_ThisTypeOfThisEqualsAndThisCallEquals() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        Object initialFunctionType1Kind = getFieldValue(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.equals(functionType1);
        
        assertFalse(actual);
        
        Object finalFunctionType1Kind = getFieldValue(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionType1Kind == finalFunctionType1Kind);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_ThisTypeOfThisEqualsAndThisCallEquals_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        BooleanType returnType1 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Object initialFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.equals(functionType1);
        
        assertFalse(actual);
        
        Object finalFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionTypeKind == finalFunctionTypeKind);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_ThisTypeOfThisEqualsAndThisCallEquals_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        EnumType jsType1 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!(otherType instanceof FunctionType)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.FunctionType#isFunctionType()} once
    /// execute conditions:
    ///     {@code (!that.isFunctionType()): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()} once
    /// execute conditions:
    ///     {@code (this.isConstructor()): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()} once
    /// execute conditions:
    ///     {@code (this.isInterface()): False},
    ///     {@code (that.isInterface()): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.ObjectType#equals(java.lang.Object)} once,
    ///     {@link com.google.javascript.rhino.jstype.ArrowType#equals(java.lang.Object)} once
    /// return from: {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (this.call.equals(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_NotThisCallEquals() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Object initialFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.equals(functionType1);
        
        assertFalse(actual);
        
        Object finalFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionTypeKind == finalFunctionTypeKind);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (this.call.equals(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_NotThisCallEquals_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NullType returnType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (this.call.equals(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_NotThisCallEquals_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Object initialFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.equals(functionType1);
        
        assertFalse(actual);
        
        Object finalFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionTypeKind == finalFunctionTypeKind);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (this.call.equals(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_NotThisCallEquals_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Object initialFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
        
        Object finalFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionTypeKind == finalFunctionTypeKind);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (this.call.equals(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_NotThisCallEquals_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", typeOfThis);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (this.call.equals(that.call)): True}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_ThisCallEquals() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", jsType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", jsType);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (this.call.equals(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.equals(that.typeOfThis) && this.call.equals(that.call);}
 *  */
    @Test
    public void testEquals_NotThisCallEquals_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        RecordType typeOfThis = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        RecordType typeOfThis = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        RecordType typeOfThis1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        boolean actual = functionType.equals(functionType1);
        
        assertFalse(actual);
        
        ObjectType functionTypeTypeOfThis = ((ObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis"));
        Map finalFunctionTypeTypeOfThisProperties = ((Map) getFieldValue(functionTypeTypeOfThis, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        
        assertNull(finalFunctionTypeTypeOfThisProperties);
    }
    
    @Test
    public void testEquals4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ErrorFunctionType typeOfThis = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType typeOfThis2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        NoObjectType typeOfThis3 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        
        ObjectType functionTypeTypeOfThis = ((ObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis"));
        Object initialFunctionTypeTypeOfThisKind = getFieldValue(functionTypeTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.equals(errorFunctionType);
        
        assertFalse(actual);
        
        ObjectType functionTypeTypeOfThis1 = ((ObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis"));
        Object finalFunctionTypeTypeOfThisKind = getFieldValue(functionTypeTypeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionTypeTypeOfThisKind == finalFunctionTypeTypeOfThisKind);
    }
    
    @Test
    public void testEquals5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType typeOfThis = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        String className = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType typeOfThis1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        boolean actual = functionType.equals(errorFunctionType);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        
        boolean actual = functionType.equals(functionType1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoObjectType typeOfThis2 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        ErrorFunctionType jsType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoObjectType typeOfThis2 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        boolean actual = functionType.equals(anonymousFunctionType);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType typeOfThis = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        String className = "";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        FunctionType typeOfThis1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        String className1 = "";
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.equals] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:629) */
        functionType.equals(anonymousFunctionType);
    }
    
    @Test
    public void testEquals11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.equals] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:628)
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:628)
            com.google.javascript.rhino.jstype.ArrowType.equals(ArrowType.java:155)
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:629) */
        functionType.equals(errorFunctionType);
    }
    
    @Test
    public void testEquals12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ErrorFunctionType jsType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType typeOfThis2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.equals] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:628)
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:628)
            com.google.javascript.rhino.jstype.ArrowType.equals(ArrowType.java:173)
            com.google.javascript.rhino.jstype.FunctionType.equals(FunctionType.java:629) */
        functionType.equals(anonymousFunctionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.executesCondition {@code (registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return "Function";}
 *  */
    @Test
    public void testToString_RegistryGetNativeType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toString();
        
        String expected = "Function";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 16));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: this == registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:649) */
        functionType.toString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this == registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:649) */
        functionType.toString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.executesCondition {@code (registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)): False}
 * @utbot.executesCondition {@code ((call == null || call.parameters == null)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean hasKnownTypeOfThis = !typeOfThis.isUnknownType();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:657) */
        functionType.toString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.executesCondition {@code (registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)): False}
 * @utbot.executesCondition {@code ((call == null || call.parameters == null)): True}
 * @utbot.executesCondition {@code ((call == null || call.parameters == null)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean hasKnownTypeOfThis = !typeOfThis.isUnknownType();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:657) */
        functionType.toString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.executesCondition {@code (registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)): False}
 * @utbot.executesCondition {@code ((call == null || call.parameters == null)): True}
 * @utbot.executesCondition {@code ((call == null || call.parameters == null)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean hasKnownTypeOfThis = !typeOfThis.isUnknownType();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:657) */
        functionType.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnknownType typeOfThis = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toString();
        
        String expected = "function ()";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
    }
    
    @Test
    public void testToString2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        UnknownType typeOfThis = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[0] = ((JSType) noType);
        nativeTypes[1] = ((JSType) noType);
        nativeTypes[2] = ((JSType) noType);
        nativeTypes[3] = ((JSType) noType);
        nativeTypes[4] = ((JSType) noType);
        nativeTypes[5] = ((JSType) noType);
        nativeTypes[6] = ((JSType) noType);
        nativeTypes[7] = ((JSType) noType);
        nativeTypes[8] = ((JSType) noType);
        nativeTypes[9] = ((JSType) noType);
        nativeTypes[10] = ((JSType) noType);
        nativeTypes[11] = ((JSType) noType);
        nativeTypes[12] = ((JSType) noType);
        nativeTypes[14] = ((JSType) noType);
        nativeTypes[15] = ((JSType) noType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toString();
        
        String expected = "function ()";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 13));
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
    }
    
    @Test
    public void testToString3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        UnknownType typeOfThis = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toString();
        
        String expected = "function ()";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
    }
    
    @Test
    public void testToString4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toString();
        
        String expected = "function ()";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        UnknownType typeOfThis = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:670) */
        functionType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnIsInterface_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        int actual = functionType.hashCode();
        
        assertEquals(115009226, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnIsInterface_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        int actual = functionType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnIsInterface_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        int actual = functionType.hashCode();
        
        assertEquals(938436390, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnIsInterface_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        int actual = functionType.hashCode();
        
        assertEquals(1501337902, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: call.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:634) */
        functionType.hashCode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(1723936707, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", parameters);
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(jsType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(1318264545, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        NoObjectType returnType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(1232652194, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test(expected = StackOverflowError.class)
    public void testHashCode5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        functionType.hashCode();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method hashCode()
    
    @Test(timeout = 1000L)
    public void testHashCode6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        functionType.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isInterface
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInterface()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.returnsFrom {@code return kind == Kind.INTERFACE;}
 *  */
    @Test
    public void testIsInterface_KindEqualsKindINTERFACE() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isInterface();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.returnsFrom {@code return kind == Kind.INTERFACE;}
 *  */
    @Test
    public void testIsInterface_KindNotEqualsKindINTERFACE() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isInterface();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReturnType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getReturnType()}
 * @utbot.executesCondition {@code (call == null): True}
 * @utbot.returnsFrom {@code return call == null ? null : call.returnType;}
 *  */
    @Test
    public void testGetReturnType_CallEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        JSType actual = functionType.getReturnType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getReturnType()}
 * @utbot.executesCondition {@code (call == null): False}
 * @utbot.returnsFrom {@code return call == null ? null : call.returnType;}
 *  */
    @Test
    public void testGetReturnType_CallNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        JSType actual = functionType.getReturnType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.returnsFrom {@code return kind == Kind.CONSTRUCTOR;}
 *  */
    @Test
    public void testIsConstructor_KindEqualsKindCONSTRUCTOR() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isConstructor();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.returnsFrom {@code return kind == Kind.CONSTRUCTOR;}
 *  */
    @Test
    public void testIsConstructor_KindNotEqualsKindCONSTRUCTOR() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isConstructor();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParameters()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParameters()}
 * @utbot.executesCondition {@code (n != null): False}
 * @utbot.invokes {@link java.util.Collections#emptySet()}
 * @utbot.returnsFrom {@code return Collections.emptySet();}
 *  */
    @Test
    public void testGetParameters_NEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Set actual = ((Set) functionType.getParameters());
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParameters()}
 * @utbot.executesCondition {@code (n != null): True}
 * @utbot.returnsFrom {@code return n.children();}
 *  */
    @Test
    public void testGetParameters_NNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Set actual = ((Set) functionType.getParameters());
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParameters()}
 * @utbot.executesCondition {@code (n != null): True}
 * @utbot.returnsFrom {@code return n.children();}
 *  */
    @Test
    public void testGetParameters_NNotEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Object actual = functionType.getParameters();
        
        Object expected = createInstance("com.google.javascript.rhino.Node$SiblingNodeIterable");
        setField(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start", parameters);
        setField(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "current", parameters);
        
        Node expectedStart = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start"));
        Node actualStart = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start"));
        String actualStartFunctionName = (((FunctionNode) actualStart)).getFunctionName();
        assertNull(actualStartFunctionName);
        
        boolean actualStartItsNeedsActivation = ((Boolean) getFieldValue(actualStart, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualStartItsNeedsActivation);
        
        int expectedStartItsFunctionType = ((Integer) getFieldValue(expectedStart, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualStartItsFunctionType = ((Integer) getFieldValue(actualStart, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(expectedStartItsFunctionType, actualStartItsFunctionType);
        
        boolean actualStartItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualStart, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualStartItsIgnoreDynamicScope);
        
        int expectedStartEncodedSourceStart = (((ScriptOrFnNode) expectedStart)).getEncodedSourceStart();
        int actualStartEncodedSourceStart = (((ScriptOrFnNode) actualStart)).getEncodedSourceStart();
        assertEquals(expectedStartEncodedSourceStart, actualStartEncodedSourceStart);
        
        int expectedStartEncodedSourceEnd = (((ScriptOrFnNode) expectedStart)).getEncodedSourceEnd();
        int actualStartEncodedSourceEnd = (((ScriptOrFnNode) actualStart)).getEncodedSourceEnd();
        assertEquals(expectedStartEncodedSourceEnd, actualStartEncodedSourceEnd);
        
        String actualStartSourceName = (((ScriptOrFnNode) actualStart)).getSourceName();
        assertNull(actualStartSourceName);
        
        int expectedStartBaseLineno = (((ScriptOrFnNode) expectedStart)).getBaseLineno();
        int actualStartBaseLineno = (((ScriptOrFnNode) actualStart)).getBaseLineno();
        assertEquals(expectedStartBaseLineno, actualStartBaseLineno);
        
        int expectedStartEndLineno = (((ScriptOrFnNode) expectedStart)).getEndLineno();
        int actualStartEndLineno = (((ScriptOrFnNode) actualStart)).getEndLineno();
        assertEquals(expectedStartEndLineno, actualStartEndLineno);
        
        ObjArray actualStartFunctions = ((ObjArray) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualStartFunctions);
        
        ObjArray actualStartRegexps = ((ObjArray) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualStartRegexps);
        
        ObjArray actualStartItsVariables = ((ObjArray) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualStartItsVariables);
        
        ObjArray actualStartItsConst = ((ObjArray) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualStartItsConst);
        
        ObjToIntMap actualStartItsVariableNames = ((ObjToIntMap) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualStartItsVariableNames);
        
        int expectedStartVarStart = ((Integer) getFieldValue(expectedStart, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualStartVarStart = ((Integer) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(expectedStartVarStart, actualStartVarStart);
        
        Object actualStartCompilerData = (((ScriptOrFnNode) actualStart)).getCompilerData();
        assertNull(actualStartCompilerData);
        
        int expectedStartType = expectedStart.getType();
        int actualStartType = actualStart.getType();
        assertEquals(expectedStartType, actualStartType);
        
        Node actualStartNext = actualStart.getNext();
        assertNull(actualStartNext);
        
        Node expectedStartFirst = ((Node) getFieldValue(expectedStart, "com.google.javascript.rhino.Node", "first"));
        Node actualStartFirst = ((Node) getFieldValue(actualStart, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        Node actualStartFirstLast = ((Node) getFieldValue(actualStartFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualStartFirstLast);
        
        Object actualStartFirstPropListHead = getFieldValue(actualStartFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualStartFirstPropListHead);
        
        int expectedStartFirstSourcePosition = ((Integer) getFieldValue(expectedStartFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualStartFirstSourcePosition = ((Integer) getFieldValue(actualStartFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedStartFirstSourcePosition, actualStartFirstSourcePosition);
        
        JSType actualStartFirstJsType = ((JSType) getFieldValue(actualStartFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualStartFirstJsType);
        
        Node actualStartFirstParent = actualStartFirst.getParent();
        assertNull(actualStartFirstParent);
        
        assertTrue(deepEquals(expectedStart, actualStart));
        assertTrue(deepEquals(expectedStart, actualStart));
        assertTrue(deepEquals(expectedStart, actualStart));
        assertTrue(deepEquals(expectedStart, actualStart));
        assertTrue(deepEquals(expectedStart, actualStart));
        
        Node expectedCurrent = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "current"));
        Node actualCurrent = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node$SiblingNodeIterable", "current"));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        
        boolean actualUsed = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.Node$SiblingNodeIterable", "used"));
        assertFalse(actualUsed);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object leastSupertypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class leastSupertypeVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", leastSupertypeVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = leastSupertypeVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        UnknownType target = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        NamedType target = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return visitor.caseFunctionType(this);
 *  */
    @Test
    public void testVisit_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object greatestSupertypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
        NoObjectType this$0 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(this$0, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(greatestSupertypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", this$0);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.visit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor.caseFunctionType(NoObjectType.java:167)
            com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor.caseFunctionType(NoObjectType.java:146)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:746) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class greatestSupertypeVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", greatestSupertypeVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = greatestSupertypeVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return visitor.caseFunctionType(this);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.visit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:746) */
        functionType.visit(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return visitor.caseFunctionType(this);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(SemanticReverseAbstractInterpreter.java:512)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseObjectType(SemanticReverseAbstractInterpreter.java:498)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:508)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:472)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:746) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    @Test
    public void testVisit1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        NamedType target = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    @Test
    public void testVisit2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType9 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType9);
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    @Test(expected = StackOverflowError.class)
    public void testVisit3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        NamedType target = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        NamedType target = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType6 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit6() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType4 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType6 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSource
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSource()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSource()}
 * @utbot.returnsFrom {@code return source;}
 *  */
    @Test
    public void testGetSource_ReturnSource() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Node actual = functionType.getSource();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasProperty(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return super.hasProperty(name) || "prototype".equals(name);}
 *  */
    @Test
    public void testHasProperty_PrototypeObjectTypeHasProperty() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType$Property");
        properties.put(null, property);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        boolean actual = functionType.hasProperty(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasProperty(java.lang.String)
    
    @Test
    public void testHasProperty1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = functionType.hasProperty(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasProperty2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        LinkedHashMap properties1 = new LinkedHashMap();
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        functionType.setImplicitPrototype(implicitPrototype);
        String string = "";
        
        boolean actual = functionType.hasProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasProperty(java.lang.String)
    
    @Test
    public void testHasProperty3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        properties.put(null, null);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        functionType.setImplicitPrototype(implicitPrototype);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasProperty(PrototypeObjectType.java:133)
            com.google.javascript.rhino.jstype.FunctionType.hasProperty(FunctionType.java:409)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasProperty(PrototypeObjectType.java:138)
            com.google.javascript.rhino.jstype.FunctionType.hasProperty(FunctionType.java:409) */
        functionType.hasProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setSource
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSource(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setSource(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSetSource() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.setSource(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getMaxArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxArguments()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testGetMaxArguments_ReturnIntegerMAX_VALUE() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testGetMaxArguments_ReturnIntegerMAX_VALUE_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testGetMaxArguments_ReturnIntegerMAX_VALUE_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return params.getChildCount();}
 *  */
    @Test
    public void testGetMaxArguments_ReturnParamsGetChildCount() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return params.getChildCount();}
 *  */
    @Test
    public void testGetMaxArguments_ReturnParamsGetChildCount_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "last", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return params.getChildCount();}
 *  */
    @Test
    public void testGetMaxArguments_ReturnParamsGetChildCount_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return params.getChildCount();}
 *  */
    @Test
    public void testGetMaxArguments_ReturnParamsGetChildCount_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): True}
 *  */
    @Test
    public void testSetPrototype_PrototypeEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.setPrototype(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 *  */
    @Test
    public void testSetPrototype_ReturnFalse() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType typeOfThis = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.setPrototype(typeOfThis);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        RecordType implicitPrototype = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionPrototypeType implicitPrototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        EnumType implicitPrototype = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isFunctionType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFunctionType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isFunctionType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsFunctionType_ReturnTrue() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isFunctionType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getMinArguments
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMinArguments()
    
    @Test
    public void testGetMinArguments1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        int actual = functionType.getMinArguments();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetMinArguments2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMinArguments();
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGetMinArguments3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMinArguments();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetMinArguments4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMinArguments();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isOrdinaryFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOrdinaryFunction()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isOrdinaryFunction()}
 * @utbot.returnsFrom {@code return kind == Kind.ORDINARY;}
 *  */
    @Test
    public void testIsOrdinaryFunction_KindEqualsKindORDINARY() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isOrdinaryFunction();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isOrdinaryFunction()}
 * @utbot.returnsFrom {@code return kind == Kind.ORDINARY;}
 *  */
    @Test
    public void testIsOrdinaryFunction_KindNotEqualsKindORDINARY() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isOrdinaryFunction();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getParametersNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParametersNode()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 * @utbot.executesCondition {@code (call == null): True}
 * @utbot.returnsFrom {@code return call == null ? null : call.parameters;}
 *  */
    @Test
    public void testGetParametersNode_CallEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Node actual = functionType.getParametersNode();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 * @utbot.executesCondition {@code (call == null): False}
 * @utbot.returnsFrom {@code return call == null ? null : call.parameters;}
 *  */
    @Test
    public void testGetParametersNode_CallNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Node actual = functionType.getParametersNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isInstanceType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInstanceType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isInstanceType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return equals(registry.getNativeType(U2U_CONSTRUCTOR_TYPE));
 *  */
    @Test
    public void testIsInstanceType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isInstanceType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.FunctionType.isInstanceType(FunctionType.java:227) */
        functionType.isInstanceType();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isInstanceType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return equals(registry.getNativeType(U2U_CONSTRUCTOR_TYPE));
 *  */
    @Test
    public void testIsInstanceType_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isInstanceType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isInstanceType(FunctionType.java:227) */
        functionType.isInstanceType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.canBeCalled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBeCalled()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#canBeCalled()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCanBeCalled_ReturnTrue() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.canBeCalled();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrototype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return prototype;}
 *  */
    @Test
    public void testGetPrototype_PrototypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        FunctionPrototypeType actual = functionType.getPrototype();
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.executesCondition {@code (prototype == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.returnsFrom {@code return prototype;}
 *  */
    @Test
    public void testGetPrototype_PrototypeEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionPrototypeType actual = functionType.getPrototype();
        
        FunctionPrototypeType expected = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(expected, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionType expectedOwnerFunction = expected.getOwnerFunction();
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(expectedOwnerFunction, actualOwnerFunction);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualRegistryNamesToTypes);
        
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualRegistryNamespaces);
        
        Set actualRegistryEnumTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualRegistryEnumTypeNames);
        
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualRegistryForwardDeclaredTypes);
        
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualRegistryTypesIndexedByProperty);
        
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualRegistryGreatestSubtypeByProperty);
        
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualRegistryInterfaceToImplementors);
        
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualRegistryUnresolvedNamedTypes);
        
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualRegistryResolvedNamedTypes);
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualRegistryLastGeneration);
        
        String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualRegistryTemplateTypeName);
        
        TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualRegistryTemplateType);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPrototype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setPrototype(new FunctionPrototypeType(registry, this, null));
 *  */
    @Test
    public void testGetPrototype_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312) */
        functionType.getPrototype();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetPrototype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312) */
        functionType.getPrototype();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPrototype()
    
    @Test
    public void testGetPrototype1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionPrototypeType actual = functionType.getPrototype();
        
        FunctionPrototypeType expected = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(expected, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionType expectedOwnerFunction = expected.getOwnerFunction();
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(expectedOwnerFunction, actualOwnerFunction);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualRegistryNamesToTypes);
        
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualRegistryNamespaces);
        
        Set actualRegistryEnumTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualRegistryEnumTypeNames);
        
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualRegistryForwardDeclaredTypes);
        
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualRegistryTypesIndexedByProperty);
        
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualRegistryGreatestSubtypeByProperty);
        
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualRegistryInterfaceToImplementors);
        
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualRegistryUnresolvedNamedTypes);
        
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualRegistryResolvedNamedTypes);
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualRegistryLastGeneration);
        
        String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualRegistryTemplateTypeName);
        
        TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualRegistryTemplateType);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    
    @Test
    public void testGetPrototype2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionPrototypeType actual = functionType.getPrototype();
        
        FunctionPrototypeType expected = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(expected, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionType expectedOwnerFunction = expected.getOwnerFunction();
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(expectedOwnerFunction, actualOwnerFunction);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualRegistryNamesToTypes);
        
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualRegistryNamespaces);
        
        Set actualRegistryEnumTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualRegistryEnumTypeNames);
        
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualRegistryForwardDeclaredTypes);
        
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualRegistryTypesIndexedByProperty);
        
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualRegistryGreatestSubtypeByProperty);
        
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualRegistryInterfaceToImplementors);
        
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualRegistryUnresolvedNamedTypes);
        
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualRegistryResolvedNamedTypes);
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualRegistryLastGeneration);
        
        String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualRegistryTemplateTypeName);
        
        TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualRegistryTemplateType);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    
    @Test
    public void testGetPrototype3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[19] = ((JSType) errorFunctionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionPrototypeType actual = functionType.getPrototype();
        
        FunctionPrototypeType expected = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(expected, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        expected.setImplicitPrototype(errorFunctionType);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionType expectedOwnerFunction = expected.getOwnerFunction();
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(expectedOwnerFunction, actualOwnerFunction);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        ObjectType expectedImplicitPrototype = expected.getImplicitPrototype();
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        ArrowType actualImplicitPrototypeCall = ((ArrowType) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualImplicitPrototypeCall);
        
        FunctionPrototypeType actualImplicitPrototypePrototype = (((FunctionType) actualImplicitPrototype)).getPrototype();
        assertNull(actualImplicitPrototypePrototype);
        
        Object actualImplicitPrototypeKind = getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualImplicitPrototypeKind);
        
        ObjectType actualImplicitPrototypeTypeOfThis = (((FunctionType) actualImplicitPrototype)).getTypeOfThis();
        assertNull(actualImplicitPrototypeTypeOfThis);
        
        Node actualImplicitPrototypeSource = (((FunctionType) actualImplicitPrototype)).getSource();
        assertNull(actualImplicitPrototypeSource);
        
        List actualImplicitPrototypeImplementedInterfaces = ((List) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplicitPrototypeImplementedInterfaces);
        
        List actualImplicitPrototypeSubTypes = (((FunctionType) actualImplicitPrototype)).getSubTypes();
        assertNull(actualImplicitPrototypeSubTypes);
        
        String actualImplicitPrototypeTemplateTypeName = (((FunctionType) actualImplicitPrototype)).getTemplateTypeName();
        assertNull(actualImplicitPrototypeTemplateTypeName);
        
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        Map actualImplicitPrototypeProperties = ((Map) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualImplicitPrototypeProperties);
        
        ObjectType actualImplicitPrototypeImplicitPrototype = (((PrototypeObjectType) actualImplicitPrototype)).getImplicitPrototype();
        assertNull(actualImplicitPrototypeImplicitPrototype);
        
        boolean actualImplicitPrototypeNativeType = ((Boolean) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualImplicitPrototypeNativeType);
        
        boolean actualImplicitPrototypeVisited = ((Boolean) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualImplicitPrototypeVisited);
        
        JSDocInfo actualImplicitPrototypeDocInfo = ((JSDocInfo) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualImplicitPrototypeDocInfo);
        
        boolean actualImplicitPrototypeUnknown = ((Boolean) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualImplicitPrototypeUnknown);
        
        boolean actualImplicitPrototypeResolved = ((Boolean) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualImplicitPrototypeResolved);
        
        JSType actualImplicitPrototypeResolveResult = ((JSType) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualImplicitPrototypeResolveResult);
        
        JSTypeRegistry actualImplicitPrototypeRegistry = actualImplicitPrototype.registry;
        assertNull(actualImplicitPrototypeRegistry);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualUnknown);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualRegistryNamesToTypes);
        
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualRegistryNamespaces);
        
        Set actualRegistryEnumTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualRegistryEnumTypeNames);
        
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualRegistryForwardDeclaredTypes);
        
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualRegistryTypesIndexedByProperty);
        
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualRegistryGreatestSubtypeByProperty);
        
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualRegistryInterfaceToImplementors);
        
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualRegistryUnresolvedNamedTypes);
        
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualRegistryResolvedNamedTypes);
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualRegistryLastGeneration);
        
        String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualRegistryTemplateTypeName);
        
        TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualRegistryTemplateType);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    
    @Test
    public void testGetPrototype4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[19] = ((JSType) noType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionPrototypeType actual = functionType.getPrototype();
        
        FunctionPrototypeType expected = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(expected, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        expected.setImplicitPrototype(noType);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionType expectedOwnerFunction = expected.getOwnerFunction();
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(expectedOwnerFunction, actualOwnerFunction);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        ObjectType expectedImplicitPrototype = expected.getImplicitPrototype();
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        Visitor actualImplicitPrototypeLeastSupertypeVisitor = ((Visitor) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualImplicitPrototypeLeastSupertypeVisitor);
        
        Visitor actualImplicitPrototypeGreatestSubtypeVisitor = ((Visitor) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualImplicitPrototypeGreatestSubtypeVisitor);
        
        ArrowType actualImplicitPrototypeCall = ((ArrowType) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualImplicitPrototypeCall);
        
        FunctionPrototypeType actualImplicitPrototypePrototype = (((FunctionType) actualImplicitPrototype)).getPrototype();
        assertNull(actualImplicitPrototypePrototype);
        
        Object actualImplicitPrototypeKind = getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualImplicitPrototypeKind);
        
        ObjectType actualImplicitPrototypeTypeOfThis = (((FunctionType) actualImplicitPrototype)).getTypeOfThis();
        assertNull(actualImplicitPrototypeTypeOfThis);
        
        Node actualImplicitPrototypeSource = (((FunctionType) actualImplicitPrototype)).getSource();
        assertNull(actualImplicitPrototypeSource);
        
        List actualImplicitPrototypeImplementedInterfaces = ((List) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplicitPrototypeImplementedInterfaces);
        
        List actualImplicitPrototypeSubTypes = (((FunctionType) actualImplicitPrototype)).getSubTypes();
        assertNull(actualImplicitPrototypeSubTypes);
        
        String actualImplicitPrototypeTemplateTypeName = (((FunctionType) actualImplicitPrototype)).getTemplateTypeName();
        assertNull(actualImplicitPrototypeTemplateTypeName);
        
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        Map actualImplicitPrototypeProperties = ((Map) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualImplicitPrototypeProperties);
        
        ObjectType actualImplicitPrototypeImplicitPrototype = (((PrototypeObjectType) actualImplicitPrototype)).getImplicitPrototype();
        assertNull(actualImplicitPrototypeImplicitPrototype);
        
        boolean actualImplicitPrototypeNativeType = ((Boolean) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualImplicitPrototypeNativeType);
        
        boolean actualImplicitPrototypeVisited = ((Boolean) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualImplicitPrototypeVisited);
        
        JSDocInfo actualImplicitPrototypeDocInfo = ((JSDocInfo) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualImplicitPrototypeDocInfo);
        
        boolean actualImplicitPrototypeUnknown = ((Boolean) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualImplicitPrototypeUnknown);
        
        boolean actualImplicitPrototypeResolved = ((Boolean) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualImplicitPrototypeResolved);
        
        JSType actualImplicitPrototypeResolveResult = ((JSType) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualImplicitPrototypeResolveResult);
        
        JSTypeRegistry actualImplicitPrototypeRegistry = actualImplicitPrototype.registry;
        assertNull(actualImplicitPrototypeRegistry);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualUnknown);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualRegistryNamesToTypes);
        
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualRegistryNamespaces);
        
        Set actualRegistryEnumTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualRegistryEnumTypeNames);
        
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualRegistryForwardDeclaredTypes);
        
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualRegistryTypesIndexedByProperty);
        
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualRegistryGreatestSubtypeByProperty);
        
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualRegistryInterfaceToImplementors);
        
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualRegistryUnresolvedNamedTypes);
        
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualRegistryResolvedNamedTypes);
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualRegistryLastGeneration);
        
        String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualRegistryTemplateTypeName);
        
        TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualRegistryTemplateType);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasInstanceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasInstanceType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.returnsFrom {@code return isConstructor() || isInterface();}
 *  */
    @Test
    public void testHasInstanceType_IsConstructorOrIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasInstanceType();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.returnsFrom {@code return isConstructor() || isInterface();}
 *  */
    @Test
    public void testHasInstanceType_IsConstructorOrIsInterface_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasInstanceType();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.returnsFrom {@code return isConstructor() || isInterface();}
 *  */
    @Test
    public void testHasInstanceType_IsConstructorOrIsInterface_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.hasInstanceType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.addSubType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addSubType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addSubType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (subTypes == null): True}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList()}
 *  */
    @Test
    public void testAddSubType_SubTypesEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method addSubTypeMethod = functionTypeClazz.getDeclaredMethod("addSubType", functionTypeClazz);
        addSubTypeMethod.setAccessible(true);
        java.lang.Object[] addSubTypeMethodArguments = new java.lang.Object[1];
        addSubTypeMethodArguments[0] = ((Object) null);
        addSubTypeMethod.invoke(functionType, addSubTypeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addSubType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (subTypes == null): False}
 *  */
    @Test
    public void testAddSubType_SubTypesNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList subTypes = new ArrayList();
        subTypes.add(null);
        subTypes.add(null);
        subTypes.add(null);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method addSubTypeMethod = functionTypeClazz.getDeclaredMethod("addSubType", functionTypeClazz);
        addSubTypeMethod.setAccessible(true);
        java.lang.Object[] addSubTypeMethodArguments = new java.lang.Object[1];
        addSubTypeMethodArguments[0] = ((Object) null);
        addSubTypeMethod.invoke(functionType, addSubTypeMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getPropertyType
    
    ///region OTHER: ERROR SUITE for method getPropertyType(java.lang.String)
    
    @Test
    public void testGetPropertyType1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        properties.put(null, null);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:202)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:462) */
        functionType.getPropertyType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return super.getLeastSupertype(that);}
 *  */
    @Test
    public void testGetLeastSupertype_PrototypeObjectTypeGetLeastSupertype() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        FunctionType actual = ((FunctionType) functionType.getLeastSupertype(noType));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testGetLeastSupertype_Return() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = ((FunctionType) functionType.getLeastSupertype(functionType));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testGetLeastSupertype_Return_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Object initialFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        FunctionType actual = ((FunctionType) functionType.getLeastSupertype(functionType1));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
        
        Object finalFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionTypeKind == finalFunctionTypeKind);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isFunctionType() && that.isFunctionType()
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:503) */
        functionType.getLeastSupertype(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionInstance.equals(that)
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:510) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:508) */
        functionType.getLeastSupertype(functionType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getInstanceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstanceType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.returnsFrom {@code return typeOfThis;}
 *  */
    @Test
    public void testGetInstanceType_ReturnTypeOfThis() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        ObjectType actual = functionType.getInstanceType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.returnsFrom {@code return typeOfThis;}
 *  */
    @Test
    public void testGetInstanceType_ReturnTypeOfThis_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        ObjectType actual = functionType.getInstanceType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstanceType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(hasInstanceType());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetInstanceType_ThrowIllegalStateException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.getInstanceType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setInstanceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInstanceType(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setInstanceType(com.google.javascript.rhino.jstype.ObjectType)}
 *  */
    @Test
    public void testSetInstanceType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.setInstanceType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeOfThis()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return typeOfThis.isNoObjectType() ? registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) : typeOfThis;}
 *  */
    @Test
    public void testGetTypeOfThis_JSTypeRegistryGetNativeObjectType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[26];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        ObjectType actual = functionType.getTypeOfThis();
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry25 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry25RegistryNativeTypes, 25));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
        
        assertNull(finalFunctionTypeRegistryNativeTypes25);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.returnsFrom {@code return typeOfThis.isNoObjectType() ? registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) : typeOfThis;}
 *  */
    @Test
    public void testGetTypeOfThis_ReturnTypeOfThisIsNoObjectType_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        FunctionType actual = ((FunctionType) functionType.getTypeOfThis());
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(typeOfThis, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.returnsFrom {@code return typeOfThis.isNoObjectType() ? registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) : typeOfThis;}
 *  */
    @Test
    public void testGetTypeOfThis_ReturnTypeOfThisIsNoObjectType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        NoType actual = ((NoType) functionType.getTypeOfThis());
        
        Visitor actualLeastSupertypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualLeastSupertypeVisitor);
        
        Visitor actualGreatestSubtypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualGreatestSubtypeVisitor);
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypeOfThis()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)
 *  */
    @Test
    public void testGetTypeOfThis_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[19] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:776) */
        functionType.getTypeOfThis();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)
 *  */
    @Test
    public void testGetTypeOfThis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:776) */
        functionType.getTypeOfThis();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeOfThis.isNoObjectType()
 *  */
    @Test
    public void testGetTypeOfThis_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:775) */
        functionType.getTypeOfThis();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)
 *  */
    @Test
    public void testGetTypeOfThis_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:776) */
        functionType.getTypeOfThis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#equals(java.lang.Object)}
 *  */
    @Test
    public void testGetGreatestSubtype_FunctionTypeEquals() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = ((FunctionType) functionType.getGreatestSubtype(functionType));
        
        // com.google.javascript.rhino.jstype.FunctionType has overridden equals method
        assertEquals(functionType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return super.getGreatestSubtype(that);}
 *  */
    @Test
    public void testGetGreatestSubtype_ReturnSuperGetGreatestSubtype() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        NoType actual = ((NoType) functionType.getGreatestSubtype(noType));
        
        Visitor actualLeastSupertypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualLeastSupertypeVisitor);
        
        Visitor actualGreatestSubtypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualGreatestSubtypeVisitor);
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return super.getGreatestSubtype(that);}
 *  */
    @Test
    public void testGetGreatestSubtype_ReturnSuperGetGreatestSubtype_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        EnumType implicitPrototype = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        NoType actual = ((NoType) functionType.getGreatestSubtype(noType));
        
        Visitor actualLeastSupertypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualLeastSupertypeVisitor);
        
        Visitor actualGreatestSubtypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualGreatestSubtypeVisitor);
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return super.getGreatestSubtype(that);}
 *  */
    @Test
    public void testGetGreatestSubtype_ReturnSuperGetGreatestSubtype_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        NoType actual = ((NoType) functionType.getGreatestSubtype(noType));
        
        Visitor actualLeastSupertypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualLeastSupertypeVisitor);
        
        Visitor actualGreatestSubtypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualGreatestSubtypeVisitor);
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return super.getGreatestSubtype(that);}
 *  */
    @Test
    public void testGetGreatestSubtype_ReturnSuperGetGreatestSubtype_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        NoType actual = ((NoType) functionType.getGreatestSubtype(noType));
        
        Visitor actualLeastSupertypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualLeastSupertypeVisitor);
        
        Visitor actualGreatestSubtypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualGreatestSubtypeVisitor);
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:529) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isFunctionType() && that.isFunctionType()
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:524) */
        functionType.getGreatestSubtype(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:529) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionInstance.equals(that)
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:531) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:529) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:529) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:529) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:529) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:529) */
        functionType.getGreatestSubtype(functionType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_21() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NullType returnType1 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_16() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_22() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_24() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        RecordType returnType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        BooleanType returnType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NamedType returnType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_14() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_15() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_13() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_23() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_17() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_18() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_19() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        BooleanType jsType1 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "next", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        NoType jsType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.equals(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallEquals_20() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.call.equals(otherType.call);
 *  */
    @Test
    public void testHasEqualCallType_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:638) */
        functionType.hasEqualCallType(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.call.equals(otherType.call);
 *  */
    @Test
    public void testHasEqualCallType_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:638) */
        functionType.hasEqualCallType(functionType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.equals(that)): True}
 *  */
    @Test
    public void testIsSubtype_ThisEquals() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(functionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.equals(that)): False}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): True}
 *  */
    @Test
    public void testIsSubtype_FunctionTypethatIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.equals(that)): False}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): False}
 * @utbot.executesCondition {@code (this.isInterface()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSubtype_ThisIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.equals(that)): False}
 * @utbot.executesCondition {@code (that.isFunctionType()): False}
 * @utbot.executesCondition {@code (that instanceof UnionType): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return getNativeType(JSTypeNative.FUNCTION_PROTOTYPE).isSubtype(that);}
 *  */
    @Test
    public void testIsSubtype_NotThatNotInstanceOfUnionType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[15];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[14] = ((JSType) noType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        boolean actual = functionType.isSubtype(noObjectType);
        
        assertTrue(actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.equals(that)): True}
 *  */
    @Test
    public void testIsSubtype_ThisEquals_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.equals(that)): True}
 *  */
    @Test
    public void testIsSubtype_ThisEquals_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.equals(that)): True}
 *  */
    @Test
    public void testIsSubtype_ThisEquals_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Object kind2 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind2);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Object initialFunctionType1Kind = getFieldValue(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertTrue(actual);
        
        Object finalFunctionType1Kind = getFieldValue(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionType1Kind == finalFunctionType1Kind);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (this.equals(that)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()} once
    /// execute conditions:
    ///     {@code (that.isFunctionType()): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()} once
    /// execute conditions:
    ///     {@code (((FunctionType) that).isInterface()): False},
    ///     {@code (this.isInterface()): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()} once,
    ///     {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)} once
    /// return from: {@code return (this.isConstructor() || other.isConstructor() || other.typeOfThis.isSubtype(this.typeOfThis) || this.typeOfThis.isSubtype(other.typeOfThis)) && this.call.isSubtype(other.call);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.call.isSubtype(other.call)): False}
 * @utbot.returnsFrom {@code return (this.isConstructor() || other.isConstructor() || other.typeOfThis.isSubtype(this.typeOfThis) || this.typeOfThis.isSubtype(other.typeOfThis)) && this.call.isSubtype(other.call);}
 *  */
    @Test
    public void testIsSubtype_NotThisCallIsSubtype() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.call.isSubtype(other.call)): True}
 * @utbot.returnsFrom {@code return (this.isConstructor() || other.isConstructor() || other.typeOfThis.isSubtype(this.typeOfThis) || this.typeOfThis.isSubtype(other.typeOfThis)) && this.call.isSubtype(other.call);}
 *  */
    @Test
    public void testIsSubtype_ThisCallIsSubtype_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.call.isSubtype(other.call)): True}
 * @utbot.returnsFrom {@code return (this.isConstructor() || other.isConstructor() || other.typeOfThis.isSubtype(this.typeOfThis) || this.typeOfThis.isSubtype(other.typeOfThis)) && this.call.isSubtype(other.call);}
 *  */
    @Test
    public void testIsSubtype_ThisCallIsSubtype() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.call.isSubtype(other.call)): True}
 * @utbot.returnsFrom {@code return (this.isConstructor() || other.isConstructor() || other.typeOfThis.isSubtype(this.typeOfThis) || this.typeOfThis.isSubtype(other.typeOfThis)) && this.call.isSubtype(other.call);}
 *  */
    @Test
    public void testIsSubtype_ThisCallIsSubtype_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NumberType returnType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.call.isSubtype(other.call)): True}
 * @utbot.returnsFrom {@code return (this.isConstructor() || other.isConstructor() || other.typeOfThis.isSubtype(this.typeOfThis) || this.typeOfThis.isSubtype(other.typeOfThis)) && this.call.isSubtype(other.call);}
 *  */
    @Test
    public void testIsSubtype_ThisCallIsSubtype_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(functionType1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that.isFunctionType()): False}
 * @utbot.executesCondition {@code (that instanceof UnionType): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(JSTypeNative.FUNCTION_PROTOTYPE).isSubtype(that);
 *  */
    @Test
    public void testIsSubtype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:114)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:741) */
        functionType.isSubtype(noObjectType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: that.isFunctionType()
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:711) */
        functionType.isSubtype(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that.isFunctionType()): False}
 * @utbot.executesCondition {@code (that instanceof UnionType): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNativeType(JSTypeNative.FUNCTION_PROTOTYPE).isSubtype(that);
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[15];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:741) */
        functionType.isSubtype(noObjectType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.call.isSubtype(other.call)
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:731) */
        functionType.isSubtype(functionType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: call = (ArrowType) safeResolve(call, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        FunctionType resolveResult = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.FunctionType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.FunctionType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:824) */
        functionType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#safeResolve(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: prototype = (FunctionPrototypeType) safeResolve(prototype, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        FunctionType resolveResult = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.FunctionType cannot be cast to class com.google.javascript.rhino.jstype.FunctionPrototypeType (com.google.javascript.rhino.jstype.FunctionType and com.google.javascript.rhino.jstype.FunctionPrototypeType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:825) */
        functionType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: call = (ArrowType) safeResolve(call, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[35] = ((JSType) noType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NoType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.NoType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:824) */
        functionType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: call = (ArrowType) safeResolve(call, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:856)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:824) */
        functionType.resolveInternal(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testResolveInternal1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:856)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:235)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:824) */
        functionType.resolveInternal(null, scope);
    }
    
    @Test
    public void testResolveInternal2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:856)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:825) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = functionTypeClazz.getDeclaredMethod("resolveInternal", errorReporterType, linkedFlowScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = ((Object) null);
        resolveInternalMethodArguments[1] = linkedFlowScope;
        try {
            resolveInternalMethod.invoke(functionType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        InstanceObjectType jsType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        EmptyScope emptyScope = new EmptyScope();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:856)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:239)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:824) */
        functionType.resolveInternal(null, emptyScope);
    }
    
    @Test
    public void testResolveInternal4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolveResult", call);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Object oldRhinoNullReporter = createInstance("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter");
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:463)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:825) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class oldRhinoNullReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = functionTypeClazz.getDeclaredMethod("resolveInternal", oldRhinoNullReporterType, linkedFlowScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = oldRhinoNullReporter;
        resolveInternalMethodArguments[1] = linkedFlowScope;
        try {
            resolveInternalMethod.invoke(functionType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        ErrorFunctionType implicitPrototype = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:461)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:825) */
        functionType.resolveInternal(null, null);
    }
    
    @Test
    public void testResolveInternal6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NamedType implicitPrototype = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.resolveViaRegistry(NamedType.java:210)
            com.google.javascript.rhino.jstype.NamedType.resolveInternal(NamedType.java:185)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:461)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:825) */
        functionType.resolveInternal(null, null);
    }
    
    @Test
    public void testResolveInternal7() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        ArrowType resolveResult = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = functionTypeClazz.getDeclaredMethod("resolveInternal", errorReporterType, linkedFlowScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = ((Object) null);
        resolveInternalMethodArguments[1] = linkedFlowScope;
        try {
            resolveInternalMethod.invoke(functionType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal8() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:463)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:825) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = functionTypeClazz.getDeclaredMethod("resolveInternal", errorReporterType, linkedFlowScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = ((Object) null);
        resolveInternalMethodArguments[1] = linkedFlowScope;
        try {
            resolveInternalMethod.invoke(functionType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:239)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:824) */
        functionType.resolveInternal(simpleErrorReporter, null);
    }
    
    @Test
    public void testResolveInternal10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        EmptyScope emptyScope = new EmptyScope();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        functionType.resolveInternal(simpleErrorReporter, emptyScope);
    }
    
    @Test
    public void testResolveInternal11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        functionType.resolveInternal(null, null);
    }
    
    @Test
    public void testResolveInternal12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        EmptyScope emptyScope = new EmptyScope();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        functionType.resolveInternal(simpleErrorReporter, emptyScope);
    }
    
    @Test
    public void testResolveInternal13() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        Object concreteScope = createInstance("com.google.javascript.jscomp.TightenTypes$ConcreteScope");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.resolveInternal(ProxyObjectType.java:292)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:861)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:892)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:826) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class simpleErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class concreteScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = functionTypeClazz.getDeclaredMethod("resolveInternal", simpleErrorReporterType, concreteScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = simpleErrorReporter;
        resolveInternalMethodArguments[1] = concreteScope;
        try {
            resolveInternalMethod.invoke(functionType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal14() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        functionType.resolveInternal(null, null);
    }
    
    @Test
    public void testResolveInternal15() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        BooleanType returnType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        StringType resolveResult = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TestErrorReporter testErrorReporter = new TestErrorReporter(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        functionType.resolveInternal(testErrorReporter, null);
    }
    
    @Test
    public void testResolveInternal16() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        UnknownType typeOfThis = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        TestErrorReporter testErrorReporter = new TestErrorReporter(null, null);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        functionType.resolveInternal(testErrorReporter, scope);
    }
    
    @Test
    public void testResolveInternal17() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        ParameterizedType resolveResult = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TestErrorReporter testErrorReporter = new TestErrorReporter(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        functionType.resolveInternal(testErrorReporter, null);
    }
    
    @Test
    public void testResolveInternal18() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TestErrorReporter testErrorReporter = new TestErrorReporter(null, null);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:831) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class testErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = functionTypeClazz.getDeclaredMethod("resolveInternal", testErrorReporterType, linkedFlowScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = testErrorReporter;
        resolveInternalMethodArguments[1] = linkedFlowScope;
        try {
            resolveInternalMethod.invoke(functionType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSubTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubTypes()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSubTypes()}
 * @utbot.returnsFrom {@code return subTypes;}
 *  */
    @Test
    public void testGetSubTypes_ReturnSubTypes() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        List actual = functionType.getSubTypes();
        
        assertNull(actual);
        
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        
        assertNull(finalFunctionTypeSubTypes);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasCachedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasCachedValues()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasCachedValues()}
 * @utbot.returnsFrom {@code return prototype != null || super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_PrototypeNotEqualsNullOrSuperHasCachedValues() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        boolean actual = functionType.hasCachedValues();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasCachedValues()}
 * @utbot.returnsFrom {@code return prototype != null || super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_PrototypeNotEqualsNullOrSuperHasCachedValues_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.hasCachedValues();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasCachedValues()}
 * @utbot.returnsFrom {@code return prototype != null || super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_PrototypeEqualsNullOrSuperHasCachedValues() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasCachedValues();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendVarArgsString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#appendVarArgsString(java.lang.StringBuilder,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (paramType.isUnionType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeType(JSTypeNative.VOID_TYPE)
 *  */
    @Test
    public void testAppendVarArgsString_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:696) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, unionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = unionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#appendVarArgsString(java.lang.StringBuilder,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (paramType.isUnionType()): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.append("...[").append(paramType.toString()).append("]");
 *  */
    @Test
    public void testAppendVarArgsString_ThrowNullPointerException_2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:698) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, functionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = functionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#appendVarArgsString(java.lang.StringBuilder,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnionType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: paramType.isUnionType()
 *  */
    @Test
    public void testAppendVarArgsString_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:693) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, jSTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = ((Object) null);
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#appendVarArgsString(java.lang.StringBuilder,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (paramType.isUnionType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(JSTypeNative.VOID_TYPE)
 *  */
    @Test
    public void testAppendVarArgsString_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnionType unionType = new UnionType(null, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:696) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, unionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = unionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendVarArgsString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testAppendVarArgsString1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        StringType stringType = new StringType(null);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class stringTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, stringTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = stringBuilder;
        appendVarArgsStringMethodArguments[1] = stringType;
        appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendVarArgsString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testAppendVarArgsString2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[0] = ((JSType) noType);
        nativeTypes[1] = ((JSType) noType);
        nativeTypes[2] = ((JSType) noType);
        nativeTypes[3] = ((JSType) noType);
        nativeTypes[4] = ((JSType) noType);
        nativeTypes[5] = ((JSType) noType);
        nativeTypes[6] = ((JSType) noType);
        nativeTypes[7] = ((JSType) noType);
        nativeTypes[8] = ((JSType) noType);
        nativeTypes[9] = ((JSType) noType);
        nativeTypes[10] = ((JSType) noType);
        nativeTypes[11] = ((JSType) noType);
        nativeTypes[12] = ((JSType) noType);
        nativeTypes[13] = ((JSType) noType);
        nativeTypes[14] = ((JSType) noType);
        nativeTypes[15] = ((JSType) noType);
        nativeTypes[16] = ((JSType) noType);
        nativeTypes[17] = ((JSType) noType);
        nativeTypes[18] = ((JSType) noType);
        nativeTypes[19] = ((JSType) noType);
        nativeTypes[20] = ((JSType) noType);
        nativeTypes[21] = ((JSType) noType);
        nativeTypes[22] = ((JSType) noType);
        nativeTypes[23] = ((JSType) noType);
        nativeTypes[24] = ((JSType) noType);
        nativeTypes[25] = ((JSType) noType);
        nativeTypes[26] = ((JSType) noType);
        nativeTypes[27] = ((JSType) noType);
        nativeTypes[28] = ((JSType) noType);
        nativeTypes[29] = ((JSType) noType);
        nativeTypes[30] = ((JSType) noType);
        nativeTypes[31] = ((JSType) noType);
        nativeTypes[32] = ((JSType) noType);
        nativeTypes[33] = ((JSType) noType);
        nativeTypes[34] = ((JSType) noType);
        nativeTypes[35] = ((JSType) noType);
        nativeTypes[36] = ((JSType) noType);
        nativeTypes[37] = ((JSType) noType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        UnionType unionType = new UnionType(jSTypeRegistry, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:157)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:367)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:695) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, unionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = unionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendVarArgsString3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[38] = ((JSType) templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        UnionType unionType = new UnionType(jSTypeRegistry, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:363)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:695) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, unionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = unionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendVarArgsString4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        nativeTypes[38] = ((JSType) booleanType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        StringBuilder stringBuilder = new StringBuilder("");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        linkedHashSet.add(functionType1);
        UnionType unionType = new UnionType(null, linkedHashSet);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:157)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:367)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:695) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, unionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = stringBuilder;
        appendVarArgsStringMethodArguments[1] = unionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 *  */
    @Test
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        List finalFunctionTypeImplementedInterfaces = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalFunctionTypeImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 *  */
    @Test
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoType implicitPrototype = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        List finalFunctionTypeImplementedInterfaces = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalFunctionTypeImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 *  */
    @Test
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        List finalFunctionTypeImplementedInterfaces = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalFunctionTypeImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 *  */
    @Test
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        List finalFunctionTypeImplementedInterfaces = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeImplementedInterfaces);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetImplementedInterfaces_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:390) */
        functionType.getImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetImplementedInterfaces_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:390) */
        functionType.getImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.executesCondition {@code (superCtor == null): True}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return implementedInterfaces;
 *  */
    @Test
    public void testGetImplementedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:390) */
        functionType.getImplementedInterfaces();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getImplementedInterfaces()
    
    @Test
    public void testGetImplementedInterfaces1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[20];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        nativeTypes[19] = ((JSType) noObjectType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
    }
    
    @Test
    public void testGetImplementedInterfaces2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[19] = ((JSType) functionType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry25 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry25RegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry26 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry26RegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry27 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry27RegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry28 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry28RegistryNativeTypes, 29));
        JSTypeRegistry jSTypeRegistry29 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes30 = ((JSType) get(jSTypeRegistry29RegistryNativeTypes, 30));
        JSTypeRegistry jSTypeRegistry30 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes31 = ((JSType) get(jSTypeRegistry30RegistryNativeTypes, 31));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
        
        assertNull(finalFunctionTypeRegistryNativeTypes25);
        
        assertNull(finalFunctionTypeRegistryNativeTypes26);
        
        assertNull(finalFunctionTypeRegistryNativeTypes27);
        
        assertNull(finalFunctionTypeRegistryNativeTypes28);
        
        assertNull(finalFunctionTypeRegistryNativeTypes29);
        
        assertNull(finalFunctionTypeRegistryNativeTypes30);
        
        assertNull(finalFunctionTypeRegistryNativeTypes31);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTopMostDefiningType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTopMostDefiningType(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(isConstructor() || isInterface());
 *  */
    @Test
    public void testGetTopMostDefiningType_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType(FunctionType.java:590) */
        functionType.getTopMostDefiningType(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTopMostDefiningType(java.lang.String)
    
    @Test
    public void testGetTopMostDefiningType1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType(FunctionType.java:590) */
        functionType.getTopMostDefiningType(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTopMostDefiningType(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetTopMostDefiningType2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String string = "";
        
        functionType.getTopMostDefiningType(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetTopMostDefiningType3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        functionType.getTopMostDefiningType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasUnknownSupertype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ObjectTypeIsUnknownType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototype = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ReturnFalse() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ReturnFalse_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ReturnFalse_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ReturnFalse_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasUnknownSupertype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(isConstructor() || isInterface());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasUnknownSupertype_ThrowIllegalArgumentException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.hasUnknownSupertype();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasUnknownSupertype()
    
    @Test
    public void testHasUnknownSupertype1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        EnumType implicitPrototype = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    @Test
    public void testHasUnknownSupertype2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasUnknownSupertype3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototype = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasUnknownSupertype()
    
    @Test(expected = StackOverflowError.class)
    public void testHasUnknownSupertype4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", implicitPrototype);
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        nativeTypes[19] = ((JSType) nullType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NullType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NullType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        EnumType implicitPrototype = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType implicitPrototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType implicitPrototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        IndexedType implicitPrototype = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:96)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:572) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype13() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        IndexedType implicitPrototype = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:96)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:572) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype14() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        IndexedType implicitPrototype = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType implicitPrototype1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype1);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:96)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:572) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype15() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        IndexedType implicitPrototype = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:96)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:572) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype16() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        EnumType implicitPrototype = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype17() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:568) */
        functionType.hasUnknownSupertype();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionPrototypeType#setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 *  */
    @Test
    public void testSetPrototypeBasedOn_PrototypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        functionType.setPrototypeBasedOn(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (prototype == null): True}
 *  */
    @Test
    public void testSetPrototypeBasedOn_PrototypeEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(noType);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (prototype == null): True}
 *  */
    @Test
    public void testSetPrototypeBasedOn_PrototypeEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(null);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionPrototypeType#setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: prototype.setImplicitPrototype(baseType);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetPrototypeBasedOn_ThrowIllegalStateException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        functionType.setPrototypeBasedOn(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry
 *  */
    @Test
    public void testSetPrototypeBasedOn_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:326) */
        functionType.setPrototypeBasedOn(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: registry
 *  */
    @Test
    public void testSetPrototypeBasedOn_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:326) */
        functionType.setPrototypeBasedOn(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testSetPrototypeBasedOn1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(noObjectType);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    @Test
    public void testSetPrototypeBasedOn2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(null);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    @Test
    public void testSetPrototypeBasedOn3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(null);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    @Test
    public void testSetPrototypeBasedOn4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(null);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    
    @Test
    public void testSetPrototypeBasedOn5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(null);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isPropertyTypeInferred
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isPropertyTypeInferred(java.lang.String)
    
    @Test
    public void testIsPropertyTypeInferred1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = functionType.isPropertyTypeInferred(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyTypeInferred2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType$Property");
        properties.put(null, property);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        boolean actual = functionType.isPropertyTypeInferred(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isPropertyTypeInferred(java.lang.String)
    
    @Test
    public void testIsPropertyTypeInferred3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isPropertyTypeInferred] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred(PrototypeObjectType.java:180)
            com.google.javascript.rhino.jstype.FunctionType.isPropertyTypeInferred(FunctionType.java:485) */
        functionType.isPropertyTypeInferred(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllImplementedInterfaces()}
 * @utbot.invokes {@link com.google.common.collect.Sets#newHashSet()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.returnsFrom {@code return interfaces;}
 *  */
    @Test
    public void testGetAllImplementedInterfaces_IterableIterator() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList implementedInterfaces = new ArrayList();
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        HashSet actual = ((HashSet) functionType.getAllImplementedInterfaces());
        
        HashSet expected = new HashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType type: getImplementedInterfaces())
 *  */
    @Test
    public void testGetAllImplementedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:365) */
        functionType.getAllImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType type: getImplementedInterfaces())
 *  */
    @Test
    public void testGetAllImplementedInterfaces_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:365) */
        functionType.getAllImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllImplementedInterfaces()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addRelatedInterfaces(type, interfaces);
 *  */
    @Test
    public void testGetAllImplementedInterfaces_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList implementedInterfaces = new ArrayList();
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:390)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:365) */
        functionType.getAllImplementedInterfaces();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getAllImplementedInterfaces()
    
    @Test
    public void testGetAllImplementedInterfaces1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[0] = ((JSType) noType);
        nativeTypes[1] = ((JSType) noType);
        nativeTypes[2] = ((JSType) noType);
        nativeTypes[3] = ((JSType) noType);
        nativeTypes[4] = ((JSType) noType);
        nativeTypes[5] = ((JSType) noType);
        nativeTypes[6] = ((JSType) noType);
        nativeTypes[7] = ((JSType) noType);
        nativeTypes[8] = ((JSType) noType);
        nativeTypes[9] = ((JSType) noType);
        nativeTypes[10] = ((JSType) noType);
        nativeTypes[11] = ((JSType) noType);
        nativeTypes[12] = ((JSType) noType);
        nativeTypes[13] = ((JSType) noType);
        nativeTypes[14] = ((JSType) noType);
        nativeTypes[15] = ((JSType) noType);
        nativeTypes[16] = ((JSType) noType);
        nativeTypes[17] = ((JSType) noType);
        nativeTypes[18] = ((JSType) noType);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[19] = ((JSType) allType);
        nativeTypes[20] = ((JSType) noType);
        nativeTypes[21] = ((JSType) noType);
        nativeTypes[22] = ((JSType) noType);
        nativeTypes[23] = ((JSType) noType);
        nativeTypes[24] = ((JSType) noType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:390)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:365) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:390)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:365) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[0] = ((JSType) noType);
        nativeTypes[1] = ((JSType) noType);
        nativeTypes[2] = ((JSType) noType);
        nativeTypes[3] = ((JSType) noType);
        nativeTypes[4] = ((JSType) noType);
        nativeTypes[5] = ((JSType) noType);
        nativeTypes[6] = ((JSType) noType);
        nativeTypes[7] = ((JSType) noType);
        nativeTypes[8] = ((JSType) noType);
        nativeTypes[9] = ((JSType) noType);
        nativeTypes[10] = ((JSType) noType);
        nativeTypes[11] = ((JSType) noType);
        nativeTypes[12] = ((JSType) noType);
        nativeTypes[13] = ((JSType) noType);
        nativeTypes[14] = ((JSType) noType);
        nativeTypes[15] = ((JSType) noType);
        nativeTypes[16] = ((JSType) noType);
        nativeTypes[17] = ((JSType) noType);
        nativeTypes[18] = ((JSType) noType);
        nativeTypes[20] = ((JSType) noType);
        nativeTypes[21] = ((JSType) noType);
        nativeTypes[22] = ((JSType) noType);
        nativeTypes[23] = ((JSType) noType);
        nativeTypes[24] = ((JSType) noType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:365) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList implementedInterfaces = new ArrayList();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        implementedInterfaces.add(anonymousFunctionType);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces(FunctionType.java:372)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:366) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList implementedInterfaces = new ArrayList();
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces(FunctionType.java:372)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:366) */
        functionType.getAllImplementedInterfaces();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", noTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = noType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class functionType1Type = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", functionType1Type, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = functionType1;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", enumTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = enumType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class recordTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", recordTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = recordType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class functionPrototypeTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", functionPrototypeTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = functionPrototypeType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType constructor = instance.getConstructor();
 *  */
    @Test
    public void testAddRelatedInterfaces_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces(FunctionType.java:372) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", objectTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = ((Object) null);
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        try {
            addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSuperClassConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.returnsFrom {@code return maybeSuperInstanceType.getConstructor();}
 *  */
    @Test
    public void testGetSuperClassConstructor_ReturnMaybeSuperInstanceTypeGetConstructor() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.returnsFrom {@code return maybeSuperInstanceType.getConstructor();}
 *  */
    @Test
    public void testGetSuperClassConstructor_ReturnMaybeSuperInstanceTypeGetConstructor_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetSuperClassConstructor_ReturnNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSuperClassConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(isConstructor() || isInterface());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSuperClassConstructor_ThrowIllegalArgumentException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.getSuperClassConstructor();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSuperClassConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetSuperClassConstructor_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549) */
        functionType.getSuperClassConstructor();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSuperClassConstructor()
    
    @Test
    public void testGetSuperClassConstructor1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    
    @Test
    public void testGetSuperClassConstructor2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSuperClassConstructor()
    
    @Test
    public void testGetSuperClassConstructor3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549) */
        functionType.getSuperClassConstructor();
    }
    
    @Test
    public void testGetSuperClassConstructor4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549) */
        functionType.getSuperClassConstructor();
    }
    
    @Test
    public void testGetSuperClassConstructor5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[34];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6db18fd0)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:685)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:107)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:59)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:66)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:312)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:549) */
        functionType.getSuperClassConstructor();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTemplateTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTemplateTypeName()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTemplateTypeName()}
 * @utbot.returnsFrom {@code return templateTypeName;}
 *  */
    @Test
    public void testGetTemplateTypeName_ReturnTemplateTypeName() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        String actual = functionType.getTemplateTypeName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setImplementedInterfaces(java.util.List)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setImplementedInterfaces(java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#copyOf(java.util.Collection)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#copyOf(java.util.Collection)}
 *  */
    @Test
    public void testSetImplementedInterfaces_ImmutableListCopyOf() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            ArrayList arrayList = new ArrayList();
            
            functionType.setImplementedInterfaces(arrayList);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setImplementedInterfaces(java.util.List)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setImplementedInterfaces(java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType type: implementedInterfaces)
 *  */
    @Test
    public void testSetImplementedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:401) */
        functionType.setImplementedInterfaces(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setImplementedInterfaces(java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.registerTypeImplementingInterface(this, type);
 *  */
    @Test
    public void testSetImplementedInterfaces_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:402) */
        functionType.setImplementedInterfaces(arrayList);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setImplementedInterfaces(java.util.List)
    
    @Test
    public void testSetImplementedInterfaces1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        arrayList.add(functionType1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:205)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:194)
            com.google.common.collect.AbstractSetMultimap.put(AbstractSetMultimap.java:80)
            com.google.common.collect.LinkedHashMultimap.put(LinkedHashMultimap.java:69)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:614)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:402) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        ArrayListMultimap interfaceToImplementors = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        arrayList.add(noObjectType);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:205)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:194)
            com.google.common.collect.AbstractListMultimap.put(AbstractListMultimap.java:72)
            com.google.common.collect.ArrayListMultimap.put(ArrayListMultimap.java:61)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:614)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:402) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        ArrayListMultimap interfaceToImplementors = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        arrayList.add(functionType1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:614)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:402) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        ArrayListMultimap interfaceToImplementors = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        arrayList.add(anonymousFunctionType);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:614)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:402) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        ArrayListMultimap interfaceToImplementors = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        arrayList.add(errorFunctionType);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractMultimap.getOrCreateCollection(AbstractMultimap.java:205)
            com.google.common.collect.AbstractMultimap.put(AbstractMultimap.java:194)
            com.google.common.collect.AbstractListMultimap.put(AbstractListMultimap.java:72)
            com.google.common.collect.ArrayListMultimap.put(ArrayListMultimap.java:61)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:614)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:402) */
        functionType.setImplementedInterfaces(arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields909574239583100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields909574239583100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass909574239592800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields909574239583100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass909574239592800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields909574239989600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields909574239989600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass909574239991600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields909574239989600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass909574239991600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields909574243102200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields909574243102200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass909574243105400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields909574243102200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass909574243105400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields909574243588400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields909574243588400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass909574243591000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields909574243588400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass909574243591000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

