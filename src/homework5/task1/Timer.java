package homework5.task1;

public class Timer {
    Action action;

    Timer(Action action) {
        this.action = action;
    }

    public void run() {
        action.start();
    }
}