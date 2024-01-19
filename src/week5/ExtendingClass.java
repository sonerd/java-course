package week5;

public class ExtendingClass extends ExamClass {

    public ExtendingClass(String nameToInput, int age, String typeToInput) {
        super(nameToInput, age, typeToInput);
        super.printMyData();
    }

}
