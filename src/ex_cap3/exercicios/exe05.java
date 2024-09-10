package ex_cap3.exercicios;

public class exe05 
{
    public static void main(String[] args) 
    {

        System.out.println("Imprimindo todos os fatorias dos numeros de 1 a 10");
        for( int i = 1; i <=10;i++)
        {
            int fatorial = 1;

            for(int j = 1; j <=i; j++)
            {
                fatorial *= j;
            }
            System.out.println("o fatorial de " + i + " é " + fatorial);
        }
    }
}
