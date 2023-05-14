/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen;

import org.openapitools.codegen.config.CodegenConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyImportTest {

    // @Test
    public void testGenerate() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hideGenerationTimestamp","true");

        File output = new File("C:\\Martin\\Projekte\\openapi-generator\\samples\\client\\petstore\\java\\native");

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("java")
                .setLibrary("native")
                .setAdditionalProperties(properties)
                .setInputSpec("src/test/resources/3_0/spring/petstore-with-fake-endpoints-models-for-testing.yaml")
/*
                .addTypeMapping("array","ArrayType")
                .addTypeMapping("Param1Def","Param1DefType")
                .addTypeMapping("ResponseDef","ResponseDefType")
                .addSchemaMapping("ArrayType","ArrayTypeSchema")
                .addSchemaMapping("Param1DefType","Param1DefTypeSchema")
                .addSchemaMapping("Param1Def","Param1DefSchema")
                .addSchemaMapping("ResponseDef","ResponseDefSchema")
                .addSchemaMapping("ResponseDefType","ResponseDefTypeSchema")
                .addSchemaMapping("List","ListSchema")
                .addSchemaMapping("ListType","ListTypeSchema")
                .addImportMapping("array","java.xyz.Array")
                .addImportMapping("List","java.xyz.List")
                .addImportMapping("Param1Def","java.xyz.Param1Def")
                .addImportMapping("Param1DefType","java.xyz.Param1DefType")
                .addImportMapping("MyIntArray","java.xyz.MyIntArray")
                .addImportMapping("ArrayTypeSchema","java.xyz.ArrayTypeSchema")
                .addImportMapping("Param1DefTypeSchema","java.xyz.Param1DefTypeSchema")
                .addImportMapping("Param1DefSchema","java.xyz.Param1DefSchema")
                .addImportMapping("MyIntArraySchema","java.xyz.MyIntArraySchema")
                .addImportMapping("ResponseDef","java.xyz.ResponseDef")
                .addImportMapping("ResponseDefType","java.xyz.ResponseDefType")
                .addImportMapping("ResponseDefSchema","java.xyz.ResponseDefSchema")
                .addImportMapping("ResponseDefTypeSchema","java.xyz.ResponseDefTypeSchema")
*/
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(clientOptInput).generate();
        output.deleteOnExit();

        TestUtils.ensureContainsFile(files, output, "README.md");
    }

    // @Test
    public void testGeneratePython() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hideGenerationTimestamp","true");

        File output = new File("C:\\Martin\\Projekte\\openapi-generator\\samples\\openapi3\\client\\petstore\\python");

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("python")
                .setAdditionalProperties(properties)
                .setInputSpec("src/test/resources/3_0/spring/petstore-with-fake-endpoints-models-for-testing.yaml")
                .setTemplateDir("C:/Martin/Projekte/openapi-generator/modules/openapi-generator/src/main/resources/python")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(clientOptInput).generate();
        output.deleteOnExit();

        TestUtils.ensureContainsFile(files, output, "README.md");
    }

    // @Test
    public void testGenerateAsciiDoc() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hideGenerationTimestamp","true");

        File output = new File("C:\\Martin\\Projekte\\openapi-generator\\samples\\asciiDoc");

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("asciidoc")
                .setAdditionalProperties(properties)
                .setInputSpec("src/test/resources/3_0/petstore-with-fake-endpoints-models-for-testing.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(clientOptInput).generate();
        output.deleteOnExit();

        TestUtils.ensureContainsFile(files, output, "index.adoc");
    }

}
