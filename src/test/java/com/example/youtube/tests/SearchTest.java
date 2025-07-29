package com.example.youtube.tests;

import com.example.youtube.pages.HomePage;
import com.example.youtube.pages.SearchResultPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest extends BaseTest{

    protected HomePage homePage;
    protected SearchResultPage resultPage;

    @BeforeEach
    public void setUpTest() {
        homePage = new HomePage(driver);  // driver hazır olduktan sonra burada oluşturuyoruz
        resultPage = new SearchResultPage(driver);
    }

    @Test
    public void testSearch() {
        homePage.open();
        homePage.search("Selenium tutorial");
        resultPage.clickVideoTitleAsX();

        String title = driver.getTitle();
        assertTrue(title.toLowerCase().contains("java"));

    }
}
