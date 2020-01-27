import features.questions.TheContactDetails;
import features.questions.TheServiceLines;
import features.questions.VerifySearchResults;
import features.tasks.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static features.tasks.MenuBar.HELP_AND_CONTACTS;
import static features.tasks.MenuBar.STATUS_UPDATES;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SerenityRunner.class)
public class WhenPlanningATrip {

    @Managed(driver = "chrome")
    WebDriver browser;
    Actor tracey = Actor.named("Tracey");

    private HomePage homePage;
    @Before
    public void setStage(){
        tracey.can(BrowseTheWeb.with(browser));
        tracey.attemptsTo(Open.browserOn().the(homePage),
                Click.on(HomePage.ACCEPT_COOKIES),
                Click.on(HomePage.DONE)
        );
    }

    @Test
    public void booking_a_simple_trip(){
        tracey.should(seeThat(TheWebPage.title(), containsString("Transport for London")));
    }

    @Test
    public void shouldBeAbleToSearchForStationDetails(){
        tracey.attemptsTo(Search.forStation("Waterloo"));
        tracey.should(seeThat(VerifySearchResults.heading(), equalTo("Search: Waterloo")));
    }

    @Test
    public void should_see_status_updates(){
        tracey.attemptsTo(SelectMenu.option(STATUS_UPDATES));
        tracey.should(seeThat(TheServiceLines.displayed(), hasItems("Bakerloo", "Central", "Circle")));
    }

    @Test
    public void should_be_able_to_contact_tfl(){
        tracey.attemptsTo(
                Click.on(HELP_AND_CONTACTS.menuOption()),
                Click.on(HelpAndContact.AboutOyester.TFLApp)
        );

        tracey.attemptsTo(
                EnterContactDetails.forCustomer("Mrs", "Sarah-jane", "Smith")

        );

        tracey.should(
                seeThat(TheContactDetails.title(),  equalTo("Mrs")),
                seeThat(TheContactDetails.firstName(), equalTo("Sarah-jane")),
                seeThat(TheContactDetails.lastName(), equalTo("Smith"))
        );
    }
}
