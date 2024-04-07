import java.util.Arrays;

public class Concarr {

    public static void main(String[] args) {
        int[] array1 = {15,56,78};
        int[] array2 = {14,89,45};
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        System.out.println(Arrays.toString(result));
    }
}
