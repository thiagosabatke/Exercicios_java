package ex_cap3.conceito;

public class Desafio03_principal 
{
    public static void main(String[] args) 
    {
        System.out.println("“DESAFIO 3_Estrutura de Repetição WHILE");
        int idade = 15;
        
        while (idade < 30) 
        {
            System.out.println("Sua idade é: " + idade);    
            idade = idade +1;
        }
        System.out.println("Fim do laço de repetição");
    }
}
