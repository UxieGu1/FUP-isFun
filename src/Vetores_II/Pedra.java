import java.util.Scanner;

public class Pedra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }

        int menorDiferenca = Integer.MAX_VALUE;
        int indiceMenor = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] >= 10 && b[i] >= 10) {
                int diff = Math.abs(a[i] - b[i]);
                if (diff < menorDiferenca) {
                    menorDiferenca = diff;
                    indiceMenor = i; 
                }
            }
        }

        if (indiceMenor != -1) {
            System.out.println(indiceMenor);
        } else {
            System.out.println("sem ganhador");
        }

        scan.close();
    }
}
