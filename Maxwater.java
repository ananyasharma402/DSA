public class Maxwater {

    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int maxWater = 0;

        // Check every possible pair
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                // Calculate width
                int width = j - i;

                // Find the smaller height
                int height = Math.min(arr[i], arr[j]);

                // Calculate water
                int water = width * height;

                // Store maximum water
                if (water > maxWater) {
                    maxWater = water;
                }
            }
        }

        System.out.println("Maximum water = " + maxWater);
    }
}