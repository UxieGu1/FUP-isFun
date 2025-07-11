/**
 * Questão: @calc: Calculadora numérica
 *
 * @author UxieGu1
 */
package Selecao_I;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        char op = scan.next().charAt(0);

        switch(op) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                if(n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
        }

        scan.close();
    }
}
