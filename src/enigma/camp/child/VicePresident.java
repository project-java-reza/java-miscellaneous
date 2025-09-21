package enigma.camp.child;

public class VicePresident extends Manager{

    public VicePresident(String name) {
        super(name);
    }

    public void sayHello(String otherName) {
        System.out.println("Hello " + otherName + ", My name is VP " + this.name);
    }
}
