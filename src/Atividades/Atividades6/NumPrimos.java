package Atividades.Atividades6;
import Atividades.Atividades6.validationPackage.validatePrime;

public class NumPrimos {

    public static void main(String args[]) {

        for (int i = 2; i <= 150; i++) {
            if ( validatePrime.isPrime(i)) {
                System.out.println("O número: " + i + " é primo");
            }
        }
    }

}
