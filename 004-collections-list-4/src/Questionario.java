// Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
// 1 - Telefonou para a vítima?
// 2 - Esteve no local do crime?
// 3 - Mora perto da vítima?
// 4 - Devia para a vítima?
// 5 - Já trabalhou com a vítima?
// Se a pessoa responder positivamente a 2 questões, ela deve ser classificada como "Suspeita",
// entre 3 e 4 questões, como "Cúmplice", e 5 como "Assassina". Caso contrário, ela será classificada
// como "Inocente".

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questionario {
    String pergunta;
    Integer resposta;
    Questionario(String pergunta, Integer resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }
    String getPergunta() {
        return pergunta;
    }
    Integer getResposta() {
        return resposta;
    }
    @Override
    public String toString() {
        String resp = "";
        if (resposta == 0) resp = "Não";
        else if (resposta == 1) resp = "Sim";
        return "\n{" + 
                "Pergunta = '" + pergunta + '\'' + 
                ", Resposta = '" + resp + '\'' +
                '}'; 
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Questionario> interrogatorio = new ArrayList<>();
        System.out.println("\n1 - Telefonou para a vítima? 1 = Sim, 0 = Não");
        interrogatorio.add(new Questionario("Telefonou para a vítima?", scan.nextInt()));
        System.out.println("\n2 - Esteve no local do crime? 1 = Sim, 0 = Não");
        interrogatorio.add(new Questionario("Esteve no local do crime?", scan.nextInt()));
        System.out.println("\n3 - Mora perto da vítima? 1 = Sim, 0 = Não");
        interrogatorio.add(new Questionario("Mora perto da vítima?", scan.nextInt()));
        System.out.println("\n4 - Devia para a vítima? 1 = Sim, 0 = Não");
        interrogatorio.add(new Questionario("Devia para a vítima?", scan.nextInt()));
        System.out.println("\n5 - Já trabalhou com a vítima? 1 = Sim, 0 = Não");
        interrogatorio.add(new Questionario("Já trabalhou com a vítima?", scan.nextInt()));

        //System.out.println(interrogatorio.toString());

        int soma = 0;
        for (Questionario questionario : interrogatorio) {
            soma += questionario.getResposta();
        }
        if (soma <= 1) System.out.println("\nInocente");
        else if (soma == 2) System.out.println("\nSuspeito");
        else if (soma <= 4) System.out.println("\nCúmplice");
        else if (soma == 5) System.out.println("\nASSASSINO");
        else System.out.println("ERRO!");
    
    }
}
