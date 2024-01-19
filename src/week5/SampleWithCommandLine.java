package week5;

public class SampleWithCommandLine {

    public static void main(String[] args) {
        // John 4 Jane 10 Julia 47
        if (args.length != 6) {
            System.out.println("It needs to be in this format -> java BST_BCS15_Q3 name1 age1 name2 age2 name3 age3");
            System.exit(1);
        }
        String[] names = new String[3];
        int[] ages = new int[3];
        for (int i = 0; i < 3; ++i) {
            names[i] = args[i * 2];
            ages[i] = Integer.parseInt(args[i * 2 + 1]);
        }
        int numTimes = 0;
        for (int i = 0; i < 3; ++i)
            if (ages[i] == 47) numTimes++;
        System.out.println("There are " + numTimes + " person(s) with age 47");
    }
}
