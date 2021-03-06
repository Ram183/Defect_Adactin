package org.testsclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Featurefile2/Adactin_Feature.feature"}, glue = {"org.stepsssclasss"}, dryRun=false,monochrome=true, snippets=SnippetType.CAMELCASE, plugin= {"pretty","html:F:\\Eclipse_Workspace\\Cucumber_Omr_Class_Practice\\Screenshots"})
public class Test_Class{

}
