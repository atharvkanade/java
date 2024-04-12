public class constructor {
  private String name;
  Main() {
    System.out.println("Constructor Called:");
    name = "Atharv";
  }

  public static void main(String[] args) {
    Main obj = new Main();
    System.out.println("The name is " + obj.name);
  }
}
