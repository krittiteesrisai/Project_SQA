package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.select.Elements;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class org_jsoup_nodes_FormElementTest {
    ///region Test suites for executable org.jsoup.nodes.FormElement.addElement
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addElement(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#addElement(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.select.Elements#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: elements.add(element);
 *  */
    @Test
    public void testAddElement_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.FormElement.addElement] produces [java.lang.NullPointerException]
            org.jsoup.nodes.FormElement.addElement(FormElement.java:45) */
        formElement.addElement(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.FormElement.elements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method elements()
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#elements()}
 * @utbot.returnsFrom {@code return elements;}
 *  */
    @Test
    public void testElements_ReturnElements() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Elements actual = formElement.elements();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.FormElement.submit
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method submit()
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#submit()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hasAttr("action")
 *  */
    @Test
    public void testSubmit_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.FormElement.submit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:81)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:221)
            org.jsoup.nodes.Node.hasAttr(Node.java:103)
            org.jsoup.nodes.FormElement.submit(FormElement.java:58) */
        formElement.submit();
    }
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#submit()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hasAttr("action")
 *  */
    @Test
    public void testSubmit_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.FormElement.submit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:81)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:221)
            org.jsoup.nodes.Node.hasAttr(Node.java:103)
            org.jsoup.nodes.FormElement.submit(FormElement.java:58) */
        formElement.submit();
    }
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#submit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hasAttr("action")
 *  */
    @Test
    public void testSubmit_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.FormElement.submit] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:81)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:221)
            org.jsoup.nodes.Node.hasAttr(Node.java:103)
            org.jsoup.nodes.FormElement.submit(FormElement.java:58) */
        formElement.submit();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method submit()
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#submit()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(action, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_ThrowIllegalArgumentException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        formElement.submit();
    }
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#submit()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(action, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_ThrowIllegalArgumentException_1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            
            formElement.submit();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#submit()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(action, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_ThrowIllegalArgumentException_2() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            String baseUri = "";
            setField(formElement, "org.jsoup.nodes.Element", "baseUri", baseUri);
            
            formElement.submit();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method submit()
    
    @Test
    public void testSubmit1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 67108866);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "[\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        String string1 = "\u0000\u0000\u0000";
        keys[1] = string1;
        attributes.keys = keys;
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.FormElement.submit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:81)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:221)
            org.jsoup.nodes.Node.hasAttr(Node.java:103)
            org.jsoup.nodes.FormElement.submit(FormElement.java:58) */
        formElement.submit();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method submit()
    
    @Test(expected = IllegalArgumentException.class)
    public void testSubmit2() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "AC\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        String baseUri = "\u0000\u0000\u0000";
        setField(formElement, "org.jsoup.nodes.Element", "baseUri", baseUri);
        
        formElement.submit();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSubmit3() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 3);
        java.lang.String[] keys = new java.lang.String[11];
        attributes.keys = keys;
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        String baseUri = "";
        setField(formElement, "org.jsoup.nodes.Element", "baseUri", baseUri);
        
        formElement.submit();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSubmit4() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "K\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        String string1 = "\u0000\u0000\u0000";
        keys[1] = string1;
        attributes.keys = keys;
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        String baseUri = "\u0000\u0000\u0000";
        setField(formElement, "org.jsoup.nodes.Element", "baseUri", baseUri);
        
        formElement.submit();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSubmit5() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            String baseUri = "\u0000";
            setField(formElement, "org.jsoup.nodes.Element", "baseUri", baseUri);
            
            formElement.submit();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.FormElement.formData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formData()
    
    /**
    @utbot.classUnderTest {@link FormElement}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.FormElement#formData()}
 * @utbot.invokes {@link org.jsoup.select.Elements#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Element el: elements)
 *  */
    @Test
    public void testFormData_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.FormElement.formData] produces [java.lang.NullPointerException]
            org.jsoup.nodes.FormElement.formData(FormElement.java:77) */
        formElement.formData();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1005319493468000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1005319493468000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1005319493474500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1005319493468000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1005319493474500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1005319494234500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1005319494234500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1005319494236600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1005319494234500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1005319494236600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1005319495314300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1005319495314300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1005319495318500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1005319495314300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1005319495318500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

