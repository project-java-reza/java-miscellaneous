package enigma.camp.application;

import enigma.camp.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("reza", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);


        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("reza"));
        System.out.println(new LoginRequest("reza", "rahasia"));
    }
}
