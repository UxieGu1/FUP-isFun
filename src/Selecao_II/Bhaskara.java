/**
 * Questão: @bhaskara: Usando biblioteca matemática
 *
 * @author UxieGu1
 */
package Selecao_II;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double delta = b*b - 4*a*c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);


            if (x1 == -0.0) x1 = 0.0;
            if (x2 == -0.0) x2 = 0.0;

            System.out.printf("%.2f\n", x1);
            System.out.printf("%.2f\n", x2);
        } else if (delta == 0) {
            double x = -b / (2*a);

            if (x == -0.0) x = 0.0;
            System.out.printf("%.2f\n", x);
        } else {
            System.out.println("nao ha raiz real");
        }
    }
}