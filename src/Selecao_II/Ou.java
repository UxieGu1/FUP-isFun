/**
 * Questão: @ou: É 3 ou 5
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Ou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n == 3 || n == 5) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

        scan.close();
    }
}
