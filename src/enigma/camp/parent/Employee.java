package enigma.camp.parent;

public class Employee {
    public String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public void sayHello(String otherName) {
        System.out.println("Hi " + otherName + ", My Name is Employee " + this.name);
    }
}
