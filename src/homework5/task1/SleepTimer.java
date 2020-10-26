package homework5.task1;

public class SleepTimer implements Action {
    @Override
    public void start() {
        while (true) {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("10 seconds have passed");
        }
    }
}