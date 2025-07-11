/**
 * Questão: @resto: Resultado e resto na divisão
 *
 * @author UxieGu1
 */
package Operacoes;

import java.util.Scanner;

public class Resto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int resto = n1 % n2;
        int quociente = n1 / n2;

        System.out.println(quociente + " " + resto);
        scanner.close();
    }
}
