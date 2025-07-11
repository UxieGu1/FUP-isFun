/**
 * Questão: @positivo: É positivo
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(n >= 0 ? "SIM" : "NAO");
        scan.close();
    }
}