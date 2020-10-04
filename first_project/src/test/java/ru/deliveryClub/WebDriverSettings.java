package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/kristina/IdeaProjects/first_project/chromedriver");
        driver = new ChromeDriver();
        System.out.println("test start");
    }

    @After
    public void close(){
        driver.quit();
        System.out.println("test end");
    }
}
