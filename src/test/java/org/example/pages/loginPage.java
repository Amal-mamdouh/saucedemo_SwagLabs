package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="user-name")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;
    @FindBy(id="login-button")
    public WebElement loginBtn;
}
