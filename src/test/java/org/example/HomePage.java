package org.example;

import org.openqa.selenium.By;

public class HomePage extends BasePage {


    public void goToWebsite(){
        driver.get("https://www.a101.com.tr/");
    }
    public void popup(){
        findAll(By.xpath("//*[contains(text(),'Kabul Et')]")).get(1).click();
    }
    public  void moveToProduct(){
        hover(By.cssSelector("a[title='GİYİM & AKSESUAR']"));
        click(By.cssSelector("a[title='Dizaltı Çorap']"));
    }
}
