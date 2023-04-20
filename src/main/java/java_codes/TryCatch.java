package java_codes;

public class TryCatch {
    public static void main(String[] args) {
        tryWithoutCatch();
        nestedTryCatch();
        wrongCatchException();
    }

    private static void tryWithoutCatch() {
        try {
            System.out.println("Try without catch");
        } finally {
            System.out.println("Finally block");
        }
    }

    private static void nestedTryCatch() {
        try {
            System.out.println("Outer Try Catch");
            int d = 10 / 0;
            try {
                System.out.println("Inner Try Catch");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
            System.out.println("Inner Try Catch Finished");
        } catch (Exception e) {
            System.out.println("Outer Catch Statmenet");
            e.printStackTrace();
        }
        System.out.println("Outer Try Catch Finished");
    }

    private static void wrongCatchException() {
        try {
            System.out.println(10 / 0);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("Last");
    }
}
