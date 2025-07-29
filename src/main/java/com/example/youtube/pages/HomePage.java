package com.example.youtube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    private By searchBox = By.name("search_query");
    private By searchButton = By.id("search-icon-legacy");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.youtube.com");
    }

    public void search(String keyword) {
        WebElement input = driver.findElement(searchBox);
        input.clear();
        input.sendKeys(keyword);

        driver.findElement(searchButton).click();
    }

}
