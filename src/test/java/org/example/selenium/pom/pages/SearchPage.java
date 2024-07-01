package org.example.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {
    private WebDriver driver;
    private static final String PAGE_URL = "https://www.google.com";

    private By acceptCookiesButtonBy = By.xpath("//div[text()='Az összes elfogadása']");

    private By searchFieldBy = By.id("APjFqb");

    private By searchButtonBy = By.name("btnK");

    private By seleniumSearchResultBy = By.xpath("//cite[text()='https://www.selenium.dev']");


    public SearchPage(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("Sign In Page")) {
            throw new IllegalStateException("This is not Sign In Page," +
                    " current page is: " + driver.getCurrentUrl());
        }
    }

    public void clickOnAcceptCookiesButton() {
        driver.findElement(acceptCookiesButtonBy).click();
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButtonBy).click();
    }

    public void clickOnSeleniumSearchResult() {
        driver.findElement(seleniumSearchResultBy).click();
    }

    public void sendKeysToSearchField(String searchForString) {
        driver.findElement(searchFieldBy).sendKeys(searchForString);
    }


}
