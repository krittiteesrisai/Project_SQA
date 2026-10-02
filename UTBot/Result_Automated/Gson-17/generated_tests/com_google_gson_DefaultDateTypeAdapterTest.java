package com.google.gson;

import org.junit.Test;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.text.CompactNumberFormat;
import com.google.gson.stream.JsonWriter;
import java.util.Date;
import com.google.gson.internal.bind.JsonTreeWriter;
import java.util.ArrayList;
import com.google.gson.stream.JsonReader;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.BufferedReader;
import com.google.gson.stream.MalformedJsonException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class com_google_gson_DefaultDateTypeAdapterTest {
    ///region Test suites for executable com.google.gson.DefaultDateTypeAdapter.deserializeToDate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeToDate(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#deserializeToDate(java.lang.String)}
 * @utbot.invokes {@link java.text.DateFormat#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDeserializeToDate_ThrowNullPointerException() throws Throwable  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.deserializeToDate] produces [java.lang.NullPointerException]
            com.google.gson.DefaultDateTypeAdapter.deserializeToDate(DefaultDateTypeAdapter.java:116) */
        Class defaultDateTypeAdapterClazz = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class stringType = Class.forName("java.lang.String");
        Method deserializeToDateMethod = defaultDateTypeAdapterClazz.getDeclaredMethod("deserializeToDate", stringType);
        deserializeToDateMethod.setAccessible(true);
        java.lang.Object[] deserializeToDateMethodArguments = new java.lang.Object[1];
        deserializeToDateMethodArguments[0] = ((Object) null);
        try {
            deserializeToDateMethod.invoke(defaultDateTypeAdapter, deserializeToDateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeToDate(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#deserializeToDate(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testDeserializeToDate_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        SimpleDateFormat localFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF', '\u0000'};
        setField(localFormat, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(defaultDateTypeAdapter, "com.google.gson.DefaultDateTypeAdapter", "localFormat", localFormat);
        String string = " ";
        
        Class defaultDateTypeAdapterClazz = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class stringType = Class.forName("java.lang.String");
        Method deserializeToDateMethod = defaultDateTypeAdapterClazz.getDeclaredMethod("deserializeToDate", stringType);
        deserializeToDateMethod.setAccessible(true);
        java.lang.Object[] deserializeToDateMethodArguments = new java.lang.Object[1];
        deserializeToDateMethodArguments[0] = string;
        try {
            deserializeToDateMethod.invoke(defaultDateTypeAdapter, deserializeToDateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#deserializeToDate(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testDeserializeToDate_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        SimpleDateFormat localFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u00FF'};
        setField(localFormat, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        setField(defaultDateTypeAdapter, "com.google.gson.DefaultDateTypeAdapter", "localFormat", localFormat);
        String string = " ";
        
        Class defaultDateTypeAdapterClazz = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class stringType = Class.forName("java.lang.String");
        Method deserializeToDateMethod = defaultDateTypeAdapterClazz.getDeclaredMethod("deserializeToDate", stringType);
        deserializeToDateMethod.setAccessible(true);
        java.lang.Object[] deserializeToDateMethodArguments = new java.lang.Object[1];
        deserializeToDateMethodArguments[0] = string;
        try {
            deserializeToDateMethod.invoke(defaultDateTypeAdapter, deserializeToDateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#deserializeToDate(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testDeserializeToDate_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        SimpleDateFormat localFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {};
        setField(localFormat, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        int[] fields = {0};
        setField(calendar, "java.util.Calendar", "fields", fields);
        boolean[] isSet = {};
        setField(calendar, "java.util.Calendar", "isSet", isSet);
        setField(calendar, "java.util.Calendar", "stamp", fields);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(localFormat, setCalendarMethodArguments);
        setField(defaultDateTypeAdapter, "com.google.gson.DefaultDateTypeAdapter", "localFormat", localFormat);
        String string = " ";
        
        Class defaultDateTypeAdapterClazz = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class stringType = Class.forName("java.lang.String");
        Method deserializeToDateMethod = defaultDateTypeAdapterClazz.getDeclaredMethod("deserializeToDate", stringType);
        deserializeToDateMethod.setAccessible(true);
        java.lang.Object[] deserializeToDateMethodArguments = new java.lang.Object[1];
        deserializeToDateMethodArguments[0] = string;
        try {
            deserializeToDateMethod.invoke(defaultDateTypeAdapter, deserializeToDateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#deserializeToDate(java.lang.String)}
 * @utbot.invokes {@link java.text.DateFormat#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testDeserializeToDate_ThrowNullPointerException_1() throws Throwable  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        SimpleDateFormat localFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        char[] compiledPattern = {'\u6400'};
        setField(localFormat, "java.text.SimpleDateFormat", "compiledPattern", compiledPattern);
        CompactNumberFormat numberFormat = ((CompactNumberFormat) createInstance("java.text.CompactNumberFormat"));
        localFormat.setNumberFormat(numberFormat);
        setField(defaultDateTypeAdapter, "com.google.gson.DefaultDateTypeAdapter", "localFormat", localFormat);
        String string = " ";
        
        Class defaultDateTypeAdapterClazz = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class stringType = Class.forName("java.lang.String");
        Method deserializeToDateMethod = defaultDateTypeAdapterClazz.getDeclaredMethod("deserializeToDate", stringType);
        deserializeToDateMethod.setAccessible(true);
        java.lang.Object[] deserializeToDateMethodArguments = new java.lang.Object[1];
        deserializeToDateMethodArguments[0] = string;
        try {
            deserializeToDateMethod.invoke(defaultDateTypeAdapter, deserializeToDateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.DefaultDateTypeAdapter.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 *  */
    @Test
    public void testToString_ClassGetSimpleName() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        SimpleDateFormat localFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(defaultDateTypeAdapter, "com.google.gson.DefaultDateTypeAdapter", "localFormat", localFormat);
        
        String actual = defaultDateTypeAdapter.toString();
        
        String expected = "DefaultDateTypeAdapter(SimpleDateFormat)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append('(').append(localFormat.getClass().getSimpleName()).append(')');
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.toString] produces [java.lang.NullPointerException]
            com.google.gson.DefaultDateTypeAdapter.toString(DefaultDateTypeAdapter.java:135) */
        defaultDateTypeAdapter.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.DefaultDateTypeAdapter.write
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method write(com.google.gson.stream.JsonWriter, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonWriter#nullValue()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWrite_ValueEqualsNull() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        String deferredName = "";
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "deferredName", deferredName);
        
        defaultDateTypeAdapter.write(jsonWriter, ((Date) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method write(com.google.gson.stream.JsonWriter, java.util.Date)
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: out.nullValue();
 *  */
    @Test
    public void testWrite_ThrowIllegalStateException() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {3};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.IllegalStateException: Nesting problem.]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:655)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
        defaultDateTypeAdapter.write(jsonWriter, ((Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWrite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {0};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
        defaultDateTypeAdapter.write(jsonWriter, ((Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: out.nullValue();
 *  */
    @Test
    public void testWrite_ThrowClassCastException() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
            stack.add(jsonPrimitive);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.ClassCastException: class com.google.gson.JsonPrimitive cannot be cast to class com.google.gson.JsonObject (com.google.gson.JsonPrimitive and com.google.gson.JsonObject are in unnamed module of loader 'app')]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
            defaultDateTypeAdapter.write(((JsonWriter) jsonTreeWriter), ((Date) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.nullValue();
 *  */
    @Test
    public void testWrite_ThrowNullPointerException() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.NullPointerException]
            com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
        defaultDateTypeAdapter.write(((JsonWriter) null), ((Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_4() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.peek(JsonWriter.java:368)
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:628)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
        defaultDateTypeAdapter.write(jsonWriter, ((Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.nullValue();
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_3() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonWriter jsonWriter = ((JsonWriter) createInstance("com.google.gson.stream.JsonWriter"));
        int[] stack = {2};
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stack", stack);
        setField(jsonWriter, "com.google.gson.stream.JsonWriter", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonWriter.beforeValue(JsonWriter.java:645)
            com.google.gson.stream.JsonWriter.nullValue(JsonWriter.java:453)
            com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
        defaultDateTypeAdapter.write(jsonWriter, ((Date) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.invokes {@link java.text.DateFormat#format(java.util.Date)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return;
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_6() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        Date date = new Date();
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.NullPointerException]
            com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:91) */
        defaultDateTypeAdapter.write(((JsonWriter) null), date);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.nullValue();
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_1() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            
            /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:82)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
            defaultDateTypeAdapter.write(((JsonWriter) jsonTreeWriter), ((Date) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.nullValue();
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_2() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.peek(JsonTreeWriter.java:72)
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:78)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
            defaultDateTypeAdapter.write(((JsonWriter) jsonTreeWriter), ((Date) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#write(com.google.gson.stream.JsonWriter,java.util.Date)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.nullValue();
 *  */
    @Test
    public void testWrite_ThrowNullPointerException_5() throws Exception  {
        JsonNull prevINSTANCE = JsonNull.INSTANCE;
        try {
            JsonNull instance = new JsonNull();
            Class jsonNullClazz = Class.forName("com.google.gson.JsonNull");
            setStaticField(jsonNullClazz, "INSTANCE", instance);
            DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
            JsonTreeWriter jsonTreeWriter = ((JsonTreeWriter) createInstance("com.google.gson.internal.bind.JsonTreeWriter"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "stack", stack);
            String pendingName = "";
            setField(jsonTreeWriter, "com.google.gson.internal.bind.JsonTreeWriter", "pendingName", pendingName);
            jsonTreeWriter.setSerializeNulls(true);
            
            /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.write] produces [java.lang.NullPointerException]
                com.google.gson.internal.bind.JsonTreeWriter.put(JsonTreeWriter.java:79)
                com.google.gson.internal.bind.JsonTreeWriter.nullValue(JsonTreeWriter.java:156)
                com.google.gson.DefaultDateTypeAdapter.write(DefaultDateTypeAdapter.java:88) */
            defaultDateTypeAdapter.write(((JsonWriter) jsonTreeWriter), ((Date) null));
        } finally {
            setStaticField(JsonNull.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.DefaultDateTypeAdapter.read
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read(com.google.gson.stream.JsonReader)
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.AssertionError} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowAssertionError_2() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peeked", 36);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.AssertionError]
            com.google.gson.stream.JsonReader.peek(JsonReader.java:456)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = {null};
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1073741825);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(((JsonReader) jsonTreeReader));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        Object linkedKeyIterator = createInstance("java.util.LinkedHashMap$LinkedKeyIterator");
        stack[0] = linkedKeyIterator;
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 12]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:114)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(((JsonReader) jsonTreeReader));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.AssertionError} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowAssertionError() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        java.lang.Object[] stack = new java.lang.Object[12];
        JsonPrimitive jsonPrimitive = ((JsonPrimitive) createInstance("com.google.gson.JsonPrimitive"));
        Object value = createInstance("java.lang.Object");
        jsonPrimitive.setValue(value);
        stack[1] = ((Object) jsonPrimitive);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 2);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.AssertionError]
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:139)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(((JsonReader) jsonTreeReader));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        int[] stack = {0};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:461)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.AssertionError} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowAssertionError_1() throws Exception  {
        Class jsonTreeReaderClazz = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Object prevSENTINEL_CLOSED = getStaticFieldValue(jsonTreeReaderClazz, "SENTINEL_CLOSED");
        try {
            java.lang.Object[] sentinelClosed = {};
            setStaticField(jsonTreeReaderClazz, "SENTINEL_CLOSED", sentinelClosed);
            DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
            JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
            java.lang.Object[] stack = {null};
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stack", stack);
            setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
            
            /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.AssertionError]
                com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:146)
                com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
            defaultDateTypeAdapter.read(((JsonReader) jsonTreeReader));
        } finally {
            setStaticField(JsonTreeReader.class, "SENTINEL_CLOSED", prevSENTINEL_CLOSED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = {'\u0000'};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 1073741824);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", -1073741825);
        int[] stack = {5};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(((JsonReader) null));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        setField(jsonTreeReader, "com.google.gson.internal.bind.JsonTreeReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonTreeReader.peekStack(JsonTreeReader.java:151)
            com.google.gson.internal.bind.JsonTreeReader.peek(JsonTreeReader.java:112)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(((JsonReader) jsonTreeReader));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in.peek() != JsonToken.STRING
 *  */
    @Test
    public void testRead_ThrowNullPointerException_2() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", -1);
        int[] stack = {5};
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1334)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method read(com.google.gson.stream.JsonReader)
    
    /**
    @utbot.classUnderTest {@link DefaultDateTypeAdapter}
 * @utbot.methodUnderTest {@link com.google.gson.DefaultDateTypeAdapter#read(com.google.gson.stream.JsonReader)}
 * @utbot.executesCondition {@code (in.peek() != JsonToken.STRING): True}
 * @utbot.invokes {@link com.google.gson.stream.JsonReader#peek()}
 * @utbot.throwsException {@link com.google.gson.JsonParseException} when: in.peek() != JsonToken.STRING
 *  */
    @Test(expected = JsonParseException.class)
    public void testRead_ThrowJsonParseException() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonTreeReader jsonTreeReader = ((JsonTreeReader) createInstance("com.google.gson.internal.bind.JsonTreeReader"));
        
        defaultDateTypeAdapter.read(((JsonReader) jsonTreeReader));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method read(com.google.gson.stream.JsonReader)
    
    @Test
    public void testRead1() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        jsonReader.setLenient(true);
        char[] buffer = new char[11];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -3 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1282)
            com.google.gson.stream.JsonReader.skipToEndOfLine(JsonReader.java:1413)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1386)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:481)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    @Test
    public void testRead2() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[25];
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peeked", 9);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:1029)
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:814)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:102) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    @Test
    public void testRead3() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[25];
        buffer[0] = '\"';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peeked", 9);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:827)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:102) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    @Test
    public void testRead4() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[15];
        buffer[0] = '\n';
        buffer[1] = '\n';
        buffer[2] = '\n';
        buffer[3] = '\n';
        buffer[4] = '\n';
        buffer[5] = '\n';
        buffer[6] = '\n';
        buffer[7] = '\t';
        buffer[8] = '\n';
        buffer[9] = '\n';
        buffer[10] = '\n';
        buffer[11] = '\n';
        buffer[12] = '\n';
        buffer[13] = '\n';
        buffer[14] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 7);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 9);
        int[] stack = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:493)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    @Test
    public void testRead5() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[37] = '\n';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", Integer.MIN_VALUE);
        int[] stack = {
            5, 5, 5, 5, 5, 5, 5, 5,
            5
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1474)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:490)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    @Test
    public void testRead6() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[11];
        buffer[2] = '\'';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 2);
        int[] stack = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            com.google.gson.stream.JsonReader.getPath(JsonReader.java:1467)
            com.google.gson.stream.JsonReader.locationString(JsonReader.java:1454)
            com.google.gson.stream.JsonReader.syntaxError(JsonReader.java:1562)
            com.google.gson.stream.JsonReader.checkLenient(JsonReader.java:1403)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:566)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    @Test
    public void testRead7() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "peeked", 9);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.google.gson.stream.JsonReader.nextQuotedValue(JsonReader.java:1027)
            com.google.gson.stream.JsonReader.nextString(JsonReader.java:814)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:102) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    
    @Test
    public void testRead8() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(jsonReader, "com.google.gson.stream.JsonReader", "in", in);
        char[] buffer = {
            '\r', '\r', '\r', '\r', '\r', '\r', '\r', '\r',
            '\r'
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", 1);
        int[] stack = {
            2, 2, 2, 2, 2, 2, 2, 2,
            2
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        /* This test fails because method [com.google.gson.DefaultDateTypeAdapter.read] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            com.google.gson.stream.JsonReader.fillBuffer(JsonReader.java:1289)
            com.google.gson.stream.JsonReader.nextNonWhitespace(JsonReader.java:1327)
            com.google.gson.stream.JsonReader.doPeek(JsonReader.java:466)
            com.google.gson.stream.JsonReader.peek(JsonReader.java:424)
            com.google.gson.DefaultDateTypeAdapter.read(DefaultDateTypeAdapter.java:99) */
        defaultDateTypeAdapter.read(jsonReader);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method read(com.google.gson.stream.JsonReader)
    
    @Test(expected = MalformedJsonException.class)
    public void testRead9() throws Exception  {
        DefaultDateTypeAdapter defaultDateTypeAdapter = ((DefaultDateTypeAdapter) createInstance("com.google.gson.DefaultDateTypeAdapter"));
        JsonReader jsonReader = ((JsonReader) createInstance("com.google.gson.stream.JsonReader"));
        char[] buffer = new char[39];
        buffer[0] = '#';
        buffer[1] = '#';
        buffer[2] = '#';
        buffer[3] = '#';
        buffer[4] = '#';
        buffer[5] = '#';
        buffer[6] = '#';
        buffer[7] = '#';
        buffer[8] = '#';
        buffer[9] = '#';
        buffer[10] = '#';
        buffer[11] = '#';
        buffer[12] = '#';
        buffer[13] = '#';
        buffer[14] = '#';
        buffer[15] = '#';
        buffer[16] = '#';
        buffer[17] = '#';
        buffer[18] = '#';
        buffer[19] = '#';
        buffer[20] = '#';
        buffer[21] = '#';
        buffer[22] = '#';
        buffer[23] = '#';
        buffer[24] = '#';
        buffer[25] = '#';
        buffer[26] = '#';
        buffer[27] = '#';
        buffer[28] = '#';
        buffer[29] = '#';
        buffer[30] = '#';
        buffer[31] = '#';
        buffer[32] = '#';
        buffer[33] = '#';
        buffer[34] = '#';
        buffer[35] = '#';
        buffer[36] = '#';
        buffer[37] = '\n';
        buffer[38] = '#';
        setField(jsonReader, "com.google.gson.stream.JsonReader", "buffer", buffer);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "pos", 37);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "limit", Integer.MIN_VALUE);
        int[] stack = {
            7, 7, 7, 7, 7, 7, 7, 7,
            7
        };
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stack", stack);
        setField(jsonReader, "com.google.gson.stream.JsonReader", "stackSize", 1);
        
        defaultDateTypeAdapter.read(jsonReader);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1016753715771300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1016753715771300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1016753715787200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016753715771300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016753715787200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1016753716802400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1016753716802400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1016753716808600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016753716802400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016753716808600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1016753718397000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1016753718397000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1016753718402900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1016753718397000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1016753718402900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

