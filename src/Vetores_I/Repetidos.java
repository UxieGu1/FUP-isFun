/**
 * Questão: @repetidos: Contar repetidos
 *
 * @author UxieGu1
 */
package Vetores_I;
import java.util.Scanner;

public class Repetidos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int n = scan.nextInt();
        int[] vetor = new int[n];
        int cont = 0;

        for (int i = 0; i < n; i++) {
            int v = scan.nextInt();
            vetor[i] = v;
            if (vetor[i] == x){
                cont++;
            }
        }
        System.out.println(cont);
        scan.close();
    }
}
