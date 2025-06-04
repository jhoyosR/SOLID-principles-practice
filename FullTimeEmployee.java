public class FullTimeEmployee extends Employee implements IProjectManagement {

    protected int dailyWorkTime;
    protected int monthlyWorkDays;

    public FullTimeEmployee(String id, String name, int hourPayment, int dailyWorkTime, int monthlyWorkDays) {
        super(id, name, hourPayment);
        this.dailyWorkTime = dailyWorkTime;
        this.monthlyWorkDays = monthlyWorkDays;
    }

    @Override
    public void work() {
        System.out.println("Full time employee " + name + " is now working...");
    }

    @Override
    public void calculateSalary() {
        int salary = hourPayment * dailyWorkTime * monthlyWorkDays;
        System.out.println("Full time employee " + name + " salary: $" + salary);
    }

    @Override
    public void manageProjects() {
        System.out.println("Full time employee " + name + " is now managing projects...");
    }

}