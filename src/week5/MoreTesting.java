package week5;

public class MoreTesting {

    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("It needs to be in this format -> java BST_BCS15_Q3 name1 age1 name2 age2 name3 age3");
            System.exit(1);
        }

        String[] nms = new String[3];
        int[] ages = new int[3];

        for (int i = 0; i < 3; ++i) {
            nms[i] = args[i * 2];
            ages[i] = Integer.parseInt(args[i * 2 + 1]);
        }

        int numTimes = 0;

        for (int i = 0; i < 3; ++i)
            if (ages[i] == 47)
                numTimes++;

        System.out.println("There are " + numTimes + " person(s) with age 47");
    }
}
