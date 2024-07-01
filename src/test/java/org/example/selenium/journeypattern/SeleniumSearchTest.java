package org.example.selenium.journeypattern;

import org.example.selenium.journeypattern.task.Search;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumSearchTest {

    private static final String PAGE_URL = "https://www.google.com";
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
        driver.get(PAGE_URL);
    }


    //Goal - verify if Selenium's webpage can be reached with Google search:
    @Test
    public void seleniumSearchTest() {
        /* Check if page is opened */
        assertTrue(Search.forWebpage(driver, textToSearch));
    }


    @AfterEach
    public void tearDown() {
        System.out.println("Quit method of WebDriver Called");
        driver.quit();
    }

}
