/**
 * Questão: @meio: A raposa e os esquilos
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Meio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if((n1 > n2 && n1 < n3) || (n1 < n2 && n1 > n3)) {
            System.out.println(n1);
        } else if((n2 > n1 && n2 < n3) || (n2 < n1 && n2 > n3)) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

        scan.close();
    }
}
