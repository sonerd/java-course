package week5;

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

public class Exercises {



        static Comparator<Book> titleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book firstBook, Book secondBook) {   // FOCUS ON THE RETURN
            return firstBook.getTitle().compareTo(secondBook.getTitle());
        }
    };


    static Comparator<Book> priceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            // FOCUS ON THE RETURN
            return firstBook.getPrice().compareTo(secondBook.getPrice());
        }
    };



    public static void main(String[] args) {

        firstExercise();

        secondExercise();

        thirdExercise();
    }

    private static void firstExercise() {  // IF THE METHOD IS STATIC IT CAN ONLY ACCESS STATIC VARIABLES
        // 1. Create a class representing a Book with attributes like title, author, and price.
        // 2. Create a list of Book objects and sort them based on title ascending
        // 3. Print out the sorted list
        // f(a,b) = y EXAMPLE OF HOW COMPARE WORKS (LIKE MATH)
        // 4. sort the books by price ascending and print out the result // DO THIS BEFORE ANYTHING ELSE!!

        // AFTER THIS GO AS MUCH AS POSSIBLE.

        Book book1 = new Book();
        book1.setTitle("Harry Potter and the half blood prince");
        book1.setAuthor("JK Rowling");
        book1.setPrice(12.99);
        Book book2 = new Book();
        book2.setTitle("Java for dummies");
        book2.setAuthor("Barry Burd");
        book2.setPrice(20.99);
        Book book3 = new Book();
        book3.setTitle("The great gatsby");
        book3.setAuthor("Scott Fitzgerald");
        book3.setPrice(10.99);
        Book book4 = new Book();
        book4.setTitle("Adventure");
        book4.setAuthor("Random person");
        book4.setPrice(10.00);


        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        books.sort(priceComparator);

        System.out.println("Books when sorted are: "+books.toString());
    }

    private static void secondExercise() {
        System.out.println("==================Task 2===================");
        // 1. Create a list of Book objects.
        // 2. The list should also contain multiple Books from same author
        // 3. How can we group the books by author?
        // 4. which collection should be used here?
        // 5. create the collection to group by author
        // 6. after that create a method which we can use to get the books by a specific author
        // 7. so the method should expect the author and return us a list of books written by the given author

        Book book1 = new Book();
        book1.setTitle("Art of War");
        book1.setAuthor("Sun tzu");
        book1.setPrice(14.99);
        Book book2 = new Book();
        book2.setTitle("The fault in our stars");
        book2.setAuthor("John Green");
        book2.setPrice(20.99);
        Book book3 = new Book();
        book3.setTitle("Looking for Alaska");
        book3.setAuthor("John Green");
        book3.setPrice(18.99);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);


        Map<String,List<Book>> authorToBooks = new HashMap<String, List<Book>>(); // Example of good practice in naming maps.
        for(Book book:bookList){
            String author = book.getAuthor();
            List<Book> booksByAuthor = authorToBooks.getOrDefault(author, new ArrayList<>());
            booksByAuthor.add(book);
            authorToBooks.put(author,booksByAuthor);
        }

        List<Book> finalList = getBooksByAuthor("John Green",authorToBooks);
        System.out.println(finalList);
        finalList = getBooksByAuthor("Sun tzu",authorToBooks);
        System.out.println(finalList);
    }

    private static List<Book> getBooksByAuthor(String author, Map<String,List<Book>> map) {

        if(!map.containsKey(author)){
            return new ArrayList<>();
        }
        return map.get(author);
    }

    private static void thirdExercise()  {
        // 1. Given the file numbers.txt which includes numbers in each line
        // 2. Count the odd and even numbers and print these counts out to console
        System.out.println("==================Task 3===================");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
            String line;
            int numOfEven = 0;
            int numOfOdd = 0;
            while (( line = reader.readLine()) != null) {
               // regular expression to check for only numbers
                if(line.matches("\\d+")) {
                    Integer number = Integer.parseInt(line);
                    if (number % 2 == 0){
                        numOfEven ++;
                    } else {
                        numOfOdd ++;
                    }
                }

            }
            // Make sure variables are inside the try block!!
            System.out.println("Amount of even numbers is: "+numOfEven+" and the amount of odd numbers is: "+numOfOdd);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

