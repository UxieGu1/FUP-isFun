/**
 * Questão: @loop_ii: Imprimindo em linha
 *
 * @author UxieGu1
 */
package Repeticao_I;

import java.util.Scanner;

public class LoopII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.print("[ ");
        for(int i = a; i < b; i++){
            System.out.printf("%d ", i);
        }
        System.out.println("]");
    }
}
