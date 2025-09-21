package enigma.camp.application;

public class StackTraceApp {
    public static void main(String[] args) {
        sampleError();
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Reza", "Ummu"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
