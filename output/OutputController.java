package consoletemplate.output;

public class OutputController {

    private static OutputController instance = new OutputController();
    private static String outputString;

    private OutputController() {
        outputString = "";
    }

    public static OutputController getInstance() {
        return instance;
    }

    public String get() {
        return outputString;
    }

    public static void append(String string) {
        outputString += string;
    }

}
