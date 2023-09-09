package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
public class checkoutCompletePage {
    public checkoutCompletePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "complete-text")
    public WebElement confirmMsg;
}
