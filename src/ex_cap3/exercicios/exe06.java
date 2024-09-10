package ex_cap3.exercicios;

public class exe06 
{
    public static void main(String[] args) 
    {
        System.out.println("imprimindo os numeros da serie de Fibonacci ate 100");
        int primeiro_num = 0;
        int segundo_num = 1;

        System.out.println(primeiro_num);
        System.out.println(segundo_num);

        int proximo = primeiro_num + segundo_num;
        
        while (proximo <= 100) 
        {
            System.out.println(proximo);
            primeiro_num = segundo_num;
            segundo_num = proximo;
            proximo = primeiro_num + segundo_num; 
        }
    }
}
