package Atividades.Atividades6;

public class NumPrimos {

    public static void main(String args[]) {

        for (int i = 1; i <= 150; i++) {
            if (isPrime(i)) {
                System.out.println("O número: " + i + " é primo");
            }

        }

    }

    public static boolean isPrime(int number) {

        int count = 2;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count == 2;

    }
}
