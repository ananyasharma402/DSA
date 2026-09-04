public class Trappingrain {

    public static void main(String[] args) {

        int[] height = {4, 2, 0, 3, 2, 5};

        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {

            // Find maximum height on the left
            int leftMax = 0;

            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find maximum height on the right
            int rightMax = 0;

            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Calculate trapped water
            int water = Math.min(leftMax, rightMax) - height[i];

            totalWater = totalWater + water;
        }

        System.out.println("Total trapped water = " + totalWater);
    }
}


