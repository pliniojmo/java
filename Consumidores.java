import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFraseII = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Olá meu povo!");
        imprimirUmaFraseII.accept("Olá meu povo 2!");
    }
}
