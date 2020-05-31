package TokoBuah.src;

public class Console {

    public static Integer readInputNumber(String message) {
        System.out.print(message);
        return App.scanner.nextInt();
    }

    public static String readInputString(String message) {
        System.out.print(message);
        return App.scanner.next();
    }

}