public abstract class Employee implements ISalaryCalculation{

    protected String id;
    protected String name;
    protected int hourPayment;

    public Employee (String id, String name, int hourPayment) {
        this.id            = id;
        this.name          = name;
        this.hourPayment   = hourPayment;
    }

    public abstract void work();

    public void showInformation() {
        System.out.println("Employee id: " + id +
                ", Name: " + name +
                ", Hour Payment: $" + hourPayment);
    }
}
