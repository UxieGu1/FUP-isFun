/**
 * Questão: @pintando: Pintando a casa
 *
 * @author UxieGu1
 */
package Operacoes;
import java.util.Scanner;
import java.lang.Math;

public class Pintando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float p = (a + b + c) / 2;
        float area = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("%.2f%n", area);
        scanner.close();
    }
}
