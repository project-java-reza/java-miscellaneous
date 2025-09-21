package enigma.camp.application;

import enigma.camp.data.LoginRequest;
import enigma.camp.error.ValidationException;
import enigma.camp.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("reza", "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Terjadi error dengan pesan : " + exception.getMessage());
        } finally {
            System.out.println("Error atau tidak, blok ini akan tetap dieksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");
    }
}
