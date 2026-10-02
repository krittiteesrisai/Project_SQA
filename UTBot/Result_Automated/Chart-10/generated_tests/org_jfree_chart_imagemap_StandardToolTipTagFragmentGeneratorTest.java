package org.jfree.chart.imagemap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class org_jfree_chart_imagemap_StandardToolTipTagFragmentGeneratorTest {
    ///region Test suites for executable org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator.generateToolTipFragment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method generateToolTipFragment(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StandardToolTipTagFragmentGenerator}
 * @utbot.methodUnderTest {@link org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator#generateToolTipFragment(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return " title=\"" + toolTipText + "\" alt=\"\"";}
 *  */
    @Test
    public void testGenerateToolTipFragment_StringBuilderToString() {
        StandardToolTipTagFragmentGenerator standardToolTipTagFragmentGenerator = new StandardToolTipTagFragmentGenerator();
        
        String actual = standardToolTipTagFragmentGenerator.generateToolTipFragment(null);
        
        String expected = " title=\"null\" alt=\"\"";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
}

