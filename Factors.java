public class Factors {
  public static void main(String[] args) {
    int numb = 28;
    System.out.print("Factors of the number " + numb+ " are as : ");
    for (int i = 1; i <= numb; ++i) {
      if (numb % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
} 
