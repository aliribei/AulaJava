package Atividades.Atividades6.validationPackage;

public class validatePrime {

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