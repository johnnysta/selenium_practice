package org.example.selenium.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;
    private static final String PAGE_URL = "https://www.google.com";


    @FindBy(how = How.XPATH, using = "//div[text()='Az összes elfogadása']")
    private WebElement acceptCookiesButton;

    @FindBy(how = How.ID, using = "APjFqb")
    private WebElement searchField;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//cite[text()='https://www.selenium.dev']")
    private WebElement seleniumSearchResult;


    public SearchPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickOnAcceptCookiesButton() {
        acceptCookiesButton.click();
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void clickOnSeleniumSearchResult() {
        seleniumSearchResult.click();
    }

    public void sendKeysToSearchField(String searchForString) {
        searchField.sendKeys(searchForString);
    }


}
