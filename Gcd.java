public class Gcd {
  public static void main(String[] args) {
    int number = 196;
    System.out.print("Factors of the " + number + " are: ");
    for (int i = 1; i <= number; ++i) {
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
