package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void loginControl(){
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".menu.top.login")));
        methods.waitBySecond(2);


    }
    public void searchItem(){
        methods.sendKeys(By.xpath("//input[@id = 'search-input']"),"Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySecond(3);


    }
    public void getDown(){
        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[7]"));
        methods.waitBySecond(4);

    }


    public void addToFavourites(){

        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[6]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[6]"));
        methods.waitBySecond(1);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[7]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[7]"));
        methods.waitBySecond(1);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[8]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[8]"));
        methods.waitBySecond(2);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[9]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[9]"));
        methods.waitBySecond(2);


    }

    public void backToMainPage(){

        methods.click(By.cssSelector(".logo-icon"));
        methods.waitBySecond(2);

    }

    public void goToLevelCatalog(){
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySecond(2);

    }

    public void selectTRClassics(){
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySecond(2);

    }

    public void filterTRClassics(){
        methods.selectByText(By.cssSelector(".sort>select"),"Yüksek Oylama");
        methods.waitBySecond(5);

    }

    public void tumKitaplarHoverAndSelectHobi(){
        methods.mouseHover(By.xpath("(//*[contains(text(),'Tüm Kitaplar')])[3]"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//a[contains(text(), 'Hobi')]"));
        methods.waitBySecond(3);

    }

    public void randomItemPicker(){
        methods.randomPicker(By.cssSelector(".pr-img-link"));
        methods.waitBySecond(3);
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.waitBySecond(3);

    }

    public void goToFavourites(){
        methods.mouseHover(By.cssSelector(".menu.top.my-list"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySecond(3);

    }

    public void removeFromFavourites(){
        methods.click(By.cssSelector(".display-item.sprite.sprite-icon-list-selected"));
        methods.waitBySecond(3);
        methods.click(By.xpath("(//*[@class='fa fa-heart-o'])[3]"));
        methods.waitBySecond(3);

    }

}
