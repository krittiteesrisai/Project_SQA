# การวิเคราะห์และแผนการทดสอบ

คลาส `ResolvedRecursiveType` มี branch/condition หลักที่ต้องครอบคลุม:

1. **Constructor** — สร้าง object ผ่าน `super(...)` (ไม่มี branch แต่ต้องสร้างได้)
2. **setReference** — if `_referencedType != null` → throw / else → set (2 branches)
3. **getGenericSignature / getErasedSignature** — delegate ไปที่ `_referencedType` (ถ้า null → NPE)
4. **with\*** methods — คืนค่า `this` เสมอ (ไม่มี branch แต่ต้องทดสอบว่าไม่ทำ mutation)
5. **\_narrow** (protected) — คืนค่า `this` เสมอ
6. **refine** — คืนค่า `null` เสมอ
7. **isContainerType** — คืนค่า `false` เสมอ
8. **toString** — if `_referencedType == null` → "UNRESOLVED" / else → ใช้ rawClass name (2 branches)
9. **equals** — มีหลาย branch: `o==this`, `o==null`, `_referencedType==null`, `getClass()` mismatch, และ referenced type equals/not-equals (5 branches)

เนื่องจาก `ResolvedRecursiveType` เป็นส่วนหนึ่งของ jackson-databind source เอง จึงใช้ `TypeFactory`/`TypeBindings` จริง (ไม่ mock) เพื่อให้ `JavaType` ที่ใช้มี `equals`, `getRawClass`, `getGenericSignature` ทำงานถูกต้องตามจริง — หลีกเลี่ยงปัญหาการ stub equals/hashCode บน mock

