package org.jfree.chart.block;

import org.junit.Test;
import org.jfree.chart.title.TextTitle;
import java.awt.geom.Rectangle2D;
import org.jfree.data.Range;
import org.jfree.chart.util.Size2D;
import org.jfree.chart.title.LegendGraphic;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.LegendItemBlockContainer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.title.LegendTitle;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_jfree_chart_block_BorderArrangementTest {
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.arrange
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrange(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.BlockContainer#toContentConstraint(org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: container.toContentConstraint(constraint)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testArrange_ThrowIllegalArgumentException() throws Exception  {
        BorderArrangement borderArrangement = new BorderArrangement();
        BlockContainer blockContainer = ((BlockContainer) createInstance("org.jfree.chart.block.BlockContainer"));
        
        borderArrangement.arrange(blockContainer, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrange(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.BlockContainer#toContentConstraint(org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: container.toContentConstraint(constraint)
 *  */
    @Test
    public void testArrange_ThrowNullPointerException() {
        BorderArrangement borderArrangement = new BorderArrangement();
        
        /* This test fails because method [org.jfree.chart.block.BorderArrangement.arrange] produces [java.lang.NullPointerException]
            org.jfree.chart.block.BorderArrangement.arrange(BorderArrangement.java:132) */
        borderArrangement.arrange(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrange(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.executesCondition {@code (w == LengthConstraintType.NONE): True}
 * @utbot.executesCondition {@code (h == LengthConstraintType.NONE): True}
 * @utbot.invokes {@link org.jfree.chart.block.BlockContainer#toContentConstraint(org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.RectangleConstraint#getWidthConstraintType()}
 * @utbot.invokes {@link org.jfree.chart.block.RectangleConstraint#getHeightConstraintType()}
 * @utbot.invokes {@link org.jfree.chart.block.BorderArrangement#arrangeNN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: contentSize = arrangeNN(container, g2);
 *  */
    @Test
    public void testArrange_ThrowNullPointerException_1() throws Exception  {
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        RectangleConstraint prevNONE1 = RectangleConstraint.NONE;
        try {
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            RectangleConstraint none1 = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
            Class rectangleConstraintClazz = Class.forName("org.jfree.chart.block.RectangleConstraint");
            setStaticField(rectangleConstraintClazz, "NONE", none1);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            TextTitle topBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
            BlockContainer blockContainer = ((BlockContainer) createInstance("org.jfree.chart.block.BlockContainer"));
            
            /* This test fails because method [org.jfree.chart.block.BorderArrangement.arrange] produces [java.lang.NullPointerException]
                org.jfree.chart.block.BorderArrangement.arrange(BorderArrangement.java:170) */
            borderArrangement.arrange(blockContainer, null, none1);
        } finally {
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
            setStaticField(RectangleConstraint.class, "NONE", prevNONE1);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.arrangeFR
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeFR(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.RectangleConstraint#getWidth()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Size2D size1 = arrangeFN(container, g2, constraint.getWidth());
 *  */
    @Test
    public void testArrangeFR_ThrowNullPointerException() {
        BorderArrangement borderArrangement = new BorderArrangement();
        
        /* This test fails because method [org.jfree.chart.block.BorderArrangement.arrangeFR] produces [java.lang.NullPointerException]
            org.jfree.chart.block.BorderArrangement.arrangeFR(BorderArrangement.java:254) */
        borderArrangement.arrangeFR(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeFR(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size1 = arrangeFN(container, g2, constraint.getWidth());
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeFR_ThrowRuntimeException() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name1 = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name1);
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            BlockContainer topBlock = ((BlockContainer) createInstance("org.jfree.chart.block.BlockContainer"));
            ColumnArrangement arrangement = ((ColumnArrangement) createInstance("org.jfree.chart.block.ColumnArrangement"));
            topBlock.setArrangement(arrangement);
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
            RectangleConstraint rectangleConstraint = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            
            borderArrangement.arrangeFR(null, null, rectangleConstraint);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeFR(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size1 = arrangeFN(container, g2, constraint.getWidth());
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeFR_ThrowRuntimeException_1() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name1 = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name1);
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            BlockContainer bottomBlock = ((BlockContainer) createInstance("org.jfree.chart.block.BlockContainer"));
            ColumnArrangement arrangement = ((ColumnArrangement) createInstance("org.jfree.chart.block.ColumnArrangement"));
            bottomBlock.setArrangement(arrangement);
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "bottomBlock", bottomBlock);
            RectangleConstraint rectangleConstraint = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            
            borderArrangement.arrangeFR(null, null, rectangleConstraint);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.arrangeRR
    
    ///region FUZZER: ERROR SUITE for method arrangeRR(org.jfree.chart.block.BlockContainer, org.jfree.data.Range, org.jfree.data.Range, java.awt.Graphics2D)
    
    @Test
    public void testArrangeRRByFuzzer() {
        BorderArrangement borderArrangement = new BorderArrangement();
        GridArrangement gridArrangement = new GridArrangement(-1, 1);
        BlockContainer blockContainer = new BlockContainer(gridArrangement);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float(1.0f, 0.0f, 1.0f, 0.0f);
        float1.y = -1.0f;
        float1.height = -1.0f;
        float1.width = -1.0f;
        float1.x = java.lang.Float.NEGATIVE_INFINITY;
        blockContainer.setBounds(float1);
        Range range = new Range(java.lang.Double.NaN, 0.0);
        
        /* This test fails because method [org.jfree.chart.block.BorderArrangement.arrangeRR] produces [java.lang.NullPointerException]
            org.jfree.data.Range.shift(Range.java:293)
            org.jfree.data.Range.shift(Range.java:272)
            org.jfree.chart.block.BorderArrangement.arrangeRR(BorderArrangement.java:357) */
        borderArrangement.arrangeRR(blockContainer, range, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.arrangeFF
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeFF(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.RectangleConstraint#getWidth()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: w[0] = constraint.getWidth();
 *  */
    @Test
    public void testArrangeFF_ThrowNullPointerException() {
        BorderArrangement borderArrangement = new BorderArrangement();
        
        /* This test fails because method [org.jfree.chart.block.BorderArrangement.arrangeFF] produces [java.lang.NullPointerException]
            org.jfree.chart.block.BorderArrangement.arrangeFF(BorderArrangement.java:426) */
        borderArrangement.arrangeFF(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)
    
    @Test
    public void testArrangeFF1() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            BorderArrangement borderArrangement = new BorderArrangement();
            RectangleConstraint rectangleConstraint = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
            
            Size2D actual = borderArrangement.arrangeFF(null, null, rectangleConstraint);
            
            Size2D expected = new Size2D(0.0, 0.0);
            
            // org.jfree.chart.util.Size2D has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)
    
    @Test
    public void testArrangeFF2() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            LegendGraphic topBlock = ((LegendGraphic) createInstance("org.jfree.chart.title.LegendGraphic"));
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
            RectangleConstraint rectangleConstraint = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
            
            /* This test fails because method [org.jfree.chart.block.BorderArrangement.arrangeFF] produces [java.lang.NullPointerException]
                org.jfree.chart.block.AbstractBlock.trimToContentWidth(AbstractBlock.java:383)
                org.jfree.chart.block.AbstractBlock.toContentConstraint(AbstractBlock.java:426)
                org.jfree.chart.title.LegendGraphic.arrange(LegendGraphic.java:510)
                org.jfree.chart.block.BorderArrangement.arrangeFF(BorderArrangement.java:432) */
            borderArrangement.arrangeFF(null, null, rectangleConstraint);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)
    
    @Test(expected = IllegalArgumentException.class)
    public void testArrangeFF3() throws Exception  {
        BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        CompositeTitle leftBlock = ((CompositeTitle) createInstance("org.jfree.chart.title.CompositeTitle"));
        setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "leftBlock", leftBlock);
        LegendItemBlockContainer legendItemBlockContainer = ((LegendItemBlockContainer) createInstance("org.jfree.chart.title.LegendItemBlockContainer"));
        RectangleConstraint rectangleConstraint = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
        setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "width", -3.337610787760802E-308);
        setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
        
        borderArrangement.arrangeFF(legendItemBlockContainer, null, rectangleConstraint);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testArrangeFF4() throws Exception  {
        BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        CompositeTitle rightBlock = ((CompositeTitle) createInstance("org.jfree.chart.title.CompositeTitle"));
        setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "rightBlock", rightBlock);
        LegendItemBlockContainer legendItemBlockContainer = ((LegendItemBlockContainer) createInstance("org.jfree.chart.title.LegendItemBlockContainer"));
        RectangleConstraint rectangleConstraint = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
        setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "width", -2.2250738585072024E-308);
        setField(rectangleConstraint, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
        
        borderArrangement.arrangeFF(legendItemBlockContainer, null, rectangleConstraint);
    }
    ///endregion
    
    ///region Errors report for arrangeFF
    
    public void testArrangeFF_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 45 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.arrangeFN
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, double)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeFN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double)}
 * @utbot.executesCondition {@code (this.topBlock != null): True}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size = this.topBlock.arrange(g2, c1);
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeFN_ThrowRuntimeException() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name1 = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name1);
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            BlockContainer topBlock = ((BlockContainer) createInstance("org.jfree.chart.block.BlockContainer"));
            ColumnArrangement arrangement = ((ColumnArrangement) createInstance("org.jfree.chart.block.ColumnArrangement"));
            topBlock.setArrangement(arrangement);
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
            
            borderArrangement.arrangeFN(null, null, java.lang.Double.NaN);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeFN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double)}
 * @utbot.executesCondition {@code (this.topBlock != null): False}
 * @utbot.executesCondition {@code (this.bottomBlock != null): True}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size = this.bottomBlock.arrange(g2, c1);
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeFN_ThrowRuntimeException_1() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name1 = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name1);
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            BlockContainer bottomBlock = ((BlockContainer) createInstance("org.jfree.chart.block.BlockContainer"));
            ColumnArrangement arrangement = ((ColumnArrangement) createInstance("org.jfree.chart.block.ColumnArrangement"));
            bottomBlock.setArrangement(arrangement);
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "bottomBlock", bottomBlock);
            
            borderArrangement.arrangeFN(null, null, java.lang.Double.NaN);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.block.BorderArrangement}
     * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeFN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D,double)}
     */
    @Test
    public void testArrangeFNWithCornerCase() {
        BorderArrangement borderArrangement = new BorderArrangement();
        GridArrangement gridArrangement = new GridArrangement(-1, 1);
        BlockContainer blockContainer = new BlockContainer(gridArrangement);
        BorderArrangement borderArrangement1 = new BorderArrangement();
        blockContainer.setArrangement(borderArrangement1);
        blockContainer.setPadding(null);
        RectangleInsets rectangleInsets = new RectangleInsets();
        blockContainer.setMargin(rectangleInsets);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float(1.0f, 0.0f, 1.0f, 0.0f);
        float1.y = -1.0f;
        float1.height = -1.0f;
        float1.width = -1.0f;
        float1.x = java.lang.Float.NEGATIVE_INFINITY;
        blockContainer.setBounds(float1);
        RectangleInsets rectangleInsets1 = new RectangleInsets();
        LineBorder lineBorder = new LineBorder(null, null, rectangleInsets1);
        blockContainer.setFrame(lineBorder);
        blockContainer.setWidth(-1.0);
        blockContainer.setHeight(1.7800590868057611E-307);
        
        Size2D actual = borderArrangement.arrangeFN(blockContainer, null, java.lang.Double.NaN);
        
        Size2D expected = new Size2D(java.lang.Double.NaN, 2.0);
        
        // org.jfree.chart.util.Size2D has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, double)
    
    @Test(expected = IllegalArgumentException.class)
    public void testArrangeFN1() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name1 = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name1);
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            BorderArrangement borderArrangement = new BorderArrangement();
            LegendItemBlockContainer legendItemBlockContainer = ((LegendItemBlockContainer) createInstance("org.jfree.chart.title.LegendItemBlockContainer"));
            
            borderArrangement.arrangeFN(legendItemBlockContainer, null, -3.337610787760802E-308);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, double)
    
    @Test
    public void testArrangeFN2() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        LengthConstraintType prevRANGE = LengthConstraintType.RANGE;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name1 = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name1);
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            LengthConstraintType range = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name2 = "RectangleConstraintType.RANGE";
            setField(range, "org.jfree.chart.block.LengthConstraintType", "name", name2);
            setStaticField(lengthConstraintTypeClazz, "RANGE", range);
            BorderArrangement borderArrangement = new BorderArrangement();
            LegendItemBlockContainer legendItemBlockContainer = ((LegendItemBlockContainer) createInstance("org.jfree.chart.title.LegendItemBlockContainer"));
            
            /* This test fails because method [org.jfree.chart.block.BorderArrangement.arrangeFN] produces [java.lang.NullPointerException]
                org.jfree.chart.block.AbstractBlock.trimToContentWidth(AbstractBlock.java:383)
                org.jfree.chart.block.AbstractBlock.toContentConstraint(AbstractBlock.java:426)
                org.jfree.chart.block.BorderArrangement.arrange(BorderArrangement.java:132)
                org.jfree.chart.block.BorderArrangement.arrangeFN(BorderArrangement.java:323) */
            borderArrangement.arrangeFN(legendItemBlockContainer, null, java.lang.Double.NaN);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
            setStaticField(LengthConstraintType.class, "RANGE", prevRANGE);
        }
    }
    
    @Test
    public void testArrangeFN3() throws Exception  {
        LengthConstraintType prevFIXED = LengthConstraintType.FIXED;
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        try {
            LengthConstraintType fixed = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.FIXED";
            setField(fixed, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "FIXED", fixed);
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name1 = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name1);
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            BlockContainer bottomBlock = ((BlockContainer) createInstance("org.jfree.chart.block.BlockContainer"));
            BorderArrangement arrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            bottomBlock.setArrangement(arrangement);
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "bottomBlock", bottomBlock);
            
            /* This test fails because method [org.jfree.chart.block.BorderArrangement.arrangeFN] produces [java.lang.NullPointerException]
                org.jfree.chart.block.AbstractBlock.trimToContentWidth(AbstractBlock.java:383)
                org.jfree.chart.block.AbstractBlock.toContentConstraint(AbstractBlock.java:426)
                org.jfree.chart.block.BorderArrangement.arrange(BorderArrangement.java:132)
                org.jfree.chart.block.BlockContainer.arrange(BlockContainer.java:182)
                org.jfree.chart.block.BorderArrangement.arrangeFN(BorderArrangement.java:288) */
            borderArrangement.arrangeFN(null, null, java.lang.Double.NaN);
        } finally {
            setStaticField(LengthConstraintType.class, "FIXED", prevFIXED);
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.arrangeNN
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeNN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D)}
 * @utbot.executesCondition {@code (this.topBlock != null): True}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size = this.topBlock.arrange(g2, RectangleConstraint.NONE);
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeNN_ThrowRuntimeException_3() throws Exception  {
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        RectangleConstraint prevNONE1 = RectangleConstraint.NONE;
        try {
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            RectangleConstraint none1 = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "widthConstraintType", none);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "heightConstraintType", none);
            Class rectangleConstraintClazz = Class.forName("org.jfree.chart.block.RectangleConstraint");
            setStaticField(rectangleConstraintClazz, "NONE", none1);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            TextTitle topBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
            
            borderArrangement.arrangeNN(null, null);
        } finally {
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
            setStaticField(RectangleConstraint.class, "NONE", prevNONE1);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeNN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D)}
 * @utbot.executesCondition {@code (this.topBlock != null): False}
 * @utbot.executesCondition {@code (this.bottomBlock != null): True}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size = this.bottomBlock.arrange(g2, RectangleConstraint.NONE);
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeNN_ThrowRuntimeException() throws Exception  {
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        RectangleConstraint prevNONE1 = RectangleConstraint.NONE;
        try {
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            RectangleConstraint none1 = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "widthConstraintType", none);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "heightConstraintType", none);
            Class rectangleConstraintClazz = Class.forName("org.jfree.chart.block.RectangleConstraint");
            setStaticField(rectangleConstraintClazz, "NONE", none1);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            TextTitle bottomBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "bottomBlock", bottomBlock);
            
            borderArrangement.arrangeNN(null, null);
        } finally {
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
            setStaticField(RectangleConstraint.class, "NONE", prevNONE1);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeNN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D)}
 * @utbot.executesCondition {@code (this.topBlock != null): False}
 * @utbot.executesCondition {@code (this.bottomBlock != null): False}
 * @utbot.executesCondition {@code (this.leftBlock != null): True}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size = this.leftBlock.arrange(g2, RectangleConstraint.NONE);
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeNN_ThrowRuntimeException_2() throws Exception  {
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        RectangleConstraint prevNONE1 = RectangleConstraint.NONE;
        try {
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            RectangleConstraint none1 = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "widthConstraintType", none);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "heightConstraintType", none);
            Class rectangleConstraintClazz = Class.forName("org.jfree.chart.block.RectangleConstraint");
            setStaticField(rectangleConstraintClazz, "NONE", none1);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            TextTitle leftBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "leftBlock", leftBlock);
            
            borderArrangement.arrangeNN(null, null);
        } finally {
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
            setStaticField(RectangleConstraint.class, "NONE", prevNONE1);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeNN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D)}
 * @utbot.executesCondition {@code (this.topBlock != null): False}
 * @utbot.executesCondition {@code (this.bottomBlock != null): False}
 * @utbot.executesCondition {@code (this.leftBlock != null): False}
 * @utbot.executesCondition {@code (this.rightBlock != null): True}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size = this.rightBlock.arrange(g2, RectangleConstraint.NONE);
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeNN_ThrowRuntimeException_1() throws Exception  {
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        RectangleConstraint prevNONE1 = RectangleConstraint.NONE;
        try {
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            RectangleConstraint none1 = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "widthConstraintType", none);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "heightConstraintType", none);
            Class rectangleConstraintClazz = Class.forName("org.jfree.chart.block.RectangleConstraint");
            setStaticField(rectangleConstraintClazz, "NONE", none1);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            TextTitle rightBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "rightBlock", rightBlock);
            
            borderArrangement.arrangeNN(null, null);
        } finally {
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
            setStaticField(RectangleConstraint.class, "NONE", prevNONE1);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeNN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D)}
 * @utbot.executesCondition {@code (this.topBlock != null): False}
 * @utbot.executesCondition {@code (this.bottomBlock != null): False}
 * @utbot.executesCondition {@code (this.leftBlock != null): False}
 * @utbot.executesCondition {@code (this.rightBlock != null): False}
 * @utbot.executesCondition {@code (this.centerBlock != null): True}
 * @utbot.invokes {@link java.lang.Math#max(double,double)}
 * @utbot.invokes {@link org.jfree.chart.block.Block#arrange(java.awt.Graphics2D,org.jfree.chart.block.RectangleConstraint)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Size2D size = this.centerBlock.arrange(g2, RectangleConstraint.NONE);
 *  */
    @Test(expected = RuntimeException.class)
    public void testArrangeNN_ThrowRuntimeException_4() throws Exception  {
        LengthConstraintType prevNONE = LengthConstraintType.NONE;
        RectangleConstraint prevNONE1 = RectangleConstraint.NONE;
        try {
            LengthConstraintType none = ((LengthConstraintType) createInstance("org.jfree.chart.block.LengthConstraintType"));
            String name = "LengthConstraintType.NONE";
            setField(none, "org.jfree.chart.block.LengthConstraintType", "name", name);
            Class lengthConstraintTypeClazz = Class.forName("org.jfree.chart.block.LengthConstraintType");
            setStaticField(lengthConstraintTypeClazz, "NONE", none);
            RectangleConstraint none1 = ((RectangleConstraint) createInstance("org.jfree.chart.block.RectangleConstraint"));
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "width", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "widthConstraintType", none);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "height", 0.0);
            setField(none1, "org.jfree.chart.block.RectangleConstraint", "heightConstraintType", none);
            Class rectangleConstraintClazz = Class.forName("org.jfree.chart.block.RectangleConstraint");
            setStaticField(rectangleConstraintClazz, "NONE", none1);
            BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
            TextTitle centerBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
            setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "centerBlock", centerBlock);
            
            borderArrangement.arrangeNN(null, null);
        } finally {
            setStaticField(LengthConstraintType.class, "NONE", prevNONE);
            setStaticField(RectangleConstraint.class, "NONE", prevNONE1);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.block.BorderArrangement}
     * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#arrangeNN(org.jfree.chart.block.BlockContainer,java.awt.Graphics2D)}
     */
    @Test
    public void testArrangeNN() {
        BorderArrangement borderArrangement = new BorderArrangement();
        GridArrangement gridArrangement = new GridArrangement(-1, 1);
        BlockContainer blockContainer = new BlockContainer(gridArrangement);
        BorderArrangement borderArrangement1 = new BorderArrangement();
        blockContainer.setArrangement(borderArrangement1);
        blockContainer.setPadding(null);
        RectangleInsets rectangleInsets = new RectangleInsets();
        blockContainer.setMargin(rectangleInsets);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float(1.0f, 0.0f, 1.0f, 0.0f);
        float1.y = -1.0f;
        float1.height = -1.0f;
        float1.width = -1.0f;
        float1.x = java.lang.Float.NEGATIVE_INFINITY;
        blockContainer.setBounds(float1);
        RectangleInsets rectangleInsets1 = new RectangleInsets();
        LineBorder lineBorder = new LineBorder(null, null, rectangleInsets1);
        blockContainer.setFrame(lineBorder);
        blockContainer.setWidth(-1.000030517578125);
        blockContainer.setHeight(0.0);
        
        Size2D actual = borderArrangement.arrangeNN(blockContainer, null);
        
        Size2D expected = new Size2D(0.0, 0.0);
        
        // org.jfree.chart.util.Size2D has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.jfree.chart.block.Block, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#add(org.jfree.chart.block.Block,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 *  */
    @Test
    public void testAdd_KeyEqualsNull() {
        BorderArrangement borderArrangement = new BorderArrangement();
        
        borderArrangement.add(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#add(org.jfree.chart.block.Block,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): True}
 *  */
    @Test
    public void testAdd_EdgeEqualsRectangleEdgeTOP() throws Exception  {
        RectangleEdge prevTOP = RectangleEdge.TOP;
        try {
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            BorderArrangement borderArrangement = new BorderArrangement();
            
            borderArrangement.add(null, top);
        } finally {
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#add(org.jfree.chart.block.Block,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): True}
 *  */
    @Test
    public void testAdd_EdgeEqualsRectangleEdgeBOTTOM() throws Exception  {
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            BorderArrangement borderArrangement = new BorderArrangement();
            
            borderArrangement.add(null, bottom);
        } finally {
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#add(org.jfree.chart.block.Block,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.LEFT): True}
 *  */
    @Test
    public void testAdd_EdgeEqualsRectangleEdgeLEFT() throws Exception  {
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name1);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            BorderArrangement borderArrangement = new BorderArrangement();
            
            borderArrangement.add(null, left);
        } finally {
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#add(org.jfree.chart.block.Block,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.LEFT): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.RIGHT): False}
 *  */
    @Test
    public void testAdd_EdgeNotEqualsRectangleEdgeRIGHT() throws Exception  {
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.RIGHT";
            setField(right, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name1);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name2);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name3);
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            BorderArrangement borderArrangement = new BorderArrangement();
            RectangleEdge rectangleEdge = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            
            borderArrangement.add(null, rectangleEdge);
        } finally {
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#add(org.jfree.chart.block.Block,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.TOP): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.BOTTOM): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.LEFT): False}
 * @utbot.executesCondition {@code (edge == RectangleEdge.RIGHT): True}
 *  */
    @Test
    public void testAdd_EdgeEqualsRectangleEdgeRIGHT() throws Exception  {
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name1);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name2);
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            BorderArrangement borderArrangement = new BorderArrangement();
            
            borderArrangement.add(null, right);
        } finally {
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.jfree.chart.block.Block, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#add(org.jfree.chart.block.Block,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: RectangleEdge edge = (RectangleEdge) key;
 *  */
    @Test
    public void testAdd_ThrowClassCastException() {
        BorderArrangement borderArrangement = new BorderArrangement();
        byte[] byteArray = {};
        
        /* This test fails because method [org.jfree.chart.block.BorderArrangement.add] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jfree.chart.util.RectangleEdge ([B is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jfree.chart.block.BorderArrangement.add(BorderArrangement.java:102) */
        borderArrangement.add(null, byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfBorderArrangement() {
        BorderArrangement borderArrangement = new BorderArrangement();
        
        boolean actual = borderArrangement.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() {
        BorderArrangement borderArrangement = new BorderArrangement();
        
        boolean actual = borderArrangement.equals(borderArrangement);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfBorderArrangement() throws Exception  {
        BorderArrangement borderArrangement = new BorderArrangement();
        BorderArrangement borderArrangement1 = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        LegendTitle topBlock = ((LegendTitle) createInstance("org.jfree.chart.title.LegendTitle"));
        setField(borderArrangement1, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
        
        boolean actual = borderArrangement.equals(borderArrangement1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfBorderArrangement_1() throws Exception  {
        BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        TextTitle topBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
        setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
        BorderArrangement borderArrangement1 = new BorderArrangement();
        
        boolean actual = borderArrangement.equals(borderArrangement1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfBorderArrangement_5() throws Exception  {
        BorderArrangement borderArrangement = new BorderArrangement();
        BorderArrangement borderArrangement1 = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        LegendTitle bottomBlock = ((LegendTitle) createInstance("org.jfree.chart.title.LegendTitle"));
        setField(borderArrangement1, "org.jfree.chart.block.BorderArrangement", "bottomBlock", bottomBlock);
        
        boolean actual = borderArrangement.equals(borderArrangement1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfBorderArrangement_6() throws Exception  {
        BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        LegendTitle topBlock = ((LegendTitle) createInstance("org.jfree.chart.title.LegendTitle"));
        setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
        BlockContainer bottomBlock = ((BlockContainer) createInstance("org.jfree.chart.block.BlockContainer"));
        setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "bottomBlock", bottomBlock);
        BorderArrangement borderArrangement1 = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        setField(borderArrangement1, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
        
        boolean actual = borderArrangement.equals(borderArrangement1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfBorderArrangement_2() throws Exception  {
        BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        TextTitle topBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
        setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
        BorderArrangement borderArrangement1 = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        TextTitle topBlock1 = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
        String id = "";
        setField(topBlock1, "org.jfree.chart.block.AbstractBlock", "id", id);
        setField(borderArrangement1, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock1);
        
        boolean actual = borderArrangement.equals(borderArrangement1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): False}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectUtilities#equal(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testEquals_ObjectUtilitiesEqual() throws Exception  {
        BorderArrangement borderArrangement = new BorderArrangement();
        BorderArrangement borderArrangement1 = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        LegendTitle leftBlock = ((LegendTitle) createInstance("org.jfree.chart.title.LegendTitle"));
        setField(borderArrangement1, "org.jfree.chart.block.BorderArrangement", "leftBlock", leftBlock);
        
        boolean actual = borderArrangement.equals(borderArrangement1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfBorderArrangement_3() throws Exception  {
        BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        TextTitle topBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
        LineBorder frame = ((LineBorder) createInstance("org.jfree.chart.block.LineBorder"));
        topBlock.setFrame(frame);
        setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
        BorderArrangement borderArrangement1 = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        TextTitle topBlock1 = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
        setField(borderArrangement1, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock1);
        
        boolean actual = borderArrangement.equals(borderArrangement1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof BorderArrangement)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfBorderArrangement_4() throws Exception  {
        BorderArrangement borderArrangement = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        TextTitle topBlock = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
        LineBorder frame = ((LineBorder) createInstance("org.jfree.chart.block.LineBorder"));
        topBlock.setFrame(frame);
        Rectangle bounds = ((Rectangle) createInstance("java.awt.Rectangle"));
        topBlock.setBounds(bounds);
        setField(borderArrangement, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock);
        BorderArrangement borderArrangement1 = ((BorderArrangement) createInstance("org.jfree.chart.block.BorderArrangement"));
        TextTitle topBlock1 = ((TextTitle) createInstance("org.jfree.chart.title.TextTitle"));
        topBlock1.setFrame(frame);
        setField(borderArrangement1, "org.jfree.chart.block.BorderArrangement", "topBlock", topBlock1);
        
        boolean actual = borderArrangement.equals(borderArrangement1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.block.BorderArrangement.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link BorderArrangement}
 * @utbot.methodUnderTest {@link org.jfree.chart.block.BorderArrangement#clear()}
 *  */
    @Test
    public void testClear() {
        BorderArrangement borderArrangement = new BorderArrangement();
        
        borderArrangement.clear();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields797846026214300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields797846026214300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass797846026230500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797846026214300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797846026230500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields797846027075100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields797846027075100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass797846027083000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797846027075100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797846027083000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

