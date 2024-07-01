package org.example.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private WebDriver driver;

    private By seleniumPageTitleBy = By.xpath("//h1[@class='d-1 fw-bold']");


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSeleniumPageOpen() {
        return driver.findElement(seleniumPageTitleBy).getText().contains("Selenium automates browsers. That's it!");
    }


}
