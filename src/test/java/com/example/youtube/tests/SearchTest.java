package com.example.youtube.tests;

import com.example.youtube.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest extends BaseTest{

    protected HomePage homePage;

    @BeforeEach
    public void setUpTest() {
        homePage = new HomePage(driver);  // driver hazır olduktan sonra burada oluşturuyoruz
    }

    @Test
    public void testSearch() {
        homePage.open();
        homePage.search("Selenium tutorial");

        String title = driver.getTitle();
        assertTrue(title.toLowerCase().contains("selenium tutorial"));
    }
}
