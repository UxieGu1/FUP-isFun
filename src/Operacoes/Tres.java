/**
 * Questão: @tres: Soma de três inteiros
 *
 * @author UxieGu1
 */
package Operacoes;
import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b + c);
        sc.close();
    }
}
