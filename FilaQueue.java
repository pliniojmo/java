import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //Mostra quem é o primeiro sem remover. Não da erro se a fila estiver em banco.

        System.out.println("Cliente: "+primeiroCliente);

        String clienteAtendimento = filaBanco.poll(); //Mostra o quem é o primeiro da fila e remove da fila.

        System.out.println("Cliente em atendimento: "+clienteAtendimento);

        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroClienteErro = filaBanco.element(); //Da erro se estiver sem elementos na fila.

        System.out.println(primeiroClienteErro);

        System.out.println(filaBanco);

        for (String cliente : filaBanco){
            System.out.println("->"+cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("=->"+iteratorFilaBanco.next());
        }

    }
}
