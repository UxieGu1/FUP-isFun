/**
 * Questão: @loop_v: Loop com continue e break;
 *
 * @author UxieGu1
 */
package Repeticao_I;
import java.util.Scanner;

public class LoopV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        System.out.print("[ ");
        boolean primeiroNumero = true;

        while (true) {
            if (A >= B) {
                break;
            }

            if (A % 2 == 0) {
                A++;
                continue;
            }

            if (primeiroNumero) {
                System.out.print(A);
                primeiroNumero = false;
            } else {
                System.out.print(" " + A);
            }

            A += 2;
        }
        System.out.println(" ]");
        scan.close();
    }
}