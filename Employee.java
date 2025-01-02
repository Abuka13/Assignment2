public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
        this.position = "boss";
        this.salary = 0.0;
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        try {
            this.position = position;
            this.salary = salary;
        } catch (Exception e) {
            System.out.println("JetBrains did a mistake not me");
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getId() + ". " + getName() + " " + getSurname() + ", Position: " + position + ", Salary: BTC" + salary;
    }
}
