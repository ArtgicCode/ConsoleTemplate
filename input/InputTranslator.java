package consoletemplate.input;

public class InputTranslator {
    
    private InputString inputString;
    
    public void setInput(String Input) {
        translate(Input);
    }
    
    public InputString getInputString() {
        return inputString;
    }
    
    public void reset() {
        inputString.reset();
    }
    
    private void translate(String Input) {
        String[] input = Input.split(" ");
        for (int i = 0; i < input.length; i++) {
            inputString.add(input[i]);
        }
    }
    
}
