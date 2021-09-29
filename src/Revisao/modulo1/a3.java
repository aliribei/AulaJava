package Revisao.modulo1;

public class a3 {
    public static void main(String[] args) {
        byte idade = 127;
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;

        short minS = Short.MIN_VALUE;
        short maxS = Short.MAX_VALUE;

        int minI = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;

        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;

        //Para imprimir em printf usar %d para numeros inteiros

        System.out.printf("IDADE %d\n",idade);
        System.out.println(min);
        System.out.println(max);
        System.out.println(minS);
        System.out.println(maxS);
        System.out.println(minI);
        System.out.println(maxI);
        System.out.println(minL);
        System.out.println(maxL);
    }
    
}
