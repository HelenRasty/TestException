public class MyException extends Exception {
    private String msg;

    public MyException(String message) {
        super(message);
        msg = message;
    }

    public void printMsg() {
        System.out.println("The messae of an exception is following: " + msg);
    }
}