package ex_cap3.exercicios;

public class exe10 
{
    public static void main(String[] args) 
    {
        double salarioAtual = 2300.00; 

        double percentualAumento = 3;
        double valorAumento = 10;

        if (salarioAtual <= 280.00) 
        {
            percentualAumento = 20.0;
        } else if (salarioAtual > 280.00 && salarioAtual <= 700.00) 
        {
            percentualAumento = 15.0;
        } else if (salarioAtual > 700.00 && salarioAtual <= 1500.00) 
        {
            percentualAumento = 10.0;
        } else 
        {
            percentualAumento = 5.0;
        }

        valorAumento = salarioAtual * (percentualAumento / 100);

        double novoSalario = salarioAtual + valorAumento;

        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário, após o aumento: R$ " + novoSalario);  
    }
}
