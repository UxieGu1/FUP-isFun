/**
 * Questão: @apertada: Busca do menor valor
 *
 * @author UxieGu1
 */
package Vetores_I;
import java.util.Scanner;

public class Apertada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++){
            int n = scan.nextInt();
            vetor[i] = n;
        }

        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println(menor);
        scan.close();
    }
}
