/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100),
armazene-os num vetor, e mostre os números e seus sucessores.
 */

import java.util.Random;


public class Ex09_NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numsAleat = new int[20];

        for (int i = 0; i < numsAleat.length; i++)
            numsAleat[i] = random.nextInt(100);
        System.out.print("\nNúmeros aleatórios gerados:\n");
        for (int i = 0; i < numsAleat.length; i++)
            System.out.print(numsAleat[i] + " ");
        System.out.print("\n");
        System.out.print("\nSucessores dos números aleatórios gerados:\n");
        for (int i = 0; i < numsAleat.length; i++)
            System.out.print(numsAleat[i] + 1 + " ");
        System.out.print("\n\n");
    }
}
