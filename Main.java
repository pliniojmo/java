import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*String nome = "PI";
        double pi = 3.1416;
        System.out.println(String.format("O %s é %.2f",nome,pi));

        Random rnd = new Random();

        for (int i =0;i<10;i++){
            System.out.println(rnd.nextInt(10));
        }
        */
        // Fatorial normal
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor para fatorial: ");
        int fat = sc.nextInt();
        int total=fat;
        do {
            total*= (fat-1);
            //System.out.println(fat);
            //System.out.println(total);
            fat--;
        }while (fat!=1);
        System.out.println(total);

    }
}
