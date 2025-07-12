/**
 * Questão: @cortada: Essa nota presta? - OBI 2019 F1P1
 *
 * @author UxieGu1
 */

package Selecao_II;
import java.util.Scanner;

public class Cortada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int B = scan.nextInt();
        int T = scan.nextInt();

        int comprimento = 160;
        int altura = 70;
        int areaTotal = comprimento * altura;
        int metadeArea = areaTotal / 2;

        int areaFelix = (B + T) * altura / 2;
        int areaMarzia = areaTotal - areaFelix;

        if (areaFelix > metadeArea) {
            System.out.println(1);
        } else if (areaMarzia > metadeArea) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}
