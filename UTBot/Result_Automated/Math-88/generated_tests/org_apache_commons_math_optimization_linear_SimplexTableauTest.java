package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVectorImpl;
import java.util.ArrayList;
import org.apache.commons.math.linear.RealMatrixImpl;
import java.util.HashSet;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import java.lang.reflect.Method;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.apache.commons.math.linear.MatrixIndexException;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.jar.JarInputStream;
import java.io.ObjectStreamClass;
import java.io.EOFException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.io.ObjectOutputStream;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.DenseRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.optimization.RealPointValuePair;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static java.lang.reflect.Array.get;

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
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.caughtException {@code ClassCastException ex}
 *  */
    @Test
    public void testEquals_CatchClassCastException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        byte[] byteArray = {};
        
        boolean actual = simplexTableau.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -256);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -254;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.0);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -256);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -254;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -2.225073858507202E-308);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): True}
 *  */
    @Test
    public void testEquals_OtherEqualsNull() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        boolean actual = simplexTableau.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 2.7543325106103084E-135);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -128;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 9.017965988196832E-231);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.986253291751151E-154);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -128;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 9.017965988196832E-231);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -256;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.0465358315867533E-308);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -256;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.0465358315867533E-308);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 3.705347150068559E78);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -254;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.970951057471637E-154);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVectorImpl coefficients1 = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients1);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 3.705347150068559E78);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -254;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.970951057471637E-154);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 2.0);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -240;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -6.408239199327403E-145);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients1);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 2.0);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -240;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -6.408239199327403E-145);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 1.1125369292536007E-308);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -255;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.297868956501121E-229);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 1.1125369292536007E-308);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -255;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.297868956501121E-229);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_8() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 1.1125369292536007E-308);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -256;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.370137133082882E77);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 1.1125369292536007E-308);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -252);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -256;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.370137133082882E77);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 4.9E-324);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -254;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.70757757215747E-310);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 4.9E-324);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -254;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.70757757215747E-310);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -240);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -254;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.87869074876982E-306);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -240);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -254;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 2.87869074876982E-306);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -256;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.162593914745497E-309);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -256;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.162593914745497E-309);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesEqualsRhsNumDecisionVariablesAndNumSlackVariablesEqualsRhsNumSlackVariablesAndNumArtificialVariablesEqualsRhsNumArtificialVariablesAndEpsilonEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_9() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.9649451753928766E-103);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        HashSet constraints = new HashSet();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -254;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.2894884768152033E-231);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.9649451753928766E-103);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        OpenMapRealMatrix tableau1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", -1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -254;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.2894884768152033E-231);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (other): False},
    ///     {@code (other == null): False}
    /// return from: {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_3() throws Exception  {
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
 * @utbot.returnsFrom {@code return (restrictToNonNegative == rhs.restrictToNonNegative) && (numDecisionVariables == rhs.numDecisionVariables) && (numSlackVariables == rhs.numSlackVariables) && (numArtificialVariables == rhs.numArtificialVariables) && (epsilon == rhs.epsilon) && f.equals(rhs.f) && constraints.equals(rhs.constraints) && tableau.equals(rhs.tableau);}
 *  */
    @Test
    public void testEquals_RestrictToNonNegativeNotEqualsRhsRestrictToNonNegativeAndNumDecisionVariablesNotEqualsRhsNumDecisionVariablesAndNumSlackVariablesNotEqualsRhsNumSlackVariablesAndNumArtificialVariablesNotEqualsRhsNumArtificialVariablesAndEpsilonNotEqualsRhsEpsilonAndFEqualsAndConstraintsEqualsAndTableauEquals_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = 1;
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        
        boolean actual = simplexTableau.equals(simplexTableau1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: f.equals(rhs.f)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -224);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -255;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.780059086805762E-307);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -224);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -255;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 1.780059086805762E-307);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:506) */
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
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -248;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.7800726675788233E-307);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -248;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -1.7800726675788233E-307);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:507) */
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
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 3.26E-322);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -254;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 5.285297588728888E-308);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 3.26E-322);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -254;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 5.285297588728888E-308);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:507) */
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
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 2.0000000000000013);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -254;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 4.3628254200157E-311);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 2.0000000000000013);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -254);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -254;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 4.3628254200157E-311);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:507) */
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
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -255;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.31561842E-316);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -255;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 3.31561842E-316);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:508) */
        simplexTableau.equals(simplexTableau1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.equals(rhs.tableau)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 7.890993961502414E303);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        HashSet constraints = new HashSet();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -254;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -4.508076080554951E-308);
        SimplexTableau simplexTableau1 = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f1 = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f1, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", 7.890993961502414E303);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f1);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau1.numArtificialVariables = -254;
        setField(simplexTableau1, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -4.508076080554951E-308);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.equals(SimplexTableau.java:508) */
        simplexTableau.equals(simplexTableau1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.hashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
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
        simplexTableau.numArtificialVariables = -255;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", -4.9E-324);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:525) */
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
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -255;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:526) */
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
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {java.lang.Double.NaN};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.0000000000000004);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -255;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:526) */
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
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {-2.0000000000000004, java.lang.Double.NaN};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", -2.0000000000000004);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = -255;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.hashCode(SimplexTableau.java:526) */
        simplexTableau.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.initialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initialize()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 *  */
    @Test
    public void testInitialize() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        initializeMethod.invoke(simplexTableau, initializeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initialize()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testInitialize_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483587);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 122);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -2);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test
    public void testInitialize_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 239);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -241);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testInitialize_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483553);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 2, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 191);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -3);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test
    public void testInitialize_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1476460548);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1342045950);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 248);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test
    public void testInitialize_ThrowNullPointerException_3() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[3][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = doubleArray;
        double[] doubleArray1 = {-0.0};
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -1);
        simplexTableau.numArtificialVariables = 1;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test
    public void testInitialize_ThrowNullPointerException_4() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInitialize_ThrowNullPointerException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1531052032);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1410023423);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -177160193);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test
    public void testInitialize_ThrowNullPointerException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 127);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -129);
        simplexTableau.numArtificialVariables = 1;
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "epsilon", 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInitialize_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1610678276);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1073610742);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.initialize] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.initialize(SimplexTableau.java:249) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initialize()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testInitialize_ThrowMatrixIndexException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 29);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -32);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testInitialize_ThrowMatrixIndexException_3() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 253);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testInitialize_ThrowMatrixIndexException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[3][];
        data[0] = ((double[]) null);
        data[1] = ((double[]) null);
        double[] doubleArray = {0.0};
        data[2] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -255);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#initialize()}
 * @utbot.iterates iterate the loop {@code for(int artificialVar = 0; artificialVar < numArtificialVariables; artificialVar++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: int row = getBasicRow(getArtificialVariableOffset() + artificialVar);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testInitialize_ThrowMatrixIndexException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[3][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = doubleArray;
        double[] doubleArray1 = {};
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -1);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method initializeMethod = simplexTableauClazz.getDeclaredMethod("initialize");
        initializeMethod.setAccessible(true);
        java.lang.Object[] initializeMethodArguments = new java.lang.Object[0];
        try {
            initializeMethod.invoke(simplexTableau, initializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            org.apache.commons.math.optimization.linear.SimplexTableau.readObject(SimplexTableau.java:547) */
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
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
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
 * @utbot.throwsException {@link java.io.EOFException} in: ois.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "totalBytesRead", -255L);
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
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testReadObject_ThrowZipException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(in1, "java.util.zip.ZipInputStream", "entry", entry);
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
    ///endregion
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
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
            org.apache.commons.math.optimization.linear.SimplexTableau.writeObject(SimplexTableau.java:536) */
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.normalize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalize(org.apache.commons.math.optimization.linear.LinearConstraint)
    
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
        RealVectorImpl realVectorImpl = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {1.2525665782579653E-308};
        setField(realVectorImpl, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        Relationship relationship = Relationship.EQ;
        LinearConstraint linearConstraint = new LinearConstraint(realVectorImpl, relationship, -2.2250738585072024E-308);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        LinearConstraint actual = ((LinearConstraint) normalizeMethod.invoke(simplexTableau, normalizeMethodArguments));
        
        RealVectorImpl realVectorImpl1 = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data1 = {-1.2525665782579653E-308};
        setField(realVectorImpl1, "org.apache.commons.math.linear.RealVectorImpl", "data", data1);
        LinearConstraint expected = new LinearConstraint(realVectorImpl1, relationship, 2.2250738585072024E-308);
        
        // org.apache.commons.math.optimization.linear.LinearConstraint has overridden equals method
        assertEquals(expected, actual);
    }
    
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
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:211) */
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
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:212) */
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
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearConstraint#getRelationship()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.Relationship#oppositeRelationship()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: constraint.getRelationship().oppositeRelationship()
 *  */
    @Test
    public void testNormalize_ThrowNullPointerException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVectorImpl realVectorImpl = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {2.260180156872931E-308};
        setField(realVectorImpl, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        LinearConstraint linearConstraint = new LinearConstraint(realVectorImpl, ((Relationship) null), -1.7800590901213795E-307);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:213) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testNormalize_ThrowNullPointerException_3() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        LinearConstraint linearConstraint = new LinearConstraint(openMapRealVector, ((Relationship) null), -2.225073858507202E-308);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:873)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:30)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:212) */
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
        RealVectorImpl realVectorImpl = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {3.40514052575E-313};
        setField(realVectorImpl, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        Relationship relationship = Relationship.LEQ;
        LinearConstraint linearConstraint = new LinearConstraint(realVectorImpl, relationship, -1.2882299074883804E-231);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        LinearConstraint actual = ((LinearConstraint) normalizeMethod.invoke(simplexTableau, normalizeMethodArguments));
        
        RealVectorImpl realVectorImpl1 = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data1 = {-3.40514052575E-313};
        setField(realVectorImpl1, "org.apache.commons.math.linear.RealVectorImpl", "data", data1);
        Relationship relationship1 = Relationship.GEQ;
        LinearConstraint expected = new LinearConstraint(realVectorImpl1, relationship1, 1.2882299074883804E-231);
        
        // org.apache.commons.math.optimization.linear.LinearConstraint has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNormalize2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVectorImpl realVectorImpl = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {1.1132202125709495E-308};
        setField(realVectorImpl, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        Relationship relationship = Relationship.GEQ;
        LinearConstraint linearConstraint = new LinearConstraint(realVectorImpl, relationship, -2.8482683727844136E-306);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        LinearConstraint actual = ((LinearConstraint) normalizeMethod.invoke(simplexTableau, normalizeMethodArguments));
        
        RealVectorImpl realVectorImpl1 = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data1 = {-1.1132202125709495E-308};
        setField(realVectorImpl1, "org.apache.commons.math.linear.RealVectorImpl", "data", data1);
        Relationship relationship1 = Relationship.LEQ;
        LinearConstraint expected = new LinearConstraint(realVectorImpl1, relationship1, 2.8482683727844136E-306);
        
        // org.apache.commons.math.optimization.linear.LinearConstraint has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNormalize3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealVectorImpl realVectorImpl = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {};
        setField(realVectorImpl, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        Relationship relationship = Relationship.GEQ;
        LinearConstraint linearConstraint = new LinearConstraint(realVectorImpl, relationship, -2.0000000002328306);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class linearConstraintType = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Method normalizeMethod = simplexTableauClazz.getDeclaredMethod("normalize", linearConstraintType);
        normalizeMethod.setAccessible(true);
        java.lang.Object[] normalizeMethodArguments = new java.lang.Object[1];
        normalizeMethodArguments[0] = linearConstraint;
        LinearConstraint actual = ((LinearConstraint) normalizeMethod.invoke(simplexTableau, normalizeMethodArguments));
        
        RealVectorImpl realVectorImpl1 = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data1 = {};
        setField(realVectorImpl1, "org.apache.commons.math.linear.RealVectorImpl", "data", data1);
        Relationship relationship1 = Relationship.LEQ;
        LinearConstraint expected = new LinearConstraint(realVectorImpl1, relationship1, 2.0000000002328306);
        
        // org.apache.commons.math.optimization.linear.LinearConstraint has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method normalize(org.apache.commons.math.optimization.linear.LinearConstraint)
    
    @Test
    public void testNormalize4() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        LinearConstraint linearConstraint = new LinearConstraint(openMapRealVector, ((Relationship) null), -2.0000000000000004);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 11 out of bounds for double[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:873)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:30)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:212) */
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
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        LinearConstraint linearConstraint = new LinearConstraint(openMapRealVector, ((Relationship) null), -2.0000000000000004);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 10 out of bounds for byte[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:139)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:873)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:30)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:212) */
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
        RealVectorImpl realVectorImpl = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN};
        setField(realVectorImpl, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        LinearConstraint linearConstraint = new LinearConstraint(realVectorImpl, ((Relationship) null), -2.0000000000000004);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:213) */
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
    public void testNormalize7() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        LinearConstraint linearConstraint = new LinearConstraint(openMapRealVector, ((Relationship) null), -2.0000000000000004);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.normalize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:139)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:873)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:30)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:212) */
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
    public void testGetEntry_ReturnTableauGetEntry() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double actual = simplexTableau.getEntry(0, 1);
        
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
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
    public void testGetEntry_ReturnTableauGetEntry_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 939524226);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 822083584);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-503316482, -503316482};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double actual = simplexTableau.getEntry(939524225, 822083583);
        
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
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
    public void testGetEntry_ReturnTableauGetEntry_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
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
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
        simplexTableau.getEntry(1073741823, 1073741823);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
        simplexTableau.getEntry(1073741823, 1073741823);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 32);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741684);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1224736768);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1073741822, 2147483646};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
        simplexTableau.getEntry(1073741683, 1224736767);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, -1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
        simplexTableau.getEntry(1073741823, 1073741823);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return tableau.getEntry(row, column);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
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
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
        simplexTableau.getEntry(1073741823, 1073741823);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
        simplexTableau.getEntry(0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(-256, -255);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return tableau.getEntry(row, column);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.getEntry(0, 129);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getEntry(int, int)
    
    @Test
    public void testGetEntry1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1072431105);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147255091);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[1] = 1;
        keys[2] = 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        double actual = simplexTableau.getEntry(1072431104, 2147221504);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getEntry(int, int)
    
    @Test
    public void testGetEntry2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 84652161);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 22160500);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = 1;
        keys[1] = 84652161;
        keys[2] = 84652161;
        keys[3] = 84652161;
        keys[4] = 84652161;
        keys[5] = 84652161;
        keys[6] = 84652161;
        keys[7] = 84652161;
        keys[8] = 1;
        keys[9] = 84652161;
        keys[10] = 1024;
        keys[11] = 84652161;
        keys[12] = 84652161;
        keys[13] = 84652161;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 14);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402) */
        simplexTableau.getEntry(51092096, 262656);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getEntry(int, int)
    
    @Test(timeout = 1000L)
    public void testGetEntry3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1072431105);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147255091);
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
        simplexTableau.getEntry(1072431104, 2147221504);
    }
    
    @Test(timeout = 1000L)
    public void testGetEntry4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1717986918);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483643);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
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
        simplexTableau.getEntry(1717986917, 2147483641);
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockColumns", 1);
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.linear.DenseRealMatrix.getData(DenseRealMatrix.java:618)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:410)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:603)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:296)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        double[][] blocks = {};
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockColumns", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.DenseRealMatrix.getData(DenseRealMatrix.java:631)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        double[][] blocks = {};
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockColumns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.DenseRealMatrix.getData(DenseRealMatrix.java:634)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
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
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:606)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:296)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        double[][] blocks = {null};
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockColumns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.DenseRealMatrix.getData(DenseRealMatrix.java:634)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        double[][] blocks = {null};
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "columns", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockColumns", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.DenseRealMatrix.getData(DenseRealMatrix.java:631)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
        simplexTableau.getData();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getData()
    
    @Test
    public void testGetData1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 7);
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
    
    ///region OTHER: ERROR SUITE for method getData()
    
    @Test
    public void testGetData2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        double[][] blocks = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
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
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "columns", 35);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockColumns", -1569314972);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 14 out of bounds for double[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.DenseRealMatrix.getData(DenseRealMatrix.java:634)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
        simplexTableau.getData();
    }
    
    @Test
    public void testGetData3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
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
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "columns", 9);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockColumns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 52 out of bounds for double[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.DenseRealMatrix.getData(DenseRealMatrix.java:631)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
        simplexTableau.getData();
    }
    
    @Test
    public void testGetData4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[3][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:606)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:296)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
        simplexTableau.getData();
    }
    
    @Test
    public void testGetData5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "rows", 7);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "columns", 9);
        setField(tableau, "org.apache.commons.math.linear.DenseRealMatrix", "blockRows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.DenseRealMatrix.getData(DenseRealMatrix.java:634)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
        simplexTableau.getData();
    }
    
    @Test
    public void testGetData6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[10][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:606)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:296)
            org.apache.commons.math.optimization.linear.SimplexTableau.getData(SimplexTableau.java:483) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
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
        
        RealMatrix realMatrix = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrixTableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] realMatrixTableauEntriesTableauEntriesKeys = ((int[]) getFieldValue(realMatrixTableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int finalSimplexTableauTableauEntriesKeys0 = ((Integer) get(realMatrixTableauEntriesTableauEntriesKeys, 0));
        RealMatrix realMatrix1 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix1TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] realMatrix1TableauEntriesTableauEntriesStates = ((byte[]) getFieldValue(realMatrix1TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalSimplexTableauTableauEntriesStates0 = ((Byte) get(realMatrix1TableauEntriesTableauEntriesStates, 0));
        RealMatrix realMatrix2 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix2TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix2, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesSize = ((Integer) getFieldValue(realMatrix2TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        RealMatrix realMatrix3 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix3TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix3, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesCount = ((Integer) getFieldValue(realMatrix3TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        
        assertEquals(0, finalSimplexTableauTableauEntriesKeys0);
        
        assertEquals((byte) 2, finalSimplexTableauTableauEntriesStates0);
        
        assertEquals(-1, finalSimplexTableauTableauEntriesSize);
        
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
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -235868385);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868385 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(0, 0, 0.0);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:391)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
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
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(row, column, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(0, 0, 0.0);
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
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(-255, -255, java.lang.Double.NaN);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:391)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(1073741823, 1073741823, 0.0);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:273)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:406)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(0, 0, 2.225073858507202E-308);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(row, column, value);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_ThrowMatrixIndexException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(row, column, value);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_ThrowMatrixIndexException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(row, column, value);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_ThrowMatrixIndexException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(0, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(row, column, value);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_ThrowMatrixIndexException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(-1, -255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setEntry(int, int, double)
    
    @Test
    public void testSetEntry1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1588987010);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 637874703);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.setEntry(1588987009, 34575619, 1.7800590868058623E-307);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrixTableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] realMatrixTableauEntriesTableauEntriesKeys = ((int[]) getFieldValue(realMatrixTableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int finalSimplexTableauTableauEntriesKeys8 = ((Integer) get(realMatrixTableauEntriesTableauEntriesKeys, 8));
        RealMatrix realMatrix1 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix1TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] realMatrix1TableauEntriesTableauEntriesValues = ((double[]) getFieldValue(realMatrix1TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double finalSimplexTableauTableauEntriesValues8 = ((Double) get(realMatrix1TableauEntriesTableauEntriesValues, 8));
        RealMatrix realMatrix2 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix2TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix2, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] realMatrix2TableauEntriesTableauEntriesStates = ((byte[]) getFieldValue(realMatrix2TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalSimplexTableauTableauEntriesStates8 = ((Byte) get(realMatrix2TableauEntriesTableauEntriesStates, 8));
        RealMatrix realMatrix3 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix3TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix3, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesSize = ((Integer) getFieldValue(realMatrix3TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        RealMatrix realMatrix4 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix4TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix4, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesCount = ((Integer) getFieldValue(realMatrix4TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        
        assertEquals(1478494866, finalSimplexTableauTableauEntriesKeys8);
        
        org.junit.Assert.assertEquals(1.7800590868058623E-307, finalSimplexTableauTableauEntriesValues8, 1.0E-6);
        
        assertEquals((byte) 1, finalSimplexTableauTableauEntriesStates8);
        
        assertEquals(1, finalSimplexTableauTableauEntriesSize);
        
        assertEquals(1, finalSimplexTableauTableauEntriesCount);
    }
    
    @Test
    public void testSetEntry2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1611071692);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1113200777);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[25];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[15];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1996514862);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1073758438);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrixTableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] initialSimplexTableauTableauEntriesKeys = ((int[]) getFieldValue(realMatrixTableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        RealMatrix realMatrix1 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix1TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] initialSimplexTableauTableauEntriesValues = ((double[]) getFieldValue(realMatrix1TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        RealMatrix realMatrix2 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix2TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix2, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] initialSimplexTableauTableauEntriesStates = ((byte[]) getFieldValue(realMatrix2TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        
        simplexTableau.setEntry(868552709, 722063408, -4.451234178859377E-308);
        
        RealMatrix realMatrix3 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix3TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix3, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] finalSimplexTableauTableauEntriesKeys = ((int[]) getFieldValue(realMatrix3TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        RealMatrix realMatrix4 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix4TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix4, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] finalSimplexTableauTableauEntriesValues = ((double[]) getFieldValue(realMatrix4TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        RealMatrix realMatrix5 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix5TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix5, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] finalSimplexTableauTableauEntriesStates = ((byte[]) getFieldValue(realMatrix5TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        RealMatrix realMatrix6 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix6TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix6, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesSize = ((Integer) getFieldValue(realMatrix6TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        RealMatrix realMatrix7 = simplexTableau.tableau;
        OpenIntToDoubleHashMap realMatrix7TableauEntries = ((OpenIntToDoubleHashMap) getFieldValue(realMatrix7, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalSimplexTableauTableauEntriesMask = ((Integer) getFieldValue(realMatrix7TableauEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask"));
        
        assertFalse(initialSimplexTableauTableauEntriesKeys == finalSimplexTableauTableauEntriesKeys);
        
        assertFalse(initialSimplexTableauTableauEntriesValues == finalSimplexTableauTableauEntriesValues);
        
        assertFalse(initialSimplexTableauTableauEntriesStates == finalSimplexTableauTableauEntriesStates);
        
        assertEquals(1996514863, finalSimplexTableauTableauEntriesSize);
        
        assertEquals(29, finalSimplexTableauTableauEntriesMask);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setEntry(int, int, double)
    
    @Test
    public void testSetEntry3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2081644803);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1212972094);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[35];
        keys[0] = 135483650;
        keys[1] = 135483650;
        keys[2] = 135483650;
        keys[3] = 135483650;
        keys[4] = 135483650;
        keys[5] = 135483650;
        keys[6] = 135483650;
        keys[7] = 135483650;
        keys[8] = 135483650;
        keys[9] = 135483650;
        keys[10] = 135483650;
        keys[11] = 135483650;
        keys[12] = 135483650;
        keys[13] = 135483650;
        keys[14] = 135483650;
        keys[15] = 135483650;
        keys[16] = 135483650;
        keys[17] = 135483650;
        keys[18] = 135483650;
        keys[19] = 135483650;
        keys[20] = 135483650;
        keys[21] = 135483650;
        keys[22] = 135483650;
        keys[23] = 135483650;
        keys[24] = 135483650;
        keys[25] = 135483650;
        keys[26] = 135483650;
        keys[27] = 135483650;
        keys[28] = 135483650;
        keys[29] = 135483650;
        keys[30] = 135483650;
        keys[31] = 135483650;
        keys[32] = 135483650;
        keys[33] = 135483650;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[39];
        states[34] = (byte) 1;
        states[38] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 38);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 35]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:285)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:406)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(135483650, 268477282, 2.848095217927871E-306);
    }
    
    @Test
    public void testSetEntry4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2018312618);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1876110303);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[37];
        states[32] = (byte) 1;
        states[36] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 9]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:306)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:406)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(1447887209, 1041892037, 1.288229753919573E-231);
    }
    
    @Test
    public void testSetEntry5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1495326774);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1708500750);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[23];
        states[16] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 50);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 10]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:273)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:406)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(407953459, 1073741865, 2.6700886302086417E-307);
    }
    
    @Test
    public void testSetEntry6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1882456102);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1202029793);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[39];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1610612774);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870914 out of bounds for length 39]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:406)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(1613103130, 1078669488, 4.778455549176872E-299);
    }
    
    @Test
    public void testSetEntry7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1544159361);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1040920543);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[13];
        keys[0] = 3;
        keys[1] = 1;
        keys[2] = 3;
        keys[3] = 128;
        keys[4] = 3;
        keys[5] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[11];
        states[1] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:365)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:245)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(1544159264, 1004799136, -0.0);
    }
    
    @Test
    public void testSetEntry8() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 394512591);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 355304878);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            394512591, 1214383636, 394512591, 394512591, 394512591, 394512591, 394512591, 394512591,
            394512591, 394512591
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:411)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(260169630, 2683568, 2.8480946237690494E-306);
    }
    
    @Test
    public void testSetEntry9() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1116754965);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2034305485);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 1196687364, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[11];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:411)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(1099967508, 272629760, -2.225073858507202E-308);
    }
    
    @Test
    public void testSetEntry10() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1011173382);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 287796854);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[37];
        keys[0] = 2061742338;
        keys[1] = 2061742338;
        keys[2] = 2061742338;
        keys[3] = 2061742338;
        keys[4] = 2061742338;
        keys[5] = 2061742338;
        keys[6] = 2061742338;
        keys[7] = 2061742338;
        keys[8] = 2061742338;
        keys[9] = 2061742338;
        keys[10] = 2061742338;
        keys[11] = 2061742338;
        keys[12] = 2061742338;
        keys[13] = 2061742338;
        keys[14] = 2061742338;
        keys[15] = 2061742338;
        keys[16] = 2061742338;
        keys[17] = 2061742338;
        keys[18] = 2061742338;
        keys[19] = 2061742338;
        keys[20] = 2061742338;
        keys[21] = 2061742338;
        keys[22] = 2061742338;
        keys[23] = 2061742338;
        keys[24] = 2061742338;
        keys[25] = 2061742338;
        keys[26] = 2061742338;
        keys[27] = 2061742338;
        keys[28] = 2061742338;
        keys[29] = 2061742338;
        keys[30] = 2061742338;
        keys[31] = 2061742338;
        keys[32] = 2061742338;
        keys[33] = 2061742338;
        keys[34] = 2061742338;
        keys[35] = 2061742338;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[37];
        states[36] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:416)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(135382019, 285543840, 3.78576699573454E-270);
    }
    
    @Test
    public void testSetEntry11() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1352720534);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1438758671);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[39];
        states[2] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 38);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:414)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(273735821, 9785, 6.675221575521604E-308);
    }
    
    @Test
    public void testSetEntry12() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2018312618);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1876110303);
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:406)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(1447887209, 1041892037, 1.288229753919573E-231);
    }
    
    @Test
    public void testSetEntry13() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:406)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(SimplexTableau.java:412) */
        simplexTableau.setEntry(0, 0, 2.225073858507202E-308);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method setEntry(int, int, double)
    
    @Test(timeout = 1000L)
    public void testSetEntry14() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", Integer.MAX_VALUE);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MAX_VALUE);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", Integer.MAX_VALUE);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getWidth();
        
        assertEquals(0, actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getWidth] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:385) */
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
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:385) */
        simplexTableau.getWidth();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNormalizedConstraints()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNormalizedConstraints()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return normalized;}
 *  */
    @Test
    public void testGetNormalizedConstraints_CollectionIterator() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        ArrayList actual = ((ArrayList) simplexTableau.getNormalizedConstraints());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNormalizedConstraints()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNormalizedConstraints()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(LinearConstraint constraint: constraints)
 *  */
    @Test
    public void testGetNormalizedConstraints_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints(SimplexTableau.java:199) */
        simplexTableau.getNormalizedConstraints();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNormalizedConstraints()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(LinearConstraint constraint: constraints)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: normalized.add(normalize(constraint));
 *  */
    @Test
    public void testGetNormalizedConstraints_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", -3.337610787760802E-308);
        constraints.add(linearConstraint);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:212)
            org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints(SimplexTableau.java:200) */
        simplexTableau.getNormalizedConstraints();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNormalizedConstraints()
    
    @Test
    public void testGetNormalizedConstraints1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.EQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", java.lang.Double.NaN);
        constraints.add(linearConstraint);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        ArrayList actual = ((ArrayList) simplexTableau.getNormalizedConstraints());
        
        ArrayList expected = new ArrayList();
        LinearConstraint linearConstraint1 = new LinearConstraint(coefficients, relationship, java.lang.Double.NaN);
        expected.add(linearConstraint1);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNormalizedConstraints()
    
    @Test
    public void testGetNormalizedConstraints2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.EQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", java.lang.Double.NaN);
        constraints.add(linearConstraint);
        constraints.add(coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints] produces [java.lang.ClassCastException: class org.apache.commons.math.linear.RealVectorImpl cannot be cast to class org.apache.commons.math.optimization.linear.LinearConstraint (org.apache.commons.math.linear.RealVectorImpl and org.apache.commons.math.optimization.linear.LinearConstraint are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2a4af276)]
            org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints(SimplexTableau.java:199) */
        simplexTableau.getNormalizedConstraints();
    }
    
    @Test
    public void testGetNormalizedConstraints3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        HashSet constraints = new HashSet();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:211)
            org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints(SimplexTableau.java:200) */
        simplexTableau.getNormalizedConstraints();
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
        simplexTableau.numArtificialVariables = 1;
        
        int actual = simplexTableau.getNumObjectiveFunctions();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method discardArtificialVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.executesCondition {@code (numArtificialVariables == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDiscardArtificialVariables_NumArtificialVariablesEqualsZero() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        simplexTableau.discardArtificialVariables();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method discardArtificialVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] matrix = new double[height][width];
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowNegativeArraySizeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", -64);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -64;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:295) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int width = getWidth() - numArtificialVariables - 1;
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -255;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:385)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:293) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] matrix = new double[height][width];
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowNegativeArraySizeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {
            null,
            null
        };
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 125;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NegativeArraySizeException: -126]
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:295) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] matrix = new double[height][width];
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowNegativeArraySizeException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 254;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NegativeArraySizeException: -254]
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:295) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < height; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: matrix[i][j] = getEntry(i + 1, j + 1);
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1995925360);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 2147483644;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1995925360 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] matrix = new double[height][width];
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowNegativeArraySizeException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -255;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:295) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < height; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: matrix[i][j] = getEntry(i + 1, j + 1);
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < height; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: matrix[i][j] = getEntry(i + 1, j + 1);
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < height; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: matrix[i][j] = getEntry(i + 1, j + 1);
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 29);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[36];
        keys[0] = 3;
        keys[1] = 3;
        keys[2] = 3;
        keys[3] = 2;
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
        keys[34] = 3;
        keys[35] = 2;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[13];
        states[3] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 35);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 26;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 13]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < height; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: matrix[i][j] = getEntry(i + 1, j + 1);
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 125);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[1] = 127;
        keys[7] = 126;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 7);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 122;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < height; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: matrix[i][j] = getEntry(i + 1, j + 1);
 *  */
    @Test
    public void testDiscardArtificialVariables_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method discardArtificialVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#discardArtificialVariables()}
 * @utbot.executesCondition {@code (numArtificialVariables == 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getWidth()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getHeight()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < height; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: matrix[i][width - 1] = getEntry(i + 1, getRhsOffset());
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testDiscardArtificialVariables_ThrowMatrixIndexException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -2;
        
        simplexTableau.discardArtificialVariables();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method discardArtificialVariables()
    
    @Test
    public void testDiscardArtificialVariables1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 2147483644;
        
        RealMatrix initialSimplexTableauTableau = simplexTableau.tableau;
        
        simplexTableau.discardArtificialVariables();
        
        RealMatrix finalSimplexTableauTableau = simplexTableau.tableau;
        int finalSimplexTableauNumArtificialVariables = simplexTableau.numArtificialVariables;
        
        assertFalse(initialSimplexTableauTableau == finalSimplexTableauTableau);
        
        assertEquals(0, finalSimplexTableauNumArtificialVariables);
    }
    
    @Test
    public void testDiscardArtificialVariables2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[25];
        keys[0] = Integer.MIN_VALUE;
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
        keys[17] = 3;
        keys[18] = 3;
        keys[19] = 3;
        keys[20] = 3;
        keys[21] = 3;
        keys[22] = 3;
        keys[23] = 3;
        keys[24] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[25];
        states[16] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 16);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 2147483644;
        
        RealMatrix initialSimplexTableauTableau = simplexTableau.tableau;
        
        simplexTableau.discardArtificialVariables();
        
        RealMatrix finalSimplexTableauTableau = simplexTableau.tableau;
        int finalSimplexTableauNumArtificialVariables = simplexTableau.numArtificialVariables;
        
        assertFalse(initialSimplexTableauTableau == finalSimplexTableauTableau);
        
        assertEquals(0, finalSimplexTableauNumArtificialVariables);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method discardArtificialVariables()
    
    @Test
    public void testDiscardArtificialVariables3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1073741823;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NullPointerException] */
        simplexTableau.discardArtificialVariables();
    }
    
    @Test
    public void testDiscardArtificialVariables4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {
            null,
            null,
            null,
            null,
            null
        };
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -10;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getEntry(RealMatrixImpl.java:354)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    
    @Test
    public void testDiscardArtificialVariables5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {
            null,
            null,
            null
        };
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getEntry(RealMatrixImpl.java:354)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:300) */
        simplexTableau.discardArtificialVariables();
    }
    
    @Test
    public void testDiscardArtificialVariables6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[3][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -2;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getEntry(RealMatrixImpl.java:354)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    
    @Test
    public void testDiscardArtificialVariables7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 10);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -6;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:298) */
        simplexTableau.discardArtificialVariables();
    }
    
    @Test
    public void testDiscardArtificialVariables8() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 536870911);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            536870912, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 536870908;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables(SimplexTableau.java:300) */
        simplexTableau.discardArtificialVariables();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method discardArtificialVariables()
    
    @Test(expected = MatrixIndexException.class)
    public void testDiscardArtificialVariables9() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[3][];
        data[0] = ((double[]) null);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        data[1] = doubleArray;
        data[2] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -3;
        
        simplexTableau.discardArtificialVariables();
    }
    
    @Test(expected = MatrixIndexException.class)
    public void testDiscardArtificialVariables10() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -3;
        
        simplexTableau.discardArtificialVariables();
    }
    
    @Test(expected = MatrixIndexException.class)
    public void testDiscardArtificialVariables11() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 29);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -4;
        
        simplexTableau.discardArtificialVariables();
    }
    
    @Test(expected = MatrixIndexException.class)
    public void testDiscardArtificialVariables12() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -10;
        
        simplexTableau.discardArtificialVariables();
    }
    
    @Test(expected = MatrixIndexException.class)
    public void testDiscardArtificialVariables13() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[13];
        keys[8] = 5;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[13];
        states[4] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 12);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -4;
        
        simplexTableau.discardArtificialVariables();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetConstraintTypeCounts_CollectionIterator() throws Exception  {
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final LinearConstraint constraint: constraints)
 *  */
    @Test
    public void testGetConstraintTypeCounts_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:235) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)
    
    @Test
    public void testGetConstraintTypeCounts1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", 2.0);
        constraints.add(linearConstraint);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Relationship relationship1 = Relationship.LEQ;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class relationship1Type = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Method getConstraintTypeCountsMethod = simplexTableauClazz.getDeclaredMethod("getConstraintTypeCounts", relationship1Type);
        getConstraintTypeCountsMethod.setAccessible(true);
        java.lang.Object[] getConstraintTypeCountsMethodArguments = new java.lang.Object[1];
        getConstraintTypeCountsMethodArguments[0] = relationship1;
        int actual = ((Integer) getConstraintTypeCountsMethod.invoke(simplexTableau, getConstraintTypeCountsMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetConstraintTypeCounts2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.LEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", java.lang.Double.NaN);
        constraints.add(linearConstraint);
        LinearConstraint linearConstraint1 = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        constraints.add(linearConstraint1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Relationship relationship1 = Relationship.LEQ;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class relationship1Type = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Method getConstraintTypeCountsMethod = simplexTableauClazz.getDeclaredMethod("getConstraintTypeCounts", relationship1Type);
        getConstraintTypeCountsMethod.setAccessible(true);
        java.lang.Object[] getConstraintTypeCountsMethodArguments = new java.lang.Object[1];
        getConstraintTypeCountsMethodArguments[0] = relationship1;
        int actual = ((Integer) getConstraintTypeCountsMethod.invoke(simplexTableau, getConstraintTypeCountsMethodArguments));
        
        assertEquals(1, actual);
        
        Relationship finalRelationship1 = relationship1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)
    
    @Test
    public void testGetConstraintTypeCounts3() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        HashSet constraints = new HashSet();
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        Relationship relationship = Relationship.GEQ;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:236) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class relationshipType = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Method getConstraintTypeCountsMethod = simplexTableauClazz.getDeclaredMethod("getConstraintTypeCounts", relationshipType);
        getConstraintTypeCountsMethod.setAccessible(true);
        java.lang.Object[] getConstraintTypeCountsMethodArguments = new java.lang.Object[1];
        getConstraintTypeCountsMethodArguments[0] = relationship;
        try {
            getConstraintTypeCountsMethod.invoke(simplexTableau, getConstraintTypeCountsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetConstraintTypeCounts4() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        constraints.add(linearConstraint);
        constraints.add(null);
        constraints.add(null);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:236) */
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
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_ReturnSum() throws Exception  {
        RealVectorImpl realVectorImpl = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {};
        setField(realVectorImpl, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        
        double actual = SimplexTableau.getInvertedCoeffiecientSum(realVectorImpl);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(double coefficient: coefficients.getData())} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_ReturnSum_1() throws Exception  {
        RealVectorImpl realVectorImpl = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {2.015625};
        setField(realVectorImpl, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        
        double actual = SimplexTableau.getInvertedCoeffiecientSum(realVectorImpl);
        
        org.junit.Assert.assertEquals(-2.015625, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: for(double coefficient: coefficients.getData())
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_ThrowNegativeArraySizeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:404)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(SimplexTableau.java:261) */
        SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(double coefficient: coefficients.getData())
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_ThrowArrayIndexOutOfBoundsException() throws Exception  {
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
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:408)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(SimplexTableau.java:261) */
        SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(double coefficient: coefficients.getData())
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
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
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:548)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:408)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(SimplexTableau.java:261) */
        SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(double coefficient: coefficients.getData())
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
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
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:531)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:408)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(SimplexTableau.java:261) */
        SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double coefficient: coefficients.getData())
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(SimplexTableau.java:261) */
        SimplexTableau.getInvertedCoeffiecientSum(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double coefficient: coefficients.getData())
 *  */
    @Test
    public void testGetInvertedCoeffiecientSum_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:531)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:408)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(SimplexTableau.java:261) */
        SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testGetInvertedCoeffiecientSum1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[14];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = (byte) 1;
        states[3] = java.lang.Byte.MIN_VALUE;
        states[4] = java.lang.Byte.MIN_VALUE;
        states[5] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        double actual = SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testGetInvertedCoeffiecientSum2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[15];
        states[0] = (byte) 1;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = java.lang.Byte.MIN_VALUE;
        states[3] = java.lang.Byte.MIN_VALUE;
        states[4] = java.lang.Byte.MIN_VALUE;
        states[5] = java.lang.Byte.MIN_VALUE;
        states[6] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:548)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:408)
            org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(SimplexTableau.java:261) */
        SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector);
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
        simplexTableau.numArtificialVariables = 1;
        
        int actual = simplexTableau.getSlackVariableOffset();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOriginalNumDecisionVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.executesCondition {@code (restrictToNonNegative): True}
 * @utbot.returnsFrom {@code return restrictToNonNegative ? numDecisionVariables : numDecisionVariables - 1;}
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_RestrictToNonNegative() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        
        int actual = simplexTableau.getOriginalNumDecisionVariables();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.executesCondition {@code (restrictToNonNegative): False}
 * @utbot.returnsFrom {@code return restrictToNonNegative ? numDecisionVariables : numDecisionVariables - 1;}
 *  */
    @Test
    public void testGetOriginalNumDecisionVariables_NotRestrictToNonNegative() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -255);
        
        int actual = simplexTableau.getOriginalNumDecisionVariables();
        
        assertEquals(-256, actual);
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
        simplexTableau.numArtificialVariables = 1;
        
        int actual = simplexTableau.getArtificialVariableOffset();
        
        assertEquals(2, actual);
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
        simplexTableau.numArtificialVariables = -255;
        
        int actual = simplexTableau.getNumArtificialVariables();
        
        assertEquals(-255, actual);
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getRhsOffset();
        
        assertEquals(-1, actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:385)
            org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset(SimplexTableau.java:436) */
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
        DenseRealMatrix tableau = ((DenseRealMatrix) createInstance("org.apache.commons.math.linear.DenseRealMatrix"));
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        int actual = simplexTableau.getHeight();
        
        assertEquals(1, actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
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
            org.apache.commons.math.optimization.linear.SimplexTableau.getHeight(SimplexTableau.java:393) */
        simplexTableau.getHeight();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtractRow(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testSubtractRow_IterateForLoop() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(-255, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testSubtractRow_IterateForLoop_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(-255, -255, java.lang.Double.NaN);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testSubtractRow_IterateForLoop_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(-255, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} twice
 *  */
    @Test
    public void testSubtractRow_RealMatrixGetEntry() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        data[1] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(0, 1, java.lang.Double.NaN);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] realMatrixTableauDataTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        double finalSimplexTableauTableauData00 = ((Double) get(realMatrixTableauDataTableauData0, 0));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSimplexTableauTableauData00, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testSubtractRow_IterateForLoop_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(-255, -255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtractRow(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(-1, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(1, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: multiple * tableau.getEntry(subtrahendRow, j)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException_7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(1, -256, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException_8() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(129, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: multiple * tableau.getEntry(subtrahendRow, j)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(0, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: multiple * tableau.getEntry(subtrahendRow, j)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741821);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(1073741823, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: multiple * tableau.getEntry(subtrahendRow, j)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 184549376);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2080374772);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {13, 13};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(184549375, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: multiple * tableau.getEntry(subtrahendRow, j)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSubtractRow_ThrowMatrixIndexException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483646);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.subtractRow(1073741823, -1, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtractRow(int, int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int j = 0; j < getWidth(); j++)
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:385)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:374) */
        simplexTableau.subtractRow(-255, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1325258289);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(1073741823, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741821);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(1073741823, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483646);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(1073741823, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483646);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 16};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(1073741823, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#subtractRow(int,int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tableau.setEntry(minuendRow, j, tableau.getEntry(minuendRow, j) - multiple * tableau.getEntry(subtrahendRow, j));
 *  */
    @Test
    public void testSubtractRow_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(SimplexTableau.java:375) */
        simplexTableau.subtractRow(0, -255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.createTableau
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTableau(boolean)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] matrix = new double[height][width];
 *  */
    @Test
    public void testCreateTableau_ThrowNegativeArraySizeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -256);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:130) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.executesCondition {@code (getNumObjectiveFunctions() == 2): False}
 * @utbot.executesCondition {@code ((getNumObjectiveFunctions() == 1)): True}
 * @utbot.executesCondition {@code (maximize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: matrix[zIndex][zIndex] = maximize ? 1 : -1;
 *  */
    @Test
    public void testCreateTableau_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -2);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:137) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] matrix = new double[height][width];
 *  */
    @Test
    public void testCreateTableau_ThrowNegativeArraySizeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -87);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", -170);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NegativeArraySizeException: -253]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:130) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.executesCondition {@code (getNumObjectiveFunctions() == 2): False}
 * @utbot.executesCondition {@code ((getNumObjectiveFunctions() == 1)): True}
 * @utbot.executesCondition {@code (maximize): True}
 * @utbot.executesCondition {@code (maximize): True}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getCoefficients()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: f.getCoefficients().mapMultiply(-1)
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -211);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 210);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:139) */
        simplexTableau.createTableau(true);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.executesCondition {@code (getNumObjectiveFunctions() == 2): False}
 * @utbot.executesCondition {@code ((getNumObjectiveFunctions() == 1)): True}
 * @utbot.executesCondition {@code (maximize): False}
 * @utbot.executesCondition {@code (maximize): False}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getCoefficients()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: f.getCoefficients()
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:139) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.executesCondition {@code (getNumObjectiveFunctions() == 2): False}
 * @utbot.executesCondition {@code ((getNumObjectiveFunctions() == 1)): True}
 * @utbot.executesCondition {@code (maximize): True}
 * @utbot.executesCondition {@code (maximize): True}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getCoefficients()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: f.getCoefficients().mapMultiply(-1)
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        ArrayList constraints = new ArrayList();
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "constraints", constraints);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", -211);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numSlackVariables", 210);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:139) */
        simplexTableau.createTableau(true);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<LinearConstraint> constraints = getNormalizedConstraints();
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException_3() throws Exception  {
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
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:211)
            org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints(SimplexTableau.java:200)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:126) */
        simplexTableau.createTableau(false);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#createTableau(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<LinearConstraint> constraints = getNormalizedConstraints();
 *  */
    @Test
    public void testCreateTableau_ThrowNullPointerException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        ArrayList constraints = new ArrayList();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", -2.225073858507202E-308);
        constraints.add(linearConstraint);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.createTableau] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:212)
            org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints(SimplexTableau.java:200)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:126) */
        simplexTableau.createTableau(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumVariables()}
 * @utbot.returnsFrom {@code return f.getCoefficients().getDimension();}
 *  */
    @Test
    public void testGetNumVariables_ReturnFGetCoefficientsGetDimension() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        int actual = simplexTableau.getNumVariables();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumVariables()}
 * @utbot.returnsFrom {@code return f.getCoefficients().getDimension();}
 *  */
    @Test
    public void testGetNumVariables_ReturnFGetCoefficientsGetDimension_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {0.0};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        int actual = simplexTableau.getNumVariables();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumVariables()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumVariables()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getCoefficients()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return f.getCoefficients().getDimension();
 *  */
    @Test
    public void testGetNumVariables_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables(SimplexTableau.java:190) */
        simplexTableau.getNumVariables();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumVariables()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getCoefficients()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return f.getCoefficients().getDimension();
 *  */
    @Test
    public void testGetNumVariables_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables(SimplexTableau.java:190) */
        simplexTableau.getNumVariables();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBasicRow(int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.returnsFrom {@code return row;}
 *  */
    @Test
    public void testGetBasicRow_ReturnRow() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = -255;
        Integer actual = ((Integer) getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.returnsFrom {@code return row;}
 *  */
    @Test
    public void testGetBasicRow_ReturnRow_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {
            null,
            null
        };
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 0;
        Integer actual = ((Integer) getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments));
        
        assertNull(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        RealMatrix realMatrix1 = simplexTableau.tableau;
        double[][] realMatrix1TableauData = ((double[][]) getFieldValue(realMatrix1, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData1 = ((double[]) get(realMatrix1TableauData, 1));
        
        assertNull(finalSimplexTableauTableauData0);
        
        assertNull(finalSimplexTableauTableauData1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.returnsFrom {@code return row;}
 *  */
    @Test
    public void testGetBasicRow_ReturnRow_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = -255;
        Integer actual = ((Integer) getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBasicRow(int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetBasicRow_ThrowMatrixIndexException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = -1;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetBasicRow_ThrowMatrixIndexException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 0;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetBasicRow_ThrowMatrixIndexException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[3][];
        data[0] = ((double[]) null);
        data[1] = ((double[]) null);
        double[] doubleArray = {0.0, 0.0};
        data[2] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 129;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBasicRow(int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483521);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 254;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483521);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 254;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, -1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 0;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2013336800);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -2147221504};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -2147483647);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483647 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 8388611;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test
    public void testGetBasicRow_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483521);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 254;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test
    public void testGetBasicRow_ThrowNullPointerException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483521);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 254;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !MathUtils.equals(getEntry(i, col), 0.0, epsilon)
 *  */
    @Test
    public void testGetBasicRow_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483521);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getBasicRowMethod = simplexTableauClazz.getDeclaredMethod("getBasicRow", intType);
        getBasicRowMethod.setAccessible(true);
        java.lang.Object[] getBasicRowMethodArguments = new java.lang.Object[1];
        getBasicRowMethodArguments[0] = 254;
        try {
            getBasicRowMethod.invoke(simplexTableau, getBasicRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.copyArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyArray([D, [D, int)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#copyArray(double[],double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCopyArray_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        simplexTableau.numArtificialVariables = 1;
        double[] doubleArray = {};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.copyArray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(SimplexTableau.java:314) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method copyArrayMethod = simplexTableauClazz.getDeclaredMethod("copyArray", doubleArrayType, doubleArrayType, intType);
        copyArrayMethod.setAccessible(true);
        java.lang.Object[] copyArrayMethodArguments = new java.lang.Object[3];
        copyArrayMethodArguments[0] = ((Object) doubleArray);
        copyArrayMethodArguments[1] = ((Object) doubleArray1);
        copyArrayMethodArguments[2] = 1;
        try {
            copyArrayMethod.invoke(simplexTableau, copyArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#copyArray(double[],double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
 *  */
    @Test
    public void testCopyArray_ThrowNullPointerException_1() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        simplexTableau.numArtificialVariables = 1;
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.copyArray] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(SimplexTableau.java:314) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method copyArrayMethod = simplexTableauClazz.getDeclaredMethod("copyArray", doubleArrayType, doubleArrayType, intType);
        copyArrayMethod.setAccessible(true);
        java.lang.Object[] copyArrayMethodArguments = new java.lang.Object[3];
        copyArrayMethodArguments[0] = ((Object) doubleArray);
        copyArrayMethodArguments[1] = ((Object) null);
        copyArrayMethodArguments[2] = -255;
        try {
            copyArrayMethod.invoke(simplexTableau, copyArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#copyArray(double[],double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
 *  */
    @Test
    public void testCopyArray_ThrowNullPointerException() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.copyArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(SimplexTableau.java:314) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method copyArrayMethod = simplexTableauClazz.getDeclaredMethod("copyArray", doubleArrayType, doubleArrayType, intType);
        copyArrayMethod.setAccessible(true);
        java.lang.Object[] copyArrayMethodArguments = new java.lang.Object[3];
        copyArrayMethodArguments[0] = ((Object) null);
        copyArrayMethodArguments[1] = ((Object) null);
        copyArrayMethodArguments[2] = -255;
        try {
            copyArrayMethod.invoke(simplexTableau, copyArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#copyArray(double[],double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
 *  */
    @Test
    public void testCopyArray_ThrowNullPointerException_2() throws Throwable  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.copyArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(SimplexTableau.java:314) */
        Class simplexTableauClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class doubleArrayType = Class.forName("[D");
        Class intType = int.class;
        Method copyArrayMethod = simplexTableauClazz.getDeclaredMethod("copyArray", doubleArrayType, doubleArrayType, intType);
        copyArrayMethod.setAccessible(true);
        java.lang.Object[] copyArrayMethodArguments = new java.lang.Object[3];
        copyArrayMethodArguments[0] = ((Object) null);
        copyArrayMethodArguments[1] = ((Object) null);
        copyArrayMethodArguments[2] = -255;
        try {
            copyArrayMethod.invoke(simplexTableau, copyArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexTableau.getSolution
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSolution()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getNumObjectiveFunctions()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getOriginalNumDecisionVariables()}
 * @utbot.invokes org.apache.commons.math.optimization.linear.SimplexTableau#getBasicRow(int)
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.LinearObjectiveFunction#getValue(double[])}
 * @utbot.returnsFrom {@code return new RealPointValuePair(coefficients, f.getValue(coefficients));}
 *  */
    @Test
    public void testGetSolution_LinearObjectiveFunctionGetValue() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        RealVectorImpl coefficients = ((RealVectorImpl) createInstance("org.apache.commons.math.linear.RealVectorImpl"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.RealVectorImpl", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NEGATIVE_INFINITY);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "f", f);
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1);
        simplexTableau.numArtificialVariables = 1;
        
        RealPointValuePair actual = simplexTableau.getSolution();
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", java.lang.Double.NEGATIVE_INFINITY);
        
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
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] coefficients = new double[getOriginalNumDecisionVariables()];
 *  */
    @Test
    public void testGetSolution_ThrowNegativeArraySizeException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:325) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] coefficients = new double[getOriginalNumDecisionVariables()];
 *  */
    @Test
    public void testGetSolution_ThrowNegativeArraySizeException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:325) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetSolution_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483640);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 14);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:327) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetSolution_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483640);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 14);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:327) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getBasicRow(getNumObjectiveFunctions() + getOriginalNumDecisionVariables())
 *  */
    @Test
    public void testGetSolution_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 5);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {14, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 2);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:327) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getBasicRow(getNumObjectiveFunctions() + getOriginalNumDecisionVariables())
 *  */
    @Test
    public void testGetSolution_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {15};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:327) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new RealPointValuePair(coefficients, f.getValue(coefficients));
 *  */
    @Test
    public void testGetSolution_ThrowNullPointerException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:344) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new RealPointValuePair(coefficients, f.getValue(coefficients));
 *  */
    @Test
    public void testGetSolution_ThrowNullPointerException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:344) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetSolution_ThrowNullPointerException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483640);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 14);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:327) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetSolution_ThrowNullPointerException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 5);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 2);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:402)
            org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(SimplexTableau.java:275)
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:327) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new RealPointValuePair(coefficients, f.getValue(coefficients));
 *  */
    @Test
    public void testGetSolution_ThrowNullPointerException_5() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {
            null,
            null
        };
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:344) */
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new RealPointValuePair(coefficients, f.getValue(coefficients));
 *  */
    @Test
    public void testGetSolution_ThrowNullPointerException_4() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 1);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.getSolution] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getSolution(SimplexTableau.java:344) */
        simplexTableau.getSolution();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSolution()
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: getBasicRow(getNumObjectiveFunctions() + getOriginalNumDecisionVariables())
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSolution_ThrowMatrixIndexException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "restrictToNonNegative", true);
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 3);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 2);
        simplexTableau.numArtificialVariables = 1;
        
        simplexTableau.getSolution();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#getSolution()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: getBasicRow(getNumObjectiveFunctions() + getOriginalNumDecisionVariables())
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSolution_ThrowMatrixIndexException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[3][];
        data[0] = ((double[]) null);
        data[1] = ((double[]) null);
        double[] doubleArray = {0.0};
        data[2] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "numDecisionVariables", 3);
        simplexTableau.numArtificialVariables = 1;
        
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
    public void testDivideRow_IterateForLoop_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(-255, java.lang.Double.NaN);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 *  */
    @Test
    public void testDivideRow_IterateForLoop_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(-255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divideRow(int, double)
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testDivideRow_ThrowMatrixIndexException() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(-1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testDivideRow_ThrowMatrixIndexException_1() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testDivideRow_ThrowMatrixIndexException_2() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexTableau}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexTableau#divideRow(int,double)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < getWidth(); j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: tableau.setEntry(dividendRow, j, tableau.getEntry(dividendRow, j) / divisor);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testDivideRow_ThrowMatrixIndexException_3() throws Exception  {
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexTableau.divideRow(-256, java.lang.Double.NaN);
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
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:385)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:357) */
        simplexTableau.divideRow(-255, java.lang.Double.NaN);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1325258289);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
        simplexTableau.divideRow(0, java.lang.Double.NaN);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741821);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1073741821);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483646);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
        simplexTableau.divideRow(1073741823, java.lang.Double.NaN);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1073741824);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2147483646);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
        simplexTableau.divideRow(1073741823, java.lang.Double.NaN);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1057068126);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 607617671);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
        simplexTableau.divideRow(1057068125, java.lang.Double.NaN);
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
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexTableau.divideRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(SimplexTableau.java:358) */
        simplexTableau.divideRow(0, java.lang.Double.NaN);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields785277343554200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields785277343554200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass785277343562400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields785277343554200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass785277343562400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields785277343854100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields785277343854100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass785277343859600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields785277343854100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass785277343859600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

