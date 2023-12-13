package day2;

public class Person {
    private String lastName;
    private Salutation salutation;
    private Gender gender;
    private Person marriedTo;


    // not effective ... ^ this is better .....private String marriedPersonName;

    public Person(String lastName, Salutation salutation, Gender gender) {
        this.lastName = lastName;
        this.salutation = salutation;
        this.gender = gender;
    }

    public String getLastName() {
        return this.lastName;
    }
    public Salutation getSalutation(){
        return this.salutation;
    }
    public Gender getGender(){
        return this.gender;
    }

    public Person getMarriedTo() {
        return this.marriedTo;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalutation(Salutation salutation){
        this.salutation = salutation;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public void greet (){
        System.out.println("Hello " + this.salutation + " " + this.lastName);
    }

    public void marry(Person personA) {
        if (personA.isMarried() || this.isMarried()) {
            System.out.println("Already married.");
        } else {
            this.marriedTo = personA;
            personA.marriedTo = this;
            System.out.println(this.toString() + " has married to " + personA.toString());
        }
    }

    public void divorce(Person personB){
        if(!personB.isMarried() || !this.isMarried()){
            System.out.println("Not Married");
        } else{
            this.marriedTo = null;
            personB.marriedTo = null;

            System.out.println(this.lastName + " Divorced " + personB.lastName);
        }
    }

    public String toString(){
        String combine = this.salutation +" "+this.lastName;
        return combine;
    }

    public boolean isMarried(){
        if(marriedTo == null ){
            return false;
        }  else {
            return true;
        }
    }
}
