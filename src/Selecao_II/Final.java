/**
 * Questão: @final: Será que eu passo?
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota1 = scan.nextInt();
        int nota2 = scan.nextInt();
        float notaFinal = scan.nextFloat();

        float media = (float) (nota1 + nota2) / 2.0f;

        if(media >= 7){
            System.out.println("aprovado");
        }else if(media < 4){
            System.out.println("reprovado");
        } else if (media >= 4 || media < 7) {
            float novaMedia = (media + notaFinal) / 2.0f;
            if(novaMedia >= 5){
                System.out.println("aprovado na final");
            }else{
                System.out.println("reprovado na final");
            }
        }
        scan.close();
    }
}