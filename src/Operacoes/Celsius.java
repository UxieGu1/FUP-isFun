/**
 * Questão: @celsius: Conversor para Fahrenheit
 *
 * @author UxieGu1
 */
package Operacoes;

import java.util.Scanner;
import java.lang.Math;

public class Celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();
        double fahrenheit = 1.80 * celsius + 32;

        System.out.printf("%.0f%n", Math.ceil(fahrenheit));
        scanner.close();
    }
}
