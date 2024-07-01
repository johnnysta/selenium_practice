package org.example.selenium.journeypattern.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Find {
    public static boolean item(WebDriver driver, String text, By selector) {
        return driver.findElement(selector).getText().contains(text);
    }
}
