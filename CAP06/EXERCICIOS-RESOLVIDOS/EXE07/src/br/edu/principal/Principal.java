package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] vet = new int[8];
        int i = 0, j, z, aux;

        Scanner sc = new Scanner(System.in);

        while (i < 8) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            aux = sc.nextInt();

            j = 0;
            while (j < i && vet[j] < aux) {
                j++;
            }

            z = i;
            while (z > j) {
                vet[z] = vet[z - 1];
                z--;
            }

            vet[j] = aux;
            i++;
        }

        System.out.println("\nVetor ordenado:");
        for (i = 0; i < 8; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
