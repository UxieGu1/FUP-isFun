/**
 * Questão: @loop_iv: Loop em ambas as direções
 *
 * @author UxieGu1
 */
package Repeticao_I;

import java.util.Scanner;

public class LoopIV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();


        if(a > b) {
            System.out.print("[ ");
            for (int i = a; i > b; i--) {
                System.out.printf("%d ", i);
            }
            System.out.println("]");
        }else{
            System.out.print("[ ");
            for (int i = a; i < b; i++) {
                System.out.printf("%d ", i);
            }
            System.out.println("]");
        }
    }
}
