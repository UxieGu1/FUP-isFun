/**
 * Questão: @tres: Soma de três inteiros
 *
 * @author UxieGu1
 */
package Operacoes;
import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a + b + c);
        scan.close();
    }
}
