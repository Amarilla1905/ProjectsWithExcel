package com.co.forms.tasks;

import com.co.forms.models.DataForms;
import com.co.forms.userinterfaces.HomeFormsPage;
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
        actor.attemptsTo(Click.on(TXT_NAME));
        actor.attemptsTo(Enter.theValue(dataForms.getName()).into(HomeFormsPage.TXT_NAME));
        actor.attemptsTo(Click.on(TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(dataForms.getEmail()).into(HomeFormsPage.TXT_EMAIL));
        actor.attemptsTo(Click.on(TXT_CURRENT_ADDRESS));
        actor.attemptsTo(Enter.theValue(dataForms.getName()).into(HomeFormsPage.TXT_CURRENT_ADDRESS));
        actor.attemptsTo(Scroll.to(TXT_PERMANENT_ADDRESS));
        actor.attemptsTo(Click.on(TXT_PERMANENT_ADDRESS));
        actor.attemptsTo(Enter.theValue(dataForms.getName()).into(HomeFormsPage.TXT_PERMANENT_ADDRESS));
        actor.attemptsTo(Click.on(BTN_SUBMIT));


    }
    public static HomeFormsTask enter(DataForms dataForms){
        return Tasks.instrumented(HomeFormsTask.class,dataForms);

    }


}
