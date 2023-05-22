// Crie uma classe LinguagemFavorita que possua os atributos: nome, anoDeCriacai e ide.
// Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
// A - Ordem de inserção
// B - Ordem Natural (nome)
// C - IDE
// D - Ano de criação e nome
// E - Nome, ano de criação e IDE
// Ao final, exiba as linguagens no console, uma abaixo da outra 


import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavorita {
    
    String nome;
    Integer anoDeCriacao;
    String ide;

    LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    String getNome() {
        return nome;
    }
    Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }
    String getIde() {
        return ide;
    }
    @Override
    public String toString() {
        return "\nLinguagem = {" +
            "nome = '" + nome + '\'' + 
            ", ano = '" + anoDeCriacao +
            ", IDE = '" + ide + '\'' +
            '}';
    }


    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
        linguagens.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagens.add(new LinguagemFavorita("Kotlin", 2011, "IntelliJ"));

        System.out.println("\nA - Ordem de inserção: ");
        for (LinguagemFavorita linguagemFavorita : linguagens) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() +
                    " - " + linguagemFavorita.getIde());
        }

        System.out.println("\nB - Ordem Natural (nome): ");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorNome());
        linguagens2.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita : linguagens2) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() +
                    " - " + linguagemFavorita.getIde());
        }

        System.out.println("\nC - IDE: ");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIde());
        linguagens3.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita : linguagens3) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() +
                    " - " + linguagemFavorita.getIde());
        }

        System.out.println("\nD - Ano de criação e nome: ");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoNome());
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita : linguagens4) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() +
                    " - " + linguagemFavorita.getIde());
        }

        System.out.println("\nE - Nome, ano de criação e IDE: ");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagens5.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita : linguagens5) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() +
                    " - " + linguagemFavorita.getIde());
        }

        System.out.println("\nExiba as linguagens no console, uma abaixo da outra: ");
        for (LinguagemFavorita linguagemFavorita : linguagens) {
            System.out.println(linguagemFavorita.getNome());
        }

    }
}

class ComparatorNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare (LinguagemFavorita l1, LinguagemFavorita l2) {
    return l1.getNome().compareTo(l2.getNome());
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare (LinguagemFavorita l1, LinguagemFavorita l2) {
    return l1.getIde().compareTo(l2.getIde());
    }
}
class ComparatorAnoNome implements Comparator <LinguagemFavorita> {
    @Override
    public int compare (LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (ano != 0) return ano;

        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        return 0;
    }
}
class ComparatorNomeAnoIde implements Comparator <LinguagemFavorita> {
    @Override
    public int compare (LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (ano != 0) return ano;

        int ide = l1.getIde().compareTo(l2.getIde());
        if (ide != 0) return ide;

        return 0;
    }
}
