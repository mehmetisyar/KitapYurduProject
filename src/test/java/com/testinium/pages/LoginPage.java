package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;


    public LoginPage() {
        methods = new Methods();
    }
    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//button[@id='js-popup-accept-button']"));
        methods.waitBySecond(3);
        methods.sendKeys(By.id("login-email"),"mehmet.testinium@gmail.com");
        methods.waitBySecond(2);
        methods.sendKeys(By.id("login-password"),"mehmet123");
        methods.waitBySecond(2);

        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySecond(5);




    }
}

