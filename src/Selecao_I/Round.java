/**
 * Questão: @round: Arredondar número
 *
 * @author UxieGu1
 */
package Selecao_I;

import java.util.Scanner;
import java.lang.Math;

public class Round {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        float n = scan.nextFloat();

        int resultado;
        if(c == 'r') {
            resultado = (int) Math.round(n);
        } else if(c == 'f') {
            resultado = (int) Math.floor(n);
        } else {
            resultado = (int) Math.ceil(n);
        }

        System.out.println(resultado);
        scan.close();
    }
}
