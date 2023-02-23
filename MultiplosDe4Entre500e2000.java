package ads.javaaula5tb;
import java.util.Scanner;
public class MultiplosDe4Entre500e2000 {
    public static void main(String[] args) {
        int i, soma=0;
        for(i=500; i<=2000; i++ ){
            if(i%4 == 0){
               soma += i; 
            }
            System.out.println("A soma dos números é igual a:" +soma);
        }
    }
}
