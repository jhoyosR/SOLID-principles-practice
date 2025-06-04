public class PartTimeEmployee extends Employee {

    protected int dailyWorkTime;
    protected int monthlyWorkDays;
    
    public PartTimeEmployee (String id, String name, int hourPayment, int dailyWorkTime, int monthlyWorkDays) {
        super(id, name, hourPayment);
        this.dailyWorkTime = dailyWorkTime;
        this.monthlyWorkDays = monthlyWorkDays;
    }

    @Override
    public void work() {
        System.out.println("Part time employee " + name + " is now working...");
    }

    public void rest() {
        System.out.println("Part time employee " + name + " is now off-work...");
    }

    @Override
    public void calculateSalary() {
        int salary = hourPayment * dailyWorkTime * monthlyWorkDays;
        System.out.println("Part time employee " + name + " salary: $" + salary);
    }

}