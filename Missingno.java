public class Missingno {
   
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};

        int n = 6;

        // Sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Sum of array elements
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
} 

