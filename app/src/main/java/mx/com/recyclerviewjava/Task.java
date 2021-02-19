package mx.com.recyclerviewjava;

import java.util.Objects;

public class Task {

    private String nameTask;
    private Boolean completed;

    public Task(String nameTask, Boolean completed) {
        this.nameTask = nameTask;
        this.completed = completed;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(nameTask, task.nameTask) &&
                Objects.equals(completed, task.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameTask, completed);
    }

}
