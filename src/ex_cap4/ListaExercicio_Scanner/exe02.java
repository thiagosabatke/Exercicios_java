package ex_cap4.ListaExercicio_Scanner;
import java.util.Scanner;

public class exe02
{
    public static void main(String[] args)
    {
        int Num1, Num2, Num3;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        Num2 = input.nextInt();
        System.out.println("Digite o terceiro numero: ");
        Num3 = input.nextInt();

        int maior = Num1;
        int menor = Num2;

        if (Num1 > Num2 && Num1 > Num3)
            maior = Num1;
        else if (Num2 > Num1 && Num2 > Num3)
            maior = Num2;
        else
            maior = Num3;

        if (Num1 < Num2 && Num1 < Num3)
            menor = Num1;
        else if (Num2 < Num1 && Num2 < Num3)
            menor = Num2;
        else
            menor = Num3;

        System.out.println("O maior: " + maior);
        System.out.println("O menor: " + menor);

        input.close();
    }
}
