package com.serenitycucumber.demo;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/baidu_search/测试打开百度搜索selenium.feature")
public class DefinitionTestSuite {}
