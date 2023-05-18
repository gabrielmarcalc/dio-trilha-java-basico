/*
 * Faça um programa que calcule o fatorial de
 * um número inteiro fornecido pelo usuário.
 */

import java.util.Scanner;

public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        long fat = 1;

        System.out.println("Digite o número inteiro do qual quer o fatorial:");
        num = scan.nextInt();
        for (int i = num; i >= 1; i--) fat *= i;
        System.out.println(num + "! = " + fat);
        System.out.println("\n");     
    }
}
