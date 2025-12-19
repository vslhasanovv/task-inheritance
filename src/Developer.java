public class Developer extends EmployeeBase {
    private double baseSalary;
    private int overtimeHours;
    private double overtimeRate;


    public Developer(double baseSalary, int overtimeHours, double overtimeRate) {
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + overtimeHours * overtimeRate;
    }
}

