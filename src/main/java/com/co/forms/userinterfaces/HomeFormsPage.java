package com.co.forms.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeFormsPage {

    public static final Target TXT_FIRST_FIELD_NAME =  Target.the("Enter the name")
            .locatedBy("//input[@aria-describedby='i2 i3']");
    public static final Target TXT_SECOND_FIELD_LAST_NAME =  Target.the("Enter the last name")
            .locatedBy("//input[@aria-describedby='i6 i7']");
    public static final Target TXT_THIRD_FIELD_AGE =  Target.the("Enter the age")
            .locatedBy("//input[@aria-describedby='i10 i11']");
    public static final Target TXT_FOURTH_FIELD_TYPE_OF_DOCUMENT=  Target.the("Enter the type of document")
            .locatedBy("//input[@aria-describedby='i14 i15']");
    public static final Target TXT_FIFTH_FIELD_NUMBER_OF_DOCUMENT=  Target.the("Enter the number of document")
            .locatedBy("//input[@aria-describedby='i18 i19']");
    public static final Target BTN_SUBMIT =  Target.the("Click on send")
            .locatedBy("//span[contains(text(),'Enviar')]");
    public static final Target TXT_VERIFY = Target.the("Text of verification")
            .locatedBy("//div[contains(text(),'Se ha registrado tu respuesta.')]");
}
