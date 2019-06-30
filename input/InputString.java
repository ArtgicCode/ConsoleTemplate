package consoletemplate.input;

import java.util.ArrayList;

public class InputString {

    private ArrayList<String> stringList;

    InputString() {
        stringList = new ArrayList<String>();
    }
    
    public String get(int id) {
        return stringList.get(id);
    }

    void add(String string) {
        stringList.add(string);
    }

    void reset() {
        stringList = new ArrayList<String>();
    }
}
