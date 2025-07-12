/**
 * Questão: @ceu: Ingrid quer chegar no céu
 *
 * @author UxieGu1
 */
package Repeticao_I;
import java.util.Scanner;

public class Ceu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print("[ ");
        for (int i = 0; i < 10; i++) {
            if(i == 10) {
                if(n != 10) {
                    System.out.print("ceu ");
                }
            }
            else if(i != n) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("]");
    }
}
