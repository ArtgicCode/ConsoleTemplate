package consoletemplate.tasks;

import java.util.ArrayList;

public class TaskInvoker {

    ArrayList<Task> tasks;

    public TaskInvoker() {
        setTaskList();
    }

    public void execute() {
        for (Task T : tasks) {
            T.execute();
        }
    }

    public void reset() {
        setTaskList();
    }

    public void add(Task newTask) {
        tasks.add(newTask);
    }

    private void setTaskList() {
        tasks = new ArrayList<Task>();
    }

}
