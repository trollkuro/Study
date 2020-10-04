package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.*;
import static org.junit.Assert.assertTrue;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest1() {
        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды из ресторанов от 25 минут!"));

    }

    @Test
    public void firstTest2() {
        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды из ресторанов от 25 минут!"));

    }


}
