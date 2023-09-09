package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event;

import static org.example.stepDefs.Hooks.driver;

public class informationScreen {
    public informationScreen(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "first-name")
    public WebElement firstName;
    @FindBy(id="last-name")
    public WebElement lastName;
    @FindBy(id = "postal-code")
    public WebElement postalCode;
    @FindBy(id="continue")
    public WebElement continueBtn;
}
