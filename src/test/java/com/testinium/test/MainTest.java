package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.CartPage;
import com.testinium.pages.LoginPage;
import com.testinium.pages.LogoutPage;
import com.testinium.pages.ProductPage;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends BaseTest {
    ProductPage productPage;
    LoginPage loginPage;

    CartPage cartPage;

    LogoutPage logoutPage;

    @Before
    public void forStart(){
        productPage = new ProductPage();
        loginPage = new LoginPage();
        cartPage = new CartPage();
        logoutPage = new LogoutPage();

    }


    @Test
    public void fullTest(){

        loginPage.login();
        productPage.loginControl();
        productPage.searchItem();
        productPage.getDown();
        productPage.addToFavourites();
        productPage.backToMainPage();
        productPage.goToLevelCatalog();
        productPage.selectTRClassics();
        productPage.filterTRClassics();
        productPage.tumKitaplarHoverAndSelectHobi();
        productPage.randomItemPicker();
        productPage.goToFavourites();
        productPage.removeFromFavourites();
        cartPage.goToCartPage();
        cartPage.increseQuantity();
        cartPage.refreshQuantity();
        cartPage.buyItems();
        cartPage.goToAddressAndAdd();
        cartPage.addCardAndControlBuying();
        logoutPage.hoverAndLogout();

    }

}
