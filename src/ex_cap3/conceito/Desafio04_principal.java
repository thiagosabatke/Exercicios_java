package ex_cap3.conceito;

public class Desafio04_principal 
{
    public static void main(String[] args)
    {
        System.out.println("Desafio04 - loop while");
        int num = 0;
        while (num <= 10) 
        {
            if (num % 2 == 0) 
            {
                System.out.println(num);
            }
            num = num + 1;
        }
    }
}
