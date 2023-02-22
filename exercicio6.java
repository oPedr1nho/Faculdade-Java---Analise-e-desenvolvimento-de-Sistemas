package ads.javaaula4tb;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println(Math.sqrt(numero));
        } else if (numero < 0) {
            System.out.println("Numero invalido");
        }

    }
}
