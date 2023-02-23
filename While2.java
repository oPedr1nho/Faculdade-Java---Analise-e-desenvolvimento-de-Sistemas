package ads.javaaula5tb;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0, soma =0, num;
        while (op == 0) {
            System.out.println("Digite um número:");
            num = sc.nextInt();
            soma = soma + num;
            System.out.println("Deseja continuar somando? Digite 0 ou qualquer número pra sair");
            op = sc.nextInt();
        }
        System.out.println("A soma do número digitado é:" +soma);
    }

}
