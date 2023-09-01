package starter.acceptancetests;

import io.cucumber.java.pl.I;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Evaluate;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {

    @CastMember
    Actor actor;

    @Test
    @DisplayName("Should be able Open The website")
    void ac1test() {
        actor.attemptsTo(
                Open.url("https://www.demoblaze.com/index.html")

        );

    }

    @Test
    @DisplayName("Should be able to login")
    void searchForGreenThings() {
        actor.attemptsTo(
                Open.url("https://www.demoblaze.com/index.html"), Click.on(By.id("login2")),
                Enter.theValue("pehohi7311@poverts.com").into(By.id("loginusername")),
                Enter.theValue("pehohi7311@poverts.com").into(By.id("loginpassword")),
                Evaluate.javascript("logIn()")
                // Find(By.id("nameofuser"))
//                Click.on(Button.withText("logout"))
        // Click.on(By.cssSelector("css=button[value='Login in'"))
        );

        // String s = actor.asksFor(Text.of("nameofuser"));
        // System.out.println(s);
        // actor.attemptsTo(
        // NavigateTo.theSearchHomePage(),
        // LookForInformation.about("green"),
        // Ensure.that(TheWebPage.title()).containsIgnoringCase("green")
        // );
    }
}
