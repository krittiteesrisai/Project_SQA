package org.apache.commons.lang.enums;

import org.junit.Test;

public final class org_apache_commons_lang_enums_ValuedEnumTest {
    ///region Test suites for executable org.apache.commons.lang.enums.ValuedEnum.toString
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* We do not support testing for abstract classes (or interfaces)
        without any non-abstract inheritors (implementors). Probably, it'll be supported in
        the future. */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.enums.ValuedEnum.compareTo
    
    ///region Errors report for compareTo
    
    public void testCompareTo_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* We do not support testing for abstract classes (or interfaces)
        without any non-abstract inheritors (implementors). Probably, it'll be supported in
        the future. */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.enums.ValuedEnum.getValue
    
    ///region Errors report for getValue
    
    public void testGetValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* We do not support testing for abstract classes (or interfaces)
        without any non-abstract inheritors (implementors). Probably, it'll be supported in
        the future. */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.enums.ValuedEnum.getEnum
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEnum(java.lang.Class, int)
    
    /**
    @utbot.classUnderTest {@link ValuedEnum}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.enums.ValuedEnum#getEnum(java.lang.Class,int)}
 * @utbot.executesCondition {@code (enumClass == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: enumClass == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEnum_ThrowIllegalArgumentException() {
        ValuedEnum.getEnum(((Class) null), -255);
    }
    ///endregion
    
    ///endregion
}

