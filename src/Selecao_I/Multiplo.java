/**
 * Questão: @multiplo: Múltiplo de sete
 *
 * @author UxieGu1
 */
package Selecao_I;
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n % 7 == 0) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

        scan.close();
    }
}
