package com.example.youtube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {
    private WebDriver driver;

    private By videoTitles = By.cssSelector("ytd-video-renderer #video-title");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickVideoTitleAsX(){
        List<WebElement> titles = driver.findElements(videoTitles);
        for(WebElement title : titles) {
            String text = title.getText().toLowerCase();
            if(text.contains("java")){
                title.click();
                break;
            }
        }
    }

}
