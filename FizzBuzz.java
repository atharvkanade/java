HBOimport java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = Scanner.nextInt();

        if (num % 5 == 0 && num % 3 == 0)
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Fizz");
        else if (num % 3 == 0)
            System.out.println("Buzz");

        else
            System.out.println(num);
    }

}
