/**
 * Questão: @abs: Valor absoluto
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int diferenca = Math.abs(n1 - n2);
        System.out.println(diferenca);

        scan.close();
    }
}
