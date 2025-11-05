/**
 * Questão: @cartas: Transformando números em letras
 *
 * @author UxieGu1
 */

import java.util.Scanner;

public class Cartas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] vetor = new int[n];

        if (n == 0){
            System.out.println("[]");
            return;
        }

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            vetor[i] = x;
        }

        System.out.print("[");
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == 1){
                System.out.print("A");
            }
            else if (vetor[j] == 11){
                System.out.print("J");
            }
            else if (vetor[j] == 12){
                System.out.print("Q");
            }
            else if (vetor[j] == 13){
                System.out.print("K");
            }else{
                System.out.print(vetor[j]);
            }
            if(j != vetor.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
