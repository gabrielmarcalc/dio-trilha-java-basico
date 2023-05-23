/*
 * Dadas as seguintes informações sobre meus livros favoritos e seus autores,
 * crie um dicionário e ordene este dicionário exibindo (Nome Autor - Nome Livro)
 * 
 * Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo, páginas: 256
 * Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, páginas: 408
 * Autor = Harari, Yuval Noah - Livro = 21 Lições Para o Século 21, páginas: 432
 */

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) throws Exception {

        System.out.println("\n--\tOrdem aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>();
        meusLivros.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivros.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }

        System.out.println("\n--\tOrdem inserção\t--");

        Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }

        System.out.println("\n--\tOrdem alfabética autores\t--");

        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro : meusLivros3.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }

        System.out.println("\n--\tOrdem alfabética livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4) {
            System.out.println(livro.getValue().getNome() + " - " + livro.getKey() + " - " + livro.getValue().getPaginas());
        }

        System.out.println("\n--\tOrdem número de páginas\t--");

        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPaginas());
        meusLivros5.addAll(meusLivros4);
        for (Map.Entry<String, Livro> livro : meusLivros5) {
            System.out.println(livro.getValue().getPaginas() + " - " + livro.getValue().getNome() + " - " + livro.getKey());
        }

    }
}

class Livro {
    private String nome;
    private Integer paginas;
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }
    @Override
    public String toString() {
        return "Livro{" + "nome='" + nome + '\'' + ", paginas=" + paginas + '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
