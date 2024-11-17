import java.io.*;

public class conversion {

    public static void dectobin(int n) {

        int[] binnum = new int[1000];

        int i = 0;
        while (n > 0) {
            binnum[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--)
            System.out.println(binnum[j]);

    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println("decimal =" + n);
        System.out.println("binary =");
        dectobin(n);

    }
}
