
import java.util.*;
public class Arrayintersection {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}

