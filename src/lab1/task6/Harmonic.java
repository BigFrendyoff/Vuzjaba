package lab1.task6;

public class Harmonic {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 10; i++){
            result += 1.0/i;
        }
        System.out.printf("%.2f", result);
    }
}
