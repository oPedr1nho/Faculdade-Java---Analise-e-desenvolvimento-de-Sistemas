package ads.javaaula4tb;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double numero = sc.nextDouble();
        if (numero > 0) {
            System.out.println(Math.sqrt(numero));
            System.out.println(numero * numero);
        } else if (numero < 0) {
            System.out.println("numero invalido");
        }

    }

}
