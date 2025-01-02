import java.util.*;

public class MyApplication {


    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            try {
                System.out.println(person.getPosition() + ": " + person.getId() + ". " +
                        person.getName() + " " + person.getSurname() + " earns " + person.getPaymentAmount() + " tenge");
            } catch (Exception e) {
                System.out.println("JetBrains did a mistake not me");
            }
        }
    }


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Employee("Uzbekbay", "Abilkaiyr", "Boss", 27045.78));
        people.add(new Employee("Duzelbay", "Alikhan", "cleaner", 50000.00));
        people.add(new Student("Bartay", "Galym", 1.50));
        people.add(new Student("Seid", "Danial", 1.00));


        Collections.sort(people);


        printData(people);
    }
}
