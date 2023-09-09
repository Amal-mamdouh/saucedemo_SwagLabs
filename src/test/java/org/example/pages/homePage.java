package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

import static org.example.stepDefs.Hooks.driver;
public class homePage {
    public homePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="add-to-cart-sauce-labs-onesie")
    public WebElement addToCartBtn;
    @FindBy(css = "a[class=\"shopping_cart_link\"]")
    public WebElement cartIcon;

}
