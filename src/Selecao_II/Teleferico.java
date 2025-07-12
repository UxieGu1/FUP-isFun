/**
 * Questão: @teleferico: Teleférico OBI 2017 - Fase 1
 *
 * @author UxieGu1
 */
package Selecao_II;

import java.util.Scanner;

public class Teleferico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cabine = scan.nextInt();
        int alunos = scan.nextInt();

        int viagens = (alunos + (cabine - 1) - 1) / (cabine - 1);
        System.out.println(viagens);
    }
}
