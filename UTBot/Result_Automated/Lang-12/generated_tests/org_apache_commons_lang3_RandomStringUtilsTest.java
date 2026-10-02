package org.apache.commons.lang3;

import org.junit.Test;
import java.util.Random;
import org.mockito.MockedConstruction.Context;
import org.mockito.MockedConstruction;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.mockito.Mockito.mock;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mockConstruction;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang3_RandomStringUtilsTest {
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.random
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method random(int, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 *  */
    @Test
    public void testRandom_ReturnRandom() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                
                String actual = RandomStringUtils.random(1, false, false);
                
                String expected = "\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 *  */
    @Test
    public void testRandom_ReturnRandom_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.random(0, false, false);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 *  */
    @Test
    public void testRandom_ReturnRandom_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56191, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56191, 0));
                
                String actual = RandomStringUtils.random(2, false, false);
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 *  */
    @Test
    public void testRandom_ReturnRandom_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 0));
                
                String actual = RandomStringUtils.random(2, false, false);
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 *  */
    @Test
    public void testRandom_ReturnRandom_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56191, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56191, 0));
                
                String actual = RandomStringUtils.random(1, false, false);
                
                String expected = "\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 *  */
    @Test
    public void testRandom_ReturnRandom_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(18);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(18));
                
                String actual = RandomStringUtils.random(1, false, true);
                
                String expected = "2";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method random(int, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, 0, 0, letters, numbers);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:278) */
                RandomStringUtils.random(-1, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method random(int, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, 0, 0, letters, numbers);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_TimeoutExceeded() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, 0, 0, letters, numbers);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_TimeoutExceeded_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, letters, numbers);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, 0, 0, letters, numbers);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_TimeoutExceeded_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56192, 57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56192, 57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method random(int, boolean, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
     */
    @Test
    public void testRandom() {
        String actual = RandomStringUtils.random(16384, true, false);
        
        String expected = "RknmWlicNSQqqioSKSNHZlPDiKylDbxAMieWmOhAwsWcXRwfZqxcnzleaCruWHdyPprskscnFsjXxWHUWaBHfQgPigRiTWwEliptiCxEZPNvLzYzrMLowMtbhSsJZbdCaLvYYgThgWqEIZeSuFAVDUawLZMBBGnwdbJBEuMxvcGhuunwiraZOibxGyziCHUdsrpbBpVBZQvoPuAoheHxJpTednwBNpWIcyEQrctMaXMcJxEoQzuAAWohkKqXCEwPIwOxgKRybXbRNcCgKdlFfNcUcEzRbesKZgjAACRbDkcseVlvkPnAXxqwPwystzduHxZXnomgGGfYEbaxhjLofXlrvqQJxVblpsUoyAsKaskBAHtymtmDQwnlvlMygBTtzPqlJzhskSmRkVWtQmwvaDZrxpJvOKquMiMmrJmwwDOqeXRantVTKnZKZlsDytNgPQKFezaYGLyEFYPrkcvMVqdgDwqdbcAaMWHPpstKCuQwpowYZLWhxFZOedPouyAaAixKBDqcPjLLVYyBOYQLertnyyxBHBmuiPieLUXeoFkERaOAsvTyFOktqJcMbygvKvDJwcyUoGfvlsTJSQUHioHUTgpFpUDVggvcKyejOdkCAuxZuAeTioYFsNNWpAWCnMNMnVogkCZwsyqMYjaLBiPxYbMosjBeTirsPPZzPPFmKxeplHOYYoxEYxKpEIfNxtnhOUPJufOJUjPNjrTFSQCTryHJKJQiLwHFijunAQZEKpyZuWtgzErezKMaplHEEBMEzdEfkYaEBlPFKtyTMxJAuMzFxxhMoupvXCmzNgsadHWwpKznLMOqcGpVfitpzNKrPPGyTVazFpERCANDzZATQVtGxjOaxlvmPuKQBoqDNNBqXZXlObgEpDMoRVEbMkMzhqNuOvwagFvrrasImbGYjqaPWWxvhrMBBZCfrdXxlGdAoVRIOHhMUxUFdXKOzxYvNJLFGoZcyBpAyvKUfcxdloQrAbGmaARPRDzkpfBrxqhDKvqdZjknbinLNUOEIlYTHRPGmZiZIlaiSZlKdEHPWARwoJNYgISPtyrqcmRXJhayvWjkQYIFZXPpgvQEqaaGYZdEqtstmxuUFTHTJUwiTlSSFDJUdHqjdkDqrHOrpNGWddNmRbqqDurDauKtnxDKtUnFxPgxzhuUyHeeoUxINnVwGhPyESTXRkZGmtRdHwxQsHKrJuDNPiJqnNLPJMneuvPWVqqNAXrIdWIPSepwmfYzjAkrxkRfEzhfyMbdUVDZSwYZkWnbMZBbvbkavXsNSJEhupCfMhJLHNQDZnvzNoDLMUMGUNjBFwHIosuATPLjMgvwtOSvKDDnncHryXWPwuPFRntzGKOsfjmsvQWATlUJKAjoXftQCjvALLAodhwjxVqRHRiIhlHRLFTpIAEcOOJJImBdthhKjHdhyIBgFKUElLAizPDyKUQfAdCZWGhuWUxSHbMYNTezlorOqznwaNiONQAPumLvgKeQgYlWcHFdSiLmNwEvceHAdvXRfooiVfWyEvVqEwPQtnzyOzELpRgucOLaRaBywynqxvZOqcCjCiGxLkEWdaUYWVPVkasoLZToIaUOMPjpmrFXeMHkGltGMKBphRaLwJUkMFQVdsgFhfEYcLUMQXvDVzQjsSoajwwLqrLMdXkFRwmZORQAggvMgtDFzVAFdhIdLhYwawzPdiWvfvEVASoooHwQhSyxRFZGXSodAUiwGjKiYnQooPGasepRjkZGynRUAbYgBBipxyLMSNxmUwuWMkGcHdTDQjiVAoqvDkaToaBuhVFEauiTWSlQlrzdIyEQrJZUNMtiyvSXKcRCSXiGEDgCfoYWHfkYYCefUYKutrIrVcdfmModbBPLAPLtEDfFuRokXQXHOGtGsgzjEhJCEwdJqbSXfhJHnQoxdJXkJXtABzxcdEKOykKNQMVoxcUxDalrYTVwZxEhaANiLCVOCYftAKXCkqHxbAqSelxHqrJPAWXtPRLRynHHymKeuMAPfYJMGNXgRHwPBxkoLPLmZLcQrjVhIIbLvmfTOpgDCActqQKjFvHanbhjOfghMrQQFWXhNYHnEkMIubmewWlkURmidzWaYDUgMUNzTDKizrCCZQhPubxATroEkzwFZUoHcCLgjJSxBmiPVuyKreglhirSesweBKbJKvyOkuEGnhfgvNrbDwkvbJivNHSSYoxwJwJhZxBwXUsTvjFPaZQubNEYutqtxNMvDNOkltnmFrbpJZCghyGVPvjFftbkqNPpdBPDpmqfcmfHiCGBtPHFkmVxNuSwEfLMmQEjsHVFdlfYOFybUwoELOCfbyUwFFmLqdKmHvrdRprhvbKvGmywvRbkehjnUeEkQHCHNFNwBsqxsLmSPoqVZwvHZnOPLVIbuCvzPoNAsJTiSKiYWiwfrJJQsRLEqTgeHfFBMOaelWhwxIiycuFtMpiOWIXFrjexSZSZigVshxrcNhtSzJxkvGQbIgMfWLDwZNKLwOWngHMxMAHVKWjapvQIZMalzwRUqZEFVshaTbdoiknhtUddQLHZRJkbfSsYsQvBaOtxHnuFjMXkHNcIqJmznIEDZJIDQzgMeyGjTttuNKICxyCuVaDUJRaeGOzuYhodzCpeNoDPdVAItqVqFplBLfKAneFoVWpmbsWEvEEVwpvcDPBsdERuRbguxGuyLoTaXhFmhIBIhACHcZUhQwPVwPvFiEEUBBwVJfkyzDRFWZfpPPmNlEgdiwkRzbDESMgTJEjhAJWiErWwHYtqEIRyKhjFtfMnAKOahsNKOKXaWFypUxvMNTqvRExrcsTLoKxvKiGJKOYaoQefibzCXStpBTAsuQgmRkcCwRmgnpQPXuwwOgCMEmaDGgTCJcQVUBOYIIvZEqrQxHjqWHjVffONCyFWbxXwDOzqaAVlAxOaOhtYqnkBoXwlEQtFfsVgfZLjXDHvhAsiqDyAZjRJXqulSmQdcEXvAzcnxYOkgEJBTYXlHkeHoXXQPeWvMwRwolEZAylcRllKftPqcirSsWwNjeRwOKQyKBXCnzNWFyObkGdIkDZEcLgqVWHRtQNHqlLTQOVHgUSwTVtqgvywWvGRxFxvHNxEWGtIniwzYhEmejGKkAQlNXbscLJPUhmXInaWIZCCTnLNpEGfIyMwKtIWQskoYrmwoqncaaDraTdHtXGMDqfrExnefHeiKqyqnXCOruuWyEhnTEtAdbFkSaURcilzgRJOVDPvdMRBJjLAeUpCTYiFFdMhLpfOuhSyYgcJFyFdoIfFdXgLCcfeZSkHCoSZYLTLDqNnHdrOAwUkHuUOmuFIfbHSkUNIHaOpkOhZHEfTHTglRevipQKpLgzBiFFxzAQJhYkSFmeDjpgWIpkukCHwYUuUUQTbcVgqhVgbyOtYdPOVsbeAKcRZzFVSoEKBQWapmhnYuyBdhzWfvTWwjScWYvFIwUDBoWyPGcwfAeHsPgKDCnmTNsRrzNqPtrBPnoRJSEHPnqgoTuYvdYgOxKqbZWslCONxRagjVGtCNvAkdOytMmUEvXwEvOCexlhFCQqjLpJebcHdazqcxRDqQuilZNSzLxxdOguWQuiwIVVifmDhAkDBAOnFyXAllfilPTfpuSOZTqiBavkbeGbZCVoIsjDaVSOEUUxmqHTHZoujwfYjQhbNkkxowzEzFAiateciVfSNIQSICeqqLWpKxSwNwwvrBgBXiGLTUkvoyvdWOPTzoWqGVTjTXIVXsYHOdEqIJDaKQkQujPGBYGbbJeICyBFQXeUrdxWWAVzjDaUPLFMmkjCiFdAeyGiduRqNTelBCUYwcuDazqJqjiOtcrrBVLwOcevpBalrIiPYpbVIJvjCGqiCwIyJBLDRQjmlVJUCTGhpuXmmyQPDadToyYdKgRvYRRzVEgTIBETVEJjuXhNgjKWiMLaIwFySbAKvfpregwqLisAkNQQByhqaEdmOoIBopZvwVYnFvSBsMFAjllVghpFCiSvbvTAiuMAvVmPQCmPtVRIlMemzGBRKAEfZPFkAjZIUCyLpjUqVXvKQYafRvuPjdWMZSDHxgbGIDaBtwxPoaCIETvSCgppYQoNUTOTuHanNQUmdUzyVtBDLiCceRFHtuPKhEgMjEckBnLzNwNBgpKSOyyKBHPmfIIDgUSAaihAwnlhTKTHVHTHaESKQEnCPuvANUWCiMcRNtdxgCaBniYJzkipxcTbfuFapzYpTrwbrxeqDSPerujurpWSfGRWQTMRrkOFdBnvCdJueCGJZbrZYArEGBRwycQiwvdywarEnGStTJKjJeMHSZRavhujKACuyWtCojPBQyEPIyOLYXpmPXAaFXBzUGvpzpBJefxthmucYshDZvYPlyzeJBgcFtbADBCkIINiHtUYqacUYEqHyIrLfHhMoQoIBXkHGRzBNtFqUZXqeXJgqFWcIQRVzGlhrsopOYnMpKQdRuhRYQaYdAkTvYcLOoTOAMRxyYPsQwlQzivSDbBSipqmwqzGoAlmhJnDWpmomsDFyafMLcPSuQQQzznmvBkEoFGQqjpzlsIYQsYWFRPNJaDVabrHtDKoWCgbyFQgkRtdHMpknavsuoPIhFHHqUTKfGvGbIIbwtPimjjqAyvqdxCqhJPjGtbYmsoyAyjJgZyyuFrcGvKNfsHhtrnKOoHOyuDCIjKqoOKlVjiciKAFYqzzzuUsIBwmWpfkTuHPcVhBNfEkJFySrYPCDdWBwScvbILsgFJUNZWlBzEUeTrHFETQOhebyentVTMWYwTgIRUgUZVcOpdLjwCwOQgDVRkgLMWZuoUHSLExEUQMTxzZgqybvYQPVFTMUnwGTbGkizJsYzlJlmFLzNVkcEDQITkMJyYHhlgEgVlutSCeNyuxkTdetVBqmXirXIDxIUauDmpUfCiiAKOKCnWPEcKpsnwsVaNANvZomtjwyyMVMCDyLejlvoYIEmvFGmzXPXgABGPYezzquoumstASHfkBHOcnYCOGgfniqgGXibiygMymXVtWbNxwCMrGZKwiJOFcBrsUZmVYNodbFvgHPSZuHhXPQuYycBRqIgweWwSuYzvgoxIecuZjuGazqyxxIiFMHMRdWSnAOOSrAbxmhwHwJmdUQhtBqaWApcaZlsfzZDDnmmMQgLttgaqTNZbZnjEwzgHKXZERWuKqlqsFpaJoPIXDIeamgVkcHffZKMfTodCOHLFeflZSHJbHOWuDJdfoeEkLFRTVnOvVTviWYLsxnmmqxALuOzvDLDpmTBLFwRgThxwKoWRIlDHbIttzKSUgjMmjuTIwpLJhZNHHldREYLHKwLPUXTmcWrfvlOPVufKjIimcwmjCFzVfYequdUlnrzSutPkTRGFjGUuIZOjtXJuZYgbLjBBIQgKJTresqGrwdUMKXvTGgSalZUDzqIwrwqCsHRElaAIfGbSPKDzZLmSwotoWeUsjjEdpVGhxxeUBBpEBFjZOwTOoSdlJijQfTvrCXSgqjZfNkEwoYTALwmqUKFeKlPffLcAMCkyLxGcexMLHjddlLCXYbvAdTJucUjBuCPyIfRqyxiONFgrVYeiQPABywRwhRghMXlnTCCShQNAfbKLGjDvmRGkcGkGAplfZCkSXbvjuVSGLvLcgCdqiKFCEPToJVTDEfwOclxFmZOFtaCADwsTiqQQjxMxznPZBYhRtPMBNUgSkSNDBPGakexoQuzUJfmOvAfnONGXcvsORLZghJGiIHnjjwLrnbEbKOiaRWLNuLABNHxJLHpRnryYYBOsdwlGylwUvjqVNxDgiHUBtYhvutkJJhUvKogyzrskwGTJOhWCFbGlzxYYsDfDpgNQvXrLxpExYgskoIQkIiVrXuYbjHdRYujHeqdBkYTXlOEvugCtlVnnmxXRyVrBPQXfmmFdjFIfrnwdZRLBEuVXpozLmLDvuEyfSKPCOXCOSZlJQPGpABjWptETuRJnKEgUxtyowMdIlojECSHsQPgltriewXNUAJffDnilbHUJmOWIBbiutNeZpbakHTbhsSuMxFzOTSEnuugGtVFtUmBHbhDNfClTgCLtaewpzZvKvagYaAZBbiOJYnbTlYkLbBnzuPTFuXRPJOggqkjnlWMQonwPZhGvGvAUzNeEhIOmSYcPWJQhhaOYLXDqYTOOZmBVaBpWebexszlJPeOMgFfHsbDwOLxRFbpzALsZBthqstnZuaGypAbGxXCzGNUKodfBStAVVMXiFGwxbOAwJyjjiaDpSPsvHYoxQTOafyOpbEodJYIsHFSQMuPJCfISUzqMZuhMqCsdGyMUXDmyGLndnETEnmnMurUbEUUcouAQlocvdqtbCjSxmhYbMzTAoHVJyxvkYBBBlMbCtGdUWtdjzXBSmnjgjjYxptVZruczieXOSkhdTmMNPMDFJYfpWvhAIIkPFunZlhlvUQXskpKnKzgbSxzPZOtUbvzqMoYVoEuzqHDgfCkKixpgiELfMdiNYMgpCbOruMQCKbHCPCoffUmPBIISdmFAUZNlEoNYYKyAekzNIvlbJEgcGvvoRsgKTZOkOlnNmiTklkvkdnFodoxMsAGTPYVpvfczHHAOrlGQiPnOTXOmdmhzsCmIegFLZbgbOsxQOIaftzOAbReMKcmDCSSvOOSPwhhosIRJezSAojokWXwizyakkHVvrfZFNDmncMAfewOUyoPDubEsLwZvyomGnjIcpMantaTzwoqpQjetmdAdHvhucvrWNbsFPyWDeVwzWjXPOUkWqtokVnjCTIhffobaaUpbKMLyTDLzmTAnuscCGkCWrtUBzOYgGVXyGKFcOIArCWmLUKnEFhXEpNRyjzwSGrmFpPzODsViIDNvZVfSoCYBCvSxseaFNDtmqdTRcCFkcZglPWoFgqtxAAMsVSRYcoGwWujylmEnhIJkGeWqGEQVWJCgUrJwcCYQEDGYToXOERRujLbTeOMRSrVAHlhgwuZJDpUoIWFaBukYhqSNJbUQiCfnTuSkTUjlhynxsxPDBVfzuyezZGeTCeBORHmMFZQwVKWCLFDranFwPElbrxQgpFjhntReoUqsPeBEFaoIihZUhFxxWxXjUvEdehLlbTbvHeOBeYmzWVciIhugCLhfXmnLbgmovKVTiYFJtaUCVaHYgGsHAnNbcAGROTYfcUVzXzanmUCnksngdNTRGtmuydYgftAehaiEJCvfpGMceYUXWQBdkUPywOQfFPIdTDSwbOaHOTJwLlZhqBWZdwcVmOTEAldrHHcDhWqEeZJCCDPhgyISHoLsnbfPVwkbhDTEFzrlifugyxNmnGMVxaOPSUEESUGzqYxAdwkMyfSFUiwfRMGZcxfCRwwGrqnuNpnSPkhQJDMgcOiHyzOsEfpydIUcvHoAReJbDuOkkVpCKyEhiYpdTkwNJkCARemZHcJrjJtCoZJOECXpCrupouvyEJZyHLFAYRkFENrAyveKlzIVDxQqcyVqAYRNitXJxSQXEXufqdLMZlvxzDGOoSIYdxMIMTayCcQeDYACOtHQYUTbJfQpBybnJEiOYTxgpFIpcpOAusJFciUOxcDvbNsRsqmwOGWffRzXiqmrABICZgkftLraAvyKVinOllMrgiJiFwwmuMbfVoEKCIOVVwqroYVFIdkIhTeuCfcmqUXRrBjFOFkODOGmUWuHOgglirXpfmYSDFhATuRJMkIKlGzvyMWdEayVwJMainnzHUQIkrwNBbEYQbBMWtlNcALapjDMHZkmGIDhMnoSVDlsnbxobzRThgbspLkshWHFeEaAHvzJYlZtwRdNFhABXfZrViGXyOVzQiUQmZkJrROaCZVGSjWftAMYtWhleqbMlUbiGKuCVEaBxHKgiTOPUrmxpJivDvhwbLdNwJIzgFcXEGMQFGkDPAnCgbyufWqcuQSMcsjiYeQbRtqdhiuTTNyiSBGfCFeQwxRYBwohSjXzPfJladJyQrzQDEWkfXbMhmMTRJIPrZzlpxEJkcPQUkJskrNjaDGCsFKbKddeicapVnTuYSakVcfQYeMxkMQUgOEXVWfwMEmTDMoRImEOGUHnuHjzkfEaGNSztUYgaBJZTlZiJipSxjYPYlumYKpJLTvZZXaouzmKHvsIKSHzHDQAkoArrEcWcDglRTsaDCtIliiPthqiQtDzMHRnJObRFKKgPCiPxKNrSUQkNAtDKEENMixBysmgweaCxZHZYiIgkoxlCnLLxGVuOZBTuBJHawWEkTINdUcsodpRrgdQaeoYKxDpODVjUxUASeieEaIAWujMMYnqUNWpvpsTemVzDPMmVEMCIxFIPEdhXWSuQUVJaBGgjDGyibqBeUrpbNAStJLCHYMSbGGxdHYpPXnIcaHGeceESJhrPUikmOahQgbcCxbuhgxCVxSCvzIdPlYfUdljpYFXiJftgUOxGTiBaOkLgUnfcTqlppZnMdYCfDOgJGwITovcmNKFCGdinGWQLvRvBNAfOuHALPxMBcSbrVwaRozXJnQmgUEvUOiRTLwUnMjcPVsRNKCQVcxSOZPnlUontMpzIMWHwYXHhFgOLfbbOPePetaWEWQIXqcAEJtuxXheFULIvQzjQSrgMzOPyQJEVEedJMiQbdDsmJZtnBGURDpRCqNaaOshOazNOWqXZHlUJCHdgzAJOxmXKmYtrWoxRoOGuJNpesfIdskEzPviErmSPCWxoXurNdwZHaDPXbseVxvVnwFqdTpSLBLljUBOiajCuisgyvCirTxuYYdUAgaNnTEzTviZPaocsWewsrNsvZvOirbIUjzFfOssMRvFDeGIsGHbxpmxsQCFMoPUAaLbpoXaizGeDleFirxQoDUhHXCUmegEFECoppCyiEFxfcOtEPcGVkGWbqrIrUBolMtZQeMRCWiXEAZrFXeufsmlBotHTrogJJDChKurrXhlVoOVykgQTUFgrVNtqyxQTaTciYajkFfdTKlbaattHEdzMOlTdTbteJsUCfxTGEKgEQYiEpaMDXsFpzDWtEKwfCjBmOknJmZObUVcKAuTQxhFVezOuPzRuoQXNkcbiPCDCSpszCUQCmtVgWdnShcSynnhdmMKgmIiawYLQZTeVADqBJarzbRUatOdfqWtpXgtdOgpNbUcaiDGoSAfZBUpufJpQzDXWazKwueIPrRMprhYAMjjHqxigvurVRlabSLPhdDKyiHlnNfDqLXAmiOFbzuIcwbZivwlfEzRMFXBJLrWoeuvjNrFyHOLbgRqjWYFkQPSSIkDemuwfvwokkkeeDnaVLjvoAmnweohbJcRkbBcNuNJHtoPTaZUbzLcTyKJSyDNJSCZXQUCfinxmWSBhMFbaWqurjFAIDTdSrEiANhbEdhWQyjwlWBsEkMAdOtlGBhYUBKlsOpsMxDkSCTgQkOoiqsswLIbwoMZfBmoqzxACHyEEyqfHgEXqfLWnYKRJcLtvPNGVpQBoTVnaTbQJFZOKUyeNZEHdHWarZoeINKTYrAMLZAmPIAtcgVDTKsQyZXOPmrhSsnFZdbpzfFGgmITyWXxQyJbZBXJdWhbXKIpuAinyatYiyRkrkCSVyioIcgxiTODAKOKAXwnBDCXkiRSoXqHcKfuGyovFfsQtqtPGcsTWsNorsZNuTgAgKgKSwBnddqplKBDnSHNHMYdoZZQbqubhqhfIQLRHMtkSjUIuvVqvPqpZanSBHpIUiQCXRHMBvvkNYPMGHOCcIiMgNwPNgyqOwxXbyLcbWtRjySpYAYGhCVeRZXtvAFQqjSPvvCTFaDDUMqjFLTBxJQNTjVkGeiHxyhDIwqGdSUdiEwteNnUNxBkaKyVfGWbvwiGqwyNMDxRXGXNKcesnsqICKuWGBICWJioMQzCjCHhDmtREFStgyhpQlQCfJPZSglWEzzDzvzCBmmgGsmInBQpybLPBCEDOzFdspCuxVdgBMqSxSPBtSsdNBTwyMFxbnlhmVVhhYhHHOYgeqALOETaDhAPeoiamxwTqBOzuWJUWvDDkrVZzlxDJIQuijOpyMicTCRsaeDaXqedeUwfEUxAnebODZThRwEYyiLYVHygNVfplWnTJPqzuUhqenVpFdXElEyZifeQYonWrljGhjMaOiyxJnxcwEXavMuCCcDdzxJIRXTQdQaIwcxmxJGdrewFSWQVyJJrXpElxCCPXOLVBzeJwDkVvaVTMKEMpjTlPDhGWpBAlFjslfznMlrfavSxJfFZxXkGQQZMHCxoaRYHxeuZOHZqTJeZnyjRXfbIzTTADZYEfvnzDtEMuYzJteTwOpmyBSkqWpKwcQGpPuOgxKvrCyjvtZGpBttbKKFCtsOjQXnUFpzZobujzYOSNPTOLyksYomVOFKAasvjOpfCeLCkzEepIAkTARjiojoJzNQymemhIvSCRbcEZxehuUoFeJlWdnXvBXxrofdONyHakmMMrOhasHjiQIBHzIbjwxUtZwVbjlkWrHemsevvyUNNZrirDmFMwjvaysrkdMQlQCMRukZLJLSpnJOTHiWaGZqtjPToLPANZTQMVzvDJUjnJesmuOFrkISkQWtCCDYsYWxOXhUxIucDPvuiaOcNZCkcgHgDlohwykxvAdAbWBmgantOlzPqUEIfjumAVykCIqFBrVUqJPashJtDTuBnuAXxQWNitbUvgIRGLnPxMjwAXEBBAKLBeigEeuHcKvVrlfAVgGdomNOQKGYjTfbNHRWMnlALMKJADURVkIloKqmZWQktXJPSVugbtnUBdhekmnTkAfFjsoErNGMyOlMaoQRIYnsKDHeSKzCZMiKJJeTIUnXTvNaMjvXXxDNjzLfCDZllPOquNympaZbpPCraUsvmJqzwcUmTZvSFZzjGibhdvAfGHZzzgTECKauiwvHlShfznmTltMluklCHcuGgzjwdjfblMNuiovFPqCdnWDqmyeGWwwrpsDnmksjOdlCHMApNWzRJmamaRlvDAPHGgmqFwXhfvQfmYJObkCQKONdHjENoIOdIrjAKBVGvymLiPYdAuPGtjJlrRFzJaCRDPusAvzxpdddUFNINpOjjBLKCVikHMDUvWAbnLgEhLxOyNPTseLrxvjDfcXscEkSgjnojeGkUAiZDHqEWShqlUswFJsHyTNfObZTvpZqUOWvuvoyBwNtascdoQIQymsrhkYbUHplVrsnqlRRAdLuRLEXnrOqqENhWmLwiWQvSqMmlDRWMmnHjtegwzZnYspOOLovPACWucUGwehtRtZcKgeMRwQehSSdrgCVUJtibICpJVsEhhNNbJGYayUpIuDcFAoswTFMIavxcASDExWlJDgqBQEoIzmbDeLePWVRcntIlPQMDIyYHiiIKJgcKEnZdhfdJKpdiQdtJjHGXcwXZodIKNsoVOQjHmLCtZAYicNhYHZPTLoAoKEhIVtitrLMattagDQnAeavboGewNszrbSdKmubRmCFBbBPCKhemZALQmjxhtBodQCNkjiusmlVTiMHWUHsDLJPmBdfmmzrAjQSJfnMsYSwFmBTWQoEmPLrPcmUOojJWjfttFaotiFMaTorWoqBTRpMngJnTdQZqerXYMlvhvkUhhdGPnBiSRGAdxcrhjzodgKitLmHVaYcuKkNoqBXBxNwQyKdCHOSGLEPspCKEKCHbdKvrTbaxGNiHUyJJEXdoBTaHGaAznosROAxkvnOJCqwqlVYVusGffFlorGtyesJOYeWjTnUhHhIHlhslxNmzMXaKydycxcMfvLMRCfeAoAHibVNJUcsYJfchIcaMYWQVjivOQaOYCiOMUcLkzGfOwPZawhnYCKUjlpClIFVrpzXFdiSyaxlIvQGecEsbHhmiuCriEGGebpinmckiTfnjOCmWJEvBzjwMgWqBfGdazxvCQPWflzQyAfPhspyIwvCgvvyHmlDJCypASvYHYOyBVQdewPCWEHjFyKPQMiVJGJVOQcmntEmPxiEDiwHEntFiyQEuGRidLNNyVzNfyAfjthQRAkVRDqXeLgLVOBamnEovmYmoBrCxDsuWOPikXUswNKkVOaRFJKTkzLsbKBpiHPNXksynmPOJVYYIyYIwJvwGlcnacjnVobPUqKMpogNAHVrHJUSddLVeyWPznWgPWmSJIdyCRttsowEQvgxCOzMwnKMcmVgiXmWhWaqmEzRQxTumfOhfzAQWuyuKHgaOnbnrmkiYURuoqdmKLrbhYdawpRRLqJmIAiMQqdyshsuNstQSAexDfEdlxwFwRupIbLspBGhOmSBWNVCszIbNjBknFTMoiBGMTQrTIaTHZgmZFzBtvcIdChAnaohvQeGjngXbHzULibXlPedgfQmMhFRMtqirvGrBGoINqrQnKEEmIlsgIRoBhGeYmQPHIJAsFTkxmXzCZyiRkjUiHWoKTGJDQIzbJrrveTRKHJryjLaGuhYxPLGHdvSmudakTpWzDgQAicPRybhXAzAftvevAHbhIVBeIXRamNqDOoilfDjKfeRCdxpkaOKJlZJcOrODJtAhVbiCGWZIrHyiHPSjHLdgQsOxYIznkpQFfffrxtKUwVjAAJvRuRjtqsCRkcjwumbhBXtLPBjgAVDXuyoAMApkidsRcWRxPdtUgZKFUWktirojssErjBcTdvSQIouQhooZlhVMTcxdHqisHKVOZLSpXgbLyovnTWxKkaYHfScEAhfJxNlAQFneDwiEAqwVHAHEQPHfUojPhwEwbPNpJMnKtkdWMakkTEaAjemnMwLiBaiDuPPCCgsugFwveBgwKopdKWBGhrmcqlldAdbKASNCzvsyeLIkyTaQDyxGRrjVzKeBViPhrhbTLBciuKHJnAMUdRdoWWUxBHIJhniAMFrvduzEkvYOaZykLjlvVQzzIxIoRgDpSThPeKiKCUHisqppgdyRkXPRiWVMKRljDsSOmmhZbKlUQbaPbEnYzZzYlmhycUkiDZLDmtMJBMgyTQajQGjhxWOQWbKrtmSgTxMNYpTwEEuRlXIDGviLtaHJjhqIsokmNCNqBWyjWrEfyQjhGkLvOmmbOCOGaYPnqTOcHgjuaAiMiDBXKmRDwOpYCdRBAifchUrPEKbQRHosusMnHvNNVZdTrSnqFuswzZKJCaWhWGRkhlpVpgEaNpKWcAVTjsUITohFbqFnVQlVDhVtFbeThSOdoOcSydlxlBmZdIpqmqNKKTxOlrmARwSRHYoZDzxWhHSiIOTiuDaEhQiGQjlamrHeXOHtIeHJjfWBjJqTWkLnQfFvEcDMbXcMpMdtdHZtcZvrvTdxSFSmrJAJxSdVPYjgUIoRuoUmHWSuNmcHpTnYJVwWjmHHLTTCanpWpDpjWjznPmZOvsmMWRfJXtnJLkeMWWJYYSAvnVTCumoyahKayIHGKoVuZUwokAeZFoobEgtIxkEPExZUcREtyXyHlsFnZGxMjzWSrdlUJqBdKmIFGpWDYWQSQGHqamGTrWidmsoRiDDqrSFrOhUSEfSQNhgjZFmeShOUqjdNsnotNOItvwVLdFNTRYMKotoIRgeePweVdCXoPdBPKdZBevJfbQeSjVTCQAZTUQKPOgXjVTWxlHbtSkxcHnGFxZXfXIpRoqKEmVhnLpmeBKsqrHTGdUJkhDlamIPxffRCxmMReYPsyefCZJKqkRImzmNPCnjiWWLKsiSpTfEHuTBtAeUffiNvutdluZxMDMRVqMlBUyxWEzzrDOKiRjyZKZdRysxghHDlfIqtfGksItbbLLBxycAziWpSjzAQXiCZFXOAaldZMCZdXJAhKOWhsJIOIlkJYAmkgvoHMgYVongyrSCeIaHPpWWdrerRqiEsSWURuaptwUcUyCTPFQJrRZEAUXpgJypVtvfZScxRTTvkKREUKhOtRzrpFxKYZJJqyXLpvrOxkVtwkrBLNvSKbbgPHQyvZPvkOghiwXqvyuwiIELurIHXDPjQcoQQrRZDIyGJKTKlBHqNyKXFAQfWlLqnJzKoXtkmbRiOWavsiraUVsQpqXBmKIsAjdjUileXMxHotMcRfIYKCLpAwujFZUrTlZAgGbvwLKilWNvrNHvpuiZAtBfgeFcfPWkzDVwjgjePEuPPTwgMMPYFPBmYDEIJgmtSloRVhCCUtoEwwpUEWEqPHIqZodwQoAlSbJbwRpYHJAvaQIHVzAzwtsxRmGLcXrdpSLbznFLCshBWMSoxbuCSBSffkbeOeTgzUJEJyNavxTPhtJtOMZiTvYCEgoZYWAQmqnqeionolXTpfbBakeELRvLuObduxKUdZhrmzhymTAaGijwHGkefRlIcyuBxdSAoEqCpuYMgVcFlRaFtUXkJOWcnwRvFCzYJiDbBLNvqqZHzKvWCtHVPlmatXAWDRQeJQUkHXQXWsxiAQdTuTSSgLCSCIcrJAzxSUPPVLplmbdGSFUPzCChvpHjJLtkZflTHxWEukErfSPSIuzqvBaFVLEMBcKBDTAwXWsOiwRUJWVaKvOkQZzqEeqHFYZTdBVgmRZpPcXVwkkbeJEqMdrjRYFtREUvDoSlKISUwsWOQxkrNOoUuPivMPraLorQwqexnGrdeScirhGsPVmLdeWnojLrlRlsNKAFInXnMGFzLoSutxpQJXJPkBXSYNpvmYnFszfVUSDCukyvqjlQBWLqoditKwBcowyagPgNztllTOvEhPfUTDIIUmYTOfTPHqWCxChwxhDKgJxjjLMYEngTvGJGOkrkCDzLQNvNtxiYWjEBektLNSrjWVBAcPXVuOjzvjlOSnBRBglWtnFzINbErPthSndIVZjEWMGQwQjeHlVoojunuBnlKVamgsBXZKPiGnkNquVQxEwstLRAEdeUaJMJlrMksMDwJvnNOOBWVKAuWIBYVOUegQlGwJpZsIbTaCsAJDytUUyNKtoqmRAAaStpCxSIjzhETVmYvdLwBsNycMEjeNoPlCQmviZbrHPEXjiRHEbIqIUrMvtFpKOpDiogLlrYPmCXLGXdmVaWddOyfWtGIKOoQWhJTBMTYSHEFsOsjMcDTBzxwAcdeFVkqRjwSEVfDiyYpeDEbifDgHKGWajaTIHwLHtFlHsKoDXnTOXkIwFIiqnUYAzSsLgLBncJJcMzIxeAkxwVVtMfmJIGxyxBoiRSFRdAncAkxlsWtRfueChQYbtnivftYKbJsqIQMKQZcMTiiLhZeAAlwzVZCCzyhIFhRGKmHtcsFzHKKFEJoKjDZcbaHKUFLhADFGETDCYkDNJaOuOwkszZenHIDzQFFktmSjIXUrtuTakMiAoaXvKIuBfcsPlKlThwqXIUyYTaQBsDeotbPRBvzvBDhERKtLakuuAOvGEbDtIHGhrqfMzSczfeGgnbqDOXudRDcjElNOVsMQNaWUdlAYsDPMBhKmCLxIhAKxdYqxineGzrQClyTYyHLbzIewmRMjBYlvUhjeVtNxyKWOJzZvGqjSOmrgcBvNEMuKHELlfSJxgmjyClCLswCKNTPbbudufYzrvFdwVJhfgrkjSjvQYfxelsCNuHefZqJkaFCwdZdOehZYaqrKdQWlvHCCiNIdnLvVCRLAnsdnhxCltHvNJKnBniBekKSfIjikXictwMCSfyKOZUivPZIiJpPGSQfVPupcypUXRTrMdTyJuejDvrpvwoTcKwXCjcmhqFIljFLmHBRcZIqiDgaHbRjRVjIeYJepcuouPldTJKsIypajFAFNkQnJoMKRtrpyTzRdRgTWyjDqbeDShXaLzETHFRwHKHSMQltsmCHnjzdYPqHglOTTSJvnkUWEKzAkbyegXNkWbKEAOirfumzrRyGzVlilkRZmPyJetSmoVXhsjdXjWZKIIwEoghIabRIrSmAiaKmgDLnbVbOHPAaMakJbcyZInDHsQKFYMYJtVOWinBfublBlGxxBBlHUpBmKMNMTUDFzpaGQWZwvksiHdvaSnRaXHQGCmIFMnCBinVShRfnAVucqAGKMsimiwHUBXaAEWowgtsfoOZwKTBPuPoetmAtJLfkAYqisxaSTIlQZUAsjIOZgzgnCfbRJrAUcewxtVKRzZFKhtYHcuqBXPpAnvCzTfnacrTUgyRBNMeaNuMWHUTolCBYLeNDtVsrBabkFmVHONjunuDxftSuFGbZEWJPezAFQsJGYQEUNeorcffaqhgyEXoSZcgElEnObVtUrQGHQplzXcQKZauMtrnGVcBjIZrbSKHCLGhJogRlkcuGnmiaoZmoIWQUEZCnzPEqMIrMRlvoNkuemyUXrnOlunGdVvHNDOpcszvssvfAfPjLorRSMNRhoCzRlljQryAYOxaUQmUzEFSaTJtYkByCiDffupEoTkltQlOwONTKIUVkgiqbOeJYLvprlBzeYQvaZLpvdyInDwXwNfGaloYyXWgGGOrjvDAWEMVXWYgsnGOVUZGZyzEgggVkyBhEbrUIMoMHaKGrKKOysyupsSuyXgZdLtGbECdwXooRgizMFftsSZPFzAivoGzonzPBsNAlJsNVEMTbAIOEKw";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
     */
    @Test
    public void testRandomWithCornerCase() {
        String actual = RandomStringUtils.random(0, true, false);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method random(int, boolean, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
     */
    @Test
    public void testRandomThrowsIAEWithCornerCase() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -2147483648 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:278) */
        RandomStringUtils.random(Integer.MIN_VALUE, false, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.random
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method random(int, int, int, boolean, boolean, [C)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, chars, RANDOM);}
 *  */
    @Test
    public void testRandom_ReturnRandom1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                char[] charArray = {' '};
                
                String actual = RandomStringUtils.random(1, 0, 0, false, false, charArray);
                
                String expected = " ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testRandom1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 1073741824));
                char[] charArray = {
                    '\uDC00', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
                    ' '
                };
                
                String actual = RandomStringUtils.random(1, 0, 0, false, false, charArray);
                
                String expected = "\uDC00";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testRandom_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 1073741824));
                char[] charArray = new char[17];
                charArray[0] = '\uDB80';
                charArray[1] = '\u8000';
                charArray[2] = ' ';
                charArray[3] = ' ';
                charArray[4] = ' ';
                charArray[5] = ' ';
                charArray[6] = ' ';
                charArray[7] = ' ';
                charArray[8] = ' ';
                charArray[9] = ' ';
                charArray[10] = ' ';
                charArray[11] = ' ';
                charArray[12] = ' ';
                charArray[13] = ' ';
                charArray[14] = ' ';
                charArray[15] = ' ';
                charArray[16] = ' ';
                
                String actual = RandomStringUtils.random(1, 0, 0, false, false, charArray);
                
                String expected = "\uDB80";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, chars, RANDOM);}
 *  */
    @Test
    public void testRandom_ReturnRandom_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.random(0, 1, -255, false, false, null);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method random(int, int, int, boolean, boolean, [C)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(1073741824));
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (0)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(1, 0, -255, false, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (-255)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(1, -255, -255, false, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, chars, RANDOM);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(128);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(128));
                char[] charArray = new char[12];
                charArray[0] = '\u8000';
                charArray[1] = '\uE020';
                charArray[2] = ' ';
                charArray[3] = ' ';
                charArray[4] = ' ';
                charArray[5] = ' ';
                charArray[6] = ' ';
                charArray[7] = ' ';
                charArray[8] = ' ';
                charArray[9] = ' ';
                charArray[10] = ' ';
                charArray[11] = ' ';
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (-127)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(1, -127, -255, false, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(220, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(220, 0));
                char[] charArray = new char[12];
                charArray[0] = '\u8000';
                charArray[1] = '\uD800';
                charArray[2] = ' ';
                charArray[3] = ' ';
                charArray[4] = ' ';
                charArray[5] = ' ';
                charArray[6] = ' ';
                charArray[7] = ' ';
                charArray[8] = ' ';
                charArray[9] = ' ';
                charArray[10] = ' ';
                charArray[11] = ' ';
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (-219)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(1, -219, -255, false, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, chars, RANDOM);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(128, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(128, 0));
                char[] charArray = new char[12];
                charArray[0] = '\u8000';
                charArray[1] = '\uD800';
                charArray[2] = ' ';
                charArray[3] = ' ';
                charArray[4] = ' ';
                charArray[5] = ' ';
                charArray[6] = ' ';
                charArray[7] = ' ';
                charArray[8] = ' ';
                charArray[9] = ' ';
                charArray[10] = ' ';
                charArray[11] = ' ';
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (-127)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(2, -127, -255, false, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(-96);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(-96));
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException: Index -96 out of bounds for length 1]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(1, 0, 0, true, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(1073741792);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(1073741792));
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741792 out of bounds for length 1]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(1, 0, 0, true, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE));
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(1, 0, 0, false, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(-96);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(-96));
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(1, 0, 0, false, true, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 0, Integer.MIN_VALUE));
                char[] charArray = {'\uDC20'};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(3, 0, 0, false, false, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(-32, -96);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(-32, -96));
                char[] charArray = {'<'};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(1, 0, 0, false, true, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, chars, RANDOM);}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException_6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(-32);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(-32));
                char[] charArray = {'0'};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(1, 0, 0, false, true, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
                RandomStringUtils.random(-1, -255, -255, false, false, null);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method random(int, int, int, boolean, boolean, [C)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, chars, RANDOM);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, start, end, letters, numbers, chars, RANDOM);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_RandomStringUtilsRandom() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, 0, 0, false, false, null);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method random(int, int, int, boolean, boolean, [C)
    
    @Test
    public void testRandomByFuzzer() {
        char[] charArray = {'\u0001', '', '\u0001', '\u0001'};
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-1) must be greater than start (-1)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
        RandomStringUtils.random(2146959359, -1, -1, true, true, charArray);
    }
    
    @Test
    public void testRandomByFuzzer1() {
        char[] charArray = {'\u0001', '', '\u0001', '\u0001'};
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-3) must be greater than start (-1)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
        RandomStringUtils.random(2146959359, -1, -3, true, true, charArray);
    }
    
    @Test
    public void testRandomByFuzzer2() {
        char[] charArray = {'\u0001', '', '\u0001', '\u0001'};
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -524289 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:322) */
        RandomStringUtils.random(-524289, -1, -3, true, true, charArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.random
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method random(int, int, int, boolean, boolean, [C, java.util.Random)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count == 0): False}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): True}
 * @utbot.executesCondition {@code (!letters): True}
 * @utbot.executesCondition {@code (!numbers): True}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.returnsFrom {@code return new String(buffer);}
 *  */
    @Test
    public void testRandom_ChGreaterThan56319() {
        char[] charArray = {
            '\uE020', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        
        String actual = RandomStringUtils.random(1, 0, 0, false, false, charArray, randomMock);
        
        String expected = "\uE020";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count == 0): False}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): True}
 * @utbot.executesCondition {@code (!letters): True}
 * @utbot.executesCondition {@code (!numbers): True}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.returnsFrom {@code return new String(buffer);}
 *  */
    @Test
    public void testRandom_CountNotEqualsZero() {
        char[] charArray = {
            '\uDC20', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0, 0);
        
        String actual = RandomStringUtils.random(2, 0, 0, false, false, charArray, randomMock);
        
        String expected = "\uDC20\uDC20";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count == 0): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testRandom_CountEqualsZero() {
        String actual = RandomStringUtils.random(0, -255, -255, false, false, null, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method random(int, int, int, boolean, boolean, [C, java.util.Random)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ch = chars[random.nextInt(gap) + start];
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_21() {
        char[] charArray = {
            '\uDB80', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0, 536870912);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (0)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382) */
        RandomStringUtils.random(1, 0, -255, false, false, charArray, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ch = chars[random.nextInt(gap) + start];
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_31() {
        char[] charArray = new char[20];
        charArray[0] = '\u8000';
        charArray[1] = '\uDC20';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        charArray[12] = ' ';
        charArray[13] = ' ';
        charArray[14] = ' ';
        charArray[15] = ' ';
        charArray[16] = ' ';
        charArray[17] = ' ';
        charArray[18] = ' ';
        charArray[19] = ' ';
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(-128, 2147483520);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (129)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382) */
        RandomStringUtils.random(1, 129, -255, false, false, charArray, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ch = chars[random.nextInt(gap) + start];
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_41() {
        char[] charArray = new char[12];
        charArray[0] = '\u8000';
        charArray[1] = '\uD800';
        charArray[2] = ' ';
        charArray[3] = ' ';
        charArray[4] = ' ';
        charArray[5] = ' ';
        charArray[6] = ' ';
        charArray[7] = ' ';
        charArray[8] = ' ';
        charArray[9] = ' ';
        charArray[10] = ' ';
        charArray[11] = ' ';
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(64, 1073741888);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (-63)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382) */
        RandomStringUtils.random(1, -63, -255, false, false, charArray, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ch = chars[random.nextInt(gap) + start];
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_51() {
        char[] charArray = {'2'};
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0, 536870912);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-254) must be greater than start (0)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382) */
        RandomStringUtils.random(2, 0, -254, false, true, charArray, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ch = chars[random.nextInt(gap) + start];
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_6() {
        char[] charArray = {'<'};
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-254) must be greater than start (0)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382) */
        RandomStringUtils.random(1, 0, -254, false, true, charArray, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): True}
 * @utbot.executesCondition {@code (!letters): True}
 * @utbot.executesCondition {@code (!numbers): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ch = chars[random.nextInt(gap) + start];
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException1() {
        char[] charArray = {' '};
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(-96);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException: Index -96 out of bounds for length 1]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412) */
        RandomStringUtils.random(1, 0, 0, false, true, charArray, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): True}
 * @utbot.executesCondition {@code (!letters): True}
 * @utbot.executesCondition {@code (!numbers): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ch = chars[random.nextInt(gap) + start];
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException_11() {
        char[] charArray = {' '};
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(1073741792);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741792 out of bounds for length 1]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412) */
        RandomStringUtils.random(1, 0, 0, false, true, charArray, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.returnsFrom {@code return new String(buffer);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new String(buffer);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_11() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(56064, 0);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (127)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382) */
        RandomStringUtils.random(2, 127, -255, false, false, null, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.returnsFrom {@code return new String(buffer);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new String(buffer);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_7() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(0);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (-255)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382) */
        RandomStringUtils.random(1, -255, -255, false, false, null, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} twice
 * @utbot.returnsFrom {@code return new String(buffer);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new String(buffer);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_8() {
        Random randomMock = mock(Random.class);
        (when(randomMock.nextInt(anyInt()))).thenReturn(4096);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (65542)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382) */
        RandomStringUtils.random(1, 65542, -255, false, false, null, randomMock);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: count < 0
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException2() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363) */
        RandomStringUtils.random(-1, -255, -255, false, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): True}
 * @utbot.executesCondition {@code (!letters): True}
 * @utbot.executesCondition {@code (!numbers): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ch = chars[random.nextInt(gap) + start];
 *  */
    @Test
    public void testRandom_ThrowNullPointerException() {
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412) */
        RandomStringUtils.random(1, 0, 0, false, true, charArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): True}
 * @utbot.executesCondition {@code (!letters): True}
 * @utbot.executesCondition {@code (!numbers): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ch = (char) (random.nextInt(gap) + start);
 *  */
    @Test
    public void testRandom_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:401) */
        RandomStringUtils.random(1, 0, 0, false, true, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): True}
 * @utbot.executesCondition {@code (!letters): False}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ch = (char) (random.nextInt(gap) + start);
 *  */
    @Test
    public void testRandom_ThrowNullPointerException_2() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:401) */
        RandomStringUtils.random(1, 0, 0, true, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.executesCondition {@code (count < 0): False}
 * @utbot.executesCondition {@code (start == 0): True}
 * @utbot.executesCondition {@code (end == 0): True}
 * @utbot.executesCondition {@code (!letters): True}
 * @utbot.executesCondition {@code (!numbers): True}
 * @utbot.iterates iterate the loop {@code while(count-- != 0)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ch = (char) (random.nextInt(gap) + start);
 *  */
    @Test
    public void testRandom_ThrowNullPointerException_3() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:401) */
        RandomStringUtils.random(1, 0, 0, false, false, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method random(int, int, int, boolean, boolean, [C, java.util.Random)
    
    @Test
    public void testRandomByFuzzer3() {
        char[] charArray = {'\uDBFF', '\uDFFF', '\uFFFF', '\uD800'};
        Random random = new Random(56319L);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: bound must be positive]
            java.base/java.util.Random.nextInt(Random.java:322)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412) */
        RandomStringUtils.random(32, Integer.MIN_VALUE, 56320, false, true, charArray, random);
    }
    
    @Test
    public void testRandomByFuzzer4() {
        char[] charArray = {'\uDBFF', '\uDFFF', '\uFFFF', '\uD800'};
        Random random = new Random(56319L);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -2147483616 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363) */
        RandomStringUtils.random(-2147483616, Integer.MIN_VALUE, 56320, false, true, charArray, random);
    }
    
    @Test
    public void testRandomByFuzzer5() {
        char[] charArray = {'\uD800', '\uDFFF', '\uFFFF', '\uDBFF'};
        Random random = new Random(56319L);
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -2147483616 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363) */
        RandomStringUtils.random(-2147483616, Integer.MIN_VALUE, 56320, false, true, charArray, random);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.random
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method random(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return random(count, 0, 0, false, false, null, RANDOM);}
 *  */
    @Test
    public void testRandom_CharsEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.random(0, ((String) null));
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.returnsFrom {@code return random(count, chars.toCharArray());}
 *  */
    @Test
    public void testRandom_ReturnRandom2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                String string = " ";
                
                String actual = RandomStringUtils.random(0, string);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, false, false, null, RANDOM);}
 *  */
    @Test
    public void testRandom_CharsEqualsNull_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56191, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56191, 0));
                
                String actual = RandomStringUtils.random(2, ((String) null));
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, false, false, null, RANDOM);}
 *  */
    @Test
    public void testRandom_CharsEqualsNull_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 0));
                
                String actual = RandomStringUtils.random(2, ((String) null));
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): False}
 *  */
    @Test
    public void testRandom_CharsNotEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE));
                String string = "\uDC20";
                
                String actual = RandomStringUtils.random(1, string);
                
                String expected = "\uDC20";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, 0, 0, false, false, null, RANDOM);}
 *  */
    @Test
    public void testRandom_CharsEqualsNull_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                
                String actual = RandomStringUtils.random(1, ((String) null));
                
                String expected = "\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): False}
 *  */
    @Test
    public void testRandom_CharsNotEqualsNull_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 1073741824));
                String string = "\uD800";
                
                String actual = RandomStringUtils.random(1, string);
                
                String expected = "\uD800";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): False}
 *  */
    @Test
    public void testRandom_CharsNotEqualsNull_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE));
                String string = "\uDB80";
                
                String actual = RandomStringUtils.random(1, string);
                
                String expected = "\uDB80";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method random(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, 0, 0, false, false, null, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:454) */
                RandomStringUtils.random(-1, ((String) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, chars.toCharArray());
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                String string = " ";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:456) */
                RandomStringUtils.random(-1, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, chars.toCharArray());
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(1073741824));
                String string = " ";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:456) */
                RandomStringUtils.random(1, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, chars.toCharArray());
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException_12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE));
                String string = " ";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:412)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:456) */
                RandomStringUtils.random(1, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method random(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, false, false, null, RANDOM);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, 0, 0, false, false, null, RANDOM);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_CharsEqualsNull_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, ((String) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method random(int, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
     */
    @Test
    public void testRandomWithCornerCaseAndNonEmptyString() {
        String actual = RandomStringUtils.random(0, "ZX");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method random(int, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
     */
    @Test
    public void testRandomThrowsIAEWithCornerCaseAndNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -2147483648 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:456) */
        RandomStringUtils.random(Integer.MIN_VALUE, "ZX");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,java.lang.String)}
     */
    @Test
    public void testRandomThrowsIAEWithCornerCaseAndEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: The chars array must not be empty]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:366)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:456) */
        RandomStringUtils.random(Integer.MAX_VALUE, "");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method random(int, java.lang.String)
    
    @Test
    public void testRandom2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 1073741824));
                String string = "\uDB80";
                
                String actual = RandomStringUtils.random(1, string);
                
                String expected = "\uDB80";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE));
                String string = "\uD800";
                
                String actual = RandomStringUtils.random(1, string);
                
                String expected = "\uD800";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method random(int, java.lang.String)
    
    @Test
    public void testRandom4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE));
                String string = "";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: The chars array must not be empty]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:366)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:456) */
                RandomStringUtils.random(9, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                String string = "";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: The chars array must not be empty]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:366)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:456) */
                RandomStringUtils.random(9, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE));
                String string = "\uE020";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(2, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 536870912);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 536870912));
                String string = "\uE000";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(2, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom8() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 0, 1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 0, 1073741824));
                String string = "\uDC00";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(5, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom9() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 0, Integer.MIN_VALUE));
                String string = "\uDC20";
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(5, string);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.random
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method random(int, [C)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return random(count, 0, chars.length, false, false, chars, RANDOM);}
 *  */
    @Test
    public void testRandom_ReturnRandom3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                char[] charArray = {' '};
                
                String actual = RandomStringUtils.random(0, charArray);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, 0, chars.length, false, false, chars, RANDOM);}
 *  */
    @Test
    public void testRandom_ReturnRandom_12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                char[] charArray = {' '};
                
                String actual = RandomStringUtils.random(1, charArray);
                
                String expected = " ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testRandom10() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE));
                char[] charArray = {
                    '\uDC00', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
                    ' '
                };
                
                String actual = RandomStringUtils.random(1, charArray);
                
                String expected = "\uDC00";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testRandom_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE));
                char[] charArray = {
                    '\uD800', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
                    ' '
                };
                
                String actual = RandomStringUtils.random(1, charArray);
                
                String expected = "\uD800";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testRandom_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, Integer.MIN_VALUE));
                char[] charArray = new char[17];
                charArray[0] = '\uDB80';
                charArray[1] = '\u8000';
                charArray[2] = ' ';
                charArray[3] = ' ';
                charArray[4] = ' ';
                charArray[5] = ' ';
                charArray[6] = ' ';
                charArray[7] = ' ';
                charArray[8] = ' ';
                charArray[9] = ' ';
                charArray[10] = ' ';
                charArray[11] = ' ';
                charArray[12] = ' ';
                charArray[13] = ' ';
                charArray[14] = ' ';
                charArray[15] = ' ';
                charArray[16] = ' ';
                
                String actual = RandomStringUtils.random(1, charArray);
                
                String expected = "\uDB80";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method random(int, [C)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, 0, chars.length, false, false, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE));
                char[] charArray = {};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: The chars array must not be empty]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:366)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475) */
                RandomStringUtils.random(1, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (chars == null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return random(count, 0, chars.length, false, false, chars, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowArrayIndexOutOfBoundsException3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(1073741824));
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(1, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, 0, 0, false, false, null, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_13() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:473) */
                RandomStringUtils.random(-1, ((char[]) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method random(int, [C)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
 * @utbot.executesCondition {@code (chars == null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.returnsFrom {@code return random(count, 0, 0, false, false, null, RANDOM);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, 0, 0, false, false, null, RANDOM);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_CharsEqualsNull1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, ((char[]) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method random(int, [C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
     */
    @Test
    public void testRandomWithCornerCaseAndNonEmptyPrimitiveArray() {
        char[] charArray = {'\u0000', '?', ''};
        
        String actual = RandomStringUtils.random(0, charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
     */
    @Test
    public void testRandomWithCornerCaseAndNonEmptyPrimitiveArray1() {
        char[] charArray = {'?', '@', '\u0000'};
        
        String actual = RandomStringUtils.random(0, charArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method random(int, [C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,char[])}
     */
    @Test
    public void testRandomThrowsIAEWithCornerCaseAndNonEmptyPrimitiveArray() {
        char[] charArray = {'\u0000', '?', ''};
        
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -2147483648 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475) */
        RandomStringUtils.random(Integer.MIN_VALUE, charArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method random(int, [C)
    
    @Test
    public void testRandom11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 1073741824));
                char[] charArray = {
                    '\uD800', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
                    ' '
                };
                
                String actual = RandomStringUtils.random(1, charArray);
                
                String expected = "\uD800";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 1073741824);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 1073741824));
                char[] charArray = {
                    '\uDC00', '\u8000', ' ', ' ', ' ', ' ', ' ', '@',
                    ' '
                };
                
                String actual = RandomStringUtils.random(1, charArray);
                
                String expected = "\uDC00";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom13() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 0));
                char[] charArray = {
                    '\uD800', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
                    ' '
                };
                
                String actual = RandomStringUtils.random(2, charArray);
                
                String expected = "\uD800\uD800";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom14() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0, 536870912);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0, 536870912));
                char[] charArray = {
                    '\uDB80', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
                    ' '
                };
                
                String actual = RandomStringUtils.random(1, charArray);
                
                String expected = "\uDB80";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method random(int, [C)
    
    @Test
    public void testRandom15() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475) */
                RandomStringUtils.random(-1, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom16() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                char[] charArray = {};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: The chars array must not be empty]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:366)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:475) */
                RandomStringUtils.random(9, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom17() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(Integer.MIN_VALUE));
                char[] charArray = {' '};
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.ArrayIndexOutOfBoundsException] */
                RandomStringUtils.random(1, charArray);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method random(int, [C)
    
    @Test(timeout = 1000L)
    public void testRandom18() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 56320, 56320);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 56320, 56320));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, ((char[]) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test(timeout = 1000L)
    public void testRandom19() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57344, 55680, 57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57344, 55680, 57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(2, ((char[]) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test(timeout = 1000L)
    public void testRandom20() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56192, 56192, 56320);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56192, 56192, 56320));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, ((char[]) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test(timeout = 1000L)
    public void testRandom21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57344, 55680, 56192);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57344, 55680, 56192));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(2, ((char[]) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test(timeout = 1000L)
    public void testRandom22() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56192, 56320, 57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56192, 56320, 57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, ((char[]) null));
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.random
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method random(int, int, int, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 *  */
    @Test
    public void testRandom_ReturnRandom4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.random(0, -254, -255, false, false);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 *  */
    @Test
    public void testRandom_ReturnRandom_13() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56191, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56191, 0));
                
                String actual = RandomStringUtils.random(2, 0, 0, false, false);
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.lang.Character#isDigit(char)}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 *  */
    @Test
    public void testRandom_ReturnRandom_21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(18);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(18));
                
                String actual = RandomStringUtils.random(1, 0, 0, false, true);
                
                String expected = "2";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 *  */
    @Test
    public void testRandom_ReturnRandom_31() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56191, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56191, 0));
                
                String actual = RandomStringUtils.random(1, 0, 0, false, false);
                
                String expected = "\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method random(int, int, int, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, null, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
                RandomStringUtils.random(-1, -255, -255, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, null, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_14() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56189, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56189, 0));
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (2)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
                RandomStringUtils.random(2, 2, -255, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, null, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_22() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (0)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
                RandomStringUtils.random(1, 0, -255, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, null, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_32() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (-255)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
                RandomStringUtils.random(1, -255, -255, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, null, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_42() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 0));
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (0)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
                RandomStringUtils.random(2, 0, -255, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, start, end, letters, numbers, null, RANDOM);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException_52() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56192, 56320, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56192, 56320, 0));
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-255) must be greater than start (0)]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
                RandomStringUtils.random(2, 0, -255, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method random(int, int, int, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.invokes {@link java.util.Random#nextInt(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.returnsFrom {@code return random(count, start, end, letters, numbers, null, RANDOM);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, start, end, letters, numbers, null, RANDOM);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_RandomStringUtilsRandom1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1, 0, 0, false, false);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method random(int, int, int, boolean, boolean)
    
    @Test
    public void testRandomByFuzzer6() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-1) must be greater than start (-1)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
        RandomStringUtils.random(Integer.MAX_VALUE, -1, -1, true, false);
    }
    
    @Test
    public void testRandomByFuzzer7() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-1) must be greater than start (-1)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
        RandomStringUtils.random(2146959359, -1, -1, true, false);
    }
    
    @Test
    public void testRandomByFuzzer8() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Parameter end (-3) must be greater than start (-1)]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:382)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298) */
        RandomStringUtils.random(Integer.MAX_VALUE, -1, -3, true, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.random
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method random(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.returnsFrom {@code return random(count, false, false);}
 *  */
    @Test
    public void testRandom_ReturnRandom5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.random(0);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.returnsFrom {@code return random(count, false, false);}
 *  */
    @Test
    public void testRandom_ReturnRandom_14() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(0));
                
                String actual = RandomStringUtils.random(1);
                
                String expected = "\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.returnsFrom {@code return random(count, false, false);}
 *  */
    @Test
    public void testRandom_ReturnRandom_22() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56191, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56191, 0));
                
                String actual = RandomStringUtils.random(2);
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.returnsFrom {@code return random(count, false, false);}
 *  */
    @Test
    public void testRandom_ReturnRandom_32() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 0));
                
                String actual = RandomStringUtils.random(2);
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.returnsFrom {@code return random(count, false, false);}
 *  */
    @Test
    public void testRandom_ReturnRandom_41() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56192, 56191, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56192, 56191, 0));
                
                String actual = RandomStringUtils.random(2);
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.returnsFrom {@code return random(count, false, false);}
 *  */
    @Test
    public void testRandom_ReturnRandom_51() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 0));
                
                String actual = RandomStringUtils.random(1);
                
                String expected = "\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method random(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, false, false);
 *  */
    @Test
    public void testRandom_ThrowIllegalArgumentException6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:278)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:82) */
                RandomStringUtils.random(-1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method random(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.returnsFrom {@code return random(count, false, false);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, false, false);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_TimeoutExceeded1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
 * @utbot.returnsFrom {@code return random(count, false, false);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, false, false);
 *  */
    @Test(timeout = 1000L)
    public void testRandom_TimeoutExceeded_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56191, 57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56191, 57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method random(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
     */
    @Test
    public void testRandom23() {
        String actual = RandomStringUtils.random(2);
        
        String expected = "\uD883\uDF30";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method random(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testRandomThrowsOOME() {
        RandomStringUtils.random(1073741826);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#random(int)}
     */
    @Test
    public void testRandomThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.random] produces [java.lang.IllegalArgumentException: Requested random string length -1073741822 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:278)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:82) */
        RandomStringUtils.random(-1073741822);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method random(int)
    
    @Test
    public void testRandom24() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56192, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56192, 0));
                
                String actual = RandomStringUtils.random(1);
                
                String expected = "\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom25() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56192, 56320, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56192, 56320, 0));
                
                String actual = RandomStringUtils.random(2);
                
                String expected = "\u0000\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandom26() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(55680, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(55680, 0));
                
                String actual = RandomStringUtils.random(1);
                
                String expected = "\u0000";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method random(int)
    
    @Test(timeout = 1000L)
    public void testRandom27() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56192, 57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56192, 57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test(timeout = 1000L)
    public void testRandom28() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56320, 57344);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56320, 57344));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.random(1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.randomNumeric
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method randomNumeric(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomNumeric(int)}
 * @utbot.returnsFrom {@code return random(count, false, true);}
 *  */
    @Test
    public void testRandomNumeric_ReturnRandom() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.randomNumeric(0);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomNumeric(int)}
 * @utbot.returnsFrom {@code return random(count, false, true);}
 *  */
    @Test
    public void testRandomNumeric_ReturnRandom_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(18);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(18));
                
                String actual = RandomStringUtils.randomNumeric(1);
                
                String expected = "2";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomNumeric(int)}
 * @utbot.returnsFrom {@code return random(count, false, true);}
 *  */
    @Test
    public void testRandomNumeric_ReturnRandom_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(15, 18);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(15, 18));
                
                String actual = RandomStringUtils.randomNumeric(1);
                
                String expected = "2";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method randomNumeric(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomNumeric(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, false, true);
 *  */
    @Test
    public void testRandomNumeric_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.randomNumeric] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:278)
                    org.apache.commons.lang3.RandomStringUtils.randomNumeric(RandomStringUtils.java:215) */
                RandomStringUtils.randomNumeric(-1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method randomNumeric(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomNumeric(int)}
     */
    @Test
    public void testRandomNumeric() {
        String actual = RandomStringUtils.randomNumeric(2);
        
        String expected = "75";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method randomNumeric(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomNumeric(int)}
     */
    @Test(timeout = 1000L)
    public void testRandomNumeric1() {
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        RandomStringUtils.randomNumeric(1073741826);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.randomAscii
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method randomAscii(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.returnsFrom {@code return random(count, 32, 127, false, false);}
 *  */
    @Test
    public void testRandomAscii_ReturnRandom() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.randomAscii(0);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.returnsFrom {@code return random(count, 32, 127, false, false);}
 *  */
    @Test
    public void testRandomAscii_ReturnRandom_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(54048);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(54048));
                
                String actual = RandomStringUtils.randomAscii(1);
                
                String expected = "\uD340";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.returnsFrom {@code return random(count, 32, 127, false, false);}
 *  */
    @Test
    public void testRandomAscii_ReturnRandom_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57248, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57248, 0));
                
                String actual = RandomStringUtils.randomAscii(2);
                
                String expected = "  ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.returnsFrom {@code return random(count, 32, 127, false, false);}
 *  */
    @Test
    public void testRandomAscii_ReturnRandom_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56159, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56159, 0));
                
                String actual = RandomStringUtils.randomAscii(2);
                
                String expected = "  ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.returnsFrom {@code return random(count, 32, 127, false, false);}
 *  */
    @Test
    public void testRandomAscii_ReturnRandom_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56160, 54048);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56160, 54048));
                
                String actual = RandomStringUtils.randomAscii(1);
                
                String expected = "\uD340";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method randomAscii(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, 32, 127, false, false);
 *  */
    @Test
    public void testRandomAscii_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.randomAscii] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
                    org.apache.commons.lang3.RandomStringUtils.randomAscii(RandomStringUtils.java:96) */
                RandomStringUtils.randomAscii(-1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method randomAscii(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.returnsFrom {@code return random(count, 32, 127, false, false);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, 32, 127, false, false);
 *  */
    @Test(timeout = 1000L)
    public void testRandomAscii_TimeoutExceeded() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(65440);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(65440));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.randomAscii(1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.returnsFrom {@code return random(count, 32, 127, false, false);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, 32, 127, false, false);
 *  */
    @Test(timeout = 1000L)
    public void testRandomAscii_TimeoutExceeded_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57248, 65440);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57248, 65440));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.randomAscii(1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
 * @utbot.returnsFrom {@code return random(count, 32, 127, false, false);}
 * @utbot.detectsSuspiciousBehavior in: return random(count, 32, 127, false, false);
 *  */
    @Test(timeout = 1000L)
    public void testRandomAscii_TimeoutExceeded_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56159, 65440);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56159, 65440));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.randomAscii(1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method randomAscii(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
     */
    @Test
    public void testRandomAsciiThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.randomAscii] produces [java.lang.IllegalArgumentException: Requested random string length -2147483646 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
            org.apache.commons.lang3.RandomStringUtils.randomAscii(RandomStringUtils.java:96) */
        RandomStringUtils.randomAscii(-2147483646);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAscii(int)}
     */
    @Test
    public void testRandomAsciiThrowsIAE1() {
        /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.randomAscii] produces [java.lang.IllegalArgumentException: Requested random string length -1073741822 is less than 0.]
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
            org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
            org.apache.commons.lang3.RandomStringUtils.randomAscii(RandomStringUtils.java:96) */
        RandomStringUtils.randomAscii(-1073741822);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method randomAscii(int)
    
    @Test
    public void testRandomAscii1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(65440, 55712, 0, 54048, 57248);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(65440, 55712, 0, 54048, 57248));
                
                String actual = RandomStringUtils.randomAscii(5);
                
                String expected = " \uD340 \uD340 ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandomAscii2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(56224, 57248, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(56224, 57248, 0));
                
                String actual = RandomStringUtils.randomAscii(2);
                
                String expected = "  ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandomAscii3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57248, 0, 57248, 0, 57248, 56224);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57248, 0, 57248, 0, 57248, 56224));
                
                String actual = RandomStringUtils.randomAscii(5);
                
                String expected = "     ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandomAscii4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57248, 0, 57248, 0, 57248, 0);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57248, 0, 57248, 0, 57248, 0));
                
                String actual = RandomStringUtils.randomAscii(5);
                
                String expected = "     ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandomAscii5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57248, 0, 57248, 0, 57248, 64416);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57248, 0, 57248, 0, 57248, 64416));
                
                String actual = RandomStringUtils.randomAscii(5);
                
                String expected = "  \uFBC0  ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    
    @Test
    public void testRandomAscii6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57248, 0, 57248, 0, 57248, 55712);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57248, 0, 57248, 0, 57248, 55712));
                
                String actual = RandomStringUtils.randomAscii(5);
                
                String expected = "     ";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method randomAscii(int)
    
    @Test(timeout = 1000L)
    public void testRandomAscii7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                (when(randomMock.nextInt(anyInt()))).thenReturn(57248, 55712, 57248, 55712);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> (when(randomMock1.nextInt(anyInt()))).thenReturn(57248, 55712, 57248, 55712));
                
                /* This execution may take longer than the 1000 ms timeout
                 and therefore fail due to exceeding the timeout. */
                RandomStringUtils.randomAscii(1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.randomAlphabetic
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method randomAlphabetic(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAlphabetic(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, true, false);}
 *  */
    @Test
    public void testRandomAlphabetic_RandomStringUtilsRandom() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.randomAlphabetic(0);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method randomAlphabetic(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAlphabetic(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, true, false);
 *  */
    @Test
    public void testRandomAlphabetic_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.randomAlphabetic] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:278)
                    org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(RandomStringUtils.java:126) */
                RandomStringUtils.randomAlphabetic(-1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method randomAlphabetic(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAlphabetic(int)}
     */
    @Test
    public void testRandomAlphabetic() {
        String actual = RandomStringUtils.randomAlphabetic(2);
        
        String expected = "kC";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method randomAlphabetic(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAlphabetic(int)}
     */
    @Test(timeout = 1000L)
    public void testRandomAlphabetic1() {
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        RandomStringUtils.randomAlphabetic(1073741826);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method randomAlphanumeric(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAlphanumeric(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.returnsFrom {@code return random(count, true, true);}
 *  */
    @Test
    public void testRandomAlphanumeric_RandomStringUtilsRandom() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                String actual = RandomStringUtils.randomAlphanumeric(0);
                
                String expected = "";
                
                assertEquals(expected, actual);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method randomAlphanumeric(int)
    
    /**
    @utbot.classUnderTest {@link RandomStringUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAlphanumeric(int)}
 * @utbot.invokes {@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return random(count, true, true);
 *  */
    @Test
    public void testRandomAlphanumeric_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        MockedConstruction mockedConstruction = null;
        try {
            Class randomStringUtilsClazz = Class.forName("org.apache.commons.lang3.RandomStringUtils");
            Random prevRANDOM = ((Random) getStaticFieldValue(randomStringUtilsClazz, "RANDOM"));
            try {
                Random randomMock = mock(Random.class);
                setStaticField(randomStringUtilsClazz, "RANDOM", randomMock);
                mockedConstruction = mockConstruction(Random.class, (Random randomMock1, Context context) -> {
                });
                
                /* This test fails because method [org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric] produces [java.lang.IllegalArgumentException: Requested random string length -1 is less than 0.]
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:363)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:298)
                    org.apache.commons.lang3.RandomStringUtils.random(RandomStringUtils.java:278)
                    org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(RandomStringUtils.java:155) */
                RandomStringUtils.randomAlphanumeric(-1);
            } finally {
                setStaticField(RandomStringUtils.class, "RANDOM", prevRANDOM);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method randomAlphanumeric(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAlphanumeric(int)}
     */
    @Test
    public void testRandomAlphanumeric() {
        String actual = RandomStringUtils.randomAlphanumeric(3);
        
        String expected = "XP8";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method randomAlphanumeric(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.RandomStringUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.RandomStringUtils#randomAlphanumeric(int)}
     */
    @Test(timeout = 1000L)
    public void testRandomAlphanumeric1() {
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        RandomStringUtils.randomAlphanumeric(1073741827);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields626326285831600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields626326285831600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass626326285840100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields626326285831600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass626326285840100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields626326287889600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields626326287889600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass626326287891400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields626326287889600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass626326287891400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    ///endregion
}

