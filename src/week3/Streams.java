package week3;

import entities.Gender;
import entities.Hero;
import entities.Human;
import entities.Person;
import entities.Salutation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {

    private static Random random = new Random();

    public static void main(String[] args) {
        Human firstHuman = new Human("Faris", "Alali", "Saudi");
        Human secondHuman = new Human("Klaus", "schmidt", "German");
        Human thirdHuman = new Human("Jake", "Smith", "Spanish");
        Human fourthHuman = new Human("Hassan", "Dag", "Turkish");
        Human fifthHuman = new Human("Ali", "Demir", "Turkish");
        Human sixthHuman = new Human("Chung", "Lee", "Chinese");
        Human seventhHuman = new Human("Abdul", "King", "Saudi");

        List<Human> humans = Arrays.asList(firstHuman, secondHuman, thirdHuman, fourthHuman, fifthHuman, sixthHuman, seventhHuman);

        // imperative way of iteration
        printList(humans);
        System.out.println("----Functional----");

        // functional way of iteration using lambda
        humans.forEach(human -> System.out.println(human));

        // filtering manually
        List<Human> onlySaudis = new ArrayList<>();
        for (Human human : humans) {
            if (human.getNationality().equals("Saudi")) {
                onlySaudis.add(human);
            }
        }
        System.out.println("----Filtering imperative----");
        printList(onlySaudis);

        // filtering with stream API
        List<Human> filteredByNationality = humans.stream()
                                                  .filter(item -> item.getNationality().equals("Saudi") && item.getLastName().startsWith("A"))
                                                  .collect(Collectors.toList());
        System.out.println("----Filtering functional----");
        printList(filteredByNationality);

        // map
        List<String> firstNames = humans.stream().map(human -> human.getFirstName()).collect(Collectors.toList());
        System.out.println("----Map----");
        printList(firstNames);

        // filter + count
        final long count = humans.stream().filter(human -> human.getLastName().startsWith("D")).count();
        System.out.println(count);

        // sorting
        final List<Human> sortedByLastName = humans.stream()
                                                   .sorted(Comparator.comparing(human -> human.getLastName()))
                                                   .collect(Collectors.toList());
        System.out.println("----Sorting----");
        printList(sortedByLastName);


        // convert human to hero by using map()
        List<Hero> heroes = humans.stream()
                                  .map(human -> new Hero("super " + human.getFirstName(), random.nextInt(10)))
                                  .sorted(Comparator.comparing(h -> h.getPowerRate()))
                                  .collect(Collectors.toList());
        System.out.println("----Heroes----");
        printList(heroes);
        
        // group using stream API
        final Map<String, List<Human>> nationalityToHumans = humans.stream()
                                                                   .collect(Collectors.groupingBy(human -> human.getNationality()));

        System.out.println("----Grouped----");
        nationalityToHumans.forEach((key, value) -> System.out.println(key + "--->" + value));

        // partioning
        Person personJames = new Person("James", Salutation.MR, Gender.MALE);
        Person personLady = new Person("Smith", Salutation.MRS, Gender.FEMALE);
        Person personThird = new Person("John", Salutation.MR, Gender.MALE);
        Person personLady2 = new Person("May", Salutation.MRS, Gender.FEMALE);
        List<Person> persons = Arrays.asList(personJames, personLady, personThird, personLady2);



        final Map<Boolean, List<Person>> partionedByGender = persons.stream()
                                                                    .collect(Collectors.partitioningBy(p -> p.getGender() == Gender.MALE));

        System.out.println("----Partioned----");
        partionedByGender.forEach((key, value) -> System.out.println(key + "--->" + value));

        // Optional class
        System.out.println("----Optional----");
        final Person duck = createPerson(null, Salutation.MR, Gender.MALE);
        if (duck != null) {
            System.out.println("My name is: " + duck.getLastName());
        }

        Optional<Person> optionalPerson = Optional.ofNullable(duck);
        optionalPerson.ifPresent(p -> System.out.println("My name is: " + p.getLastName()));
        optionalPerson.map(p-> p.getSalutation()).ifPresent(salutation -> System.out.println("Salutation: " + salutation));
        final Person defaultPerson = optionalPerson.orElse(new Person("Default Name", Salutation.MR, Gender.MALE));
        System.out.println("Default: " + defaultPerson.getLastName());
    }

    private static Person createPerson(String lastName, Salutation salutation, Gender gender) {
        if (lastName != null) {
            Person person = new Person(lastName, salutation, gender);
            return person;
        } else {
            return null;
        }
    }

    private static void printList(final List<?> items) {
        for (Object o : items) {
            System.out.println(o);
        }
    }
}
