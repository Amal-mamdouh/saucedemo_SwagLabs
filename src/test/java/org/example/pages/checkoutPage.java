package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class checkoutPage {
    public checkoutPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="checkout")
    public WebElement checkoutBtn;
}
