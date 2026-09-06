import java.util.HashSet;

public class Difference {
    public static void main(String[] args) {

        int[] arr = {5, 20, 3, 2, 50, 80};
        int k = 78;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num - k)) {
                System.out.println("Pair found: " + (num - k) + ", " + num);
                return;
            }

            if (set.contains(num + k)) {
                System.out.println("Pair found: " + num + ", " + (num + k));
                return;
            }

            set.add(num);
        }

        System.out.println("Pair not found");
    }
}