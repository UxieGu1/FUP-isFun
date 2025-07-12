/**
 * Questão: @filhos: Filhos de Seu David
 *
 * @author UxieGu1
 */
package Repeticao_I;
import java.util.Scanner;

public class Filhos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maisNovo = scan.nextInt();
        int qtdFilhos = scan.nextInt();

        for (int i = 0; i < qtdFilhos; i++) {
            System.out.println(maisNovo + (i *  2));
        }
        scan.close();
    }
}
