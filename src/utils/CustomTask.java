package utils;

public class CustomTask implements Task {

    private String message;

    public CustomTask(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }
}
