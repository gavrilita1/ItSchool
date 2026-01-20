package session15;

import java.util.Objects;

public class Employee {

    private long id;
    private String firstName;
    private String lastName;

    public Employee(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Marcel", "Great");
        Employee e2 = new Employee(2, "Marcela", "Doe");
        Employee e3 = new Employee();
        e3.setId(1);
        e3.setFirstName("Marcel");
        e3.setLastName("Great");

        System.out.println("e1 equals e2? " + e1.equals(e2));
        System.out.println("e1 equals e3? " + e1.equals(e3));

        System.out.println("e1: " + e1.hashCode());
        System.out.println("e2: " + e2.hashCode());
        System.out.println("e3: " + e3.hashCode());

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
    }
}
