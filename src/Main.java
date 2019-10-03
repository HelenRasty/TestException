public class Main {

    public static void testException(String str) throws Exception {
        throw new Exception("Exception message which describes the reason of occuring.");
    }

    public static void main(String[] args) {
        String exceptionText = "";

        try {
            MyTest.test();
            testException("test");
        } catch (MyException myExObj) {
            myExObj.printMsg();
        } catch (Exception exObj) {
            exceptionText = exObj.getMessage();
        } finally {
            System.out.println("Program finished, but an exception occured. " + exceptionText);
        }
    }
}
