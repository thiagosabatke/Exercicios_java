package ex_cap3.exercicios;

public class exe09 
{
    public static void main(String[] args) 
    {
        double valorHora = 50;
        int horasTrabalhadas = 100;

        double salarioBruto = valorHora * horasTrabalhadas;
	        double descontoIR = 0;
	        double descontoINSS = salarioBruto * 0.10; 
	        double fgts = salarioBruto * 0.11; 

	        if (salarioBruto <= 900) 
            {
	            descontoIR = 0;
	        } else if (salarioBruto <= 1500) 
            {
	            descontoIR = salarioBruto * 0.05; 
	        } else if (salarioBruto <= 2500) 
            {
	            descontoIR = salarioBruto * 0.10; 
	        } else {
	            descontoIR = salarioBruto * 0.20; 
	        }

	        double totalDescontos = descontoIR + descontoINSS;

	        double salarioLiquido = salarioBruto - totalDescontos;

	        System.out.println("Salário Bruto: R$ " + salarioBruto);
	        System.out.println("(-) IR: R$ " + descontoIR);
	        System.out.println("(-) INSS: R$ " + descontoINSS);
	        System.out.println("FGTS: R$ " + fgts);
	        System.out.println("Total de descontos: R$ " + totalDescontos);
	        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
