/**
 * Questão: @jokenpo: Jokenpo das tartarugas
 *
 * @author UxieGu1
 */
package Selecao_I;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char jog1 = scan.next().charAt(0);
        char jog2 = scan.next().charAt(0);

        if((jog1 == 'R' && jog2 == 'S') || (jog1 == 'P' && jog2 == 'R') || (jog1 == 'S' && jog2 == 'P')) {
            System.out.println("jog1");
        } else if((jog2 == 'R' && jog1 == 'S') || (jog2 == 'P' && jog1 == 'R') || (jog2 == 'S' && jog1 == 'P')) {
            System.out.println("jog2");
        } else {
            System.out.println("empate");
        }

        scan.close();
    }
}