package ads.javaaula5tb;
import java.util.Scanner;
public class CorreçãoEXFOR1 {
     public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber a sua tabuada de 1 a 10:");
        int num = sc.nextInt();
        for (i = 0; i <= 10; i++) {
            System.out.println("O número " + num + " * " + i + " = " + num * i);

        }
    }
}
