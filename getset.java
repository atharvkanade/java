// main class
public class getset {
    public static void main(String[] args) {
        var employee = new employee();
        employee.setBasesalary(35000);
        employee.setHourlyrate(50);
        int wage = employee.calculatewage(10);
        System.out.println(wage);

    }
}

// employeeclass
public class employee {
    private int basesalary;
    private int hourlyrate;

    public int calculatewage(int extrahours) {
        return basesalary + (extrahours * hourlyrate);
    }

    private int getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(int basesalary) {
        if (basesalary <= 0) {
            throw new IllegalArgumentException("Salary can't be 0 or -ve");
        }
        this.basesalary = basesalary;
    }

    private int getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(int hourlyrate) {
        if (hourlyrate <= 0) {
            throw new IllegalArgumentException("Hourly rate can't be 0 or -ve");

        }
        this.hourlyrate = hourlyrate;
    }
}
