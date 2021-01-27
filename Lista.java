import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Lista {
    //psvm
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos"); //0
        nomes.add("Pedro"); //1
        nomes.add("Juliana"); //2
        nomes.add("Anderson"); //3
        nomes.add("Maria"); //4
        nomes.add("João"); //5

        System.out.println(nomes); //[Carlos, Pedro, Juliana, Anderson, Maria, João]

        nomes.set(2,"Larissa"); //Troca Juliana por Larissa.

        System.out.println(nomes); //[Carlos, Pedro, Larissa, Anderson, Maria, João]

        Collections.sort(nomes); //Colocando em ordem alfabética.

        System.out.println(nomes); //[Anderson, Carlos, João, Larissa, Maria, Pedro]

        nomes.set(2,"Wesley");

        System.out.println(nomes); //[Anderson, Carlos, Wesley, Larissa, Maria, Pedro]

        nomes.remove(4); //Remove por posição.

        System.out.println(nomes); //[Anderson, Carlos, Wesley, Larissa, Pedro]

        nomes.remove("Wesley"); // Remove por nome.

        System.out.println(nomes); //[Anderson, Carlos, Larissa, Pedro]

        String nome = nomes.get(1); //Puxa para a variável o nome que está na posição 1.

        System.out.println(nome); //Carlos

        int tamanho = nomes.size();

        System.out.println(tamanho); //Traz o tamanho.

        nomes.remove("Larissa");

        tamanho = nomes.size(); // Atualiza o tamanho.

        System.out.println(tamanho); //Traz novamente o tamanho.

        boolean busca = nomes.contains("Anderson"); //Procura o nome da lista.

        System.out.println(busca); //Verdadeiro ou falso? Verdadeiro!

        int posicao = nomes.indexOf("Anderson"); //Mostra onde ele está na lista. Se o nome não estiver na lista ele mostra -1.

        System.out.println(posicao); //0

        boolean listaEstaVazia = nomes.isEmpty(); //Verifica se a lista está vazia.

        System.out.println(listaEstaVazia); //Verdadeiro ou falso? Falso!

        for (String nomeDoItem: nomes){ //Percorre a lista mostrando seu itens.
            System.out.println("--> "+nomeDoItem);
        }

        nomes.add("Ana");

        Collections.sort(nomes);

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("-=-> "+iterator.next()); //Percorre a lista também.
        }

        nomes.clear(); //Limpa a lista. Apaga tudo!

        listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia); //Verdadeiro ou falso? Verdadeiro!

    }
}
