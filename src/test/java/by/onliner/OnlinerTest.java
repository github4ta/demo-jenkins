package by.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {
    WebDriver driver;
    String URL = "";

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testUrl() {
        driver.get("https://demoqa.com/");
        String actualUrl = driver.getCurrentUrl();

        Assertions.assertEquals("https://demoqa.com/", actualUrl);
    }

    @AfterEach
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
