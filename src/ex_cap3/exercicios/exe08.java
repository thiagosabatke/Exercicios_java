package ex_cap3.exercicios;

public class exe08 
{
    public static void main(String[] args) 
    {
        int numeros = 4;
        for (int i = 1; i <= numeros; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
