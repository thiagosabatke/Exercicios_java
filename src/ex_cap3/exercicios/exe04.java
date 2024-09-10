package ex_cap3.exercicios;

public class exe04 
{
    public static void main(String[] args) 
    {
        System.out.println("imprimindo numeros entre 1 e 100 que sao divisiveis por 100");
        for(int i = 1; i <= 100; i++)
        {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
