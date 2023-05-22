// Faça um programa que recebe a temperatura média dos 6 primeiro meses do ano e armazene-as 
// em uma lista. Após isso, calcule a média semestral das temperatores e mostre todas as temperaturas
// acima desta média, e em que mês elas ocorrem (mostrar o mês por extenso).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Semestre {

    String nome;
    Double temp;
    Semestre(String nome, Double temp) {        // Construtor
        this.nome = nome;
        this.temp = temp;
    }
    String getNome() {
        return nome;
    }
    Double getTemp() {
        return temp;
    }
    @Override
    public String toString() {
        return "{" + 
                "mês = '" + nome + '\'' + 
                ", temperatura = '" + temp + '\'' +
                '}'; 
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Semestre> temperaturas = new ArrayList<>() {{
            System.out.println("Digite a temperatura média de Janeiro:");
            add(new Semestre("Janeiro", scan.nextDouble()));
            System.out.println("Digite a temperatura média de Fevereiro:");
            add(new Semestre("Fevereiro", scan.nextDouble()));
            System.out.println("Digite a temperatura média de Março:");
            add(new Semestre("Março", scan.nextDouble()));
            System.out.println("Digite a temperatura média de Abril:");
            add(new Semestre("Abril", scan.nextDouble()));
            System.out.println("Digite a temperatura média de Maio:");
            add(new Semestre("Maio", scan.nextDouble()));
            System.out.println("Digite a temperatura média de Junho:");
            add(new Semestre("Junho", scan.nextDouble()));
        }};
        
        //System.out.println(temperaturas.toString());

        Double soma = 0.0;
        for (Semestre semestre : temperaturas) {
            soma += semestre.getTemp();
        }
        Double media = soma/6;

        System.out.println("\nA média de temperatura do semestre foi de: " + media + "°");

        System.out.println("\nOs meses que tiveram temperatura acima da média foram:");
        for (Semestre semestre : temperaturas) {
            if (semestre.getTemp() > media) System.out.print(semestre.getNome() + " ");
        }
        
    }
}
