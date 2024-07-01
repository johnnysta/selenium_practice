package org.example.selenium.pom.tests;

import org.example.selenium.pagefactory.pages.LandingPage;
import org.example.selenium.pagefactory.pages.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumSearchTest {

    String textToSearch = "selenium";
    private WebDriver driver;

    @BeforeEach
    public void testSetUp() {
        try {
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("headless");
//            options.addArguments("disable-extensions");
//            options.addArguments("start-maximized");
//            options.addArguments("incognito");
            driver = new ChromeDriver(options);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void seleniumSearchTest() {
        SearchPage searchPage = new SearchPage(driver);

        searchPage.clickOnAcceptCookiesButton();
        searchPage.sendKeysToSearchField(textToSearch);
        searchPage.clickOnSearchButton();
        searchPage.clickOnSeleniumSearchResult();

        LandingPage landingPage = new LandingPage(driver);

        /* Check if page is opened */
        assertTrue(landingPage.isSeleniumPageOpen());
    }


    @AfterEach
    public void tearDown() {
        System.out.println("Quit method of WebDriver Called");
        driver.quit();
    }

}
