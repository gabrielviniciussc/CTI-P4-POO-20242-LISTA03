package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] X = new int[10];
        int[] Y = new int[10];
        int[] U = new int[20];
        int[] D = new int[10];
        int[] S = new int[10];
        int[] P = new int[10];
        int[] IT = new int[10];
        int i, j, k;
        int cont_u = 1, cont_d = 1, cont_i = 1;

        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número para X: ");
            X[i-1] = sc.nextInt();
            System.out.print("Digite o " + i + "º número para Y: ");
            Y[i-1] = sc.nextInt();
        }

        for (i = 1; i <= 10; i++) {
            j = 1;
            while (j < cont_u && X[i-1] != U[j]) {
                j++;
            }
            if (j >= cont_u) {
                U[cont_u] = X[i-1];
                cont_u++;
            }
        }

        for (i = 1; i <= 10; i++) {
            j = 1;
            while (j < cont_u && Y[i-1] != U[j]) {
                j++;
            }
            if (j >= cont_u) {
                U[cont_u] = Y[i-1];
                cont_u++;
            }
        }

        System.out.println("\nUnião U:");
        for (i = 1; i < cont_u; i++) {
            System.out.print(U[i] + " ");
        }

        for (i = 1; i <= 10; i++) {
            j = 1;
            while (j <= 10 && X[i-1] != Y[j-1]) {
                j++;
            }
            if (j > 10) {
                k = 1;
                while (k < cont_d && X[i-1] != D[k]) {
                    k++;
                }
                if (k >= cont_d) {
                    D[cont_d] = X[i-1];
                    cont_d++;
                }
            }
        }

        System.out.println("\nDiferença D:");
        for (i = 1; i < cont_d; i++) {
            System.out.print(D[i] + " ");
        }

        for (i = 1; i <= 10; i++) {
            S[i-1] = X[i-1] + Y[i-1];
            P[i-1] = X[i-1] * Y[i-1];
        }

        System.out.println("\nSoma S:");
        for (i = 1; i <= 10; i++) {
            System.out.print(S[i-1] + " ");
        }

        System.out.println("\nProduto P:");
        for (i = 1; i <= 10; i++) {
            System.out.print(P[i-1] + " ");
        }

        for (i = 1; i <= 10; i++) {
            j = 1;
            while (j <= 10 && X[i-1] != Y[j-1]) {
                j++;
            }
            if (j <= 10) {
                k = 1;
                while (k < cont_i && IT[k] != X[i-1]) {
                    k++;
                }
                if (k >= cont_i) {
                    IT[cont_i] = X[i-1];
                    cont_i++;
                }
            }
        }

        System.out.println("\nItens Comuns IT:");
        for (i = 1; i < cont_i; i++) {
            System.out.print(IT[i] + " ");
        }
    }
}
