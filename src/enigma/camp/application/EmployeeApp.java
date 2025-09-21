package enigma.camp.application;

import enigma.camp.child.Manager;
import enigma.camp.child.VicePresident;
import enigma.camp.parent.Employee;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Rizqi");
        employee.sayHello("Kambing");

        employee = new Manager("Jamal");
        employee.sayHello("Sapi");

        employee = new VicePresident("Jumadi");
        employee.sayHello("Ayam");

        sayHelloMethodPolymorphism(new Employee("Andre"));
        sayHelloMethodPolymorphism(new Manager("Ummu"));
        sayHelloMethodPolymorphism(new VicePresident("Ardiansyah"));
    }

    static void sayHelloMethodPolymorphism(Employee employee) {
        System.out.println("Haylo " + employee.name);
    }
}
