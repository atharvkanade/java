// main function
public class encapsulation {
    public static void main(String[] args) {
        var employee = new employee();
        employee.basesalary = 15000;
        employee.hourlyrate = 50;
        int wage = employee.calculatewage(10);
        System.out.println(wage);
    }
}       
// employee class 
public class employee {
    int basesalary;
    int hourlyrate;
    public int calculatewage(int extrahours) {
        return basesalary + (extrahours * hourlyrate);
    }
}
