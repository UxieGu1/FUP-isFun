/**
 * Questão: @sapatos: Sapatos para 2 e 3
 *
 * @author UxieGu1
 */
package Repeticao_I;

import java.util.Scanner;

public class Sapatos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a > b){
            System.out.println("invalido");
            return;
        }
        int soma = 0;

        for (int i = a; i <= b; i++){
            if(i % 2 == 0 && i % 3 == 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
