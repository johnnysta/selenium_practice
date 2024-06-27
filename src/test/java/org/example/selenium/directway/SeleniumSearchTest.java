package org.example.selenium.directway;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class SeleniumSearchTest {


    private WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }


    @BeforeEach
    void setupTest() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("disable-extensions");
//        options.addArguments("start-maximized");
//        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }


    void slowStep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void seleniumSearchTest() {
        driver.get("https://www.google.com/");
        slowStep();

        {
            WebElement cookies_accept = driver.findElement(By.xpath("//div[text()='Az összes elfogadása']"));
            slowStep();
            Actions actions = new Actions(driver);
            actions.moveToElement(cookies_accept).click().build().perform();
        }

        slowStep();
        driver.manage().window().setSize(new Dimension(950, 1020));
        slowStep();
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
        slowStep();
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//cite[text()='https://www.selenium.dev']")).click();
    }

}
