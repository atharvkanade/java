public class senreverse {

  public static void main(String[] args) {
    String sentence = "Welcome everyone ";
    String reversed = reverse(sentence);
    System.out.println("The sentence after reversing is: " + reversed);
  }

  public static String reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
