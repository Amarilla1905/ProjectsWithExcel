package com.co.forms.stepsdefinitions;


import com.co.forms.models.DataForms;
import com.co.forms.models.builders.DataBuilder;
import com.co.forms.tasks.HomeFormsTask;
import com.co.forms.utils.Constants;
import com.co.forms.utils.reader.PropsCsv;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class OpenFormsStepDefinition {

    @Managed(driver = "chrome",options = "--start-maximized")
    WebDriver hisDriver;
    private EnvironmentVariables environmentVariables;


    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("SARA");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));

    }

    @Given("^that the user opens the Forms page$")
    public void thatTheUserOpensTheFormsPage(){
        /*String webServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("environments.default.webdriver.base.url");
        String URL = webServiceEndpoint.toString();*/
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("^he fills in the fields B and clicks on the submit button$")
    public void heFillsInTheFieldsBAndClicksOnTheSubmitButton(List<Map<String,String>>filtro) throws IOException {
        DataForms dataForms;
        dataForms = DataBuilder.dataInformation(PropsCsv.getDataCsv("TEST_EXCEL_ID",
                filtro.get(0).get("people"))).build();
        OnStage.theActorInTheSpotlight().attemptsTo(HomeFormsTask.enter(dataForms));


    }

    @Then("^he can check that he has correctly saved the answers$")
    public void heCanCheckThatHeHasCorrectlySavedTheAnswers() {

    }
}

