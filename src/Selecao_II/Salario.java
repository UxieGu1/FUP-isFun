/**
 * Questão: @salario: Calculando aumento
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salario = scan.nextFloat();


        if(salario <= 1000.00) salario += salario * 0.20F;
        else if (salario > 1000.00 && salario <= 1500.00) salario += salario * 0.15F;
        else if (salario > 1500.00 && salario <= 2000.00) salario += salario * 0.10F;
        else salario += salario * 0.05F;

        System.out.printf("%.2f\n", salario);
    }
}
