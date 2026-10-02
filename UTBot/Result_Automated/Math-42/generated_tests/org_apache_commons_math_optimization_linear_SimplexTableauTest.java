package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import java.lang.reflect.Method;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.optimization.RealPointValuePair;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_optimization_linear_SimplexTableauTest {
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        boolean actual = simplexTableau.equals(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndMaxUlpsNotEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -256);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 4.9E-324);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -256);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.0E-323);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndMaxUlpsNotEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.2250738585072014E-308);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", 1);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.2250738585072014E-308);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfSimplexTableau() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        boolean actual = simplexTableau.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 3.137047647055637E241);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -248);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 9.885011677026627E136);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -9.552042274961374E-115);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -248);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 9.885011677026627E136);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -2.376364457868951E-212);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -2.376364457868951E-212);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 2.590327E-318);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 0.0);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -254);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 2.590327E-318);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -0.0);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -254);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -9.178347367391382E192);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.0522772085141574E-289);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -248);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -9.178347367391382E192);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.0522772085141574E-289);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -248);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_12() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.0522684006491881E-289);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 9.691603531647977E-268);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -192);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(coefficients1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients1);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.0522684006491881E-289);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 9.691603531647977E-268);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -192);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -248);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.145250165905085E155);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -248);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.145250165905085E155);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
        
        List finalSimplexTableau1Constraints = ((List) getFieldValue(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints"));
        
        assertNull(finalSimplexTableau1Constraints);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_11() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {3.247587140260481E32};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.70826078809316E-309);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -248);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -3.4457160440875926E-282);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -254);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {-8.61420780303211E-283};
        setField(coefficients1, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients1);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.70826078809316E-309);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -248);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -3.4457160440875926E-282);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -254);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -8.086472612719538E-174);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -8.086472612719538E-174);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -2.937097493229506E-306);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -2.937097493229506E-306);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -248);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.341153137226256E77);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -248);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.341153137226256E77);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_8() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.892884942306076E-269);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau1 = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(tableau1, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.892884942306076E-269);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
        
        RealMatrix simplexTableau1Tableau = ((RealMatrix) getFieldValue(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableau1TableauTableauData = ((double[][]) getFieldValue(simplexTableau1Tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableau1TableauData1 = ((double[]) get(simplexTableau1TableauTableauData, 1));
        
        assertNull(finalSimplexTableau1TableauData1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_10() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.97745327116E-313);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.97745327116E-313);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableauTableauData = ((double[][]) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(simplexTableauTableauTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof SimplexTableau): True}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndMaxUlpsEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_9() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 4.778309727014615E-299);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau1 = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 4.778309727014615E-299);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (other): False},
    ///     {@code (other instanceof SimplexTableau): True}
    /// return from: {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndMaxUlpsNotEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndMaxUlpsNotEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 1);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndMaxUlpsNotEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && (maxUlps == rhs.maxUlps) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndMaxUlpsNotEqualsRhsMaxUlpsAndFEqualsAndConstraintsEqualsAndTableauEquals_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.equals(rhs.tableau)
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.2379E-319);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau1 = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau1, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.2379E-319);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.linear.AbstractRealMatrix.equals(AbstractRealMatrix.java:918)
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:582) */
        simplexTableau.equals(simplexTableau1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.equals(rhs.tableau)
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -4.927631905696996E-299);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -4.927631905696996E-299);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.linear.AbstractRealMatrix.equals(AbstractRealMatrix.java:917)
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:582) */
        simplexTableau.equals(simplexTableau1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: f.equals(rhs.f)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -9.924161033296232E-265);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -9.924161033296232E-265);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:580) */
        simplexTableau.equals(simplexTableau1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.equals(rhs.constraints)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.000000000000001);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.000000000000001);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:581) */
        simplexTableau.equals(simplexTableau1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.equals(rhs.constraints)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -4.7783097267364807E-299);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.0585396913426166E-289);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -4.7783097267364807E-299);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.0585396913426166E-289);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:581) */
        simplexTableau.equals(simplexTableau1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.equals(rhs.constraints)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -3.986487522537044E-309);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.7857968960284145E-270);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -240);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -3.986487522537044E-309);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.7857968960284145E-270);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -240);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:581) */
        simplexTableau.equals(simplexTableau1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.equals(rhs.tableau)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -4.787788470171358E-299);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -4.787788470171358E-299);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -256);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:582) */
        simplexTableau.equals(simplexTableau1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.equals(rhs.constraints)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {-4.9E-324};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 8.217152770830614E-289);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -256);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -3.395201097256E-312);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -252);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(coefficients1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients1);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 8.217152770830614E-289);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -256);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -3.395201097256E-312);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -252);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:581) */
        simplexTableau.equals(simplexTableau1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.returnsFrom {@code return Boolean.valueOf(restrictToNonNegative).hashCode() ^ numDecisionVariables ^ numSlackVariables ^ numArtificialVariables ^ Double.valueOf(epsilon).hashCode() ^ maxUlps ^ f.hashCode() ^ constraints.hashCode() ^ tableau.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnBooleanValueOfRestrictToNonNegativeHashCodeXorNumDecisionVariablesXorNumSlackVariablesXorNumArtificialVariablesXorDoubleValueOfEpsilonHashCodeXorMaxUlpsXorFHashCodeXorConstraintsHashCodeXorTableauHashCode() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.390671161567E-309);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        int actual = simplexTableau.hashCode();
        
        assertEquals(2147032755, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.returnsFrom {@code return Boolean.valueOf(restrictToNonNegative).hashCode() ^ numDecisionVariables ^ numSlackVariables ^ numArtificialVariables ^ Double.valueOf(epsilon).hashCode() ^ maxUlps ^ f.hashCode() ^ constraints.hashCode() ^ tableau.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnBooleanValueOfRestrictToNonNegativeHashCodeXorNumDecisionVariablesXorNumSlackVariablesXorNumArtificialVariablesXorDoubleValueOfEpsilonHashCodeXorMaxUlpsXorFHashCodeXorConstraintsHashCodeXorTableauHashCode_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        data1[0] = data;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 4.9E-324);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        int actual = simplexTableau.hashCode();
        
        assertEquals(2146967218, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.0864618449742E-311);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.linear.AbstractRealMatrix.hashCode(AbstractRealMatrix.java:940)
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:598) */
        simplexTableau.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: f.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -4.9E-324);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:596) */
        simplexTableau.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.4916681462400417E-154);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:681)
            org.apache.commons.math.optimization.linear.LinearObjectiveFunction.hashCode(LinearObjectiveFunction.java:123)
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:596) */
        simplexTableau.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {java.lang.Double.NaN};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.0000000000000004);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:597) */
        simplexTableau.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -2.0000000000000004);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:597) */
        simplexTableau.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {-2.0000000000000004, java.lang.Double.NaN};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -0.0);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:597) */
        simplexTableau.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraints.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {-2.0000000000000004};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.0000000000000004);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:597) */
        simplexTableau.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.0000000000000004);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "maxUlps", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:598) */
        simplexTableau.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ois.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.readObject(SimplexTableau.java:618) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = simplexTableauClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(simplexTableau, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: ois.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = simplexTableauClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(simplexTableau, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: ois.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = simplexTableauClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(simplexTableau, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = simplexTableauClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(simplexTableau, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = simplexTableauClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(simplexTableau, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: oos.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.writeObject] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.writeObject(SimplexTableau.java:607) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = simplexTableauClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(simplexTableau, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: oos.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = simplexTableauClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(simplexTableau, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: oos.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = simplexTableauClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(simplexTableau, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeObject
    
    public void testWriteObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.normalize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalize(org.apache.commons.math.optimization.linear.LinearConstraint)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#normalize(org.apache.commons.math.optimization.linear.LinearConstraint)}
 * @utbot.executesCondition {@code (constraint.getValue() < 0): False}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearConstraint#getCoefficients()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearConstraint#getRelationship()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearConstraint#getValue()}
 * @utbot.returnsFrom {@code return new LinearConstraint(constraint.getCoefficients(), constraint.getRelationship(), constraint.getValue());}
 *  */
    @Test
    public void testNormalize_ConstraintGetValueGreaterOrEqualZero() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearConstraint linearConstraint = new LinearConstraint(((RealVector) null), ((Relationship) null), -0.0);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        LinearConstraint actual = ((LinearConstraint) normalizeMethod.invoke(simplexTableau, normalizeMethodArguments));
        
        LinearConstraint expected = new LinearConstraint(((RealVector) null), ((Relationship) null), -0.0);
        
        // org.apache.commons.math.optimization.linear.LinearConstraint has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#normalize(org.apache.commons.math.optimization.linear.LinearConstraint)}
 * @utbot.executesCondition {@code (constraint.getValue() < 0): True}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearConstraint#getCoefficients()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#mapMultiply(double)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearConstraint#getRelationship()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.Relationship#oppositeRelationship()}
 *  */
    @Test
    public void testNormalize_ConstraintGetValueLessThanZero() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVector anonymousRealVector = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        ArrayRealVector val$v1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {4.9E-324};
        setField(val$v1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(val$v, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v1);
        setField(anonymousRealVector, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        Relationship relationship = Relationship.GEQ;
        LinearConstraint linearConstraint = new LinearConstraint(anonymousRealVector, relationship, -1.0609978955E-314);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        LinearConstraint actual = ((LinearConstraint) normalizeMethod.invoke(simplexTableau, normalizeMethodArguments));
        
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {-4.9E-324};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        Relationship relationship1 = Relationship.LEQ;
        LinearConstraint expected = new LinearConstraint(arrayRealVector, relationship1, 1.0609978955E-314);
        
        // org.apache.commons.math.optimization.linear.LinearConstraint has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalize(org.apache.commons.math.optimization.linear.LinearConstraint)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#normalize(org.apache.commons.math.optimization.linear.LinearConstraint)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: constraint.getValue() < 0
 *  */
    @Test
    public void testNormalize_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:260) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = ((Object) null);
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#normalize(org.apache.commons.math.optimization.linear.LinearConstraint)}
 * @utbot.executesCondition {@code (constraint.getValue() < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new LinearConstraint(constraint.getCoefficients().mapMultiply(-1), constraint.getRelationship().oppositeRelationship(), -1 * constraint.getValue());
 *  */
    @Test
    public void testNormalize_ThrowNullPointerException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearConstraint linearConstraint = new LinearConstraint(((RealVector) null), ((Relationship) null), -2.225073858507202E-308);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:261) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#normalize(org.apache.commons.math.optimization.linear.LinearConstraint)}
 * @utbot.executesCondition {@code (constraint.getValue() < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraint.getRelationship().oppositeRelationship()
 *  */
    @Test
    public void testNormalize_ThrowNullPointerException_3() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        LinearConstraint linearConstraint = new LinearConstraint(arrayRealVector, ((Relationship) null), -2.0522684006492465E-289);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:262) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#normalize(org.apache.commons.math.optimization.linear.LinearConstraint)}
 * @utbot.executesCondition {@code (constraint.getValue() < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraint.getRelationship().oppositeRelationship()
 *  */
    @Test
    public void testNormalize_ThrowNullPointerException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVector anonymousRealVector = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        ArrayRealVector val$v1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {7.29112201956966E-304};
        setField(val$v1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(val$v, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v1);
        setField(anonymousRealVector, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        LinearConstraint linearConstraint = new LinearConstraint(anonymousRealVector, ((Relationship) null), -2.0237E-320);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:262) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normalize(org.apache.commons.math.optimization.linear.LinearConstraint)
    
    @Test
    public void testNormalize1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVector anonymousRealVector = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        ArrayRealVector val$v1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {2.781342323134002E-309};
        setField(val$v1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(val$v, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v1);
        setField(anonymousRealVector, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        Relationship relationship = Relationship.EQ;
        LinearConstraint linearConstraint = new LinearConstraint(anonymousRealVector, relationship, -1.2882298307039035E-231);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        LinearConstraint actual = ((LinearConstraint) normalizeMethod.invoke(simplexTableau, normalizeMethodArguments));
        
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {-2.781342323134002E-309};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        LinearConstraint expected = new LinearConstraint(arrayRealVector, relationship, 1.2882298307039035E-231);
        
        // org.apache.commons.math.optimization.linear.LinearConstraint has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method normalize(org.apache.commons.math.optimization.linear.LinearConstraint)
    
    @Test
    public void testNormalize2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVector anonymousRealVector = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        OpenMapRealVector val$v1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(val$v1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(val$v, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v1);
        setField(anonymousRealVector, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        LinearConstraint linearConstraint = new LinearConstraint(anonymousRealVector, ((Relationship) null), -2.0000000000000004);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 10 out of bounds for double[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:180)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:303)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:33)
            org.apache.commons.math.linear.RealVector.mapMultiply(RealVector.java:527)
            org.apache.commons.math.linear.RealVector$2.mapMultiply(RealVector.java:1060)
            org.apache.commons.math.linear.RealVector$2.mapMultiply(RealVector.java:1060)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:261) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNormalize3() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        LinearConstraint linearConstraint = new LinearConstraint(openMapRealVector, ((Relationship) null), -2.0000000000000004);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:180)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:303)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:33)
            org.apache.commons.math.linear.RealVector.mapMultiply(RealVector.java:527)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:261) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNormalize4() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        LinearConstraint linearConstraint = new LinearConstraint(openMapRealVector, ((Relationship) null), -2.0522684006491886E-289);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:180)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:303)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:33)
            org.apache.commons.math.linear.RealVector.mapMultiply(RealVector.java:527)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:261) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNormalize5() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVector anonymousRealVector = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        OpenMapRealVector val$v1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(val$v1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(val$v, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v1);
        setField(anonymousRealVector, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        LinearConstraint linearConstraint = new LinearConstraint(anonymousRealVector, ((Relationship) null), -2.0000000000000004);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:180)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:303)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:33)
            org.apache.commons.math.linear.RealVector.mapMultiply(RealVector.java:527)
            org.apache.commons.math.linear.RealVector$2.mapMultiply(RealVector.java:1060)
            org.apache.commons.math.linear.RealVector$2.mapMultiply(RealVector.java:1060)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:261) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNormalize6() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVector anonymousRealVector = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        OpenMapRealVector val$v1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(val$v1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(val$v, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v1);
        setField(anonymousRealVector, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        LinearConstraint linearConstraint = new LinearConstraint(anonymousRealVector, ((Relationship) null), -2.0000000000000004);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:180)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:303)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:33)
            org.apache.commons.math.linear.RealVector.mapMultiply(RealVector.java:527)
            org.apache.commons.math.linear.RealVector$2.mapMultiply(RealVector.java:1060)
            org.apache.commons.math.linear.RealVector$2.mapMultiply(RealVector.java:1060)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:261) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        try {
            normalizeMethod.invoke(simplexTableau, normalizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.returnsFrom {@code return tableau.getEntry(row, column);}
 *  */
    @Test
    public void testGetEntry_ReturnTableauGetEntry_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double actual = simplexTableau.getEntry(0, 0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.returnsFrom {@code return tableau.getEntry(row, column);}
 *  */
    @Test
    public void testGetEntry_ReturnTableauGetEntry_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double actual = simplexTableau.getEntry(0, 0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.returnsFrom {@code return tableau.getEntry(row, column);}
 *  */
    @Test
    public void testGetEntry_ReturnTableauGetEntry() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double actual = simplexTableau.getEntry(1073741823, 1073741823);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.returnsFrom {@code return tableau.getEntry(row, column);}
 *  */
    @Test
    public void testGetEntry_ReturnTableauGetEntry_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double actual = simplexTableau.getEntry(1073741823, 1073741823);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.returnsFrom {@code return tableau.getEntry(row, column);}
 *  */
    @Test
    public void testGetEntry_ReturnTableauGetEntry_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double actual = simplexTableau.getEntry(0, 0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = new double[34];
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0, 0.0};
        data[1] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 2]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:295)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(1, 33);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(1073741823, 1073741823);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, -2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(1073741823, 1073741823);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 538592137);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 276860272);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-13628178, -684687122};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 4};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(538592136, 276860271);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(-255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480) */
        simplexTableau.getEntry(1073741823, 1073741823);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, -255);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getEntry(int, int)
    
    @Test(timeout = 1000L)
    public void testGetEntry1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 563714457);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2147483643);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = 1;
        keys[5] = 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[14];
        states[0] = (byte) 1;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[4] = java.lang.Byte.MIN_VALUE;
        states[5] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexTableau.getEntry(429496728, 2147483640);
    }
    
    @Test(timeout = 1000L)
    public void testGetEntry2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1437378132);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2147483645);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 1, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[14];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[4] = java.lang.Byte.MIN_VALUE;
        states[5] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexTableau.getEntry(1431655763, 2147483641);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getData()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.returnsFrom {@code return tableau.getData();}
 *  */
    @Test
    public void testGetData_ReturnTableauGetData_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double[][] actual = simplexTableau.getData();
        
        double[][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.returnsFrom {@code return tableau.getData();}
 *  */
    @Test
    public void testGetData_ReturnTableauGetData_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double[][] actual = simplexTableau.getData();
        
        double[][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.returnsFrom {@code return tableau.getData();}
 *  */
    @Test
    public void testGetData_ReturnTableauGetData_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double[][] actual = simplexTableau.getData();
        
        double[][] expected = new double[1][];
        double[] doubleArray1 = {};
        expected[0] = doubleArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.returnsFrom {@code return tableau.getData();}
 *  */
    @Test
    public void testGetData_ReturnTableauGetData_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double[][] actual = simplexTableau.getData();
        
        double[][] expected = new double[1][];
        double[] doubleArray1 = {};
        expected[0] = doubleArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.returnsFrom {@code return tableau.getData();}
 *  */
    @Test
    public void testGetData_ReturnTableauGetData() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double[][] actual = simplexTableau.getData();
        
        double[][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getData()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return tableau.getData();
 *  */
    @Test
    public void testGetData_ThrowNegativeArraySizeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.linear.BlockRealMatrix.getData(BlockRealMatrix.java:580)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:506)
            org.apache.commons.math.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getData();
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.getData(BlockRealMatrix.java:593)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getData();
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.getData(BlockRealMatrix.java:596)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getData();
 *  */
    @Test
    public void testGetData_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getData();
 *  */
    @Test
    public void testGetData_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:509)
            org.apache.commons.math.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getData();
 *  */
    @Test
    public void testGetData_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = {null};
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BlockRealMatrix.getData(BlockRealMatrix.java:596)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getData();
 *  */
    @Test
    public void testGetData_ThrowNullPointerException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = {null};
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BlockRealMatrix.getData(BlockRealMatrix.java:593)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getData()
    
    @Test
    public void testGetData1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        blocks[0] = doubleArray;
        blocks[1] = ((double[]) null);
        blocks[2] = ((double[]) null);
        blocks[3] = ((double[]) null);
        blocks[4] = ((double[]) null);
        blocks[5] = ((double[]) null);
        blocks[6] = ((double[]) null);
        blocks[7] = ((double[]) null);
        blocks[8] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 5);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 52 out of bounds for double[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BlockRealMatrix.getData(BlockRealMatrix.java:596)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    @Test
    public void testGetData2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        blocks[0] = doubleArray;
        blocks[1] = ((double[]) null);
        blocks[2] = ((double[]) null);
        blocks[3] = ((double[]) null);
        blocks[4] = ((double[]) null);
        blocks[5] = ((double[]) null);
        blocks[6] = ((double[]) null);
        blocks[7] = ((double[]) null);
        blocks[8] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 5);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 52 out of bounds for double[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BlockRealMatrix.getData(BlockRealMatrix.java:593)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    @Test
    public void testGetData3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:509)
            org.apache.commons.math.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    @Test
    public void testGetData4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 7);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 9);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BlockRealMatrix.getData(BlockRealMatrix.java:596)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    
    @Test
    public void testGetData5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[4][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = doubleArray;
        data[2] = doubleArray;
        data[3] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:509)
            org.apache.commons.math.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:561) */
        simplexTableau.getData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.setEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 *  */
    @Test
    public void testSetEntry() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(0, 0, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 *  */
    @Test
    public void testSetEntry_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 *  */
    @Test
    public void testSetEntry_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableauTableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] simplexTableauTableauTableauEntriesTableauEntriesKeys = ((int[]) getFieldValue(simplexTableauTableauTableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int finalSimplexTableauTableauEntriesKeys0 = ((Integer) get(simplexTableauTableauTableauEntriesTableauEntriesKeys, 0));
        RealMatrix simplexTableauTableau1 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau1TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] simplexTableauTableau1TableauEntriesTableauEntriesStates = ((byte[]) getFieldValue(simplexTableauTableau1TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalSimplexTableauTableauEntriesStates0 = ((Byte) get(simplexTableauTableau1TableauEntriesTableauEntriesStates, 0));
        RealMatrix simplexTableauTableau2 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau2TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau2, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesSize = ((Integer) getFieldValue(simplexTableauTableau2TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        RealMatrix simplexTableauTableau3 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau3TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau3, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesCount = ((Integer) getFieldValue(simplexTableauTableau3TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        
        assertEquals(0, finalSimplexTableauTableauEntriesKeys0);
        
        assertEquals((byte) 2, finalSimplexTableauTableauEntriesStates0);
        
        assertEquals(-1, finalSimplexTableauTableauEntriesSize);
        
        assertEquals(1, finalSimplexTableauTableauEntriesCount);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 *  */
    @Test
    public void testSetEntry_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -38027265);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -76054525);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(0, 0, 2.0522684006496548E-289);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableauTableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] simplexTableauTableauTableauEntriesTableauEntriesValues = ((double[]) getFieldValue(simplexTableauTableauTableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double finalSimplexTableauTableauEntriesValues0 = ((Double) get(simplexTableauTableauTableauEntriesTableauEntriesValues, 0));
        RealMatrix simplexTableauTableau1 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau1TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] simplexTableauTableau1TableauEntriesTableauEntriesStates = ((byte[]) getFieldValue(simplexTableauTableau1TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalSimplexTableauTableauEntriesStates0 = ((Byte) get(simplexTableauTableau1TableauEntriesTableauEntriesStates, 0));
        RealMatrix simplexTableauTableau2 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau2TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau2, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesSize = ((Integer) getFieldValue(simplexTableauTableau2TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        RealMatrix simplexTableauTableau3 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau3TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau3, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesCount = ((Integer) getFieldValue(simplexTableauTableau3TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        
        org.junit.Assert.assertEquals(2.0522684006496548E-289, finalSimplexTableauTableauEntriesValues0, 1.0E-6);
        
        assertEquals((byte) 1, finalSimplexTableauTableauEntriesStates0);
        
        assertEquals(-38027264, finalSimplexTableauTableauEntriesSize);
        
        assertEquals(1, finalSimplexTableauTableauEntriesCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -235868385);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868385 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:233)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:233)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:357)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:233)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:393)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:233)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -235868385);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868385 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1073741823, 1073741823, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:417)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(-255, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:233)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(0, 0, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:233)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(0, 0, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:233)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:273)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:393)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:233)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(0, 0, 2.225073858507202E-308);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setEntry(row, column, value);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setEntry(row, column, value);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(-1, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setEntry(row, column, value);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setEntry(row, column, value);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(0, -1, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setEntry(int, int, double)
    
    @Test
    public void testSetEntry1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 3085);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1982956201);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(3084, 147849729, -0.0);
    }
    
    @Test
    public void testSetEntry2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1487673323);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1468414648);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[27];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[27];
        values[0] = java.lang.Double.NaN;
        values[1] = java.lang.Double.NaN;
        values[2] = java.lang.Double.NaN;
        values[3] = java.lang.Double.NaN;
        values[4] = java.lang.Double.NaN;
        values[5] = java.lang.Double.NaN;
        values[6] = java.lang.Double.NaN;
        values[7] = java.lang.Double.NaN;
        values[8] = java.lang.Double.NaN;
        values[9] = java.lang.Double.NaN;
        values[10] = java.lang.Double.NaN;
        values[11] = java.lang.Double.NaN;
        values[12] = java.lang.Double.NaN;
        values[13] = java.lang.Double.NaN;
        values[14] = java.lang.Double.NaN;
        values[15] = java.lang.Double.NaN;
        values[16] = java.lang.Double.NaN;
        values[17] = java.lang.Double.NaN;
        values[18] = java.lang.Double.NaN;
        values[19] = java.lang.Double.NaN;
        values[20] = java.lang.Double.NaN;
        values[21] = java.lang.Double.NaN;
        values[22] = java.lang.Double.NaN;
        values[23] = java.lang.Double.NaN;
        values[24] = java.lang.Double.NaN;
        values[25] = java.lang.Double.NaN;
        values[26] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[27];
        states[10] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 26);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(1483544554, 1234307322, 2.848094549499197E-306);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableauTableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] simplexTableauTableauTableauEntriesTableauEntriesKeys = ((int[]) getFieldValue(simplexTableauTableauTableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int finalSimplexTableauTableauEntriesKeys26 = ((Integer) get(simplexTableauTableauTableauEntriesTableauEntriesKeys, 26));
        RealMatrix simplexTableauTableau1 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau1TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] simplexTableauTableau1TableauEntriesTableauEntriesValues = ((double[]) getFieldValue(simplexTableauTableau1TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double finalSimplexTableauTableauEntriesValues26 = ((Double) get(simplexTableauTableau1TableauEntriesTableauEntriesValues, 26));
        RealMatrix simplexTableauTableau2 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau2TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau2, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] simplexTableauTableau2TableauEntriesTableauEntriesStates = ((byte[]) getFieldValue(simplexTableauTableau2TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalSimplexTableauTableauEntriesStates26 = ((Byte) get(simplexTableauTableau2TableauEntriesTableauEntriesStates, 26));
        RealMatrix simplexTableauTableau3 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        OpenIntToDoubleHashMap simplexTableauTableau3TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(simplexTableauTableau3, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesSize = ((Integer) getFieldValue(simplexTableauTableau3TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        
        assertEquals(-1713226454, finalSimplexTableauTableauEntriesKeys26);
        
        org.junit.Assert.assertEquals(2.848094549499197E-306, finalSimplexTableauTableauEntriesValues26, 1.0E-6);
        
        assertEquals((byte) 1, finalSimplexTableauTableauEntriesStates26);
        
        assertEquals(1, finalSimplexTableauTableauEntriesSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setEntry(int, int, double)
    
    @Test
    public void testSetEntry3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", Integer.MAX_VALUE);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexTableau.setEntry(2147483646, 2147483646, -0.0);
    }
    
    @Test
    public void testSetEntry4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", Integer.MAX_VALUE);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexTableau.setEntry(2147483646, 2147483646, -0.0);
    }
    
    @Test
    public void testSetEntry5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1896451868);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1257534259);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 3, 3, 3, 3, 3, 3, 3,
            3, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[29];
        states[9] = (byte) 1;
        states[25] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 25);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 10]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:285)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1351192217, 947912771, 2.052268400708917E-289);
    }
    
    @Test
    public void testSetEntry6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1582359613);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1301231353);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[37];
        states[32] = (byte) 1;
        states[36] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 32]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:306)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1582359612, 1279266640, -2.848094538889258E-306);
    }
    
    @Test
    public void testSetEntry7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2056282277);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1504404282);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        keys[0] = 536870912;
        keys[1] = 536870912;
        keys[2] = 536870912;
        keys[3] = 536870912;
        keys[4] = 536870912;
        keys[5] = 536870912;
        keys[6] = 536870912;
        keys[7] = 536870912;
        keys[8] = 536870912;
        keys[9] = 536870912;
        keys[10] = 536870912;
        keys[11] = 536870912;
        keys[12] = 536870912;
        keys[13] = 536870912;
        keys[14] = 536870912;
        keys[15] = 536870912;
        keys[16] = 536870912;
        keys[17] = 536870912;
        keys[18] = 536870912;
        keys[19] = 536870912;
        keys[20] = 536870912;
        keys[21] = 536870912;
        keys[22] = 536870912;
        keys[23] = 536870912;
        keys[24] = 536870912;
        keys[25] = 536870912;
        keys[26] = 536870912;
        keys[27] = 536870912;
        keys[28] = 536870912;
        keys[29] = 536870912;
        keys[30] = 536870912;
        keys[31] = 536870912;
        keys[32] = 536870912;
        keys[33] = 536870912;
        keys[34] = 536870912;
        keys[35] = 536870912;
        keys[36] = 536870912;
        keys[37] = 536870912;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[39];
        states[38] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 166);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 164 out of bounds for length 39]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:285)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(2056016036, 684134933, java.lang.Double.NaN);
    }
    
    @Test
    public void testSetEntry8() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1476936334);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2009583525);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[17];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[39];
        states[32] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 17]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:273)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1476936331, 1612809674, 4.778309727014615E-299);
    }
    
    @Test
    public void testSetEntry9() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2127830190);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1755385355);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[33];
        keys[0] = 36;
        keys[1] = 36;
        keys[2] = 36;
        keys[3] = 36;
        keys[4] = 36;
        keys[5] = 36;
        keys[6] = 36;
        keys[7] = 36;
        keys[8] = 36;
        keys[9] = 36;
        keys[10] = 36;
        keys[11] = 36;
        keys[12] = 36;
        keys[13] = 36;
        keys[14] = 36;
        keys[15] = 36;
        keys[16] = 36;
        keys[17] = 36;
        keys[18] = 36;
        keys[19] = 36;
        keys[20] = 36;
        keys[21] = 36;
        keys[22] = 36;
        keys[23] = 36;
        keys[24] = 36;
        keys[25] = 36;
        keys[26] = 36;
        keys[27] = 36;
        keys[28] = 36;
        keys[29] = 36;
        keys[30] = 36;
        keys[31] = 36;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[37];
        states[32] = (byte) 1;
        states[36] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 36 out of bounds for length 33]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:415)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(2127829663, 1039609268, -1.2882395823324662E-231);
    }
    
    @Test
    public void testSetEntry10() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1216349697);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1076888224);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1076888224, -2146598400, 1076888224, 1076888224, 1076888224, 1076888224, 1076888224, 1076888224,
            1076888224, 1076888224
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[19];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:412)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(411043072, 1073766912, 2.848094708648881E-306);
    }
    
    @Test
    public void testSetEntry11() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1317539756);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 737669173);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1118488337, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:412)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1313345449, 137492, java.lang.Double.NaN);
    }
    
    @Test
    public void testSetEntry12() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2046837287);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1443709759);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[35];
        keys[0] = 3;
        keys[1] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        keys[13] = 3;
        keys[14] = 3;
        keys[15] = 3;
        keys[16] = 3;
        keys[17] = 3;
        keys[18] = 3;
        keys[19] = 3;
        keys[20] = 3;
        keys[21] = 3;
        keys[22] = 3;
        keys[23] = 3;
        keys[24] = 3;
        keys[25] = 3;
        keys[26] = 3;
        keys[27] = 3;
        keys[28] = 3;
        keys[29] = 3;
        keys[30] = 3;
        keys[31] = 3;
        keys[32] = 3;
        keys[33] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[35];
        states[34] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 34);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:417)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(2030060070, 939616812, 2.0522684006494214E-289);
    }
    
    @Test
    public void testSetEntry13() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1582359613);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1301231353);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[37];
        states[32] = (byte) 1;
        states[36] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:306)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:490) */
        simplexTableau.setEntry(1582359612, 1279266640, -2.848094538889258E-306);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method setEntry(int, int, double)
    
    @Test(timeout = 1000L)
    public void testSetEntry14() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", Integer.MAX_VALUE);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexTableau.setEntry(2147483646, 2147483646, -0.0);
    }
    
    @Test(timeout = 1000L)
    public void testSetEntry15() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", Integer.MAX_VALUE);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexTableau.setEntry(2147483646, 2147483646, -0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getWidth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWidth()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.returnsFrom {@code return tableau.getColumnDimension();}
 *  */
    @Test
    public void testGetWidth_ReturnTableauGetColumnDimension() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getWidth();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.returnsFrom {@code return tableau.getColumnDimension();}
 *  */
    @Test
    public void testGetWidth_ReturnTableauGetColumnDimension_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getWidth();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.returnsFrom {@code return tableau.getColumnDimension();}
 *  */
    @Test
    public void testGetWidth_ReturnTableauGetColumnDimension_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getWidth();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.returnsFrom {@code return tableau.getColumnDimension();}
 *  */
    @Test
    public void testGetWidth_ReturnTableauGetColumnDimension_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getWidth();
        
        assertEquals(0, actual);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableauTableauData = ((double[][]) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(simplexTableauTableauTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.returnsFrom {@code return tableau.getColumnDimension();}
 *  */
    @Test
    public void testGetWidth_ReturnTableauGetColumnDimension_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getWidth();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWidth()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getColumnDimension();
 *  */
    @Test
    public void testGetWidth_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getWidth] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:463) */
        simplexTableau.getWidth();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getColumnDimension();
 *  */
    @Test
    public void testGetWidth_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getWidth] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:463) */
        simplexTableau.getWidth();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.createTableau
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTableau(boolean)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.executesCondition {@code (maximize): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#toArray()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: copyArray(objectiveCoefficients.toArray(), matrix.getDataRef()[zIndex]);
 *  */
    @Test
    public void testCreateTableau_ThrowNegativeArraySizeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MIN_VALUE);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:658)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:194) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int height = constraints.size() + getNumObjectiveFunctions();
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:183) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int height = constraints.size() + getNumObjectiveFunctions();
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:183) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.executesCondition {@code (maximize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: copyArray(objectiveCoefficients.toArray(), matrix.getDataRef()[zIndex]);
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:194) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.executesCondition {@code (maximize): True}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getCoefficients()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#mapMultiply(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: f.getCoefficients().mapMultiply(-1)
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:193) */
        simplexTableau.createTableau(true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createTableau(boolean)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumObjectiveFunctions()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumObjectiveFunctions()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(height, width);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testCreateTableau_ThrowNotStrictlyPositiveException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -2);
        
        simplexTableau.createTableau(false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createTableau(boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateTableau1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        setField(coefficients, "org.apache.commons.math.linear.RealVector$2", "val$v", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 7);
        
        simplexTableau.createTableau(true);
    }
    
    @Test
    public void testCreateTableau2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 27);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:193) */
        simplexTableau.createTableau(false);
    }
    
    @Test
    public void testCreateTableau3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 27);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:193) */
        simplexTableau.createTableau(true);
    }
    
    @Test
    public void testCreateTableau4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 6);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:193) */
        simplexTableau.createTableau(false);
    }
    
    @Test
    public void testCreateTableau5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {1.32624737E-315};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 13);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 1610612736);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -1610612735);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:211) */
        simplexTableau.createTableau(true);
    }
    
    @Test
    public void testCreateTableau6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 7);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:569)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:503)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:481)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:238)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:659)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:194) */
        simplexTableau.createTableau(false);
    }
    
    @Test
    public void testCreateTableau7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        OpenMapRealVector val$v = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(coefficients, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 7);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:180)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:303)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:33)
            org.apache.commons.math.linear.RealVector.mapMultiply(RealVector.java:527)
            org.apache.commons.math.linear.RealVector$2.mapMultiply(RealVector.java:1060)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:193) */
        simplexTableau.createTableau(true);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createTableau(boolean)
    
    @Test(expected = OutOfRangeException.class)
    public void testCreateTableau8() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            1.358077306218E-312, 7.291122026346784E-304, 3.785766995788769E-270, 1.61895E-319, 2.0E-323, 1.295163E-318,
            8.4879831639E-314, 7.291122021253994E-304, 0.0, 6.7903865311E-313
        };
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 131506884);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 805920080);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -937426944);
        
        simplexTableau.createTableau(false);
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testCreateTableau9() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 2147483646);
        
        simplexTableau.createTableau(false);
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testCreateTableau10() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        ArrayRealVector val$v = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {2.0E-323};
        setField(val$v, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(coefficients, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 2021672734);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -989167603);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -1032505121);
        
        simplexTableau.createTableau(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.copyArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyArray([D, [D)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#copyArray(double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCopyArray_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        double[] doubleArray = {};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.copyArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(SimplexTableau.java:374) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class doubleArrayType = Class.forName("[D");
        Method copyArrayMethod = simplexTableauClazz.getDeclaredMethod("copyArray", doubleArrayType, doubleArrayType);
        copyArrayMethod.setAccessible(true);
        java.lang.Object[] copyArrayMethodArguments = new java.lang.Object[2];
        copyArrayMethodArguments[0] = ((Object) doubleArray);
        copyArrayMethodArguments[1] = ((Object) doubleArray1);
        try {
            copyArrayMethod.invoke(simplexTableau, copyArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#copyArray(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
 *  */
    @Test
    public void testCopyArray_ThrowNullPointerException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.copyArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(SimplexTableau.java:374) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class doubleArrayType = Class.forName("[D");
        Method copyArrayMethod = simplexTableauClazz.getDeclaredMethod("copyArray", doubleArrayType, doubleArrayType);
        copyArrayMethod.setAccessible(true);
        java.lang.Object[] copyArrayMethodArguments = new java.lang.Object[2];
        copyArrayMethodArguments[0] = ((Object) doubleArray);
        copyArrayMethodArguments[1] = ((Object) null);
        try {
            copyArrayMethod.invoke(simplexTableau, copyArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#copyArray(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
 *  */
    @Test
    public void testCopyArray_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.copyArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(SimplexTableau.java:374) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class doubleArrayType = Class.forName("[D");
        Method copyArrayMethod = simplexTableauClazz.getDeclaredMethod("copyArray", doubleArrayType, doubleArrayType);
        copyArrayMethod.setAccessible(true);
        java.lang.Object[] copyArrayMethodArguments = new java.lang.Object[2];
        copyArrayMethodArguments[0] = ((Object) null);
        copyArrayMethodArguments[1] = ((Object) null);
        try {
            copyArrayMethod.invoke(simplexTableau, copyArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#copyArray(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
 *  */
    @Test
    public void testCopyArray_ThrowNullPointerException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.copyArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(SimplexTableau.java:374) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class doubleArrayType = Class.forName("[D");
        Method copyArrayMethod = simplexTableauClazz.getDeclaredMethod("copyArray", doubleArrayType, doubleArrayType);
        copyArrayMethod.setAccessible(true);
        java.lang.Object[] copyArrayMethodArguments = new java.lang.Object[2];
        copyArrayMethodArguments[0] = ((Object) null);
        copyArrayMethodArguments[1] = ((Object) null);
        try {
            copyArrayMethod.invoke(simplexTableau, copyArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBasicRow(int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.returnsFrom {@code return row;}
 *  */
    @Test
    public void testGetBasicRow_IterateForLoop() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Integer actual = simplexTableau.getBasicRow(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.returnsFrom {@code return row;}
 *  */
    @Test
    public void testGetBasicRow_IterateForLoop_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Integer actual = simplexTableau.getBasicRow(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.returnsFrom {@code return row;}
 *  */
    @Test
    public void testGetBasicRow_IterateForLoop_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Integer actual = simplexTableau.getBasicRow(-255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBasicRow(int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = getEntry(i, col);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetBasicRow_ThrowOutOfRangeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getBasicRow(-1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = getEntry(i, col);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetBasicRow_ThrowOutOfRangeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getBasicRow(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBasicRow(int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 96);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 64);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 64 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(95);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 128);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-128};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(127);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 128);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-128, -128};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(127);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 128);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-128};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(127);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 128);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(127);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getHeight(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double entry = getEntry(i, col);
 *  */
    @Test
    public void testGetBasicRow_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:480)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:313) */
        simplexTableau.getBasicRow(0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBasicRow(int)
    
    @Test
    public void testGetBasicRow1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 251658238);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 3, 3, 3, 3, 3, 3, 3,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -2.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Integer actual = simplexTableau.getBasicRow(251658231);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBasicRow2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2021725408);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[37];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[37];
        states[36] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Integer actual = simplexTableau.getBasicRow(2021725361);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBasicRow3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 3, 3, 3, 3, 3, 3, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -2.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Integer actual = simplexTableau.getBasicRow(0);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBasicRow4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 0, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Integer actual = simplexTableau.getBasicRow(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getBasicRow(int)
    
    @Test(timeout = 1000L)
    public void testGetBasicRow5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 1, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexTableau.getBasicRow(0);
    }
    
    @Test(timeout = 1000L)
    public void testGetBasicRow6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexTableau.getBasicRow(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOptimal()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexTableau.isOptimal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        boolean actual = simplexTableau.isOptimal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        boolean actual = simplexTableau.isOptimal();
        
        assertTrue(actual);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableauTableauData = ((double[][]) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(simplexTableauTableauTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        boolean actual = simplexTableau.isOptimal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        boolean actual = simplexTableau.isOptimal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 *  */
    @Test
    public void testIsOptimal() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 64);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -2.007965087890625);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.2436116137370745E-308);
        
        boolean actual = simplexTableau.isOptimal();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isOptimal()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testIsOptimal_ThrowOutOfRangeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.isOptimal();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testIsOptimal_ThrowOutOfRangeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.isOptimal();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isOptimal()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = getNumObjectiveFunctions(); i < getWidth() - 1; i++)
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:463)
            org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:382) */
        simplexTableau.isOptimal();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:383) */
        simplexTableau.isOptimal();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:383) */
        simplexTableau.isOptimal();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:383) */
        simplexTableau.isOptimal();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 32);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        keys[0] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:383) */
        simplexTableau.isOptimal();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[2] = 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:383) */
        simplexTableau.isOptimal();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#isOptimal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testIsOptimal_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:383) */
        simplexTableau.isOptimal();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isOptimal()
    
    @Test
    public void testIsOptimal1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 512);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483136);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 0.0);
        
        boolean actual = simplexTableau.isOptimal();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getSolution
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSolution()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.executesCondition {@code (negativeVarColumn > 0): False}
 * @utbot.executesCondition {@code (negativeVarBasicRow == null): True}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getValue(double[])}
 * @utbot.returnsFrom {@code return new RealPointValuePair(coefficients, f.getValue(coefficients));}
 *  */
    @Test
    public void testGetSolution_NegativeVarBasicRowEqualsNull() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList columnLabels = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "columnLabels", columnLabels);
        
        RealPointValuePair actual = simplexTableau.getSolution();
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NaN);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSolution()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.executesCondition {@code (negativeVarColumn > 0): False}
 * @utbot.executesCondition {@code (negativeVarBasicRow == null): True}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] coefficients = new double[getOriginalNumDecisionVariables()];
 *  */
    @Test
    public void testGetSolution_ThrowNegativeArraySizeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MIN_VALUE);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList columnLabels = new ArrayList();
        columnLabels.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "columnLabels", columnLabels);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:402) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int negativeVarColumn = columnLabels.indexOf(NEGATIVE_VAR_COLUMN_LABEL);
 *  */
    @Test
    public void testGetSolution_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:397) */
        simplexTableau.getSolution();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.divideRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method divideRow(int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testDivideRow_IterateForLoop() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(-255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testDivideRow_IterateForLoop_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testDivideRow_IterateForLoop_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(-255, java.lang.Double.NaN);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableauTableauData = ((double[][]) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(simplexTableauTableauTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testDivideRow_IterateForLoop_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(-255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divideRow(int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDivideRow_ThrowOutOfRangeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(-1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDivideRow_ThrowOutOfRangeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divideRow(int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int j = 0; j < getWidth(); j++)
 *  */
    @Test
    public void testDivideRow_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:463)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:437) */
        simplexTableau.divideRow(-255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1325258289);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(1073741823, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741821);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(1073741823, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741821);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(1073741823, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2147483646);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(1073741823, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2147483646);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(1073741823, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test
    public void testDivideRow_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:438) */
        simplexTableau.divideRow(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRhsOffset()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getRhsOffset()}
 * @utbot.returnsFrom {@code return getWidth() - 1;}
 *  */
    @Test
    public void testGetRhsOffset_ReturnGetWidthMinus1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getRhsOffset();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getRhsOffset()}
 * @utbot.returnsFrom {@code return getWidth() - 1;}
 *  */
    @Test
    public void testGetRhsOffset_ReturnGetWidthMinus1_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getRhsOffset();
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getRhsOffset()}
 * @utbot.returnsFrom {@code return getWidth() - 1;}
 *  */
    @Test
    public void testGetRhsOffset_ReturnGetWidthMinus1_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getRhsOffset();
        
        assertEquals(-1, actual);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableauTableauData = ((double[][]) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(simplexTableauTableauTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getRhsOffset()}
 * @utbot.returnsFrom {@code return getWidth() - 1;}
 *  */
    @Test
    public void testGetRhsOffset_ReturnGetWidthMinus1_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getRhsOffset();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getRhsOffset()}
 * @utbot.returnsFrom {@code return getWidth() - 1;}
 *  */
    @Test
    public void testGetRhsOffset_ReturnGetWidthMinus1_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getRhsOffset();
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRhsOffset()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getRhsOffset()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getWidth() - 1;
 *  */
    @Test
    public void testGetRhsOffset_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:463)
            org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset(SimplexTableau.java:514) */
        simplexTableau.getRhsOffset();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getHeight
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeight()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getHeight()}
 * @utbot.returnsFrom {@code return tableau.getRowDimension();}
 *  */
    @Test
    public void testGetHeight_ReturnTableauGetRowDimension() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getHeight();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getHeight()}
 * @utbot.returnsFrom {@code return tableau.getRowDimension();}
 *  */
    @Test
    public void testGetHeight_ReturnTableauGetRowDimension_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getHeight();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getHeight()}
 * @utbot.returnsFrom {@code return tableau.getRowDimension();}
 *  */
    @Test
    public void testGetHeight_ReturnTableauGetRowDimension_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getHeight();
        
        assertEquals(1, actual);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableauTableauData = ((double[][]) getFieldValue(simplexTableauTableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(simplexTableauTableauTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getHeight()}
 * @utbot.returnsFrom {@code return tableau.getRowDimension();}
 *  */
    @Test
    public void testGetHeight_ReturnTableauGetRowDimension_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getHeight();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getHeight()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getHeight()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getRowDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tableau.getRowDimension();
 *  */
    @Test
    public void testGetHeight_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getHeight] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getHeight(SimplexTableau.java:471) */
        simplexTableau.getHeight();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtractRow(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test
    public void testSubtractRow_ThrowNegativeArraySizeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.linear.BlockRealMatrix.getRowVector(BlockRealMatrix.java:986)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test
    public void testSubtractRow_ThrowNegativeArraySizeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.linear.AbstractRealMatrix.getRow(AbstractRealMatrix.java:516)
            org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(AbstractRealMatrix.java:478)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = {null};
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 2007498784);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 2);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 745760552);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1552266584 out of bounds for length 1]
            org.apache.commons.math.linear.BlockRealMatrix.getRowVector(BlockRealMatrix.java:994)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(2007498783, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 792505340);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 14);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1879048196);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1926821840 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.linear.AbstractRealMatrix.getRow(AbstractRealMatrix.java:518)
            org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(AbstractRealMatrix.java:478)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(792505339, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.linear.AbstractRealMatrix.getRow(AbstractRealMatrix.java:518)
            org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(AbstractRealMatrix.java:478)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 1073741822};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.linear.AbstractRealMatrix.getRow(AbstractRealMatrix.java:518)
            org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(AbstractRealMatrix.java:478)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(1073741823, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 1073741823};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.linear.AbstractRealMatrix.getRow(AbstractRealMatrix.java:518)
            org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(AbstractRealMatrix.java:478)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(1073741823, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test
    public void testSubtractRow_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(-255, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test
    public void testSubtractRow_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = {null};
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BlockRealMatrix.getRowVector(BlockRealMatrix.java:995)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSubtractRow_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.linear.AbstractRealMatrix.getRow(AbstractRealMatrix.java:518)
            org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(AbstractRealMatrix.java:478)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSubtractRow_ThrowNullPointerException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.linear.AbstractRealMatrix.getRow(AbstractRealMatrix.java:518)
            org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(AbstractRealMatrix.java:478)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:454) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtractRow(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtractRow_ThrowOutOfRangeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(-1, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtractRow_ThrowOutOfRangeException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(-1, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tableau.setRowVector(minuendRow, tableau.getRowVector(minuendRow).subtract(tableau.getRowVector(subtrahendRow).mapMultiply(multiple)));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtractRow_ThrowOutOfRangeException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: subtract
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtractRow_ThrowOutOfRangeException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(0, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: subtract
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtractRow_ThrowOutOfRangeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(0, 130, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getNumObjectiveFunctions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumObjectiveFunctions()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumObjectiveFunctions()}
 * @utbot.executesCondition {@code (this.numArtificialVariables > 0): False}
 * @utbot.returnsFrom {@code return this.numArtificialVariables > 0 ? 2 : 1;}
 *  */
    @Test
    public void testGetNumObjectiveFunctions_ThisNumArtificialVariablesLessOrEqualZero() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        int actual = simplexTableau.getNumObjectiveFunctions();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumObjectiveFunctions()}
 * @utbot.executesCondition {@code (this.numArtificialVariables > 0): True}
 * @utbot.returnsFrom {@code return this.numArtificialVariables > 0 ? 2 : 1;}
 *  */
    @Test
    public void testGetNumObjectiveFunctions_ThisNumArtificialVariablesGreaterThanZero() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        int actual = simplexTableau.getNumObjectiveFunctions();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getNumDecisionVariables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumDecisionVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumDecisionVariables()}
 * @utbot.returnsFrom {@code return numDecisionVariables;}
 *  */
    @Test
    public void testGetNumDecisionVariables_ReturnNumDecisionVariables() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        
        int actual = simplexTableau.getNumDecisionVariables();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.initializeColumnLabels
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initializeColumnLabels()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initializeColumnLabels()}
 * @utbot.executesCondition {@code (!restrictToNonNegative): False}
 *  */
    @Test
    public void testInitializeColumnLabels_RestrictToNonNegative_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        ArrayList columnLabels = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "columnLabels", columnLabels);
        
        simplexTableau.initializeColumnLabels();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initializeColumnLabels()}
 * @utbot.executesCondition {@code (!restrictToNonNegative): False}
 *  */
    @Test
    public void testInitializeColumnLabels_RestrictToNonNegative() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        ArrayList columnLabels = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "columnLabels", columnLabels);
        
        simplexTableau.initializeColumnLabels();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initializeColumnLabels()}
 * @utbot.executesCondition {@code (!restrictToNonNegative): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testInitializeColumnLabels_NotRestrictToNonNegative() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList columnLabels = new ArrayList();
        columnLabels.add(null);
        columnLabels.add(null);
        columnLabels.add(null);
        columnLabels.add(null);
        columnLabels.add(null);
        columnLabels.add(null);
        columnLabels.add(null);
        columnLabels.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "columnLabels", columnLabels);
        
        simplexTableau.initializeColumnLabels();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initializeColumnLabels()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initializeColumnLabels()}
 * @utbot.executesCondition {@code (getNumObjectiveFunctions() == 2): False}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: columnLabels.add("Z");
 *  */
    @Test
    public void testInitializeColumnLabels_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initializeColumnLabels] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.initializeColumnLabels(SimplexTableau.java:157) */
        simplexTableau.initializeColumnLabels();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initializeColumnLabels()}
 * @utbot.executesCondition {@code (getNumObjectiveFunctions() == 2): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: columnLabels.add("W");
 *  */
    @Test
    public void testInitializeColumnLabels_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initializeColumnLabels] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.initializeColumnLabels(SimplexTableau.java:155) */
        simplexTableau.initializeColumnLabels();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetConstraintTypeCounts_ReturnCount() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class relationshipType = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Method getConstraintTypeCountsMethod = simplexTableauClazz.getDeclaredMethod("getConstraintTypeCounts", relationshipType);
        getConstraintTypeCountsMethod.setAccessible(true);
        java.lang.Object[] getConstraintTypeCountsMethodArguments = new java.lang.Object[1];
        getConstraintTypeCountsMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getConstraintTypeCountsMethod.invoke(simplexTableau, getConstraintTypeCountsMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)}
 * @utbot.iterates iterate the loop {@code for(final LinearConstraint constraint: constraints)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetConstraintTypeCounts_ConstraintGetRelationshipNotEqualsRelationship() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        constraints.add(linearConstraint);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class relationshipType = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Method getConstraintTypeCountsMethod = simplexTableauClazz.getDeclaredMethod("getConstraintTypeCounts", relationshipType);
        getConstraintTypeCountsMethod.setAccessible(true);
        java.lang.Object[] getConstraintTypeCountsMethodArguments = new java.lang.Object[1];
        getConstraintTypeCountsMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getConstraintTypeCountsMethod.invoke(simplexTableau, getConstraintTypeCountsMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)}
 * @utbot.iterates iterate the loop {@code for(final LinearConstraint constraint: constraints)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetConstraintTypeCounts_ConstraintGetRelationshipEqualsRelationship() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        constraints.add(linearConstraint);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class relationshipType = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Method getConstraintTypeCountsMethod = simplexTableauClazz.getDeclaredMethod("getConstraintTypeCounts", relationshipType);
        getConstraintTypeCountsMethod.setAccessible(true);
        java.lang.Object[] getConstraintTypeCountsMethodArguments = new java.lang.Object[1];
        getConstraintTypeCountsMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getConstraintTypeCountsMethod.invoke(simplexTableau, getConstraintTypeCountsMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final LinearConstraint constraint: constraints)
 *  */
    @Test
    public void testGetConstraintTypeCounts_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:284) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class relationshipType = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Method getConstraintTypeCountsMethod = simplexTableauClazz.getDeclaredMethod("getConstraintTypeCounts", relationshipType);
        getConstraintTypeCountsMethod.setAccessible(true);
        java.lang.Object[] getConstraintTypeCountsMethodArguments = new java.lang.Object[1];
        getConstraintTypeCountsMethodArguments[0] = ((Object) null);
        try {
            getConstraintTypeCountsMethod.invoke(simplexTableau, getConstraintTypeCountsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(final LinearConstraint constraint: constraints)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: constraint.getRelationship() == relationship
 *  */
    @Test
    public void testGetConstraintTypeCounts_ThrowNullPointerException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:285) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class relationshipType = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Method getConstraintTypeCountsMethod = simplexTableauClazz.getDeclaredMethod("getConstraintTypeCounts", relationshipType);
        getConstraintTypeCountsMethod.setAccessible(true);
        java.lang.Object[] getConstraintTypeCountsMethodArguments = new java.lang.Object[1];
        getConstraintTypeCountsMethodArguments[0] = ((Object) null);
        try {
            getConstraintTypeCountsMethod.invoke(simplexTableau, getConstraintTypeCountsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOriginalNumDecisionVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.returnsFrom {@code return f.getCoefficients().getDimension();}
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_ReturnFGetCoefficientsGetDimension_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        int actual = simplexTableau.getOriginalNumDecisionVariables();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.returnsFrom {@code return f.getCoefficients().getDimension();}
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_ReturnFGetCoefficientsGetDimension() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        int actual = simplexTableau.getOriginalNumDecisionVariables();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.returnsFrom {@code return f.getCoefficients().getDimension();}
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_ReturnFGetCoefficientsGetDimension_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        OpenMapRealVector val$v = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(coefficients, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        int actual = simplexTableau.getOriginalNumDecisionVariables();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.returnsFrom {@code return f.getCoefficients().getDimension();}
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_ReturnFGetCoefficientsGetDimension_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        ArrayRealVector val$v = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(val$v, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(coefficients, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        int actual = simplexTableau.getOriginalNumDecisionVariables();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.returnsFrom {@code return f.getCoefficients().getDimension();}
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_ReturnFGetCoefficientsGetDimension_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math.linear.RealVector$2"));
        ArrayRealVector val$v1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(val$v1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(val$v, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v1);
        setField(coefficients, "org.apache.commons.math.linear.RealVector$2", "val$v", val$v);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        int actual = simplexTableau.getOriginalNumDecisionVariables();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOriginalNumDecisionVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return f.getCoefficients().getDimension();
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables(SimplexTableau.java:537) */
        simplexTableau.getOriginalNumDecisionVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getCoefficients()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return f.getCoefficients().getDimension();
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables(SimplexTableau.java:537) */
        simplexTableau.getOriginalNumDecisionVariables();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dropPhase1Objective()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumObjectiveFunctions()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDropPhase1Objective_SimplexTableauGetNumObjectiveFunctions() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        simplexTableau.dropPhase1Objective();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dropPhase1Objective()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testDropPhase1Objective_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective(SimplexTableau.java:337) */
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testDropPhase1Objective_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective(SimplexTableau.java:337) */
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testDropPhase1Objective_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective(SimplexTableau.java:337) */
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testDropPhase1Objective_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective(SimplexTableau.java:337) */
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testDropPhase1Objective_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective(SimplexTableau.java:337) */
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testDropPhase1Objective_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective(SimplexTableau.java:337) */
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testDropPhase1Objective_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective(SimplexTableau.java:337) */
        simplexTableau.dropPhase1Objective();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dropPhase1Objective()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDropPhase1Objective_ThrowOutOfRangeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDropPhase1Objective_ThrowOutOfRangeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDropPhase1Objective_ThrowOutOfRangeException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDropPhase1Objective_ThrowOutOfRangeException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexTableau.dropPhase1Objective();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#dropPhase1Objective()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDropPhase1Objective_ThrowOutOfRangeException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexTableau.dropPhase1Objective();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getSlackVariableOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSlackVariableOffset()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSlackVariableOffset()}
 * @utbot.returnsFrom {@code return getNumObjectiveFunctions() + numDecisionVariables;}
 *  */
    @Test
    public void testGetSlackVariableOffset_ReturnGetNumObjectiveFunctionsPlusNumDecisionVariables() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        
        int actual = simplexTableau.getSlackVariableOffset();
        
        assertEquals(-254, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSlackVariableOffset()}
 * @utbot.returnsFrom {@code return getNumObjectiveFunctions() + numDecisionVariables;}
 *  */
    @Test
    public void testGetSlackVariableOffset_ReturnGetNumObjectiveFunctionsPlusNumDecisionVariables_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        int actual = simplexTableau.getSlackVariableOffset();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getNumSlackVariables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumSlackVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumSlackVariables()}
 * @utbot.returnsFrom {@code return numSlackVariables;}
 *  */
    @Test
    public void testGetNumSlackVariables_ReturnNumSlackVariables() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        
        int actual = simplexTableau.getNumSlackVariables();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getNumArtificialVariables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumArtificialVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumArtificialVariables()}
 * @utbot.returnsFrom {@code return numArtificialVariables;}
 *  */
    @Test
    public void testGetNumArtificialVariables_ReturnNumArtificialVariables() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", -255);
        
        int actual = simplexTableau.getNumArtificialVariables();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetInvertedCoefficientSum_ReturnSum() throws Exception  {
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        double actual = SimplexTableau.getInvertedCoefficientSum(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(double coefficient: coefficients.toArray())} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetInvertedCoefficientSum_ReturnSum_1() throws Exception  {
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {1.7800590868057611E-307};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        double actual = SimplexTableau.getInvertedCoefficientSum(arrayRealVector);
        
        org.junit.Assert.assertEquals(-1.7800590868057611E-307, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testGetInvertedCoefficientSum() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = SimplexTableau.getInvertedCoefficientSum(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testGetInvertedCoefficientSum_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = SimplexTableau.getInvertedCoefficientSum(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: for(double coefficient: coefficients.toArray())
 *  */
    @Test
    public void testGetInvertedCoefficientSum_ThrowNegativeArraySizeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:658)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(SimplexTableau.java:299) */
        SimplexTableau.getInvertedCoefficientSum(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(double coefficient: coefficients.toArray())
 *  */
    @Test
    public void testGetInvertedCoefficientSum_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1073741824};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:662)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(SimplexTableau.java:299) */
        SimplexTableau.getInvertedCoefficientSum(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(double coefficient: coefficients.toArray())
 *  */
    @Test
    public void testGetInvertedCoefficientSum_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:662)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(SimplexTableau.java:299) */
        SimplexTableau.getInvertedCoefficientSum(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(double coefficient: coefficients.toArray())
 *  */
    @Test
    public void testGetInvertedCoefficientSum_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:662)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(SimplexTableau.java:299) */
        SimplexTableau.getInvertedCoefficientSum(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double coefficient: coefficients.toArray())
 *  */
    @Test
    public void testGetInvertedCoefficientSum_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(SimplexTableau.java:299) */
        SimplexTableau.getInvertedCoefficientSum(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double coefficient: coefficients.toArray())
 *  */
    @Test
    public void testGetInvertedCoefficientSum_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:662)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(SimplexTableau.java:299) */
        SimplexTableau.getInvertedCoefficientSum(openMapRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getArtificialVariableOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArtificialVariableOffset()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getArtificialVariableOffset()}
 * @utbot.returnsFrom {@code return getNumObjectiveFunctions() + numDecisionVariables + numSlackVariables;}
 *  */
    @Test
    public void testGetArtificialVariableOffset_ReturnGetNumObjectiveFunctionsPlusNumDecisionVariablesPlusNumSlackVariables() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        
        int actual = simplexTableau.getArtificialVariableOffset();
        
        assertEquals(-509, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getArtificialVariableOffset()}
 * @utbot.returnsFrom {@code return getNumObjectiveFunctions() + numDecisionVariables + numSlackVariables;}
 *  */
    @Test
    public void testGetArtificialVariableOffset_ReturnGetNumObjectiveFunctionsPlusNumDecisionVariablesPlusNumSlackVariables_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        int actual = simplexTableau.getArtificialVariableOffset();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.normalizeConstraints
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeConstraints(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#normalizeConstraints(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return normalized;}
 *  */
    @Test
    public void testNormalizeConstraints_CollectionIterator() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) simplexTableau.normalizeConstraints(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizeConstraints(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#normalizeConstraints(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(LinearConstraint constraint: originalConstraints)
 *  */
    @Test
    public void testNormalizeConstraints_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalizeConstraints] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalizeConstraints(SimplexTableau.java:248) */
        simplexTableau.normalizeConstraints(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields728234118264200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields728234118264200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass728234118269300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields728234118264200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass728234118269300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields728234118833500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields728234118833500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass728234118835500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields728234118833500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass728234118835500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

