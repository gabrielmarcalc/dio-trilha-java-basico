import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista de String: ");
        
        //------------------------------- CLASSE ANÔNIMA ----------------------------------//
        /*
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */
        //------------------------------- FUNÇÃO LAMBDA -----------------------------------//
        /*
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));
        //ou
        numerosAleatorios.forEach(s -> System.out.println(s));
        */
        //------------------------------ REFERENCE METHOD -----------------------------------//
        
        //numerosAleatorios.stream().forEach(System.out::println);
        //ou
        numerosAleatorios.forEach(System.out::println);
        
        
        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");

        //------------------------------ REFERENCE METHOD -----------------------------------//
        
        // Caso se queira apenas colocar os valores num Set, mas não mostrar na tela:
        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        System.out.println(collectSet);
        // Colocar os dados num Set e mostra na tela:
        //numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros: ");

        //------------------------------- CLASSE ANÔNIMA ----------------------------------//
        /*
        numerosAleatorios.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });
        */
        //------------------------------- FUNÇÃO LAMBDA -----------------------------------//
        /*
        numerosAleatorios.stream().map(s -> Integer.parseInt(s));
        */
        //------------------------------- REFERENCE METHOD -----------------------------------//
        
        // Caso se queira apenas colocar os valores num List, mas não mostrar na tela:
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger);
        // Colocar os dados num List e mostra na tela:
        //numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);;
        
        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista: ");
        
        //Converte os elementos da lista de String para Integer e
        //salva em uma nova lista aqueles que são pares e maiores do que 2
        /*
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt).filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
            System.out.println(listParesMaioresQue2);
        */
        
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt).filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
            System.out.println(listParesMaioresQue2);
        
        
        System.out.println("\nMostre a média dos números: ");
        /*
        numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String s) {
                return Integer.parseInt(s);
            }
        });
        */
        /*
        numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s));
         */
        /*
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double v) {
                        System.out.println(v);
                    }
                });
        */
        
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
        

        System.out.println("\nRemova os valores ímpares: ");
        /*
        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i % 2 != 0) return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInteger);
        */
        
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);
        
       
        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante: ");

        List<Integer> numerosAleatoriosInteger2 = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatoriosInteger2.stream().skip(3).forEach(System.out::println);


        long countNumerosUnicos = numerosAleatoriosInteger2.stream().distinct().count();
        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? "+countNumerosUnicos);


        System.out.println("\nMostre o menor valor da lista: ");

        numerosAleatoriosInteger2.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);

        
        System.out.println("\nMostre o maior valor da lista: ");

        numerosAleatoriosInteger2.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);

        
        int somaNumerosImpares = numerosAleatoriosInteger2.stream().filter(i -> ( i % 2 != 0))
                .mapToInt(Integer::intValue).sum();
        System.out.println("\nPegue apenas os números ímpares e some: "+somaNumerosImpares);


        System.out.println("Mostre a lista na ordem numérica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger2.stream()
                .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        
        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 e de 5: ");
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger2.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
                System.out.println(collectNumerosMultiplosDe3E5);

        
    }
}
