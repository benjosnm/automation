package net.automation.practice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static net.automation.practice.ui.register.RegisterElements.HEADER_INFO_FULL_NAME;

public class HeaderInformation implements Question<String> {


    public static HeaderInformation displayed() {
        return new HeaderInformation();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HEADER_INFO_FULL_NAME).viewedBy(actor).asString();
    }
}
