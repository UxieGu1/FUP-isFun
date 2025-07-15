/**
 * Questão: @concentra: Jogo de laço
 *
 * @author UxieGu1
 */
package Repeticao_II;
import java.util.Scanner;

public class Concentra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int originalA = a;
        int originalB = b;

        System.out.print("[ ");
        while(a <= b) {
            System.out.printf("%d %d ", a, b);
            a++;
            b--;
        }
        a--;
        b++;
        while(a >= originalA && b <= originalB) {
            if (a != b) {
                System.out.printf("%d %d ", b, a);
            }
            a--;
            b++;
        }
        System.out.println("]");
        scan.close();
    }
}
