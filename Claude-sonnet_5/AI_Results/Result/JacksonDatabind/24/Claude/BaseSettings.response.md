# วิเคราะห์และแผนการทดสอบ

จากซอร์สโค้ด `BaseSettings` เป็น immutable class ที่มี:
- Constructor เดียว + getters ทั้งหมด (ต้องเทส mapping ค่าที่ถูกต้อง)
- เมธอด `withXxx` ส่วนใหญ่มี pattern `if (_field == newValue) return this;` → ต้องเทสทั้งสองสาขา (same/different)
- `withInsertedAnnotationIntrospector` / `withAppendedAnnotationIntrospector` → พึ่งพา `AnnotationIntrospectorPair.create(...)` (ไม่ใช่โค้ดใน class นี้ แต่ส่งผลต่อ branch ของ `withAnnotationIntrospector`)
- `withVisibility` → ไม่มี self-check, delegate ไปที่ `_visibilityChecker.withVisibility(...)`
- `withDateFormat` → มี branch ซ้อน: same-check และ `df == null ? _timeZone : df.getTimeZone()`
- `with(TimeZone)` → null-check throw exception, และ if/else ระหว่าง `StdDateFormat` กับ DateFormat อื่น (clone) — จุดนี้มีความเสี่ยงเรื่อง NPE ถ้า `_dateFormat` เป็น null (ไม่มีการป้องกันในซอร์ส) จึงเขียนเทสไว้เป็นเอกสารพฤติกรรมปัจจุบัน
- `with(Base64Variant)` → same-check ปกติ

หมายเหตุสำคัญ: `TypeFactory` เป็น final class ที่ constructor ไม่ public จึงไม่สามารถสร้าง instance ที่สองแบบง่าย ๆ หรือ mock ได้ (final class, ไม่มี mockito-inline ใน classpath) → ใช้ `null` เป็นค่าที่ต่างจากค่าเดิมเพื่อทดสอบ branch "different" แทน (คอมเมนต์กำกับไว้ในโค้ด)

