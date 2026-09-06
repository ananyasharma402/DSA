 import java.util.Arrays;
public class Mergesortedarray {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements of both arrays
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Add remaining elements of arr1
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Add remaining elements of arr2
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(result));
    }
}

