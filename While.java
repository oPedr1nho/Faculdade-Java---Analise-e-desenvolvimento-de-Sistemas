package ads.javaaula5tb;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op == 0) {
            System.out.println("Seja feliz!");
            System.out.println("Deseja continuar? Digite 0 ou qualquer número pra sair");
            op = sc.nextInt();
        }
    }

}
