package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import java.util.Random;
import java.util.HashSet;
import java.util.ArrayList;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy;
import java.util.Collection;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_stat_clustering_KMeansPlusPlusClustererTest {
    ///region Test suites for executable org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cluster(java.util.Collection, int, int)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowIndexOutOfBoundsException() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(1);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowClassCastException_1() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(1);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:177)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, 2, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: assignPointsToClusters(clusters, points);
 *  */
    @Test
    public void testCluster_ThrowClassCastException() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(1);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        ArrayList arrayList = new ArrayList();
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint[] euclideanIntegerPointArray = {};
        arrayList.add(euclideanIntegerPointArray);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.ClassCastException: class [Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable ([Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; and org.apache.commons.math.stat.clustering.Clusterable are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:146)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:96) */
        kMeansPlusPlusClusterer.cluster(arrayList, 1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assignPointsToClusters(clusters, points);
 *  */
    @Test
    public void testCluster_ThrowNullPointerException_7() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:96) */
        kMeansPlusPlusClusterer.cluster(hashSet, 1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowNullPointerException() {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowNullPointerException_1() {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowNullPointerException_2() {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        Long long1 = 0L;
        hashSet.add(long1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowNullPointerException_3() {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowNullPointerException_4() {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowNullPointerException_5() {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        Long long1 = 0L;
        hashSet.add(long1);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
 *  */
    @Test
    public void testCluster_ThrowNullPointerException_6() {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(arrayList, -255, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method cluster(java.util.Collection, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
     */
    @Test
    public void testClusterThrowsIAEWithCornerCase() {
        Random random = new Random();
        KMeansPlusPlusClusterer.EmptyClusterStrategy emptyClusterStrategy = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(random, emptyClusterStrategy);
        Collection collection = emptyList();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.IllegalArgumentException: bound must be positive]
            java.base/java.util.Random.nextInt(Random.java:322)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(collection, Integer.MAX_VALUE, 1);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#cluster(java.util.Collection,int,int)}
     */
    @Test
    public void testClusterThrowsIAEWithCornerCase1() {
        Random random = new Random();
        KMeansPlusPlusClusterer.EmptyClusterStrategy emptyClusterStrategy = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(random, emptyClusterStrategy);
        Collection collection = emptyList();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.IllegalArgumentException: bound must be positive]
            java.base/java.util.Random.nextInt(Random.java:322)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(collection, Integer.MAX_VALUE, 4097);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method cluster(java.util.Collection, int, int)
    
    @Test
    public void testCluster1() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.IndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, 0, 0);
    }
    
    @Test
    public void testCluster2() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Long long1 = 0L;
        hashSet.add(long1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.ClassCastException: class java.lang.Long cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Long is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, -2147483646, 0);
    }
    
    @Test
    public void testCluster3() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        (when(randomMock.nextDouble())).thenReturn(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, 2, 0);
    }
    
    @Test
    public void testCluster4() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        (when(randomMock.nextDouble())).thenReturn(java.lang.Double.NaN);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Long long1 = 0L;
        hashSet.add(long1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.ClassCastException: class java.lang.Long cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Long is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, 2, 0);
    }
    
    @Test
    public void testCluster5() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        (when(randomMock.nextDouble())).thenReturn(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(arrayList, 2, 0);
    }
    
    @Test
    public void testCluster6() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        (when(randomMock.nextDouble())).thenReturn(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Character is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, 2, 0);
    }
    
    @Test
    public void testCluster7() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Long long1 = 0L;
        hashSet.add(long1);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.ClassCastException: class java.lang.Long cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Long is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, 0, 0);
    }
    
    @Test
    public void testCluster8() {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        Long long1 = 0L;
        hashSet.add(long1);
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint[] euclideanIntegerPointArray = {};
        hashSet.add(euclideanIntegerPointArray);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.cluster(KMeansPlusPlusClusterer.java:95) */
        kMeansPlusPlusClusterer.cluster(hashSet, 0, 0);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method cluster(java.util.Collection, int, int)
    
    @Test(timeout = 1000L)
    public void testCluster9() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        (when(randomMock.nextDouble())).thenReturn(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        kMeansPlusPlusClusterer.cluster(hashSet, 2, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNearestCluster(java.util.Collection, org.apache.commons.math.stat.clustering.Clusterable)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.returnsFrom {@code return minCluster;}
 *  */
    @Test
    public void testGetNearestCluster_ReturnMinCluster() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayList arrayList = new ArrayList();
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Class clusterableType = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", arrayListType, clusterableType);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = arrayList;
        getNearestClusterMethodArguments[1] = ((Object) null);
        Cluster actual = ((Cluster) getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.returnsFrom {@code return minCluster;}
 *  */
    @Test
    public void testGetNearestCluster_ReturnMinCluster_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        HashSet hashSet = new HashSet();
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class clusterableType = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", hashSetType, clusterableType);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = hashSet;
        getNearestClusterMethodArguments[1] = ((Object) null);
        Cluster actual = ((Cluster) getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.returnsFrom {@code return minCluster;}
 *  */
    @Test
    public void testGetNearestCluster_ReturnMinCluster_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        int[] intArray = {0};
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(intArray);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        arrayList.add(cluster);
        int[] intArray1 = {};
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Class euclideanIntegerPoint1Type = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", arrayListType, euclideanIntegerPoint1Type);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = arrayList;
        getNearestClusterMethodArguments[1] = euclideanIntegerPoint1;
        Cluster actual = ((Cluster) getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments));
        
        Cluster expected = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        setField(expected, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", intArray);
        setField(expected, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        
        List expectedPoints = expected.getPoints();
        List actualPoints = actual.getPoints();
        assertTrue(deepEquals(expectedPoints, actualPoints));
        
        Clusterable expectedCenter = expected.getCenter();
        Clusterable actualCenter = actual.getCenter();
        int[] expectedCenterPoint = (((EuclideanIntegerPoint) expectedCenter)).getPoint();
        int[] actualCenterPoint = (((EuclideanIntegerPoint) actualCenter)).getPoint();
        int expectedCenterPointSize = expectedCenterPoint.length;
        assertEquals(expectedCenterPointSize, actualCenterPoint.length);
        assertArrayEquals(expectedCenterPoint, actualCenterPoint);
        
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.returnsFrom {@code return minCluster;}
 *  */
    @Test
    public void testGetNearestCluster_ReturnMinCluster_3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        int[] intArray = {0};
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(intArray);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        arrayList.add(cluster);
        int[] intArray1 = {};
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Class euclideanIntegerPoint1Type = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", arrayListType, euclideanIntegerPoint1Type);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = arrayList;
        getNearestClusterMethodArguments[1] = euclideanIntegerPoint1;
        Cluster actual = ((Cluster) getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments));
        
        Cluster expected = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        setField(expected, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", intArray);
        setField(expected, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        
        List expectedPoints = expected.getPoints();
        List actualPoints = actual.getPoints();
        assertTrue(deepEquals(expectedPoints, actualPoints));
        
        Clusterable expectedCenter = expected.getCenter();
        Clusterable actualCenter = actual.getCenter();
        int[] expectedCenterPoint = (((EuclideanIntegerPoint) expectedCenter)).getPoint();
        int[] actualCenterPoint = (((EuclideanIntegerPoint) actualCenter)).getPoint();
        int expectedCenterPointSize = expectedCenterPoint.length;
        assertEquals(expectedCenterPointSize, actualCenterPoint.length);
        assertArrayEquals(expectedCenterPoint, actualCenterPoint);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNearestCluster(java.util.Collection, org.apache.commons.math.stat.clustering.Clusterable)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetNearestCluster_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        int[] intArray = {};
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(intArray);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        arrayList.add(cluster);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        int[] intArray1 = {0};
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MathUtils.distance(MathUtils.java:1875)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:57)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:30)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Class euclideanIntegerPoint1Type = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", arrayListType, euclideanIntegerPoint1Type);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = arrayList;
        getNearestClusterMethodArguments[1] = euclideanIntegerPoint1;
        try {
            getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetNearestCluster_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        int[] intArray = {0};
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(intArray);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        arrayList.add(cluster);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        int[] intArray1 = {0, 0};
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.MathUtils.distance(MathUtils.java:1875)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:57)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:30)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Class euclideanIntegerPoint1Type = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", arrayListType, euclideanIntegerPoint1Type);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = arrayList;
        getNearestClusterMethodArguments[1] = euclideanIntegerPoint1;
        try {
            getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Cluster<T> c: clusters)
 *  */
    @Test
    public void testGetNearestCluster_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:323) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Class clusterableType = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", collectionType, clusterableType);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = ((Object) null);
        getNearestClusterMethodArguments[1] = ((Object) null);
        try {
            getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double distance = point.distanceFrom(c.getCenter());
 *  */
    @Test
    public void testGetNearestCluster_ThrowNullPointerException() throws Throwable  {
        HashSet hashSet = new HashSet();
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(null);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class clusterableType = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", hashSetType, clusterableType);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = hashSet;
        getNearestClusterMethodArguments[1] = ((Object) null);
        try {
            getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double distance = point.distanceFrom(c.getCenter());
 *  */
    @Test
    public void testGetNearestCluster_ThrowNullPointerException_2() throws Throwable  {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Cluster cluster = new Cluster(null);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class clusterableType = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", hashSetType, clusterableType);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = hashSet;
        getNearestClusterMethodArguments[1] = ((Object) null);
        try {
            getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double distance = point.distanceFrom(c.getCenter());
 *  */
    @Test
    public void testGetNearestCluster_ThrowNullPointerException_3() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Class clusterableType = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", arrayListType, clusterableType);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = arrayList;
        getNearestClusterMethodArguments[1] = ((Object) null);
        try {
            getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNearestCluster(java.util.Collection, org.apache.commons.math.stat.clustering.Clusterable)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
     */
    @Test
    public void testGetNearestCluster() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Collection collection = emptyList();
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Class clusterableType = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", collectionType, clusterableType);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = collection;
        getNearestClusterMethodArguments[1] = ((Object) null);
        Cluster actual = ((Cluster) getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments));
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getNearestCluster(java.util.Collection,org.apache.commons.math.stat.clustering.Clusterable)}
     */
    @Test
    public void testGetNearestCluster1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Collection collection = emptyList();
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Class clusterableType = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Method getNearestClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getNearestCluster", collectionType, clusterableType);
        getNearestClusterMethod.setAccessible(true);
        java.lang.Object[] getNearestClusterMethodArguments = new java.lang.Object[2];
        getNearestClusterMethodArguments[0] = collection;
        getNearestClusterMethodArguments[1] = ((Object) null);
        Cluster actual = ((Cluster) getNearestClusterMethod.invoke(null, getNearestClusterMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFarthestPoint(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.executesCondition {@code (selectedCluster == null): True}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 *  */
    @Test
    public void testGetFarthestPoint_SelectedClusterEqualsNull() throws Exception  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {0, 0};
        setField(euclideanIntegerPoint, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        points.add(euclideanIntegerPoint);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        EuclideanIntegerPoint actual = ((EuclideanIntegerPoint) getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments));
        
        EuclideanIntegerPoint expected = new EuclideanIntegerPoint(point);
        
        // org.apache.commons.math.stat.clustering.EuclideanIntegerPoint has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.executesCondition {@code (selectedCluster == null): False}
 * @utbot.invokes {@link org.apache.commons.math.stat.clustering.Cluster#getPoints()}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.returnsFrom {@code return selectedCluster.getPoints().remove(selectedPoint);}
 *  */
    @Test
    public void testGetFarthestPoint_SelectedClusterNotEqualsNull() throws Exception  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {};
        setField(euclideanIntegerPoint, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        points.add(euclideanIntegerPoint);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point1 = {0};
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point1);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        EuclideanIntegerPoint actual = ((EuclideanIntegerPoint) getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments));
        
        EuclideanIntegerPoint expected = new EuclideanIntegerPoint(point);
        
        // org.apache.commons.math.stat.clustering.EuclideanIntegerPoint has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFarthestPoint(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.executesCondition {@code (selectedCluster == null): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: selectedCluster == null
 *  */
    @Test
    public void testGetFarthestPoint_ThrowRuntimeException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.RuntimeException: empty cluster in k-means]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:304) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", arrayListType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = arrayList;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.executesCondition {@code (selectedCluster == null): True}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.RuntimeException} when: selectedCluster == null
 *  */
    @Test
    public void testGetFarthestPoint_ThrowRuntimeException_1() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.RuntimeException: empty cluster in k-means]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:304) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final double distance = points.get(i).distanceFrom(center);
 *  */
    @Test
    public void testGetFarthestPoint_ThrowClassCastException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint[] euclideanIntegerPointArray = {};
        points.add(euclideanIntegerPointArray);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.ClassCastException: class [Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable ([Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; and org.apache.commons.math.stat.clustering.Clusterable are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:292) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double distance = points.get(i).distanceFrom(center);
 *  */
    @Test
    public void testGetFarthestPoint_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {0};
        setField(euclideanIntegerPoint, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        points.add(euclideanIntegerPoint);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point1 = {};
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point1);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MathUtils.distance(MathUtils.java:1875)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:57)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:30)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:292) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double distance = points.get(i).distanceFrom(center);
 *  */
    @Test
    public void testGetFarthestPoint_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {0, 0};
        setField(euclideanIntegerPoint, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        points.add(euclideanIntegerPoint);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point1 = {0};
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point1);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.MathUtils.distance(MathUtils.java:1875)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:57)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:30)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:292) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Cluster<T> cluster: clusters)
 *  */
    @Test
    public void testGetFarthestPoint_ThrowNullPointerException_2() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:286) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", collectionType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = ((Object) null);
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < points.size(); ++i)
 *  */
    @Test
    public void testGetFarthestPoint_ThrowNullPointerException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:291) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T center = cluster.getCenter();
 *  */
    @Test
    public void testGetFarthestPoint_ThrowNullPointerException_3() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Cluster cluster = new Cluster(null);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:289) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < points.size(); ++i)
 *  */
    @Test
    public void testGetFarthestPoint_ThrowNullPointerException_4() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:289) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double distance = points.get(i).distanceFrom(center);
 *  */
    @Test
    public void testGetFarthestPoint_ThrowNullPointerException_6() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {};
        setField(euclideanIntegerPoint, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        points.add(euclideanIntegerPoint);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point1 = {0};
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point1);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:292) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double distance = points.get(i).distanceFrom(center);
 *  */
    @Test
    public void testGetFarthestPoint_ThrowNullPointerException_1() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        points.add(null);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:292) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", hashSetType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = hashSet;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T center = cluster.getCenter();
 *  */
    @Test
    public void testGetFarthestPoint_ThrowNullPointerException_5() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:289) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", arrayListType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = arrayList;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFarthestPoint(java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getFarthestPoint(java.util.Collection)}
     */
    @Test
    public void testGetFarthestPointThrowsRE() throws Throwable  {
        Random random = new Random();
        KMeansPlusPlusClusterer.EmptyClusterStrategy emptyClusterStrategy = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(random, emptyClusterStrategy);
        Collection collection = emptyList();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint] produces [java.lang.RuntimeException: empty cluster in k-means]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getFarthestPoint(KMeansPlusPlusClusterer.java:304) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method getFarthestPointMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getFarthestPoint", collectionType);
        getFarthestPointMethod.setAccessible(true);
        java.lang.Object[] getFarthestPointMethodArguments = new java.lang.Object[1];
        getFarthestPointMethodArguments[0] = collection;
        try {
            getFarthestPointMethod.invoke(kMeansPlusPlusClusterer, getFarthestPointMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assignPointsToClusters(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 *  */
    @Test
    public void testAssignPointsToClusters() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayList arrayList = new ArrayList();
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", collectionType, collectionType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = ((Object) null);
        assignPointsToClustersMethodArguments[1] = arrayList;
        assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 *  */
    @Test
    public void testAssignPointsToClusters_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        HashSet hashSet = new HashSet();
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", collectionType, collectionType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = ((Object) null);
        assignPointsToClustersMethodArguments[1] = hashSet;
        assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 *  */
    @Test
    public void testAssignPointsToClusters_2() throws Exception  {
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {0, 0};
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        ArrayList arrayList = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(point);
        arrayList.add(euclideanIntegerPoint);
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method assignPointsToClusters(java.util.Collection, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(final T p: points)
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowClassCastException() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint[][] euclideanIntegerPointArray = {};
        arrayList.add(euclideanIntegerPointArray);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.ClassCastException: class [[Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable ([[Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; and org.apache.commons.math.stat.clustering.Clusterable are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:146) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", collectionType, collectionType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = ((Object) null);
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        HashSet hashSet = new HashSet();
        int[] intArray = {};
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(intArray);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        hashSet.add(cluster);
        ArrayList arrayList = new ArrayList();
        int[] intArray1 = {0};
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        arrayList.add(euclideanIntegerPoint1);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MathUtils.distance(MathUtils.java:1875)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:57)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:30)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final T p: points)
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:146) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", collectionType, collectionType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = ((Object) null);
        assignPointsToClustersMethodArguments[1] = ((Object) null);
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Cluster<T> cluster = getNearestCluster(clusters, p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_2() throws Throwable  {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:323)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", collectionType, collectionType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = ((Object) null);
        assignPointsToClustersMethodArguments[1] = hashSet;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cluster.addPoint(p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_3() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:148) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", arrayListType, arrayListType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = arrayList;
        assignPointsToClustersMethodArguments[1] = hashSet;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Cluster<T> cluster = getNearestCluster(clusters, p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_4() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:323)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", collectionType, collectionType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = ((Object) null);
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cluster.addPoint(p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_5() throws Throwable  {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:148) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Cluster<T> cluster = getNearestCluster(clusters, p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_6() throws Throwable  {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Cluster<T> cluster = getNearestCluster(clusters, p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_7() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", arrayListType, arrayListType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = arrayList;
        assignPointsToClustersMethodArguments[1] = hashSet;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Cluster<T> cluster = getNearestCluster(clusters, p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException() throws Throwable  {
        HashSet hashSet = new HashSet();
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(null);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        hashSet.add(cluster);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cluster.addPoint(p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_11() throws Throwable  {
        HashSet hashSet = new HashSet();
        int[] intArray = {0};
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(intArray);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        hashSet.add(cluster);
        ArrayList arrayList = new ArrayList();
        int[] intArray1 = {};
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        arrayList.add(euclideanIntegerPoint1);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Cluster<T> cluster = getNearestCluster(clusters, p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_8() throws Throwable  {
        HashSet hashSet = new HashSet();
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(null);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        hashSet.add(cluster);
        hashSet.add(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_9() throws Throwable  {
        HashSet hashSet = new HashSet();
        int[] intArray = {0};
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(intArray);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        hashSet.add(cluster);
        hashSet.add(null);
        ArrayList arrayList = new ArrayList();
        int[] intArray1 = {0, 0};
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        arrayList.add(euclideanIntegerPoint1);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Cluster<T> cluster = getNearestCluster(clusters, p);
 *  */
    @Test
    public void testAssignPointsToClusters_ThrowNullPointerException_10() throws Throwable  {
        HashSet hashSet = new HashSet();
        int[] intArray = {0};
        EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(intArray);
        Cluster cluster = new Cluster(euclideanIntegerPoint);
        hashSet.add(cluster);
        hashSet.add(null);
        ArrayList arrayList = new ArrayList();
        int[] intArray1 = {};
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        arrayList.add(euclideanIntegerPoint1);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(KMeansPlusPlusClusterer.java:324)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:147) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", hashSetType, hashSetType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = hashSet;
        assignPointsToClustersMethodArguments[1] = arrayList;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method assignPointsToClusters(java.util.Collection, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
     */
    @Test
    public void testAssignPointsToClustersThrowsCCE() throws Throwable  {
        Collection collection = emptyList();
        HashSet hashSet = new HashSet();
        Object object = new Object();
        hashSet.add(object);
        Object object1 = new Object();
        hashSet.add(object1);
        Object object2 = new Object();
        hashSet.add(object2);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:146) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", collectionType, collectionType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = collection;
        assignPointsToClustersMethodArguments[1] = hashSet;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#assignPointsToClusters(java.util.Collection,java.util.Collection)}
     */
    @Test
    public void testAssignPointsToClustersThrowsCCE1() throws Throwable  {
        Collection collection = emptyList();
        HashSet hashSet = new HashSet();
        Object object = new Object();
        hashSet.add(object);
        Object object1 = new Object();
        hashSet.add(object1);
        Object object2 = new Object();
        hashSet.add(object2);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(KMeansPlusPlusClusterer.java:146) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method assignPointsToClustersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("assignPointsToClusters", collectionType, collectionType);
        assignPointsToClustersMethod.setAccessible(true);
        java.lang.Object[] assignPointsToClustersMethodArguments = new java.lang.Object[2];
        assignPointsToClustersMethodArguments[0] = collection;
        assignPointsToClustersMethodArguments[1] = hashSet;
        try {
            assignPointsToClustersMethod.invoke(null, assignPointsToClustersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chooseInitialCenters(java.util.Collection, int, java.util.Random)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.iterates iterate the loop {@code while(resultSet.size() < k)} once
 * @utbot.returnsFrom {@code return resultSet;}
 *  */
    @Test
    public void testChooseInitialCenters_ListSize() throws Exception  {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 1;
        chooseInitialCentersMethodArguments[2] = randomMock;
        ArrayList actual = ((ArrayList) chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments));
        
        ArrayList expected = new ArrayList();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        expected.add(cluster);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method chooseInitialCenters(java.util.Collection, int, java.util.Random)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowIndexOutOfBoundsException() throws Throwable  {
        HashSet hashSet = new HashSet();
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(-1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = randomMock;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException() throws Throwable  {
        HashSet hashSet = new HashSet();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException_1() throws Throwable  {
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException_2() throws Throwable  {
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException_3() throws Throwable  {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Integer integer = 0;
        hashSet.add(integer);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException_4() throws Throwable  {
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException_5() throws Throwable  {
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException_6() throws Throwable  {
        HashSet hashSet = new HashSet();
        Integer integer = 8388607;
        hashSet.add(integer);
        Integer integer1 = 0;
        hashSet.add(integer1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException_7() throws Throwable  {
        HashSet hashSet = new HashSet();
        Character character = '';
        hashSet.add(character);
        Character character1 = '\u0000';
        hashSet.add(character1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
 *  */
    @Test
    public void testChooseInitialCenters_ThrowNullPointerException_8() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", arrayListType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = arrayList;
        chooseInitialCentersMethodArguments[1] = -255;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method chooseInitialCenters(java.util.Collection, int, java.util.Random)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
     */
    @Test
    public void testChooseInitialCentersThrowsIAE() throws Throwable  {
        Collection collection = emptyList();
        Random random = new Random();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.IllegalArgumentException: bound must be positive]
            java.base/java.util.Random.nextInt(Random.java:322)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", collectionType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = collection;
        chooseInitialCentersMethodArguments[1] = 3;
        chooseInitialCentersMethodArguments[2] = random;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#chooseInitialCenters(java.util.Collection,int,java.util.Random)}
     */
    @Test
    public void testChooseInitialCentersThrowsIAE1() throws Throwable  {
        Collection collection = emptyList();
        Random random = new Random();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.IllegalArgumentException: bound must be positive]
            java.base/java.util.Random.nextInt(Random.java:322)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", collectionType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = collection;
        chooseInitialCentersMethodArguments[1] = -2147483645;
        chooseInitialCentersMethodArguments[2] = random;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method chooseInitialCenters(java.util.Collection, int, java.util.Random)
    
    @Test
    public void testChooseInitialCenters1() throws Throwable  {
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        (when(randomMock.nextDouble())).thenReturn(java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Character is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 2;
        chooseInitialCentersMethodArguments[2] = randomMock;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testChooseInitialCenters2() throws Throwable  {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Character character = '\u0000';
        hashSet.add(character);
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Character is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 0;
        chooseInitialCentersMethodArguments[2] = randomMock;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testChooseInitialCenters3() throws Throwable  {
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        hashSet.add(null);
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 0;
        chooseInitialCentersMethodArguments[2] = randomMock;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testChooseInitialCenters4() throws Throwable  {
        HashSet hashSet = new HashSet();
        Character character = '\u0001';
        hashSet.add(character);
        Character character1 = '\u0000';
        hashSet.add(character1);
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Character is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 0;
        chooseInitialCentersMethodArguments[2] = randomMock;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testChooseInitialCenters5() throws Throwable  {
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        Character character = '\u0000';
        hashSet.add(character);
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Character is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 2;
        chooseInitialCentersMethodArguments[2] = randomMock;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testChooseInitialCenters6() throws Throwable  {
        HashSet hashSet = new HashSet();
        Integer integer = 1;
        hashSet.add(integer);
        Integer integer1 = 0;
        hashSet.add(integer1);
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 0;
        chooseInitialCentersMethodArguments[2] = randomMock;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testChooseInitialCenters7() throws Throwable  {
        HashSet hashSet = new HashSet();
        Character character = '\u0000';
        hashSet.add(character);
        hashSet.add(null);
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable (java.lang.Character is in module java.base of loader 'bootstrap'; org.apache.commons.math.stat.clustering.Clusterable is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomMockType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomMockType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 0;
        chooseInitialCentersMethodArguments[2] = randomMock;
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testChooseInitialCenters8() throws Throwable  {
        HashSet hashSet = new HashSet();
        Character character = '\u0002';
        hashSet.add(character);
        Character character1 = '\u0001';
        hashSet.add(character1);
        Character character2 = '\u0000';
        hashSet.add(character2);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 0;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testChooseInitialCenters9() throws Throwable  {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Integer integer = 1;
        hashSet.add(integer);
        Integer integer1 = 0;
        hashSet.add(integer1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(KMeansPlusPlusClusterer.java:168) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Class intType = int.class;
        Class randomType = Class.forName("java.util.Random");
        Method chooseInitialCentersMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("chooseInitialCenters", hashSetType, intType, randomType);
        chooseInitialCentersMethod.setAccessible(true);
        java.lang.Object[] chooseInitialCentersMethodArguments = new java.lang.Object[3];
        chooseInitialCentersMethodArguments[0] = hashSet;
        chooseInitialCentersMethodArguments[1] = 0;
        chooseInitialCentersMethodArguments[2] = ((Object) null);
        try {
            chooseInitialCentersMethod.invoke(null, chooseInitialCentersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPointFromLargestNumberCluster(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link org.apache.commons.math.stat.clustering.Cluster#getPoints()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.returnsFrom {@code return selectedPoints.remove(random.nextInt(selectedPoints.size()));}
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_SelectedNotEqualsNull() throws Exception  {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        hashSet.add(cluster);
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", hashSetType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = hashSet;
        Clusterable actual = ((Clusterable) getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPointFromLargestNumberCluster(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: selected == null
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowRuntimeException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.RuntimeException: empty cluster in k-means]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:266) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", arrayListType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = arrayList;
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): True}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.RuntimeException} when: selected == null
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowRuntimeException_1() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        ArrayList arrayList = new ArrayList();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        arrayList.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.RuntimeException: empty cluster in k-means]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:266) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", arrayListType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = arrayList;
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return selectedPoints.remove(random.nextInt(selectedPoints.size()));
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowClassCastException() throws Throwable  {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint[] euclideanIntegerPointArray = {};
        points.add(euclideanIntegerPointArray);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.ClassCastException: class [Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable ([Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; and org.apache.commons.math.stat.clustering.Clusterable are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:271) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", hashSetType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return selectedPoints.remove(random.nextInt(selectedPoints.size()));
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowIndexOutOfBoundsException() throws Throwable  {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(-1);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        points.add(null);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:271) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", hashSetType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Cluster<T> cluster: clusters)
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowNullPointerException_1() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:251) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", collectionType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = ((Object) null);
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int number = cluster.getPoints().size();
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowNullPointerException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:254) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", hashSetType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int number = cluster.getPoints().size();
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowNullPointerException_3() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        hashSet.add(cluster);
        Cluster cluster1 = new Cluster(null);
        hashSet.add(cluster1);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:254) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", hashSetType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return selectedPoints.remove(random.nextInt(selectedPoints.size()));
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowNullPointerException_4() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        points.add(null);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:271) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", hashSetType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestNumberCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int number = cluster.getPoints().size();
 *  */
    @Test
    public void testGetPointFromLargestNumberCluster_ThrowNullPointerException_2() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestNumberCluster(KMeansPlusPlusClusterer.java:254) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method getPointFromLargestNumberClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestNumberCluster", arrayListType);
        getPointFromLargestNumberClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestNumberClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestNumberClusterMethodArguments[0] = arrayList;
        try {
            getPointFromLargestNumberClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestNumberClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPointFromLargestVarianceCluster(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link org.apache.commons.math.stat.clustering.Cluster#getPoints()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.returnsFrom {@code return selectedPoints.remove(random.nextInt(selectedPoints.size()));}
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_SelectedNotEqualsNull() throws Exception  {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(randomMock, null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {0};
        setField(euclideanIntegerPoint, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        points.add(euclideanIntegerPoint);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", hashSetType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = hashSet;
        EuclideanIntegerPoint actual = ((EuclideanIntegerPoint) getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments));
        
        EuclideanIntegerPoint expected = new EuclideanIntegerPoint(point);
        
        // org.apache.commons.math.stat.clustering.EuclideanIntegerPoint has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPointFromLargestVarianceCluster(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: selected == null
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowRuntimeException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.RuntimeException: empty cluster in k-means]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:232) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", arrayListType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = arrayList;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): True}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.RuntimeException} when: selected == null
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowRuntimeException_1() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        ArrayList arrayList = new ArrayList();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        arrayList.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.RuntimeException: empty cluster in k-means]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:232) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", arrayListType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = arrayList;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(final T point: cluster.getPoints())
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowClassCastException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint[] euclideanIntegerPointArray = {};
        points.add(euclideanIntegerPointArray);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.ClassCastException: class [Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; cannot be cast to class org.apache.commons.math.stat.clustering.Clusterable ([Lorg.apache.commons.math.stat.clustering.EuclideanIntegerPoint; and org.apache.commons.math.stat.clustering.Clusterable are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:216) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", hashSetType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: stat.increment(point.distanceFrom(center));
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {0};
        setField(euclideanIntegerPoint, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        points.add(euclideanIntegerPoint);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point1 = {};
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point1);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MathUtils.distance(MathUtils.java:1875)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:57)
            org.apache.commons.math.stat.clustering.EuclideanIntegerPoint.distanceFrom(EuclideanIntegerPoint.java:30)
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:217) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", hashSetType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Cluster<T> cluster: clusters)
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowNullPointerException_1() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:210) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class collectionType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", collectionType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = ((Object) null);
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !cluster.getPoints().isEmpty()
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowNullPointerException() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:211) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", hashSetType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !cluster.getPoints().isEmpty()
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowNullPointerException_2() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        hashSet.add(cluster);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:211) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", hashSetType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !cluster.getPoints().isEmpty()
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowNullPointerException_3() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Cluster cluster = new Cluster(null);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:211) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", hashSetType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.invokes {@link org.apache.commons.math.stat.clustering.Cluster#getPoints()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return selectedPoints.remove(random.nextInt(selectedPoints.size()));
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowNullPointerException_6() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null, null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        EuclideanIntegerPoint euclideanIntegerPoint = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        int[] point = {0};
        setField(euclideanIntegerPoint, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        points.add(euclideanIntegerPoint);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(center, "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", "point", point);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:237) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", hashSetType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !cluster.getPoints().isEmpty()
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowNullPointerException_4() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:211) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class arrayListType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", arrayListType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = arrayList;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link KMeansPlusPlusClusterer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer#getPointFromLargestVarianceCluster(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Cluster<T> cluster: clusters)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stat.increment(point.distanceFrom(center));
 *  */
    @Test
    public void testGetPointFromLargestVarianceCluster_ThrowNullPointerException_5() throws Throwable  {
        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(null);
        HashSet hashSet = new HashSet();
        Cluster cluster = ((Cluster) createInstance("org.apache.commons.math.stat.clustering.Cluster"));
        ArrayList points = new ArrayList();
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        points.add(null);
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "points", points);
        EuclideanIntegerPoint center = ((EuclideanIntegerPoint) createInstance("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"));
        setField(cluster, "org.apache.commons.math.stat.clustering.Cluster", "center", center);
        hashSet.add(cluster);
        
        /* This test fails because method [org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getPointFromLargestVarianceCluster(KMeansPlusPlusClusterer.java:217) */
        Class kMeansPlusPlusClustererClazz = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class hashSetType = Class.forName("java.util.Collection");
        Method getPointFromLargestVarianceClusterMethod = kMeansPlusPlusClustererClazz.getDeclaredMethod("getPointFromLargestVarianceCluster", hashSetType);
        getPointFromLargestVarianceClusterMethod.setAccessible(true);
        java.lang.Object[] getPointFromLargestVarianceClusterMethodArguments = new java.lang.Object[1];
        getPointFromLargestVarianceClusterMethodArguments[0] = hashSet;
        try {
            getPointFromLargestVarianceClusterMethod.invoke(kMeansPlusPlusClusterer, getPointFromLargestVarianceClusterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields734338900626200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields734338900626200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass734338900633300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields734338900626200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass734338900633300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        if (hasCustomEquals(firstClass) && !org.mockito.Mockito.mockingDetails(o1).isMock()) {
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

