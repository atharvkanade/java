import java.util.Scanner;

public class Simpinterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the principal amount : ");
    double principal = input.nextDouble();

    System.out.print("Enter the rate of interest : ");
    double rate = input.nextDouble();

    System.out.print("Enter the time: ");
    double time = input.nextDouble();

    double interest = (principal * time * rate) / 100;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Simple Interest is : " + interest);

    input.close();
  }
}
