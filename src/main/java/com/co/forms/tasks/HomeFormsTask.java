package com.co.forms.tasks;

import com.co.forms.models.DataForms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.forms.userinterfaces.HomeFormsPage.*;



public class HomeFormsTask implements Task {

    DataForms dataForms;

    public HomeFormsTask(DataForms dataForms) {
        this.dataForms = dataForms;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_FIRST_FIELD_NAME),
                Enter.theValue(dataForms.getName()).into(TXT_FIRST_FIELD_NAME),
                Click.on(TXT_SECOND_FIELD_LAST_NAME),
                Enter.theValue(dataForms.getLast_name()).into(TXT_SECOND_FIELD_LAST_NAME),
                Click.on(TXT_THIRD_FIELD_AGE),
                Enter.theValue(dataForms.getAge()).into(TXT_THIRD_FIELD_AGE),
                Click.on(TXT_FOURTH_FIELD_TYPE_OF_DOCUMENT),
                Enter.theValue(dataForms.getType_document()).into(TXT_FOURTH_FIELD_TYPE_OF_DOCUMENT),
                Click.on(TXT_FIFTH_FIELD_NUMBER_OF_DOCUMENT),
                Scroll.to(TXT_FIFTH_FIELD_NUMBER_OF_DOCUMENT),
                Enter.theValue(dataForms.getNumber_document()).into(TXT_FIFTH_FIELD_NUMBER_OF_DOCUMENT),
                Click.on(BTN_SUBMIT));

    }
    public static HomeFormsTask enter(DataForms dataForms){
        return Tasks.instrumented(HomeFormsTask.class,dataForms);

    }


}
