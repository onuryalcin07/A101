package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    public void selectColor(){
        click(By.cssSelector("label[for='attributes_integration_colourSİYAH']"));
    }
    public void selectProduct() throws InterruptedException {
        Thread.sleep(2000);
        findAll(By.cssSelector("li[class='col-md-4 col-sm-6 col-xs-6 set-product-item']")).get(0).click();
    }
    public void verify(){
     String color =  find(By.cssSelector("div[class='selected-variant-text']")).getText();
     Assert.assertEquals("Renk Doğru Değil",color,"Seçılen Renk: SİYAH");
    }
    public void addToCart(){
        click(By.cssSelector("button[class='add-to-basket button green block with-icon js-add-basket']"));
    }
    public void goToCart(){
        click(By.cssSelector("a[class='go-to-shop']"));
    }
}

