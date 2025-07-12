/**
 * Questão: @loop_iii: Loop decrescente
 *
 * @author UxieGu1
 */
package Repeticao_I;

import java.util.Scanner;

public class LoopIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.print("[ ");
        for(int i = a; i > b; i--){
            System.out.printf("%d ", i);
        }
        System.out.println("]");
    }
}