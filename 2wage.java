// main function
public class practice {
    public static void main(String[] args) {
        var employee = new employee();
        employee.basesalary = 20000;
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
