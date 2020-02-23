package com.serenitycucumber.demo.steps.serenity;

import com.serenitycucumber.demo.pages.BaiduPage;
import com.serenitycucumber.demo.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class BaiduSearchSteps {

    BaiduPage baiduPage;

    @Step
    public void enters(String keyword) {
        baiduPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        baiduPage.click_search();
    }

    @Step
    public void should_see_definition(String definition) throws InterruptedException {
        baiduPage.waitUntilResultShow();
        Assert.assertEquals(definition+"_百度搜索",baiduPage.getTitle());
    }

    @Step
    public void openBaidu() {
        baiduPage.open();
    }

    @Step
    public WebElement waitForLogo() {
        return baiduPage.waitforlogo();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

}