```java
package com.fasterxml.jackson.databind.cfg;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.HandlerInstantiator;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;

/**
 * Unit tests for {@link BaseSettings}.
 *
 * หมายเหตุทั่วไป:
 * - TypeFactory เป็น final class ที่ constructor ไม่ public จึงไม่สามารถสร้าง instance ที่สอง
 *   หรือ mock ได้ในสภาพแวดล้อมนี้ (ไม่มี mockito-inline) จึงใช้ null เป็นค่าที่แตกต่างเพื่อทดสอบ
 *   branch "different" ของ withTypeFactory แทน
 * - AnnotationIntrospectorPair.create(...) ไม่ใช่โค้ดของ BaseSettings เอง แต่พฤติกรรมมาตรฐานของ
 *   Jackson คือ create(a,null)==a และ create(null,b)==b ซึ่งถูกใช้ตรวจสอบผลลัพธ์ทางอ้อม
 */
public class BaseSettingsTest {

    private ClassIntrospector ci;
    private AnnotationIntrospector ai;
    @SuppressWarnings("rawtypes")
    private VisibilityChecker vcRaw;
    private VisibilityChecker<?> vc;
    private PropertyNamingStrategy pns;
    private TypeFactory tf;
    @SuppressWarnings("rawtypes")
    private TypeResolverBuilder typerRaw;
    private TypeResolverBuilder<?> typer;
    private DateFormat df;
    private HandlerInstantiator hi;
    private Locale locale;
    private TimeZone tz;
    private Base64Variant base64;

    private BaseSettings settings;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        ci = mock(ClassIntrospector.class);
        ai = mock(AnnotationIntrospector.class);
        vcRaw = mock(VisibilityChecker.class);
        vc = vcRaw;
        pns = mock(PropertyNamingStrategy.class);
        tf = TypeFactory.defaultInstance();
        typerRaw = mock(TypeResolverBuilder.class);
        typer = typerRaw;
        df = new SimpleDateFormat(); // ไม่ใช่ StdDateFormat
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        hi = mock(HandlerInstantiator.class);
        locale = Locale.US;
        tz = TimeZone.getTimeZone("UTC");
        base64 = Base64Variants.MIME;

        settings = new BaseSettings(ci, ai, vc, pns, tf, typer, df, hi, locale, tz, base64);
    }

    // ---------------- Constructor / Getters ----------------

    @Test
    public void testConstructorAndGetters() {
        assertSame(ci, settings.getClassIntrospector());
        assertSame(ai, settings.getAnnotationIntrospector());
        assertSame(vc, settings.getVisibilityChecker());
        assertSame(pns, settings.getPropertyNamingStrategy());
        assertSame(tf, settings.getTypeFactory());
        assertSame(typer, settings.getTypeResolverBuilder());
        assertSame(df, settings.getDateFormat());
        assertSame(hi, settings.getHandlerInstantiator());
        assertSame(locale, settings.getLocale());
        assertSame(tz, settings.getTimeZone());
        assertSame(base64, settings.getBase64Variant());
    }

    // ---------------- withClassIntrospector ----------------

    @Test
    public void testWithClassIntrospector_same() {
        BaseSettings result = settings.withClassIntrospector(ci);
        assertSame(settings, result);
    }

    @Test
    public void testWithClassIntrospector_different() {
        ClassIntrospector newCi = mock(ClassIntrospector.class);
        BaseSettings result = settings.withClassIntrospector(newCi);
        assertNotSame(settings, result);
        assertSame(newCi, result.getClassIntrospector());
        assertSame(ai, result.getAnnotationIntrospector()); // อื่น ๆ ไม่เปลี่ยน
    }

    @Test
    public void testWithClassIntrospector_null() {
        BaseSettings result = settings.withClassIntrospector(null);
        assertNotSame(settings, result);
        assertNull(result.getClassIntrospector());
    }

    // ---------------- withAnnotationIntrospector ----------------

    @Test
    public void testWithAnnotationIntrospector_same() {
        BaseSettings result = settings.withAnnotationIntrospector(ai);
        assertSame(settings, result);
    }

    @Test
    public void testWithAnnotationIntrospector_different() {
        AnnotationIntrospector newAi = mock(AnnotationIntrospector.class);
        BaseSettings result = settings.withAnnotationIntrospector(newAi);
        assertNotSame(settings, result);
        assertSame(newAi, result.getAnnotationIntrospector());
    }

    @Test
    public void testWithAnnotationIntrospector_null() {
        BaseSettings result = settings.withAnnotationIntrospector(null);
        assertNotSame(settings, result);
        assertNull(result.getAnnotationIntrospector());
    }

    // -------- withInsertedAnnotationIntrospector / withAppendedAnnotationIntrospector --------

    @Test
    public void testWithInsertedAnnotationIntrospector_originalNull() {
        BaseSettings s = new BaseSettings(ci, null, vc, pns, tf, typer, df, hi, locale, tz, base64);
        AnnotationIntrospector insertAi = mock(AnnotationIntrospector.class);
        BaseSettings result = s.withInsertedAnnotationIntrospector(insertAi);
        assertSame(insertAi, result.getAnnotationIntrospector());
    }

    @Test
    public void testWithAppendedAnnotationIntrospector_originalNull() {
        BaseSettings s = new BaseSettings(ci, null, vc, pns, tf, typer, df, hi, locale, tz, base64);
        AnnotationIntrospector appendAi = mock(AnnotationIntrospector.class);
        BaseSettings result = s.withAppendedAnnotationIntrospector(appendAi);
        assertSame(appendAi, result.getAnnotationIntrospector());
    }

    @Test
    public void testWithInsertedAnnotationIntrospector_bothNonNull_createsCombined() {
        AnnotationIntrospector insertAi = mock(AnnotationIntrospector.class);
        BaseSettings result = settings.withInsertedAnnotationIntrospector(insertAi);
        assertNotSame(settings, result);
        assertNotNull(result.getAnnotationIntrospector());
        assertNotSame(ai, result.getAnnotationIntrospector());
        assertNotSame(insertAi, result.getAnnotationIntrospector());
    }

    @Test
    public void testWithAppendedAnnotationIntrospector_bothNonNull_createsCombined() {
        AnnotationIntrospector appendAi = mock(AnnotationIntrospector.class);
        BaseSettings result = settings.withAppendedAnnotationIntrospector(appendAi);
        assertNotSame(settings, result);
        assertNotNull(result.getAnnotationIntrospector());
        assertNotSame(ai, result.getAnnotationIntrospector());
        assertNotSame(appendAi, result.getAnnotationIntrospector());
    }

    // ---------------- withVisibilityChecker ----------------

    @Test
    public void testWithVisibilityChecker_same() {
        BaseSettings result = settings.withVisibilityChecker(vc);
        assertSame(settings, result);
    }

    @Test
    public void testWithVisibilityChecker_different() {
        VisibilityChecker<?> newVc = mock(VisibilityChecker.class);
        BaseSettings result = settings.withVisibilityChecker(newVc);
        assertNotSame(settings, result);
        assertSame(newVc, result.getVisibilityChecker());
    }

    // ---------------- withVisibility ----------------

    @SuppressWarnings("unchecked")
    @Test
    public void testWithVisibility_delegatesToChecker() {
        @SuppressWarnings("rawtypes")
        VisibilityChecker newVcRaw = mock(VisibilityChecker.class);
        when(vcRaw.withVisibility(any(PropertyAccessor.class), any(JsonAutoDetect.Visibility.class)))
                .thenReturn(newVcRaw);

        BaseSettings result = settings.withVisibility(PropertyAccessor.FIELD,
                JsonAutoDetect.Visibility.PUBLIC_ONLY);

        assertNotSame(settings, result);
        assertSame(newVcRaw, result.getVisibilityChecker());
        verify(vcRaw).withVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.PUBLIC_ONLY);
    }

    // ---------------- withPropertyNamingStrategy ----------------

    @Test
    public void testWithPropertyNamingStrategy_same() {
        BaseSettings result = settings.withPropertyNamingStrategy(pns);
        assertSame(settings, result);
    }

    @Test
    public void testWithPropertyNamingStrategy_different() {
        PropertyNamingStrategy newPns = mock(PropertyNamingStrategy.class);
        BaseSettings result = settings.withPropertyNamingStrategy(newPns);
        assertNotSame(settings, result);
        assertSame(newPns, result.getPropertyNamingStrategy());
    }

    @Test
    public void testWithPropertyNamingStrategy_null() {
        BaseSettings result = settings.withPropertyNamingStrategy(null);
        assertNotSame(settings, result);
        assertNull(result.getPropertyNamingStrategy());
    }

    // ---------------- withTypeFactory ----------------
    // TypeFactory เป็น final class, constructor ไม่ public -> ใช้ null แทนค่าที่ "แตกต่าง"

    @Test
    public void testWithTypeFactory_same() {
        BaseSettings result = settings.withTypeFactory(tf);
        assertSame(settings, result);
    }

    @Test
    public void testWithTypeFactory_different() {
        BaseSettings result = settings.withTypeFactory(null);
        assertNotSame(settings, result);
        assertNull(result.getTypeFactory());
    }

    // ---------------- withTypeResolverBuilder ----------------

    @Test
    public void testWithTypeResolverBuilder_same() {
        BaseSettings result = settings.withTypeResolverBuilder(typer);
        assertSame(settings, result);
    }

    @Test
    public void testWithTypeResolverBuilder_different() {
        TypeResolverBuilder<?> newTyper = mock(TypeResolverBuilder.class);
        BaseSettings result = settings.withTypeResolverBuilder(newTyper);
        assertNotSame(settings, result);
        assertSame(newTyper, result.getTypeResolverBuilder());
    }

    @Test
    public void testWithTypeResolverBuilder_null() {
        BaseSettings result = settings.withTypeResolverBuilder(null);
        assertNotSame(settings, result);
        assertNull(result.getTypeResolverBuilder());
    }

    // ---------------- withDateFormat ----------------

    @Test
    public void testWithDateFormat_same() {
        BaseSettings result = settings.withDateFormat(df);
        assertSame(settings, result);
    }

    @Test
    public void testWithDateFormat_null_keepsOriginalTimeZone() {
        BaseSettings result = settings.withDateFormat(null);
        assertNotSame(settings, result);
        assertNull(result.getDateFormat());
        assertSame(tz, result.getTimeZone()); // df == null -> tz = _timeZone (เดิม)
    }

    @Test
    public void testWithDateFormat_differentNonNull_updatesTimeZoneFromDf() {
        SimpleDateFormat newDf = new SimpleDateFormat();
        TimeZone newTz = TimeZone.getTimeZone("America/New_York");
        newDf.setTimeZone(newTz);

        BaseSettings result = settings.withDateFormat(newDf);

        assertNotSame(settings, result);
        assertSame(newDf, result.getDateFormat());
        assertEquals(newTz, result.getTimeZone()); // df != null -> tz = df.getTimeZone()
    }

    // ---------------- withHandlerInstantiator ----------------

    @Test
    public void testWithHandlerInstantiator_same() {
        BaseSettings result = settings.withHandlerInstantiator(hi);
        assertSame(settings, result);
    }

    @Test
    public void testWithHandlerInstantiator_different() {
        HandlerInstantiator newHi = mock(HandlerInstantiator.class);
        BaseSettings result = settings.withHandlerInstantiator(newHi);
        assertNotSame(settings, result);
        assertSame(newHi, result.getHandlerInstantiator());
    }

    // ---------------- with(Locale) ----------------

    @Test
    public void testWithLocale_same() {
        BaseSettings result = settings.with(locale);
        assertSame(settings, result);
    }

    @Test
    public void testWithLocale_different() {
        Locale newLocale = Locale.FRENCH;
        BaseSettings result = settings.with(newLocale);
        assertNotSame(settings, result);
        assertSame(newLocale, result.getLocale());
    }

    // ---------------- with(TimeZone) ----------------

    @Test(expected = IllegalArgumentException.class)
    public void testWithTimeZone_null_throwsIllegalArgumentException() {
        settings.with(null);
    }

    @Test
    public void testWithTimeZone_stdDateFormat_usesWithTimeZoneBranch() {
        BaseSettings s = new BaseSettings(ci, ai, vc, pns, tf, typer,
                new StdDateFormat(), hi, locale, tz, base64);
        TimeZone newTz = TimeZone.getTimeZone("Asia/Tokyo");

        BaseSettings result = s.with(newTz);

        assertNotSame(s, result);
        assertTrue(result.getDateFormat() instanceof StdDateFormat);
        assertSame(newTz, result.getTimeZone());
        assertEquals(newTz, result.getDateFormat().getTimeZone());
    }

    @Test
    public void testWithTimeZone_nonStdDateFormat_clonesAndSetsTimeZone() {
        TimeZone newTz = TimeZone.getTimeZone("Asia/Tokyo");

        BaseSettings result = settings.with(newTz);

        assertNotSame(settings, result);
        assertNotSame(df, result.getDateFormat()); // ต้องถูก clone ไม่ใช่ตัวเดิม
        assertTrue(result.getDateFormat() instanceof SimpleDateFormat);
        assertSame(newTz, result.getTimeZone());
        assertEquals(newTz, result.getDateFormat().getTimeZone());

        // ตรวจสอบว่า object เดิมยัง immutable ไม่ถูกแก้ไข
        assertEquals(TimeZone.getTimeZone("UTC"), settings.getDateFormat().getTimeZone());
    }

    // Edge case / potential fault: หาก _dateFormat เป็น null โค้ดจะเข้า else-branch แล้วเรียก
    // df.clone() บน null -> เกิด NullPointerException เนื่องจากไม่มีการป้องกัน null ในซอร์ส
    // เทสนี้ใช้บันทึกพฤติกรรมปัจจุบัน (ไม่ได้เดา แต่สืบจาก logic ตรง ๆ ของโค้ด)
    @Test(expected = NullPointerException.class)
    public void testWithTimeZone_nullDateFormat_throwsNPE() {
        BaseSettings s = new BaseSettings(ci, ai, vc, pns, tf, typer,
                null, hi, locale, tz, base64);
        s.with(TimeZone.getTimeZone("Asia/Tokyo"));
    }

    // ---------------- with(Base64Variant) ----------------

    @Test
    public void testWithBase64Variant_same() {
        BaseSettings result = settings.with(base64);
        assertSame(settings, result);
    }

    @Test
    public void testWithBase64Variant_different() {
        Base64Variant newBase64 = Base64Variants.PEM;
        BaseSettings result = settings.with(newBase64);
        assertNotSame(settings, result);
        assertSame(newBase64, result.getBase64Variant());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorAndGetters` | Constructor assignment ทุกฟิลด์ + getters ทั้งหมด |
