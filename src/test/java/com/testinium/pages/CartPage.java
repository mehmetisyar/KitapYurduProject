package com.testinium.pages;

import com.testinium.methods.Methods;


import org.junit.Assert;
import org.openqa.selenium.By;


public class CartPage {
    Methods methods;

    public CartPage() {
        methods = new Methods();

    }

    public void goToCartPage(){
        methods.waitBySecond(3);
        methods.click(By.cssSelector(".common-sprite.fl"));
        methods.waitBySecond(3);
        methods.click(By.cssSelector("#js-cart"));
        methods.waitBySecond(3);
    }

    public void increseQuantity(){

        methods.sendKeys(By.xpath("//input[@name='quantity']"),"3");
        methods.waitBySecond(3);
    }

    public void refreshQuantity(){
        methods.click(By.xpath("(//i[@class='fa fa-refresh green-icon'])[1]"));
        methods.waitBySecond(3);
    }

    public void buyItems(){
        methods.click(By.cssSelector(".right>.button.red"));
        methods.waitBySecond(3);
    }

    public void goToAddressAndAdd(){
        methods.click(By.xpath("//a[contains(text(),'Yeni bir adres kullanmak istiyorum.')]"));
        methods.waitBySecond(3);

        methods.sendKeys(By.xpath("//input[@name = 'firstname_companyname']"),"Mehmet");
        methods.sendKeys(By.xpath("//input[@name = 'lastname_title']"),"Isyar");
        methods.selectByText(By.xpath("//select[@name = 'zone_id']"),"İzmir");
        methods.waitBySecond(2);
        methods.selectByText(By.xpath("//select[@name = 'county_id']"),"BUCA");
        methods.sendKeys(By.xpath("//textarea[@name = 'address']"),"İzmir");
        methods.sendKeys(By.xpath("//input[@name = 'mobile_telephone']"),"5555555555");
        methods.click(By.xpath("//button[@id = 'button-checkout-continue']"));

        methods.waitBySecond(3);
        methods.click(By.xpath("//button[@id = 'button-checkout-continue']"));
    }

    public void addCardAndControlBuying(){
        methods.waitBySecond(3);
        methods.sendKeys(By.xpath("//input[@id = 'credit-card-owner']"),"Mehmet");
        methods.sendKeys(By.xpath("//input[@id = 'credit_card_number_1']"),"1111");
        methods.sendKeys(By.xpath("//input[@id = 'credit_card_number_2']"),"1111");
        methods.sendKeys(By.xpath("//input[@id = 'credit_card_number_3']"),"1111");
        methods.sendKeys(By.xpath("//input[@id = 'credit_card_number_4']"),"1111");
        methods.selectByText(By.xpath("//select[@name= 'credit_card_expire_date_month']"),"01");
        methods.selectByText(By.xpath("//select[@name= 'credit_card_expire_date_year']"),"2023");
        methods.sendKeys(By.xpath("//input[@name= 'credit_card_security_code']"),"123");
        methods.waitBySecond(3);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySecond(3);

        String expected = "Kart numarası geçersiz. Kontrol ediniz!";
        Assert.assertEquals("testUnvalidCart > Test Failed!  ", expected, methods.getText(By.xpath("//span[@class='error']")));
        methods.waitBySecond(3);

        methods.click(By.cssSelector(".checkout-logo"));

        methods.waitBySecond(3);
    }





}
