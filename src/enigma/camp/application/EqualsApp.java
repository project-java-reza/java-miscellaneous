package enigma.camp.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Reza";
        first = first + " " + "Ardiansyah";

        System.out.println(first);

        String second = "Reza Ardiansyah";

        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Reza Ardiansyah";

        System.out.println(second == third);
        System.out.println(second.equals(third));

    }
}
