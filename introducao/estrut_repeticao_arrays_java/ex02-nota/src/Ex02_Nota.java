/*
 * Faça um programa que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue
 * pedindo até que o usuário informe um valor válido.
 */

 import java.util.Scanner;

 public class Ex02_Nota {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
 
         float nota;
 
         while (true) {
             System.out.println("\nDigite a nota: ");
             nota = scan.nextFloat();
             if (0.0f <= nota && nota <= 10.0f) System.out.println("Valor válido.");
             else if (nota < 0.0f || nota > 10.0f) {
                 while (nota < 0.0f || nota > 10.0f) {
                     System.out.println("\nValor INVÁLIDO! Digite um novo valor: ");
                     nota = scan.nextFloat();
                 }
                 System.out.println("Valor válido.");
             }
         }
     }
 }
 