import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



class ExemploList {
    public static void main(String[] args) {
        
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça

// List notas = new ArrayList();
// List<Double> notas = new ArrayList<>();
// ArrayList<double> notas = new ArrayList<>();
// List<double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 6d, 0d, 3.6));
// List<double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 6d, 0d, 3.6);
// notas.add(10d);
// System.out.println(notas);

// List<double> notas = List.of(7d, 8.5, 9.3, 5d, 6d, 0d, 3.6);
// notas.add(1d);
// notas.remove(5d);
// System.out.println(notas);


        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println(notas.indexOf(5.0)); 

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas.toString());

        System.out.println("Confirme se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas)
            System.out.print(nota + " ");

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator1 = notas.iterator();
        Double soma = 0.0;
        while(iterator1.hasNext())
            soma += iterator1.next();
        System.out.println(soma);

        System.out.println("Exiba a média das notas: ");
        System.out.println(soma/notas.size());

        System.out.println("Remova a nota 0: ");
        System.out.println(notas.remove(0.0));
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        System.out.println(notas.remove(0));
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext())
            if(iterator2.next() < 7.0)
                iterator2.remove();
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: ");
        System.out.println(notas.isEmpty());


    }
}
