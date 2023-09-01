package starter.acceptancetests;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Evaluate;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import starter.actions.Forminput.EnterData;
import starter.actions.navigation.NavigatTo;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAc2 {

    @CastMember
    Actor actor;
    @Test
    @DisplayName("Should be able Open The Login")
    void Login() {
        actor.attemptsTo(
                NavigatTo.theSearchHomePage(),

                EnterData.CLickELement(By.id("login2")),
                EnterData.forminput("pehohi7311@poverts.com",By.id("loginusername")),
                EnterData.forminput("pehohi7311@poverts.com",By.id("loginpassword")),

                Evaluate.javascript("logIn()")
//                EnterData.CLickELement(By.id("logout2"))
                // Find(By.id("nameofuser"))
//                Click.on(Button.withText("logout"))
                // Click.on(By.cssSelector("css=button[value='Login in'"))
        );


    }
}
