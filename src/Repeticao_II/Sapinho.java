/**
 * Questão: @sapinho: Sapinho no Poço
 *
 * @author UxieGu1
 */
package Repeticao_II;
import java.util.Scanner;

class Sapinho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int p = scan.nextInt();
        int s = scan.nextInt();
        int e = scan.nextInt();

        int salto = 0;

        for(int i = 0; i < 12; i++){
            System.out.printf("%d ", salto);

            salto += s;


            if(salto >= p) {
                System.out.println("saiu");
                break;
            }

            System.out.println(salto);
            salto -= e;

        }
        scan.close();
    }
}
