package week3;

import java.util.Map;

public class Human {

    private String firstName;

    private String lastName;

    private String nationality;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public Human(String firstName,String lastName, String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;

    }

}
