import java.util.ArrayList;
import java.util.List;

public class Mergelist {
  public static void main(String[] args) {
    List<Integer> prime = new ArrayList<>();
    prime.add(7);
    prime.add(11);
    prime.add(23);
    System.out.println("First List: " + prime);
    List<Integer> even = new ArrayList<>();
    even.add(22);
    even.add(82);
    System.out.println("Second List: " + even);
    List<Integer> numbers = new ArrayList<>();
    numbers.addAll(prime);
    numbers.addAll(even);

    System.out.println("Merged List is : " + numbers);

  }
}
