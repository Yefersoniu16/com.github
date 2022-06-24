package com.githud.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.githud.userinterfaces.Login.*;
import static com.githud.utils.Constant.MY_PASSWORD;
import static com.githud.utils.Constant.MY_USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGN_IN),
                Enter.theValue(MY_USER).into(USER),
                Enter.theValue(MY_PASSWORD).into(PASSWORD),
                Click.on(CLICK_SIGN_IN)


        );

    }
    public static PageLogin startSection(){
        return instrumented(PageLogin.class);
    }

}