| `testWithClassIntrospector_same` / `_different` / `_null` | `_classIntrospector == ci` true/false, ค่า null |
| `testWithAnnotationIntrospector_same` / `_different` / `_null` | `_annotationIntrospector == ai` true/false, ค่า null |
| `testWithInsertedAnnotationIntrospector_originalNull` / `_bothNonNull` | branch ภายใน `withAnnotationIntrospector` ที่ถูกเรียกทางอ้อมจาก create(ai,null) และ create(a,b) ทั้งสองไม่ null |
| `testWithAppendedAnnotationIntrospector_originalNull` / `_bothNonNull` | เหมือนด้านบนแต่สลับลำดับ argument ของ `create()` |
| `testWithVisibilityChecker_same` / `_different` | `_visibilityChecker == vc` true/false |
| `testWithVisibility_delegatesToChecker` | delegate call `_visibilityChecker.withVisibility(...)`, สร้าง instance ใหม่เสมอ |
| `testWithPropertyNamingStrategy_same` / `_different` / `_null` | `_propertyNamingStrategy == pns` true/false, ค่า null |
| `testWithTypeFactory_same` / `_different` | `_typeFactory == tf` true/false (ใช้ null แทนกรณี "different") |
| `testWithTypeResolverBuilder_same` / `_different` / `_null` | `_typeResolverBuilder == typer` true/false, ค่า null |
| `testWithDateFormat_same` | `_dateFormat == df` true |
| `testWithDateFormat_null_keepsOriginalTimeZone` | `_dateFormat == df` false, และ `df == null` true → `tz = _timeZone` |
| `testWithDateFormat_differentNonNull_updatesTimeZoneFromDf` | `_dateFormat == df` false, `df == null` false → `tz = df.getTimeZone()` |
| `testWithHandlerInstantiator_same` / `_different` | `_handlerInstantiator == hi` true/false |
| `testWithLocale_same` / `_different` | `_locale == l` true/false |
| `testWithTimeZone_null_throwsIllegalArgumentException` | `tz == null` → throw `IllegalArgumentException` |
| `testWithTimeZone_stdDateFormat_usesWithTimeZoneBranch` | `df instanceof StdDateFormat` == true |
| `testWithTimeZone_nonStdDateFormat_clonesAndSetsTimeZone` | `df instanceof StdDateFormat` == false → clone + setTimeZone, ตรวจ immutability ของ object เดิม |
| `testWithTimeZone_nullDateFormat_throwsNPE` | edge case: `_dateFormat == null` เข้า else-branch แล้ว `null.clone()` → NPE (fault-detecting test) |
| `testWithBase64Variant_same` / `_different` | `base64 == _defaultBase64` true/false |

**ข้อสังเกตเรื่องความเสี่ยง/ข้อจำกัด**
- ทดสอบ `withInsertedAnnotationIntrospector`/`withAppendedAnnotationIntrospector` พึ่งพาพฤติกรรมมาตรฐานของ `AnnotationIntrospectorPair.create(...)` ซึ่งไม่ได้อยู่ในซอร์สโค้ดเป้าหมายโดยตรง — คอมเมนต์กำกับไว้ในโค้ดแล้ว
- ทดสอบ `withTypeFactory` ใช้ `null` แทนอินสแตนซ์ที่สองของ `TypeFactory` เนื่องจากเป็น final class ที่ constructor ไม่ public
- ทดสอบ `testWithTimeZone_nullDateFormat_throwsNPE` เป็นการเปิดเผยพฤติกรรมที่อาจเป็น fault (ไม่มี null-check ก่อน `.clone()`) ตามที่ระบุไว้ในข้อกำหนด