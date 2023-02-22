package ads.javaaula4tb;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        System.out.println("Digite o nivel do professor");
        double nivel = sc.nextDouble();
        System.out.println("Digite as horas trabalhadas");
        double ht = sc.nextDouble();
        if (nivel == 1) {
            salario = ht * 12;
            System.out.println("O salario é" + salario);
        } else if (nivel == 2) {
            salario = ht * 17;
            System.out.println("O salario é" + salario);
        } else if (nivel == 3) {
            salario = ht * 25;
            System.out.println("O salario é" + salario);
        } else {
            System.out.println("Nivel invalido");
        }

    }
}
