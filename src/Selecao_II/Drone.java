/**
 * Questão: @drone: Dronede Entrega - OBI 2017 - Fase 1
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Drone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int h = scan.nextInt();
        int l = scan.nextInt();

        //if (a * b <= h * l){
        //    System.out.println("S");
        //}else{
        //    System.out.println("N");
        //}

        if (((a <= h && b <= l) || (b <= h && a <= l))
                || ((a <= h && c <= l) || (c <= h && a <= l))
                || ((b <= h && c <= l) || (c <= h && b <= l))) {
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
