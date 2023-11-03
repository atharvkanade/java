import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 29;
        numbers[1] = 30;
        numbers[2] = 32;
        numbers[3] = 35;
        Arrays.sort(numbers);
        System.out.println(
                Arrays.toString(numbers));

    }
}