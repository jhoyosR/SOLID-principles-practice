public class FreelanceEmployee extends Employee {

    protected int monthlyWorkTime;
   
    public FreelanceEmployee (String id, String name, int hourPayment, int monthlyWorkTime) {
        super(id, name, hourPayment);
        this.monthlyWorkTime = monthlyWorkTime;
    }

    @Override
    public void work() {
        System.out.println("Freelance employee " + name + " is now working...");
    }

    public void rest() {
        System.out.println("Freelance employee " + name + " is now off-work...");
    }

    @Override
    public void calculateSalary() {
        int salary = hourPayment * monthlyWorkTime;
        System.out.println("Freelance employee " + name + " salary: $" + salary);
    }
}
