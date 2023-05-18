/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */

 import java.util.Scanner;

public class Ex04_ParEImpar {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int total = 0;
        int par = 0;
        int impar = 0;
        int numero;

        while(true) {
            System.out.println("\nQuantidade total de números fornecidos: " + total);
            System.out.println("Quantidade de números pares: " + par);
            System.out.println("Quantidade de números ímpares: " + impar);

            System.out.println("Digite um número inteiro:");
            numero = scan.nextInt();
            total++;
            if (numero % 2 == 0) par++;
            else if (numero % 2 == 1) impar++;
            else
                break;
        }
    }
}
