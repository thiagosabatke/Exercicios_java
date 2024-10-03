package ex_cap4.ListaExercicio_Scanner;
import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            num = input.nextInt();

            if (num == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (num > 1 && (num == 2 || num == 3 || num == 5 || num == 7 || (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0))) {
                System.out.println("O número " + num + " é primo!");
            } else {
                System.out.println("O número " + num + " não é primo!");
            }
        }

        input.close();
    }
}
