class Negfactors {
  public static void main(String[] args) {
    int number = -180;
    System.out.print("Factors of the " + number + " are as: ");
    for(int i = number; i <= Math.abs(number); ++i) {
      if(i == 0) {
        continue;
      }
      else {
        if (number % i == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }
}
