package ads.javaaula5tb;

import java.util.Scanner;

public class While3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma =0, num;
        char op ='S';
        while (op == 'S') {
            System.out.println("Digite um número:");
            num = sc.nextInt();
            soma = soma + num;
            System.out.println("Deseja continuar somando? (S/N)");
            op = sc.next().charAt(0);
        }
        System.out.println("A soma do número digitado é:" +soma);
    }

}
