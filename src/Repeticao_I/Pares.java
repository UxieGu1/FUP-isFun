/**
 * Questão: @pares: Calculando soma
 *
 * @author UxieGu1
 */
package Repeticao_I;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a > b){
            System.out.println("invalido");
        }else{
            int soma = 0;
            for (int i = a; i <= b; i++){
                if(i % 2 == 0){
                    soma += i;
                }
            }
            System.out.println(soma);
        }

    }
}