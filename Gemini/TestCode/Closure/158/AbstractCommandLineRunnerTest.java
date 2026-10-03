package com.google.javascript.jscomp;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AbstractCommandLineRunnerTest {

    private ConcreteCommandLineRunner runner;
    private ByteArrayOutputStream errStream;

    // คลาสลูกรูปธรรม (Concrete implementation) สำหรับใช้ทดสอบ Abstract class
    private static class ConcreteCommandLineRunner extends AbstractCommandLineRunner<Compiler, CompilerOptions> {
        
        public ConcreteCommandLineRunner(String[] args) {
            super();
        }

        public ConcreteCommandLineRunner(PrintStream out, PrintStream err) {
            super(out, err);
        }

        @Override
        protected Compiler createCompiler() {
            return new Compiler();
        }

        @Override
        protected CompilerOptions createOptions() {
            CompilerOptions options = new CompilerOptions();
            return options;
        }
    }

    @Before
    public void setUp() {
        errStream = new ByteArrayOutputStream();
        runner = new ConcreteCommandLineRunner(new PrintStream(System.out), new PrintStream(errStream));
    }

    @Test
    public void testLanguageInValidOptions() throws Exception {
        // ทดสอบภาษาทุกบรานช์ที่ถูกต้อง
        String[] validLanguages = {
            "ECMASCRIPT5_STRICT", "ES5_STRICT",
            "ECMASCRIPT5", "ES5",
            "ECMASCRIPT3", "ES3"
        };

        for (String lang : validLanguages) {
            CompilerOptions options = runner.createOptions();
            runner.getCommandLineConfig().setLanguageIn(lang);
            runner.setRunOptions(options);
            // ไม่มี Exception แสดงว่าผ่าน
        }
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testLanguageInInvalidOptionThrowsException() throws Exception {
        // ทดสอบ Edge Case: ภาษาที่ไม่รู้จัก ต้องโยน FlagUsageException
        CompilerOptions options = runner.createOptions();
        runner.getCommandLineConfig().setLanguageIn("INVALID_LANG_99");
        runner.setRunOptions(options);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesInvalidSpecParts() throws Exception {
        // Edge Case: โมดูลสเปกมีส่วนประกอบน้อยเกินไป (น้อยกว่า 2 ส่วน)
        List<String> specs = ImmutableList.of("mod1"); // ผิดรูปแบบ
        List<String> jsFiles = ImmutableList.of("file1.js");
        runner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesDuplicateName() throws Exception {
        // Edge Case: ชื่อโมดูลซ้ำกัน
        List<String> specs = ImmutableList.of("mod1:1", "mod1:1");
        List<String> jsFiles = ImmutableList.of("file1.js", "file2.js");
        runner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesUnknownDependency() throws Exception {
        // Edge Case: โมดูลอ้างอิง Dependency ที่ไม่มีอยู่จริง
        List<String> specs = ImmutableList.of("mod1:1", "mod2:1:mod_unknown");
        List<String> jsFiles = ImmutableList.of("file1.js", "file2.js");
        runner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCheckInvalidModuleName() throws Exception {
        // Edge Case: ชื่อโมดูลไม่ใช่ JS Identifier ที่ถูกต้อง (เช่น มีขีดกลาง)
        List<String> specs = ImmutableList.of("invalid-name:1");
        List<String> jsFiles = ImmutableList.of("file1.js");
        runner.createJsModules(specs, jsFiles);
    }

    @Test
    public void testParseModuleWrappersValid() throws Exception {
        JSModule m1 = new JSModule("m1");
        JSModule m2 = new JSModule("m2");
        List<JSModule> modules = ImmutableList.of(m1, m2);
        List<String> specs = ImmutableList.of("m1:(%s)", "m2:start %s end");

        Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
        assertEquals("(%s)", wrappers.get("m1"));
        assertEquals("start %s end", wrappers.get("m2"));
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappersMissingPlaceholder() throws Exception {
        // Edge Case: Wrapper ไม่มี %s placeholder
        JSModule m1 = new JSModule("m1");
        List<JSModule> modules = ImmutableList.of(m1);
        List<String> specs = ImmutableList.of("m1:no_placeholder");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test
    public void testCreateDefineOrTweakReplacementsValid() {
        CompilerOptions options = runner.createOptions();
        List<String> defines = ImmutableList.of(
            "myBool",                  // ไม่มีค่า เท่ากับ true
            "myTrueBool=true",         // บูลีน true
            "myFalseBool=false",       // บูลีน false
            "myString='hello'",        // สตริง single quotes
            "myDouble=123.45"          // ตัวเลข double
        );

        AbstractCommandLineRunner.createDefineOrTweakReplacements(defines, options, false);
        // หากไม่มี RuntimeException แสดงว่าทำงานถูกต้องตาม Branch
    }

    @Test(expected = RuntimeException.class)
    public void testCreateDefineOrTweakReplacementsInvalidSyntax() {
        CompilerOptions options = runner.createOptions();
        // Edge Case: Syntax ผิดสำหรับ Define
        List<String> invalidDefines = ImmutableList.of("badDefine==");
        AbstractCommandLineRunner.createDefineOrTweakReplacements(invalidDefines, options, false);
    }

    @Test
    public void testWriteOutputWithoutPlaceholder() throws Exception {
        // ทดสอบ WriteOutput กรณี wrapper ไม่มี placeholder
        StringBuilder sb = new StringBuilder();
        AbstractCommandLineRunner.writeOutput(sb, null, "codeContent", "NoPlaceholderWrapper", "%output%");
        assertEquals("codeContent\n", sb.toString());
    }

    @Test
    public void testWriteOutputWithPlaceholder() throws Exception {
        // ทดสอบ WriteOutput กรณีมี placeholder สมบูรณ์
        StringBuilder sb = new StringBuilder();
        AbstractCommandLineRunner.writeOutput(sb, null, "myCode", "pre-%output%-post", "%output%");
        assertEquals("pre-myCode-post\n", sb.toString());
    }

    @Test
    public void testTestModeExecution() {
        // ทดสอบเปิด Test Mode และการจำลอง Supplier/Receiver
        runner.enableTestMode(
            () -> Collections.emptyList(),
            () -> Collections.emptyList(),
            null,
            exitCode -> {
                assertEquals(Integer.valueOf(0), exitCode);
                return true;
            }
        );
        assertTrue(runner.isInTestMode());
    }
}