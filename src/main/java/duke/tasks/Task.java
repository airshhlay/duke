package duke.tasks;

public class Task {
    protected TaskType TYPE;
    protected String description;
    protected boolean isDone;

    public Task(){ // default constructor with no parameters

    }

    public Task(String description) { // constructor for duke.tasks.Task when creating new duke.tasks.Task
        this.description = description.trim();
        this.isDone = false;
    }

    public Task(String status, String description) { // constructor for duke.tasks.Task, if need to specify status (when parsing tasks from hard disk)
        this.isDone = status.equals("1");
        this.description = description;
    }

    public String getStatusIcon() {
        return (isDone ? "[✔]" : "[✘]"); //return tick or X symbols
    }

    public String getDescription() {
        return description;
    }

    public int getDoneInt() {
        return (isDone ? 1 : 0);
    }

    public TaskType getTaskType() {
        return this.TYPE;
    }

    public void markAsDone() {
        isDone = true;
    }

    public String toString() {
        return getStatusIcon() + " " + this.description;
    }

}
