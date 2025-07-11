/**
 * Questão: @sobrou: Calculando quanto sobrou
 *
 * @author UxieGu1
 */
package Operacoes;
import java.util.Scanner;

public class Sobrou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtd1 = scanner.nextInt();
        int qtd2 = scanner.nextInt();
        int qtd3 = scanner.nextInt();
        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();
        double p3 = scanner.nextDouble();
        double qtdDinheiro = scanner.nextDouble();

        double total = (qtd1 * p1) + (qtd2 * p2) + (qtd3 * p3);
        double troco = qtdDinheiro - total;

        System.out.printf("%.2f%n", troco);
        scanner.close();
    }
}
