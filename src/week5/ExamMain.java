package week5;

public class ExamMain {

    public static void main(String[] args) {
        ExamClass e1 = new ExamClass();
        ExamClass e2 = new ExamClass("DOG", 25);

        e1.printMyData();
        System.out.println("--------------------------------");
        e2.printMyData();
        System.out.println("--------------------------------");

        ExtendingClass extendingClass = new ExtendingClass("Tom", 22, "Dog");

        char[][][] data = {{new char[]{'a'}}, {new char[]{'a'}}, {new char[]{'f'}}};

    }

}
