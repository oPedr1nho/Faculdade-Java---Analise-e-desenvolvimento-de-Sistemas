package ads.javaaula4tb;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB, diferença;
        System.out.println("Digite o primeiro número");
        numA = sc.nextInt();
        System.out.println("Digite outro numero");
        numB = sc.nextInt();

        if (numA > numB) {
            diferença = numA - numB;
            System.out.println("a diferença é:" + diferença);
        } else {
            diferença = numB - numA;
            System.out.println("o resultado é:" + diferença);
        }
    }
}
