/**
 * Questão: @esconde: Diana no esconde-esconde
 *
 * @author UxieGu1
 */
package Repeticao_I;

import java.util.Scanner;

public class Esconde {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        //impares
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

       //pares
        for (int i = n; i >= 0 ; i--) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
