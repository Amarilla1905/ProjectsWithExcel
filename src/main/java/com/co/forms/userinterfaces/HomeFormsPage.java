package com.co.forms.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeFormsPage {


    public static final Target TXT_NAME =  Target.the("Enter the name")
            .locatedBy("//input[@id ='userName']");

    public static final Target TXT_EMAIL =  Target.the("Enter the email")
            .locatedBy("//input[@id ='userEmail']");

    public static final Target TXT_CURRENT_ADDRESS =  Target.the("Enter the current adreess")
            .locatedBy("//textarea[@id='currentAddress']");

    public static final Target TXT_PERMANENT_ADDRESS =  Target.the("Enter the permanent adreess")
            .locatedBy("//textarea[@id='permanentAddress']");

    public static final Target BTN_SUBMIT =  Target.the("Click on submit")
            .locatedBy("//button[@id='submit']");


}
