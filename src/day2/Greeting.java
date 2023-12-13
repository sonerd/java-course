package day2;

public class Greeting {
   private static Gender genderInput = Gender.MALE;
    public static void main (String[] args){
       /* String name = "James";
        if(name.equalsIgnoreCase("smith")){
            name = name.replace("Smith","Schmidt");
        }*/
        Person personJames;
        personJames = new Person("James",Salutation.MR, Gender.MALE);

        Person personLady = new Person("Smith",Salutation.MRS, Gender.FEMALE);

        Person personThird = new Person("John",Salutation.MR,Gender.MALE);
        Person personLady2 = new Person("May",Salutation.MRS,Gender.FEMALE);

        personJames.marry(personLady);
      //  System.out.println("James is married to: " + personJames.getMarriedTo().toString());
       // System.out.println("Mrs Smith is married to: " + personLady.getMarriedTo().toString());
        personLady2.marry(personThird);
        personLady2.divorce(personThird);
        personThird.marry(personLady);
        personLady2.marry(personThird);
    }


}
