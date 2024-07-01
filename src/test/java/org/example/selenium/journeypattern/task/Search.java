package org.example.selenium.journeypattern.task;

import org.example.selenium.journeypattern.action.Click;
import org.example.selenium.journeypattern.action.Enter;

import org.example.selenium.journeypattern.action.Find;
import org.example.selenium.journeypattern.screen.LandingPage;
import org.example.selenium.journeypattern.screen.SearchPage;
import org.openqa.selenium.WebDriver;

public class Search {
    public static boolean forWebpage(WebDriver webdriver, String searchString) {
        Click.on(webdriver, SearchPage.acceptCookiesButtonBy);
        Click.on(webdriver, SearchPage.searchFieldBy);
        Enter.textInto(webdriver, searchString, SearchPage.searchFieldBy);
        Click.on(webdriver, SearchPage.searchButtonBy);
        Click.on(webdriver, SearchPage.seleniumSearchResultBy);
        return Find.item(webdriver, "Selenium automates browsers. That's it!", LandingPage.seleniumPageTitleBy);
    }
}