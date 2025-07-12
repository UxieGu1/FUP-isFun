/**
 * Questão: @loop_i: Treino de loop
 *
 * @author UxieGu1
 */
package Repeticao_I;

import java.util.Scanner;

public class LoopI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        for(int i = a; i < b; i++){
            System.out.println(i);
        }
    }
}
