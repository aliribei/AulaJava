package Atividades.Atividade6.validationPackage;

public class validatePrime {

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
               return false;
            }
        }
        return true;
    }
}