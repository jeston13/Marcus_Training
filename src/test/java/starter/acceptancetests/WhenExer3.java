package starter.acceptancetests;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import starter.actions.Forminput.EnterData;
import starter.actions.navigation.NavigatTo;


@ExtendWith(SerenityJUnit5Extension.class)
class WhenExer3 {

    @CastMember
    Actor actor;

    @Test
    @DisplayName("Should be able Open The Login and add to cart")
    void Add_to_cart_workflow() {
        actor.attemptsTo(
                NavigatTo.theSearchHomePage(),
                EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/'")),
                EnterData.forminput("pehohi7311@poverts.com",By.id("username")),
                EnterData.forminput("pehohi7311@poverts.com@10",By.id("password")),
                EnterData.CLickELement(By.cssSelector("input[value='Login']")),
                Click.on(Link.containing("resources")),
                Click.on(Button.withText("GO TO RESOURCE")),
                Click.on(Button.withText("add to cart")),
                EnterData.CLickELement(By.className("btn-cart"))

        );

    }

}
