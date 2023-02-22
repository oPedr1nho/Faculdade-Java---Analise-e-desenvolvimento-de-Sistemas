package ads.javaaula4tb;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dgite seu sexo:");

        char sexo = sc.next().charAt(0);

        if ((sexo == 'M') || (sexo == 'F')) {
            System.out.println("Sexo Binário!");
        } else {
            System.out.println("Sexo não Binário!");
        }
    }
}
