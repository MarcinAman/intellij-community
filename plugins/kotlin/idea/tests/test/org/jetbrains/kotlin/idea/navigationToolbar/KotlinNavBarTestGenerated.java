/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.navigationToolbar;

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
@TestMetadata("testData/navigationToolbar")
public class KotlinNavBarTestGenerated extends AbstractKotlinNavBarTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("ClassProperty.kt")
    public void testClassProperty() throws Exception {
        runTest("testData/navigationToolbar/ClassProperty.kt");
    }

    @TestMetadata("fileNameDoesntMatchClassName.kt")
    public void testFileNameDoesntMatchClassName() throws Exception {
        runTest("testData/navigationToolbar/fileNameDoesntMatchClassName.kt");
    }

    @TestMetadata("MethodInClass.kt")
    public void testMethodInClass() throws Exception {
        runTest("testData/navigationToolbar/MethodInClass.kt");
    }

    @TestMetadata("SeveralClassesInFile.kt")
    public void testSeveralClassesInFile() throws Exception {
        runTest("testData/navigationToolbar/SeveralClassesInFile.kt");
    }

    @TestMetadata("topLevelFunction.kt")
    public void testTopLevelFunction() throws Exception {
        runTest("testData/navigationToolbar/topLevelFunction.kt");
    }

    @TestMetadata("topLevelProperty.kt")
    public void testTopLevelProperty() throws Exception {
        runTest("testData/navigationToolbar/topLevelProperty.kt");
    }
}
