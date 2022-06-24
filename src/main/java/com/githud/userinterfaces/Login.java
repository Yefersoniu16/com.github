package com.githud.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target USER = Target.the("User").
            located(By.id("login_field"));
    public static final Target PASSWORD = Target.the("Password").
            located(By.id("password"));
    public static final Target SIGN_IN = Target.the("Sign in").
            located(By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 no-underline'] "));
    public static final Target CLICK_SIGN_IN = Target.the("Sign in").
            located(By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button'] "));
    public static final Target VERIFY = Target.the("Sign in").
            located(By.xpath("//span[@class='d-inline d-md-none d-lg-inline']"));
}
