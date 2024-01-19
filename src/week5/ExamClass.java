package week5;

public class ExamClass {

    public static String type;
    public int age;
    public String name;

    public ExamClass() {
    } // no-argument constructor

    public ExamClass(String typ, int N) { // constructor with two arguments this.type = typ;
        this.type = typ;
        this.age = N;
    }

    public ExamClass(String nameToInput, int numberToInput, String typeToInput) {
        this.name = nameToInput;
        this.age = numberToInput;
        type = typeToInput;
    }

    public void printMyData() {
        System.out.println("My name is : " + this.name);
        System.out.println("My age is : " + this.age);
        System.out.println("My type is : " + type);
    }

}

