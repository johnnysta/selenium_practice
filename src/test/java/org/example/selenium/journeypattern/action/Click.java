package org.example.selenium.journeypattern.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click {
    public static void on(WebDriver driver, By selector) {
        driver.findElement(selector).click();
    }
}
