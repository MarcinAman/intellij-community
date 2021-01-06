/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.folding;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinFoldingTestGenerated extends AbstractKotlinFoldingTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/folding/noCollapse")
    public static class NoCollapse extends AbstractKotlinFoldingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("class.kt")
        public void testClass() throws Exception {
            runTest("testData/folding/noCollapse/class.kt");
        }

        @TestMetadata("function.kt")
        public void testFunction() throws Exception {
            runTest("testData/folding/noCollapse/function.kt");
        }

        @TestMetadata("imports.kt")
        public void testImports() throws Exception {
            runTest("testData/folding/noCollapse/imports.kt");
        }

        @TestMetadata("kdocComments.kt")
        public void testKdocComments() throws Exception {
            runTest("testData/folding/noCollapse/kdocComments.kt");
        }

        @TestMetadata("multilineComments.kt")
        public void testMultilineComments() throws Exception {
            runTest("testData/folding/noCollapse/multilineComments.kt");
        }

        @TestMetadata("object.kt")
        public void testObject() throws Exception {
            runTest("testData/folding/noCollapse/object.kt");
        }

        @TestMetadata("oneImport.kt")
        public void testOneImport() throws Exception {
            runTest("testData/folding/noCollapse/oneImport.kt");
        }

        @TestMetadata("singleLineString.kt")
        public void testSingleLineString() throws Exception {
            runTest("testData/folding/noCollapse/singleLineString.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/folding/checkCollapse")
    public static class CheckCollapse extends AbstractKotlinFoldingTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doSettingsFoldingTest, this, testDataFilePath);
        }

        @TestMetadata("collectionFactoryFunctions.kt")
        public void testCollectionFactoryFunctions() throws Exception {
            runTest("testData/folding/checkCollapse/collectionFactoryFunctions.kt");
        }

        @TestMetadata("collectionFactoryFunctionsEmptyOneLine.kt")
        public void testCollectionFactoryFunctionsEmptyOneLine() throws Exception {
            runTest("testData/folding/checkCollapse/collectionFactoryFunctionsEmptyOneLine.kt");
        }

        @TestMetadata("collectionFactoryFunctionsFewArguments.kt")
        public void testCollectionFactoryFunctionsFewArguments() throws Exception {
            runTest("testData/folding/checkCollapse/collectionFactoryFunctionsFewArguments.kt");
        }

        @TestMetadata("customRegions.kt")
        public void testCustomRegions() throws Exception {
            runTest("testData/folding/checkCollapse/customRegions.kt");
        }

        @TestMetadata("customRegionsNotFullBlock.kt")
        public void testCustomRegionsNotFullBlock() throws Exception {
            runTest("testData/folding/checkCollapse/customRegionsNotFullBlock.kt");
        }

        @TestMetadata("doubleImportListsError.kt")
        public void testDoubleImportListsError() throws Exception {
            runTest("testData/folding/checkCollapse/doubleImportListsError.kt");
        }

        @TestMetadata("functionLiteral.kt")
        public void testFunctionLiteral() throws Exception {
            runTest("testData/folding/checkCollapse/functionLiteral.kt");
        }

        @TestMetadata("functionWithExpressionBody.kt")
        public void testFunctionWithExpressionBody() throws Exception {
            runTest("testData/folding/checkCollapse/functionWithExpressionBody.kt");
        }

        @TestMetadata("functionWithExpressionBody2.kt")
        public void testFunctionWithExpressionBody2() throws Exception {
            runTest("testData/folding/checkCollapse/functionWithExpressionBody2.kt");
        }

        @TestMetadata("functionWithExpressionBody3.kt")
        public void testFunctionWithExpressionBody3() throws Exception {
            runTest("testData/folding/checkCollapse/functionWithExpressionBody3.kt");
        }

        @TestMetadata("headerKDoc.kt")
        public void testHeaderKDoc() throws Exception {
            runTest("testData/folding/checkCollapse/headerKDoc.kt");
        }

        @TestMetadata("headerMultilineComment.kt")
        public void testHeaderMultilineComment() throws Exception {
            runTest("testData/folding/checkCollapse/headerMultilineComment.kt");
        }

        @TestMetadata("imports.kt")
        public void testImports() throws Exception {
            runTest("testData/folding/checkCollapse/imports.kt");
        }

        @TestMetadata("multilineStrings.kt")
        public void testMultilineStrings() throws Exception {
            runTest("testData/folding/checkCollapse/multilineStrings.kt");
        }

        @TestMetadata("primaryConstructor.kt")
        public void testPrimaryConstructor() throws Exception {
            runTest("testData/folding/checkCollapse/primaryConstructor.kt");
        }

        @TestMetadata("when.kt")
        public void testWhen() throws Exception {
            runTest("testData/folding/checkCollapse/when.kt");
        }
    }
}
