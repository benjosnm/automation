package net.automation.practice.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class Authenticate implements Ability {
    private final String email;
    private final String pwd;

    public Authenticate(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public static Authenticate with(String username, String pwd) {
        return new Authenticate(username, pwd);
    }

    public static Authenticate as(Actor actor) {
        return actor.abilityTo(Authenticate.class);
    }
}
