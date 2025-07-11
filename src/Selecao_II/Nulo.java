/**
 * Questão: @nulo: Positivo, nulo ou negativo
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Nulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n > 0) {
            System.out.println("+");
        } else if(n == 0) {
            System.out.println("0");
        } else {
            System.out.println("-");
        }

        scan.close();
    }
}
