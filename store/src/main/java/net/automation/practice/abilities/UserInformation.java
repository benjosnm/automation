package net.automation.practice.abilities;

import net.automation.practice.models.AddressInformation;
import net.automation.practice.models.UserCredential;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class UserInformation implements Ability {
    private String firstName;
    private String lastName;
    private UserCredential credential;
    private String phoneNumber;
    private AddressInformation addressInformation;

    public UserInformation(String firstName, String lastName, UserCredential credential, String phoneNumber, AddressInformation addressInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.credential = credential;
        this.phoneNumber = phoneNumber;
        this.addressInformation = addressInformation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserCredential getCredential() {
        return credential;
    }

    public void setCredential(UserCredential credential) {
        this.credential = credential;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AddressInformation getAddressInformation() {
        return addressInformation;
    }

    public void setAddressInformation(AddressInformation addressInformation) {
        this.addressInformation = addressInformation;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public static UserInformation is(String firstName, String lastName, UserCredential credential, String phoneNumber, AddressInformation addressInformation) {
        return new UserInformation(firstName, lastName, credential, phoneNumber, addressInformation);
    }

    public static UserInformation as(Actor actor) {
        return actor.abilityTo(UserInformation.class);
    }
}
