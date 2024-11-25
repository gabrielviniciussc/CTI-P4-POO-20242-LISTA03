package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] num = new int[9];
        int i, j, cont;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 9; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = sc.nextInt();
        }

        for (i = 0; i < 9; i++) {
            cont = 0;
            for (j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cont++;
                }
            }
            if (cont <= 2) {
                System.out.println(num[i]);
                System.out.println(i + 1);
            }
        }
    }
}
