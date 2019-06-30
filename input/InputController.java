package consoletemplate.input;

public class InputController {

    private static InputController instance = new InputController();

    private static InputString inputString;
    private static InputTranslator inputTranslator;

    private InputController() {
        inputString = new InputString();
        inputTranslator = new InputTranslator();
    }

    public static InputController getInstance() {
        return instance;
    }

    public void set(String string) {
        inputTranslator.setInput(string);
        inputString = inputTranslator.getInputString();
    }

    public static InputString getInputString() {
        return inputString;
    }

}
