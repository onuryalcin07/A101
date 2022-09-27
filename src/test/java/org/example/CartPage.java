package org.example;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    public void checkOut() {
        click(By.cssSelector("a[class='button green checkout-button block js-checkout-button']"));
    }

    public void moveWithoutLogin() throws InterruptedException {
        Thread.sleep(2000);
        click(By.xpath("//*[contains(text(),'ÜYE OLMADAN DEVAM ET')]"));
    }

    public void typeMail() {
        typeText(By.cssSelector("input[name='user_email']"), "onuryalcinn97@gmail.com");
    }

    public void submitMail() {
        click(By.cssSelector("button[class='button block green']"));
    }

    public void addAddress() {
        click(By.cssSelector("a[title='Yeni adres oluştur']"));
    }

    public void typeInfo() throws InterruptedException {
        typeText(By.cssSelector("input[name='title']"), "Ev Adresi");
        typeText(By.cssSelector("input[name='first_name']"), "Onur");
        typeText(By.cssSelector("input[name='last_name']"), "Yalçın");
        typeText(By.cssSelector("input[name='phone_number']"), "5551234567");
        selectDropdown(By.cssSelector("select[name='city']"),"ANTALYA");
        Thread.sleep(2000);
        selectDropdown(By.cssSelector("select[name='township']"),"KONYAALTI");
        Thread.sleep(2000);
        selectDropdown(By.cssSelector("select[name='district']"),"ULUÇ MAH");
        Thread.sleep(2000);
        typeText(By.cssSelector("textarea[name='line']"), "Case için adres");
    }

    public void saveAdress(){
        click(By.cssSelector("button[class='button green js-set-country js-prevent-emoji']"));
    }
    public void chooseCompany(){
        findAll(By.cssSelector("label[class='js-checkout-cargo-item']")).get(0).click();
    }
    public void proceed(){
        click(By.cssSelector("button[class='button block green js-proceed-button']"));
    }
}
