import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int SAIR = 4;

        String menu = "Menu\n1.Hotel\n2.Banho\n3.Tosa\n4.Sair";

        Scanner sc = new Scanner(System.in);

        System.out.println(menu);
        int opcao = sc.nextInt();

        while (opcao != SAIR) {
            switch (opcao) {
                case 1:
                    System.out.println("É um cachorro grande, medio ou pequeno.");
                    char tamanho = sc.next().charAt(0);
                    System.out.println("Tem um pelo curto, medio ou longo.");
                    char pelo = sc.next().charAt(0);
                    Banho banho = new Banho(pelo,tamanho);

                    break;

                case 2:

                    break;
                case 3:
                    break;


            }

            System.out.println(menu);
            opcao = sc.nextInt();
        }
    }

}