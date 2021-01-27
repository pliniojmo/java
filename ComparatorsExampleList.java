import java.util.*;

public class ComparatorsExampleList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- ordem de inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade()-second.getIdade());

        System.out.println("--- ordem natual dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first,secod)-> secod.getIdade()-first.getIdade());

        System.out.println("--- ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- ordem natual dos números - idade (method reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println("--- ordem reversa dos números - idade (method reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("--- ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());

        System.out.println("--- ordem reversa dos números - idade (interface Comparator) ---");
        System.out.println(estudantes);
    }
}
