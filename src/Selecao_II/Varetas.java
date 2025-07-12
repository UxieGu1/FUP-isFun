
/**
 * Questão: @varetas: Critério para triângulos
 *
 * @author UxieGu1
 */

package Selecao_II;
import java.util.Scanner;

public class Varetas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v1, v2, v3;

        v1 = scan.nextInt();
        v2 = scan.nextInt();
        v3 = scan.nextInt();

        if (v1 >= v2 + v3 || v2 >= v1 + v3 || v3 >= v1 + v2) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
