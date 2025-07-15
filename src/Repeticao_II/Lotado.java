/**
 * Questão: @lotado: Ônibus dos alunos
 *
 * @author UxieGu1
 */
package Repeticao_II;
import java.util.Scanner;

public class Lotado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c = scan.nextInt();
        int passageiro = 0;

        while(true){
            int m = scan.nextInt();
            passageiro += m;

            if(passageiro >= (c * 2)) {
                System.out.println("hora de partir");
                break;
            } else if(passageiro == 0){
                System.out.println("vazio");
            } else if (passageiro < c) {
                System.out.println("ainda cabe");
            } else{
                System.out.println("lotado");
            }

        }
    }
}
