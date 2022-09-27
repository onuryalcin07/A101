package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class A101Test {
    public static WebDriver driver;
    public static WebDriverWait wait;
    ChromeOptions chromeOptions = new ChromeOptions();

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--start-fullscreen");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        homePage.goToWebsite();
        homePage.popup();
        homePage.moveToProduct();
        productPage.selectColor();
        productPage.selectProduct();
        productPage.verify();
        productPage.addToCart();
        productPage.goToCart();
        cartPage.checkOut();
        cartPage.moveWithoutLogin();
        cartPage.typeMail();
        cartPage.submitMail();
        cartPage.addAddress();
        cartPage.typeInfo();
        cartPage.saveAdress();
        cartPage.chooseCompany();
        cartPage.proceed();

    }
}
