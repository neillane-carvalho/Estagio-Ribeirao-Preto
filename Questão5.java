import java.util.Scanner;

public class Questão5 {

    public static void main(String[] args) {
        boolean lampadaAQuente = false;
        boolean lampadaBLigada = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Ligue o interruptor A e espere alguns minutos para a lâmpada aquecer.");
        lampadaAQuente = true;

        System.out.println("2. Desligue o interruptor A.");
        System.out.println("3. Ligue o interruptor B e vá verificar as lâmpadas.");

        lampadaBLigada = true;

        System.out.println("\nVerificando as lâmpadas...");

        if (lampadaBLigada) {
            System.out.println("A lâmpada 2 está acesa. Logo, o interruptor B controla a lâmpada 2.");
        }

        if (!lampadaBLigada && lampadaAQuente) {
            System.out.println("A lâmpada 1 está apagada, mas está quente. Logo, o interruptor A controla a lâmpada 1.");
        }

        System.out.println("A lâmpada 3 está apagada e fria. Logo, o interruptor C controla a lâmpada 3.");

        scanner.close();
    }
}
