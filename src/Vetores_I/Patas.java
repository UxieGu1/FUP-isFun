/**
 * Questão: @patas: Chico Bento e Cebolinha
 *
 * @author UxieGu1
 */
package Vetores_I;
import java.util.Scanner;

public class Patas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chuteChico = scan.nextInt();
        int chuteCebolinha = scan.nextInt();
        int qtdAnimais = scan.nextInt();

        int soma = 0;
        for (int i = 0; i < qtdAnimais; i++) {
            char tipo = scan.next().charAt(0);

            if(tipo == 'v') soma += 4;
            else if(tipo == 'g') soma += 2;
            else if(tipo == 'c') soma += 4;
        }

        System.out.println(soma);

        int diffChico = Math.abs(chuteChico - soma);
        int diffCebolinha = Math.abs(chuteCebolinha - soma);

        if (diffChico < diffCebolinha) {
            System.out.println("Chico Bento");
        } else if (diffCebolinha < diffChico) {
            System.out.println("Cebolinha");
        } else {
            System.out.println("empate");
        }

        scan.close();
    }
}