/**
 * Questão: @dindin: Clenda adora chocolate
 *
 * @author UxieGu1
 */
package Vetores_I;
import java.util.Scanner;

public class Dindin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtd = scan.nextInt();
        int[] sabores = new int[2];
        int[] turnos = new int[2];

        for (int i = 0; i < qtd; i++) {
            char sabor = scan.next().charAt(0);
            char turno = scan.next().charAt(0);

            if (sabor == 'c') sabores[0]++;
            else if (sabor == 'l') sabores[1]++;

            if (turno == 'm') turnos[0]++;
            else if (turno == 't') turnos[1]++;
        }

        String flavorResult = sabores[0] == sabores[1] ? "empate" :
                (sabores[0] > sabores[1] ? "c" : "l");
        System.out.println(flavorResult);

        if (flavorResult.equals("empate")) {
            System.out.println(turnos[0] == turnos[1] ? "empate" :
                    (turnos[0] > turnos[1] ? "m" : "t"));
        } else {
            if (turnos[0] == turnos[1]) {
                System.out.println("empate");
            } else {
                System.out.println(turnos[0] > turnos[1] ? "t" : "m");
            }
        }
    }
}
