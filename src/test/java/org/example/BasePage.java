package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage extends A101Test {



    public BasePage(){
        wait = new WebDriverWait(driver, 10, 500);
    }
    public WebElement find(By by) {
       return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findAll(By by) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void typeText(By by, String text){
        wait.until(ExpectedConditions.presenceOfElementLocated(by)).sendKeys(text);
    }
    public void hover(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(by)).build().perform();
    }

    public void selectDropdown(By by, String text) {
        Select select = new Select(find(by));
        select.selectByVisibleText(text);
    }
}
