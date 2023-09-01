package starter.acceptancetests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Evaluate;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
;
import starter.actions.navigation.NavigatTo;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenAc1 {

    @CastMember
    Actor actor;

    @Test
    @DisplayName("Should be able Open The website")
    void ac1test() {
        actor.attemptsTo(
                NavigatTo.theSearchHomePage()
        );

    }


}
