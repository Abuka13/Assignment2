interface Payable {
    double getPaymentAmount();
}

public class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String surname;


    public Person() {
        this.id = idCounter++;
        this.name = "";
        this.surname = "";
    }


    public Person(String name, String surname) {
            this.id = idCounter++;
            try {
                this.name = name;
                this.surname = surname;
            } catch (Exception e) {
                System.out.println("JetBrains did a mistake not me");
            }
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public double getPaymentAmount() {
        return 36660.00;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
