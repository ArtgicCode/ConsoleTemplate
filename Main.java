package consoletemplate;

import consoletemplate.windows.ConsoleWindow;
import consoletemplate.tasks.TaskFactory;
import consoletemplate.tasks.TaskInvoker;

public class Main {

    private static ConsoleWindow consoleWindow;
    private static TaskInvoker taskInvoker;
    private static TaskFactory taskFactory;

    public static void main(String[] args) {
        initializeDependencies();
    }

    private static void initializeDependencies() {
        setConsoleWindow();
        setTaskInvoker();
        setTaskFactory();
    }

    private static void setConsoleWindow() {
        consoleWindow = new ConsoleWindow();
        consoleWindow.setTitle("Console Window");
        consoleWindow.setVisible(true);
    }

    private static void setTaskInvoker() {
        taskInvoker = new TaskInvoker();
    }

    private static void setTaskFactory() {
        taskFactory = new TaskFactory();
    }

}
