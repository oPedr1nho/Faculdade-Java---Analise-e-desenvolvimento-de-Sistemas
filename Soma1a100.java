package ads.javaaula5tb;

import java.util.Scanner;

public class Soma1a100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int soma = 0;
        System.out.println("Digite um número que somará com os 100 primeiros números");
        for (i = 1; i <= 100; i++) {
            soma = soma + i;
            System.out.println("Soma: " + soma);
        }
    }
}
