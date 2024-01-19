package week5;


    public class Testing {

        public static void main(String[] args) {
            // Example usage:
            int[] inputArray = {1, 2, 3, 4, 5, 5,7, 8, 8, 9, 9, 9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,9,9,8};
            howManyTimes(inputArray);
        }

        public static void howManyTimes(int[] inputArray) {

            int[] digitFrequencies = new int[10];

            for (int num : inputArray) {
                if (num >= 1 && num <= 9) {
                    digitFrequencies[num]++;
                }
            }

            for (int i = 1; i <= 9; i++) {
                int frequency = digitFrequencies[i];
                String times = (frequency == 1) ? "time" : "times";
                System.out.println(i + " is repeated " + frequency + " " + times + ".");
            }
        }
    }

