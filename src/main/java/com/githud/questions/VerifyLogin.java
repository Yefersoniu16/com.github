package com.githud.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import org.assertj.core.api.SoftAssertions;

import static com.githud.userinterfaces.Login.VERIFY;

public class VerifyLogin implements Question <Boolean>{

    private final SoftAssertions validate = new SoftAssertions();
    @Override
    @Subject("Validar información")
    public Boolean answeredBy(Actor actor) {
        validate.assertThat(VERIFY.resolveAllFor(actor).contains(" request"));
        return true;
    }
    public static Question<Boolean> veification() {
        return new VerifyLogin();
    }
}