```java
import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ResolvedRecursiveTypeTest {

    private ResolvedRecursiveType newType() {
        return new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
    }

    private JavaType stringType() {
        return TypeFactory.defaultInstance().constructType(String.class);
    }

    private JavaType integerType() {
        return TypeFactory.defaultInstance().constructType(Integer.class);
    }

    // ---------- constructor / initial state ----------

    @Test
    public void testConstructorAndInitialStateIsUnresolved() {
        ResolvedRecursiveType t = newType();
        assertNotNull(t);
        assertNull("reference should be null before setReference()", t.getSelfReferencedType());
    }

    // ---------- setReference ----------

    @Test
    public void testSetReferenceOnceSucceeds() {
        ResolvedRecursiveType t = newType();
        JavaType ref = stringType();
        t.setReference(ref);
        assertSame(ref, t.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReferenceTwiceThrowsIllegalState() {
        ResolvedRecursiveType t = newType();
        t.setReference(stringType());
        t.setReference(integerType()); // second call must throw
    }

    // ---------- getGenericSignature / getErasedSignature ----------

    @Test
    public void testGetGenericSignatureDelegatesToReferencedType() {
        ResolvedRecursiveType t = newType();
        JavaType ref = stringType();
        t.setReference(ref);

        String expected = ref.getGenericSignature(new StringBuilder()).toString();
        String actual = t.getGenericSignature(new StringBuilder()).toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetErasedSignatureDelegatesToReferencedType() {
        ResolvedRecursiveType t = newType();
        JavaType ref = stringType();
        t.setReference(ref);

        String expected = ref.getErasedSignature(new StringBuilder()).toString();
        String actual = t.getErasedSignature(new StringBuilder()).toString();
        assertEquals(expected, actual);
    }

    // เอกสาร behavior จริงของโค้ด: ถ้ายังไม่ set reference จะเกิด NPE
    // (ไม่มีการ guard null ใน source) — ไม่ใช่การเดา แต่สอดคล้องตาม
    // `_referencedType.getGenericSignature(sb)` เมื่อ _referencedType == null
    @Test(expected = NullPointerException.class)
    public void testGetGenericSignatureWithoutReferenceThrowsNPE() {
        ResolvedRecursiveType t = newType();
        t.getGenericSignature(new StringBuilder());
    }

    @Test(expected = NullPointerException.class)
    public void testGetErasedSignatureWithoutReferenceThrowsNPE() {
        ResolvedRecursiveType t = newType();
        t.getErasedSignature(new StringBuilder());
    }

    // ---------- with* methods always return 'this' ----------

    @Test
    public void testWithContentTypeReturnsSelf() {
        ResolvedRecursiveType t = newType();
        assertSame(t, t.withContentType(stringType()));
    }

    @Test
    public void testWithContentTypeWithNullArgReturnsSelf() {
        ResolvedRecursiveType t = newType();
        assertSame(t, t.withContentType(null));
    }

    @Test
    public void testWithTypeHandlerReturnsSelf() {
        ResolvedRecursiveType t = newType();
        assertSame(t, t.withTypeHandler(new Object()));
    }

    @Test
    public void testWithContentTypeHandlerReturnsSelf() {
        ResolvedRecursiveType t = newType();
        assertSame(t, t.withContentTypeHandler(new Object()));
    }

    @Test
    public void testWithValueHandlerReturnsSelf() {
        ResolvedRecursiveType t = newType();
        assertSame(t, t.withValueHandler(new Object()));
    }

    @Test
    public void testWithContentValueHandlerReturnsSelf() {
        ResolvedRecursiveType t = newType();
        assertSame(t, t.withContentValueHandler(new Object()));
    }

    @Test
    public void testWithStaticTypingReturnsSelf() {
        ResolvedRecursiveType t = newType();
        assertSame(t, t.withStaticTyping());
    }

    // ---------- _narrow (protected, deprecated) ----------

    @Test
    public void testNarrowReturnsSelf() throws Exception {
        ResolvedRecursiveType t = newType();
        Method m = ResolvedRecursiveType.class.getDeclaredMethod("_narrow", Class.class);
        m.setAccessible(true);
        Object result = m.invoke(t, String.class);
        assertSame(t, result);
    }

    // ---------- refine ----------

    @Test
    public void testRefineReturnsNullWithNullArgs() {
        ResolvedRecursiveType t = newType();
        JavaType result = t.refine(String.class, TypeBindings.emptyBindings(), null, null);
        assertNull(result);
    }

    @Test
    public void testRefineReturnsNullWithNonNullArgs() {
        ResolvedRecursiveType t = newType();
        JavaType superClass = stringType();
        JavaType[] superInterfaces = new JavaType[] { integerType() };
        JavaType result = t.refine(Object.class, TypeBindings.emptyBindings(), superClass, superInterfaces);
        assertNull(result);
    }

    // ---------- isContainerType ----------

    @Test
    public void testIsContainerTypeIsFalse() {
        ResolvedRecursiveType t = newType();
        assertFalse(t.isContainerType());
    }

    // ---------- toString ----------

    @Test
    public void testToStringUnresolvedBranch() {
        ResolvedRecursiveType t = newType();
        assertEquals("[recursive type; UNRESOLVED]", t.toString());
    }

    @Test
    public void testToStringResolvedBranch() {
        ResolvedRecursiveType t = newType();
        JavaType ref = stringType();
        t.setReference(ref);
        String expected = "[recursive type; " + ref.getRawClass().getName();
        assertEquals(expected, t.toString());
    }

    // ---------- equals ----------

    @Test
    public void testEqualsSameInstanceTrue() {
        ResolvedRecursiveType t = newType();
        assertTrue(t.equals(t));
    }

    @Test
    public void testEqualsNullFalse() {
        ResolvedRecursiveType t = newType();
        assertFalse(t.equals(null));
    }

    @Test
    public void testEqualsUnresolvedAlwaysFalse() {
        // ตาม comment ใน source: "Do NOT ever match unresolved references"
        ResolvedRecursiveType t1 = newType();
        ResolvedRecursiveType t2 = newType();
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testEqualsDifferentClassFalse() {
        ResolvedRecursiveType t = newType();
        t.setReference(stringType());
        assertFalse(t.equals("not a ResolvedRecursiveType"));
    }

    @Test
    public void testEqualsSameReferencedTypeTrue() {
        ResolvedRecursiveType t1 = newType();
        ResolvedRecursiveType t2 = newType();
        t1.setReference(stringType());
        t2.setReference(TypeFactory.defaultInstance().constructType(String.class));
        assertTrue(t1.equals(t2));
    }

    @Test
    public void testEqualsDifferentReferencedTypeFalse() {
        ResolvedRecursiveType t1 = newType();
        ResolvedRecursiveType t2 = newType();
        t1.setReference(stringType());
        t2.setReference(integerType());
        assertFalse(t1.equals(t2));
    }
}
```

