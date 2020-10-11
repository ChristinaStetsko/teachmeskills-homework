package homework3.task4;

public class Computer {

    private String processorType;
    private int ram;
    private int ssd;
    private boolean status;
    private static int random = (int) (Math.random() * 2);

    public Computer(String processorType, int ram, int ssd, boolean status) {
        this.processorType = processorType;
        this.ram = ram;
        this.ssd = ssd;
        this.status = status;
    }

    public void print(Computer computer) {
        System.out.println("Type of processor: " + computer.getProcessorType() + ", "
                + "RAM: " + computer.getRam() + ", " + "SSD: " + computer.getSsd());
    }

    public static void startComputer(Computer computer, int numForLoad) {
        if (random == numForLoad) {
            System.out.println("Computer successfully started!");
            computer.setStatus(true);
        } else {
            System.out.println("Computer burned out!");
        }
    }

    public static void stopComputer(Computer computer, int numForStop) {
        if (random == numForStop) {
            System.out.println("Computer successfully stopped!");
        } else {
            System.out.println("Computer burned out!");
        }
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}