package enigma.camp.child;

import enigma.camp.parent.Employee;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void sayHello(String otherName) {
        System.out.println("Hello " + otherName + ", My name is Manager " + this.name);
    }

}
