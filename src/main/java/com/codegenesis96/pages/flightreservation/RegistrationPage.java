package com.codegenesis96.pages.flightreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends AbstractPage{

    @FindBy(id = "firstname")
    private WebElement firstnameInput;

    @FindBy(id = "lastname")
    private WebElement lastnameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passswordInput;

    @FindBy(name = "street")
    private WebElement streetInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "zip")
    private WebElement zipInput;

    @FindBy(id = "register-btn")
    private WebElement registerbutton;

    public RegistrationPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.firstnameInput));
        return this.firstnameInput.isDisplayed();
    }

    public void goTo(String url){
        this.driver.get(url);
    }

    public void enterUserDetails(String firstName, String lastName){
        this.firstnameInput.sendKeys(firstName);
        this.lastnameInput.sendKeys(lastName);
    }

    public void enterUserCredentials(String email, String password){
        this.emailInput.sendKeys(email);
        this.passswordInput.sendKeys(password);
    }

    public void enterAddress(String street, String city, String zip){
        this.streetInput.sendKeys(street);
        this.cityInput.sendKeys(city);
        this.zipInput.sendKeys(zip);
    }

    public void register(){
        this.registerbutton.click();
    }
    
}