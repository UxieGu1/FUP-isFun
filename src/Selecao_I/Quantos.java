/**
 * Questão: @quantos: Quantos são iguais
 *
 * @author UxieGu1
 */
package Selecao_I;
import java.util.Scanner;

public class Quantos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if(n1 == n2 && n2 == n3) {
            System.out.println(3);
        }
        else if(n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println(2);
        }
        else {
            System.out.println(0);
        }

        scan.close();
    }
}
