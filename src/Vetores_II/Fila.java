/**
 * Questão: @fila: Separar Pares e Ímpares
 *
 * @author UxieGu1
 */

import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] alunos = new int[N];
        int[] servidores = new int[N];
        int qtdAlunos = 0;
        int qtdServidores = 0;
        
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num % 2 != 0) {
                alunos[qtdAlunos++] = num;
            } else {
                servidores[qtdServidores++] = num;
            }
        }
        
        if (qtdAlunos == 0) {
            System.out.println("[ ]");
        } else {
            System.out.print("[ ");
            for (int i = 0; i < qtdAlunos; i++) {
                System.out.print(alunos[i]);
                if (i < qtdAlunos - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ]");
        }
        
        if (qtdServidores == 0) {
            System.out.println("[ ]");
        } else {
            System.out.print("[ ");
            for (int i = 0; i < qtdServidores; i++) {
                System.out.print(servidores[i]);
                if (i < qtdServidores - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ]");
        }
    }
}
