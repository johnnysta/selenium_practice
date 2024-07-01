package org.example.selenium.journeypattern.screen;

import org.openqa.selenium.By;

public class SearchPage {
    public static By acceptCookiesButtonBy = By.xpath("//div[text()='Az összes elfogadása']");
    public static By searchFieldBy = By.id("APjFqb");
    public static By searchButtonBy = By.name("btnK");
    public static By seleniumSearchResultBy = By.xpath("//cite[text()='https://www.selenium.dev']");
}