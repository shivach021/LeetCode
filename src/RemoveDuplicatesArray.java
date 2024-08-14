import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoveDuplicatesArray {

    public static void main(String[] args) {
        int[] input = new int[] {1, 1, 2};
        input = removeDuplicates(input);
        System.out.println("Count is "+ input.length);
        System.out.println(Arrays.toString(input));

    }

    public static int[] removeDuplicates(int[] input) {
        return Arrays.stream(input).distinct().toArray();
    }
}
