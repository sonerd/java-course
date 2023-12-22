package week2.collections;

import java.util.*;

public class Collections {

    private static Comparator<String> myComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if (o1.charAt(0) < o2.charAt(0)) {
                return -1;
            } else {
                return 1;
            }
        }
    };

    private  static  Comparator<Integer> integerComparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1 < o2){
                return -1;
            } else{
                return 1;
            }

        }
    };

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 12;
        numbers[1] = 7;
        numbers[2] = 9;

        String[] names = new String[]{"Faris","Anna","Jake"};
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        int rowCount;
        int columnCount;

        rowCount = 2;
        columnCount = 6;
        int[][] matrix1 = createMatrix(rowCount,columnCount);
        matrixPrinter(matrix1, rowCount, columnCount);

        rowCount = 3;
        columnCount = 4;
        int[][] matrix2 = createMatrix(rowCount,columnCount);
        matrixPrinter(matrix2, rowCount, columnCount);

        // java collection framework
        List<String> myNames = new ArrayList<>();
        myNames.add("Faris");
        myNames.add("Jake");

        System.out.println("========Collections========");
        myNames.add(1,"Larry");
        myNames.add("Larry");
        myNames.add("Adam");
        myNames.add("Kevin");
        myNames.add("Ben");
        myNames.add("Gwen");
        printList(myNames);
        System.out.println("=======Fruits=========");

        List<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        printList(fruits);

        System.out.println("=========Lists=========");
        System.out.println("Not sorted: ");
        printList(myNames);
        System.out.println("Sorted: ");

        myNames.sort(myComparator);
        printList(myNames);

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(2);

        nums.sort(integerComparator);
        System.out.println(nums);
    }

    private static void matrixPrinter(int[][] matrix, int rowCount, int columnCount) {
        for(int m = 0; m < rowCount; m++){
            for(int n = 0; n < columnCount; n++){
                System.out.print(matrix[m][n]);
            }
            System.out.println();
        }
    }

    private static int[][] createMatrix(int rowCount, int columnCount) {
        int[][] matrix = new int[rowCount][columnCount];
        Random random = new Random();
        for(int i = 0; i < rowCount;i++){
            for(int j = 0; j < columnCount;j++){
               matrix[i][j] = random.nextInt(10);
                //System.out.print(matrix[j][i] );
            }
            //System.out.println();
        }
        return matrix;
    }

    private static void printList(List<String> listToPrint) {
        // foreach item in the given list
        for (String item : listToPrint) {
            System.out.println(item);
        }
    }

}
