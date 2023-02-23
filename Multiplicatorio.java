package ads.javaaula5tb;

import java.util.Scanner;

public class Multiplicatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, p=1;
        System.out.println("Entre com um valor para nota:");
        nota = sc.nextDouble();
        p = p * nota; //acumula as notas digitadas
        System.out.println("Entre com um valor para outra nota:");
        nota = sc.nextDouble();
        p = p * nota;
        System.out.println("O valor final será:" +nota);
    }
}