## ตารางสรุป Test Method → Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorAndInitialStateIsUnresolved` | Constructor ทำงานได้, `_referencedType` เริ่มต้นเป็น null |
| `testSetReferenceOnceSucceeds` | `setReference`: branch `_referencedType == null` (ไม่ throw) |
| `testSetReferenceTwiceThrowsIllegalState` | `setReference`: branch `_referencedType != null` → throw `IllegalStateException` |
| `testGetGenericSignatureDelegatesToReferencedType` | `getGenericSignature` delegate ไปยัง `_referencedType` (non-null) |
| `testGetErasedSignatureDelegatesToReferencedType` | `getErasedSignature` delegate ไปยัง `_referencedType` (non-null) |
| `testGetGenericSignatureWithoutReferenceThrowsNPE` | `getGenericSignature` เมื่อ `_referencedType == null` → NPE (boundary/ผิดรูปแบบ) |
| `testGetErasedSignatureWithoutReferenceThrowsNPE` | `getErasedSignature` เมื่อ `_referencedType == null` → NPE |
| `testWithContentTypeReturnsSelf` / `WithNullArgReturnsSelf` | `withContentType` คืน `this` ทั้งกรณี arg ปกติและ null |
| `testWithTypeHandlerReturnsSelf` | `withTypeHandler` คืน `this` |
| `testWithContentTypeHandlerReturnsSelf` | `withContentTypeHandler` คืน `this` |
| `testWithValueHandlerReturnsSelf` | `withValueHandler` คืน `this` |
| `testWithContentValueHandlerReturnsSelf` | `withContentValueHandler` คืน `this` |
| `testWithStaticTypingReturnsSelf` | `withStaticTyping` คืน `this` |
| `testNarrowReturnsSelf` | `_narrow` (protected, reflection) คืน `this` |
| `testRefineReturnsNullWithNullArgs` | `refine` คืน `null` เมื่อ args เป็น null |
| `testRefineReturnsNullWithNonNullArgs` | `refine` คืน `null` เมื่อ args ไม่เป็น null |
| `testIsContainerTypeIsFalse` | `isContainerType` คืน `false` |
| `testToStringUnresolvedBranch` | `toString`: branch `_referencedType == null` → "UNRESOLVED" |
| `testToStringResolvedBranch` | `toString`: branch `_referencedType != null` → ใช้ rawClass name |
| `testEqualsSameInstanceTrue` | `equals`: branch `o == this` → true |
| `testEqualsNullFalse` | `equals`: branch `o == null` → false |
| `testEqualsUnresolvedAlwaysFalse` | `equals`: branch `_referencedType == null` → false |
| `testEqualsDifferentClassFalse` | `equals`: branch `o.getClass() != getClass()` → false |
| `testEqualsSameReferencedTypeTrue` | `equals`: branch class เท่ากันและ referencedType.equals() → true |
| `testEqualsDifferentReferencedTypeFalse` | `equals`: branch class เท่ากันแต่ referencedType ไม่เท่ากัน → false |

**หมายเหตุ:** กรณี `getGenericSignature`/`getErasedSignature` เมื่อ `_referencedType == null` จะเกิด `NullPointerException` เนื่องจาก source ไม่มีการ guard null — เป็นพฤติกรรมจริงตามโค้ดที่ให้มา ไม่ใช่การเดา