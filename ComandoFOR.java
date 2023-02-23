package ads.javaaula5tb;
import java.util.Scanner;
public class ComandoFOR {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor do inicio do intervalo:");
        int n1 = sc.nextInt();
         System.out.println("Digite um valor para o fim do intervalo:");
        int n2 = sc.nextInt();
        for(i=n1; i<n2; i++){
            System.out.println(i);
        }
        
    }
}
