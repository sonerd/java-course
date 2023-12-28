package entities;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("entities.Human{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", nationality='").append(nationality).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
