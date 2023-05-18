/*
 * Faça um programa que leia cinco números e informe:
 * O MAIOR número e a MÉDIA deles.
 */

import java.util.Scanner;

public class Ex03_MaiorEMedia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        float numero = 0.0f;
        float maior = 0.0f;
        float acumula = 0.0f;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número: ");
            numero = scan.nextFloat();
            acumula += numero;
            if (numero >= maior) maior = numero;          
        }

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números digitados é: " + acumula/5);
    }
}
