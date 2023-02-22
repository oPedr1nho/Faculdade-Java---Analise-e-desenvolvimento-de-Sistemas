package ads.javaaula4tb;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int A = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int B = sc.nextInt();
        if (A > B) {
            System.out.println("O primeiro numero é maior");
        } else if (B > A) {
            System.out.println("O segundo numero é maior");
        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}
