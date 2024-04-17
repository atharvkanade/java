public class inheritance {
  String name;
  public void eat() {
    System.out.println("I can dance");
  }
}
class Dog extends Animal {
  public void display() {
    System.out.println("The name of my college is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    Dog labrador = new Dog();

    labrador.name = "Shaktiman";
    labrador.display();

    labrador.eat();

  }
}
