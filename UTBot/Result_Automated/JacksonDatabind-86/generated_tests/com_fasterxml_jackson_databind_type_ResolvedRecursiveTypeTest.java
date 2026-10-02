package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_type_ResolvedRecursiveTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        boolean actual = resolvedRecursiveType.equals(resolvedRecursiveType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        boolean actual = resolvedRecursiveType.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (_referencedType == null): False}
 * @utbot.returnsFrom {@code return (o.getClass() == getClass() && _referencedType.equals(((ResolvedRecursiveType) o).getSelfReferencedType()));}
 *  */
    @Test
    public void testEquals_OGetClassNotEqualsGetClassAnd_referencedTypeEquals() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        byte[] byteArray = {};
        
        boolean actual = resolvedRecursiveType.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (_referencedType == null): True}
 *  */
    @Test
    public void testEquals__referencedTypeEqualsNull() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        byte[] byteArray = {};
        
        boolean actual = resolvedRecursiveType.equals(byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#toString()}
 * @utbot.executesCondition {@code (_referencedType == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString__referencedTypeNotEqualsNull() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        
        JavaType javaType = resolvedRecursiveType._referencedType;
        Class initialResolvedRecursiveType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = resolvedRecursiveType.toString();
        
        String expected = "[recursive type; java.lang.Object";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = resolvedRecursiveType._referencedType;
        Class finalResolvedRecursiveType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialResolvedRecursiveType_referencedType_class == finalResolvedRecursiveType_referencedType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#toString()}
 * @utbot.executesCondition {@code (_referencedType == null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString__referencedTypeEqualsNull() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        String actual = resolvedRecursiveType.toString();
        
        String expected = "[recursive type; UNRESOLVED";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#toString()}
 * @utbot.executesCondition {@code (_referencedType == null): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(_referencedType.getRawClass().getName());
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.toString(ResolvedRecursiveType.java:98) */
        resolvedRecursiveType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _referencedType.getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(null);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _referencedType.getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_1() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:224)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:251)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(null);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _referencedType.getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_2() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:224)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:204)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(null);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _referencedType.getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_3() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("             ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:206)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:253)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _referencedType.getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_4() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("   ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:253)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:253)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _referencedType.getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_5() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:224)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:206)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    @Test(expected = StackOverflowError.class)
    public void testGetGenericSignature1() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _referencedType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("");
        
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetGenericSignature2() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _referencedType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature3() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:224)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:253)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature4() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("                               ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:192)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:253)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature5() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("                               ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:256)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:253)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature6() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException] */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature7() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException] */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature8() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException] */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature9() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:253)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:206)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature10() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:206)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:206)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature11() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:192)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:206)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature12() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:256)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:206)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature(ResolvedRecursiveType.java:34) */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature13() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException] */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature14() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException] */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature15() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getGenericSignature] produces [java.lang.NullPointerException] */
        resolvedRecursiveType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getSelfReferencedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSelfReferencedType()
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getSelfReferencedType()}
 * @utbot.returnsFrom {@code return _referencedType;}
 *  */
    @Test
    public void testGetSelfReferencedType_Return_referencedType() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        JavaType actual = resolvedRecursiveType.getSelfReferencedType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.withContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentTypeHandler_Return() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) resolvedRecursiveType.withContentTypeHandler(null));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.withContentValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentValueHandler_Return() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) resolvedRecursiveType.withContentValueHandler(null));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.refine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method refine(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testRefine_ReturnNull() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        JavaType actual = resolvedRecursiveType.refine(null, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.withTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTypeHandler_Return() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) resolvedRecursiveType.withTypeHandler(null));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getErasedSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.returnsFrom {@code return _referencedType.getErasedSignature(sb);}
 *  */
    @Test
    public void testGetErasedSignature_Return_referencedTypeGetErasedSignature() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("");
        
        JavaType javaType = resolvedRecursiveType._referencedType;
        Class initialResolvedRecursiveType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        StringBuilder actual = resolvedRecursiveType.getErasedSignature(stringBuilder);
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        byte[] value = new byte[34];
        value[0] = (byte) 76;
        value[1] = (byte) 106;
        value[2] = (byte) 97;
        value[3] = (byte) 118;
        value[4] = (byte) 97;
        value[5] = (byte) 47;
        value[6] = (byte) 108;
        value[7] = (byte) 97;
        value[8] = (byte) 110;
        value[9] = (byte) 103;
        value[10] = (byte) 47;
        value[11] = (byte) 79;
        value[12] = (byte) 98;
        value[13] = (byte) 106;
        value[14] = (byte) 101;
        value[15] = (byte) 99;
        value[16] = (byte) 116;
        value[17] = (byte) 59;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 18);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
        JavaType javaType1 = resolvedRecursiveType._referencedType;
        Class finalResolvedRecursiveType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialResolvedRecursiveType_referencedType_class == finalResolvedRecursiveType_referencedType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.returnsFrom {@code return _referencedType.getErasedSignature(sb);}
 *  */
    @Test
    public void testGetErasedSignature_Return_referencedTypeGetErasedSignature_1() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        StringBuilder stringBuilder = new StringBuilder("");
        
        JavaType javaType = resolvedRecursiveType._referencedType;
        Class initialResolvedRecursiveType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        StringBuilder actual = resolvedRecursiveType.getErasedSignature(stringBuilder);
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        byte[] value = new byte[34];
        value[0] = (byte) 76;
        value[1] = (byte) 106;
        value[2] = (byte) 97;
        value[3] = (byte) 118;
        value[4] = (byte) 97;
        value[5] = (byte) 47;
        value[6] = (byte) 108;
        value[7] = (byte) 97;
        value[8] = (byte) 110;
        value[9] = (byte) 103;
        value[10] = (byte) 47;
        value[11] = (byte) 79;
        value[12] = (byte) 98;
        value[13] = (byte) 106;
        value[14] = (byte) 101;
        value[15] = (byte) 99;
        value[16] = (byte) 116;
        value[17] = (byte) 59;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 18);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
        JavaType javaType1 = resolvedRecursiveType._referencedType;
        Class finalResolvedRecursiveType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialResolvedRecursiveType_referencedType_class == finalResolvedRecursiveType_referencedType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _referencedType.getErasedSignature(sb);
 *  */
    @Test
    public void testGetErasedSignature_ThrowNullPointerException() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getErasedSignature(ResolvedRecursiveType.java:39) */
        resolvedRecursiveType.getErasedSignature(null);
    }
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _referencedType.getErasedSignature(sb);
 *  */
    @Test
    public void testGetErasedSignature_ThrowNullPointerException_1() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:224)
            com.fasterxml.jackson.databind.type.MapLikeType.getErasedSignature(MapLikeType.java:246)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.getErasedSignature(ResolvedRecursiveType.java:39) */
        resolvedRecursiveType.getErasedSignature(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.setReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setReference(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#setReference(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_referencedType != null): False}
 *  */
    @Test
    public void testSetReference__referencedTypeEqualsNull() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        resolvedRecursiveType.setReference(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setReference(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#setReference(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_referencedType != null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _referencedType != null
 *  */
    @Test
    public void testSetReference_ThrowNullPointerException() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ResolvedRecursiveType.setReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:258)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ResolvedRecursiveType.setReference(ResolvedRecursiveType.java:24) */
        resolvedRecursiveType.setReference(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.withContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentType_Return() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) resolvedRecursiveType.withContentType(null));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.withValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithValueHandler_Return() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) resolvedRecursiveType.withValueHandler(null));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.withStaticTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#withStaticTyping()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithStaticTyping_Return() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) resolvedRecursiveType.withStaticTyping());
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType._narrow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _narrow(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void test_narrow_Return() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) resolvedRecursiveType._narrow(null));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ResolvedRecursiveType.isContainerType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isContainerType()
    
    /**
    @utbot.classUnderTest {@link ResolvedRecursiveType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ResolvedRecursiveType#isContainerType()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsContainerType_ReturnFalse() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        boolean actual = resolvedRecursiveType.isContainerType();
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1085709479318399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1085709479318399.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1085709479324700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1085709479318399.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1085709479324700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1085709479928100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1085709479928100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1085709479931700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1085709479928100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1085709479931700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

