package ex_cap4.classes_e_objetos.listaExercicios.Exercicio10;

public class exe10 {
    public void calcularReajuste(double sal_atual){
        double percentualAumento = 0;
        double valorAumento = 0;
        double novoSalario = sal_atual;

        if (sal_atual <= 280.00) {
            percentualAumento = 20;
        } else if (sal_atual > 280.00 && sal_atual <= 700.00) {
            percentualAumento = 15;
        } else if (sal_atual > 700.00 && sal_atual <= 1500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        valorAumento = (percentualAumento / 100) * sal_atual;
        novoSalario = sal_atual + valorAumento;

        System.out.println("Salário antes do reajuste: R$ " + sal_atual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento);
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário, após o aumento: " + novoSalario);
    }
}