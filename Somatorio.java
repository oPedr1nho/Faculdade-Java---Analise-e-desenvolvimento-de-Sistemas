package ads.javaaula5tb;

import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, soma = 0;
        System.out.println("Digite uma nota:");
        nota = sc.nextDouble();
        soma = soma + nota;
        System.out.println("Soma Parcial:" + soma);
        System.out.println("Digite outra nota:");
        nota = sc.nextDouble();
        soma = soma + nota;
        System.out.println("Soma total:" + soma);
    }
}
