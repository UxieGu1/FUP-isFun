/**
 * Questão: @max: Maior de dois números
 *
 * @author UxieGu1
 */

package Selecao_II;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if(n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }

        scan.close();
    }
}
