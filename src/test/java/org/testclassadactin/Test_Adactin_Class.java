package org.testclassadactin;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/featurefile1/Adactin_Feature.feature"}, glue= {"org.stepdefinition"}, dryRun=false, monochrome=true, snippets=SnippetType.CAMELCASE)

public class Test_Adactin_Class {

}
