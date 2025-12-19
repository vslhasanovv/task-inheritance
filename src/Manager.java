public class Manager extends EmployeeBase{

    private double salary;
    private double bonus;

    public Manager(double salary, double bonus ){
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}
