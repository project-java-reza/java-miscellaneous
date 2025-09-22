package enigma.camp.application;

import enigma.camp.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        // anonymous class
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Reza";
//            }
//        };
//
//        System.out.println(simpleAction1.action("Ardiansyah"));

        // dengan lambda
        SimpleAction simpleAction2 = (name) ->{
            return "Hello " + name;
        };

        System.out.println(simpleAction2.action("Ummu"));

        // dengan lambda lebih singkat
        SimpleAction simpleAction3 = name -> "Hello " + name;

        System.out.println(simpleAction3.action("Sa'adah"));

    }
}
