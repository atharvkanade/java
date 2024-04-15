import java.util.Stack;

class Stack {
  public static void main(String[] args) {

   
    Stack<String> animals= new Stack<>();

   
    animals.push("Bullock");
    animals.push("Deer");
    animals.push("Peacock");
    System.out.println("Stack: " + animals);

    
    animals.pop();
    System.out.println("Stack after pop: " + animals);
    }
}
