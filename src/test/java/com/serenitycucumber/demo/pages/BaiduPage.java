package com.serenitycucumber.demo.pages;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.zh_cn.假设;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://www.baidu.com/")
public class BaiduPage extends PageObject {

    @FindBy(xpath="//div[@id='lg']/img")
    private WebElementFacade baidulogo;

    @FindBy(id="kw")
    private WebElementFacade kw;

    @FindBy(id="su")
    private WebElementFacade su;

    @FindBy(xpath="//*[contains(text(),'百度为您找到相关结果约')]")
    private WebElementFacade searchResultText;


    public WebElement waitforlogo() {
        return baidulogo;
    }

    public void enter_keywords(String searchText)  {
      kw.clear();
      kw.sendKeys(searchText);
    }


    public void click_search()  {
        su.click();
    }


    public void waitUntilResultShow() throws InterruptedException {
        new WebDriverWait(getDriver(),30).until(ExpectedConditions.visibilityOf(searchResultText));

    }

}
