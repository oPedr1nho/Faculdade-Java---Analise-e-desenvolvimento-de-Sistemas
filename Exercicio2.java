package ads.javaaula4tb;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        if ((numero % 2) == 0) {
            System.out.println("O numero digitado é par");
        } else if ((numero % 2) != 0) {
            System.out.println("O número digitado é impar");
        }
        if (numero >= 0) {
            System.out.println("Este numero é positivo");
        } else if (numero < 0) {
            System.out.println("Este numero é negativo");
        } else {
            System.out.println("O numero digitado é 0");
        }
    }

}
