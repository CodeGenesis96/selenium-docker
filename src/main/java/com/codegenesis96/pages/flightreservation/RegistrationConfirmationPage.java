package com.codegenesis96.pages.flightreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationConfirmationPage {

    @FindBy(id = "go-to-flights-search")
    private WebElement goToFlightsSearchButton;

    public RegistrationConfirmationPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void goToFlightSearch(){
        this.goToFlightsSearchButton.click();
    }

}