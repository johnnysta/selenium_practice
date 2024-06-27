package org.example.selenium.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private WebDriver driver;

    @FindBy(xpath = "//h1[@class='d-1 fw-bold']")
    private WebElement seleniumPageTitle;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isSeleniumPageOpen() {
        return seleniumPageTitle.getText().toString().contains("Selenium automates browsers. That's it!");
    }


}
