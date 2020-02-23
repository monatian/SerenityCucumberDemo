package com.serenitycucumber.demo.steps;

import com.serenitycucumber.demo.steps.serenity.BaiduSearchSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.zh_cn.假设;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebElement;

public class DefinitionSteps {

//    @Steps
//    EndUserSteps anna;
//
//    @Given("the user is on the Wikionary home page")
//    public void givenTheUserIsOnTheWikionaryHomePage() {
//        anna.is_the_home_page();
//    }
//
//    @When("the user looks up the definition of the word '(.*)'")
//    public void whenTheUserLooksUpTheDefinitionOf(String word) {
//        anna.looks_for(word);
//    }
//
//    @Then("they should see the definition '(.*)'")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
//        anna.should_see_definition(definition);
//    }

    @Steps
    BaiduSearchSteps baiduSearchSteps;

    @假设("我打开百度首页")
    public void 我打开百度首页() throws Throwable {
        baiduSearchSteps.openBaidu();
    }

    @When("我看到百度logo")
    public WebElement 我看到百度logo() {
        return baiduSearchSteps.waitForLogo();
    }

    @And("我输入关键词\"(.*)\"")
    public void 我输入关键词(String searchText) throws Throwable {
        baiduSearchSteps.enters(searchText);
    }

    @And("点击搜索按钮")
    public void 点击搜索按钮() throws Throwable {
        baiduSearchSteps.starts_search();
    }

    @Then("^我应该看到搜索\"(.*)\"结果页面$")
    public void 我应该看到搜索结果页面(String searchText) throws InterruptedException {
        baiduSearchSteps.should_see_definition(searchText);
    }


}
