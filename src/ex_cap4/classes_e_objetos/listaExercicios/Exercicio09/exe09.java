package ex_cap4.classes_e_objetos.listaExercicios.Exercicio09;

public class exe09 {
    public void calculoPagamento(String nome, double valorHora,int horatrab){

        var salarioBruto = valorHora * horatrab;
        double desconto_IR = 0;
        double desconto_INSS = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;

        if (salarioBruto <= 900){
            desconto_IR = 0;
        } else if (salarioBruto <= 1500) {
            desconto_IR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            desconto_IR = salarioBruto * 0.10;
        } else {
            desconto_IR = salarioBruto * 0.20;
        }

        double totalDesconto = desconto_IR + desconto_INSS;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("----------------------");
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("IR: R$ " + desconto_IR);
        System.out.println("INSS: R$ " + desconto_INSS);
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDesconto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
        System.out.println("-----------------------");
    }
}
