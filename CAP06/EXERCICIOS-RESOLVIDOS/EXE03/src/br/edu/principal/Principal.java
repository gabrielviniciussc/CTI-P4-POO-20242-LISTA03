package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        int i, j = 0;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para o vetor 1: ");
            vet1[i] = sc.nextInt();
            vet3[j] = vet1[i];
            j++;

            System.out.print("Digite o " + (i + 1) + "º número para o vetor 2: ");
            vet2[i] = sc.nextInt();
            vet3[j] = vet2[i];
            j++;
        }

        System.out.println("\nVetor 3:");
        for (i = 0; i < 20; i++) {
            System.out.println("Índice " + i + ": " + vet3[i]);
        }
    }
}
