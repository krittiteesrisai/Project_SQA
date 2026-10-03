package com.fasterxml.jackson.databind.cfg;

import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class BaseSettingsTest {

    private BaseSettings baseSettings;
    private ClassIntrospector classIntrospector;
    private AnnotationIntrospector annotationIntrospector;
    private VisibilityChecker<?> visibilityChecker;
    private PropertyNamingStrategy propertyNamingStrategy;
    private TypeFactory typeFactory;
    private TypeResolverBuilder<?> typeResolverBuilder;
    private DateFormat dateFormat;
    private HandlerInstantiator handlerInstantiator;
    private Locale locale;
    private TimeZone timeZone;
    private Base64Variant base64Variant;

    @Before
    public void setUp() {
        classIntrospector = new ClassIntrospector();
        annotationIntrospector = AnnotationIntrospector.nopInstance();
        visibilityChecker = VisibilityChecker.Std.defaultInstance();
        propertyNamingStrategy = PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES;
        typeFactory = TypeFactory.defaultInstance();
        typeResolverBuilder = null;
        dateFormat = new StdDateFormat();
        handlerInstantiator = null;
        locale = Locale.US;
        timeZone = TimeZone.getTimeZone("UTC");
        base64Variant = Base64Variant.getDefaultBase64();

        baseSettings = new BaseSettings(
                classIntrospector, annotationIntrospector, visibilityChecker,
                propertyNamingStrategy, typeFactory, typeResolverBuilder,
                dateFormat, handlerInstantiator, locale, timeZone, base64Variant
        );
    }

    @Test
    public void testGetters() {
        assertSame(classIntrospector, baseSettings.getClassIntrospector());
        assertSame(annotationIntrospector, baseSettings.getAnnotationIntrospector());
        assertSame(visibilityChecker, baseSettings.getVisibilityChecker());
        assertSame(propertyNamingStrategy, baseSettings.getPropertyNamingStrategy());
        assertSame(typeFactory, baseSettings.getTypeFactory());
        assertSame(typeResolverBuilder, baseSettings.getTypeResolverBuilder());
        assertSame(dateFormat, baseSettings.getDateFormat());
        assertSame(handlerInstantiator, baseSettings.getHandlerInstantiator());
        assertSame(locale, baseSettings.getLocale());
        assertSame(timeZone, baseSettings.getTimeZone());
        assertSame(base64Variant, base64Variant);
        assertSame(base64Variant, baseSettings.getBase64Variant());
    }

    @Test
    public void testWithClassIntrospector() {
        assertSame(baseSettings, baseSettings.withClassIntrospector(classIntrospector));
        ClassIntrospector newCi = new ClassIntrospector();
        BaseSettings updated = baseSettings.withClassIntrospector(newCi);
        assertSame(newCi, updated.getClassIntrospector());
    }

    @Test
    public void testWithAnnotationIntrospector() {
        assertSame(baseSettings, baseSettings.withAnnotationIntrospector(annotationIntrospector));
        AnnotationIntrospector newAi = AnnotationIntrospector.nopInstance();
        BaseSettings updated = baseSettings.withAnnotationIntrospector(newAi);
        assertSame(newAi, updated.getAnnotationIntrospector());
    }

    @Test
    public void testAnnotationIntrospectorPairing() {
        AnnotationIntrospector newAi = AnnotationIntrospector.nopInstance();
        BaseSettings inserted = baseSettings.withInsertedAnnotationIntrospector(newAi);
        assertNotNull(inserted.getAnnotationIntrospector());

        BaseSettings appended = baseSettings.withAppendedAnnotationIntrospector(newAi);
        assertNotNull(appended.getAnnotationIntrospector());
    }

    @Test
    public void testWithVisibilityChecker() {
        assertSame(baseSettings, baseSettings.withVisibilityChecker(visibilityChecker));
        VisibilityChecker<?> newVc = VisibilityChecker.Std.defaultInstance();
        BaseSettings updated = baseSettings.withVisibilityChecker(newVc);
        assertSame(newVc, updated.getVisibilityChecker());
    }

    @Test
    public void testWithVisibility() {
        BaseSettings updated = baseSettings.withVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        assertNotNull(updated.getVisibilityChecker());
    }

    @Test
    public void testWithPropertyNamingStrategy() {
        assertSame(baseSettings, baseSettings.withPropertyNamingStrategy(propertyNamingStrategy));
        PropertyNamingStrategy newPns = PropertyNamingStrategy.SNAKE_CASE;
        BaseSettings updated = baseSettings.withPropertyNamingStrategy(newPns);
        assertSame(newPns, updated.getPropertyNamingStrategy());
    }

    @Test
    public void testWithTypeFactory() {
        assertSame(baseSettings, baseSettings.withTypeFactory(typeFactory));
        TypeFactory newTf = TypeFactory.defaultInstance();
        BaseSettings updated = baseSettings.withTypeFactory(newTf);
        assertSame(newTf, updated.getTypeFactory());
    }

    @Test
    public void testWithTypeResolverBuilder() {
        assertSame(baseSettings, baseSettings.withTypeResolverBuilder(typeResolverBuilder));
        BaseSettings updated = baseSettings.withTypeResolverBuilder(typeResolverBuilder);
        assertSame(baseSettings, updated);
    }

    @Test
    public void testWithDateFormat() {
        assertSame(baseSettings, baseSettings.withDateFormat(dateFormat));

        // Test with null DateFormat branch
        BaseSettings nullDfSettings = baseSettings.withDateFormat(null);
        assertNull(nullDfSettings.getDateFormat());
        assertEquals(baseSettings.getTimeZone(), nullDfSettings.getTimeZone());

        // Test with custom non-StdDateFormat (forces clone branch)
        DateFormat customDf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        BaseSettings customDfSettings = baseSettings.withDateFormat(customDf);
        assertNotNull(customDfSettings.getDateFormat());
    }

    @Test
    public void testWithHandlerInstantiator() {
        assertSame(baseSettings, baseSettings.withHandlerInstantiator(handlerInstantiator));
        BaseSettings updated = baseSettings.withHandlerInstantiator(handlerInstantiator);
        assertSame(baseSettings, updated);
    }

    @Test
    public void testWithLocale() {
        assertSame(baseSettings, baseSettings.with(locale));
        Locale newLocale = Locale.GERMAN;
        BaseSettings updated = baseSettings.with(newLocale);
        assertSame(newLocale, updated.getLocale());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithTimeZoneNull() {
        baseSettings.with((TimeZone) null);
    }

    @Test
    public void testWithTimeZone() {
        TimeZone newTz = TimeZone.getTimeZone("GMT+1");
        BaseSettings updated = baseSettings.with(newTz);
        assertEquals(newTz, updated.getTimeZone());

        // Test with custom non-StdDateFormat timezone update branch
        DateFormat customDf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        BaseSettings customSettings = new BaseSettings(
                classIntrospector, annotationIntrospector, visibilityChecker,
                propertyNamingStrategy, typeFactory, typeResolverBuilder,
                customDf, handlerInstantiator, locale, timeZone, base64Variant
        );
        BaseSettings updatedCustom = customSettings.with(newTz);
        assertEquals(newTz, updatedCustom.getTimeZone());
    }

    @Test
    public void testWithBase64Variant() {
        assertSame(baseSettings, baseSettings.with(base64Variant));
        Base64Variant newVariant = Base64Variant.getDefaultBase64();
        // Force different reference if possible or cover branch
        BaseSettings updated = baseSettings.with(newVariant);
        assertNotNull(updated.getBase64Variant());
    }
}