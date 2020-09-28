package homework2;

public class Task1 {

    static double globalSum(double distance){
        double sum = 10;

        for (int i = 1; i < 7; i++) {
            distance *= 1.1;
            sum += distance;
        }

        return sum;
    }

    public static void main(String[] args) {
        int distance = 10;
        System.out.println(globalSum(distance));
    }
}
