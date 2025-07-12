/**
 * Questão: @semana: Semana e sábado
 *
 * @author UxieGu1
 */
package Selecao_II;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int diaSemana = scan.nextInt();
        int hora = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("NAO");
                break;
            case 2: case 3: case 4: case 5: case 6:
                if ((hora >= 8 && hora <= 11) || (hora >= 14 && hora <= 17)) {
                    System.out.println("SIM");
                } else {
                    System.out.println("NAO");
                }
                break;
            case 7:
                if (hora >= 8 && hora <= 11) {
                    System.out.println("SIM");
                } else {
                    System.out.println("NAO");
                }
                break;
            default:
                System.out.println("DIA INVALIDO");
        }
    }
}

