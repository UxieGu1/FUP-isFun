/**
 * Questão: @goiabas: Pegar do pé do vizinho
 *
 * @author UxieGu1
 */

package Selecao_II;
import java.util.Scanner;

public class Goiabas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cesta = scan.nextInt();
        int bananas = scan.nextInt();
        int goiabas = scan.nextInt();
        int mangas = scan.nextInt();

        int totalFrutas = bananas + goiabas + mangas;
        int viagens = (totalFrutas + cesta - 1) / cesta;
        System.out.println(viagens);
    }
}
