package ex_cap4.ListaExercicio_Scanner;
import java.util.Scanner;

public class exe01
{
    public static void main(String[] args)
    {
        int Num1, Num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Num1 = input.nextInt();
        System.out.println("Digite outro numero: ");
        Num2 = input.nextInt();
        for (int i = Num1; i <= Num2; i++)
        {
            System.out.print(i + " ");
        }
    }
}
