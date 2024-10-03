package ex_cap4.classes_e_objetos.Desafio02;

public class contaBancaria {

    public String titular;
    public double saldo;

    public static double taxaDeJuros = 0.05;

    public void exibirSaldo(){
        System.out.println("------ Extrato ------");
        System.out.println("titular: " + this.titular);
        System.out.println("saldo: " + this.saldo);
        System.out.println("---------------------");
        System.out.println(" ");
    }

    public void atualizaSaldos() {
        this.saldo = this.saldo + this.saldo * taxaDeJuros;
    }

    public static void atualizarTaxaDeJuros(double novaTaxa) {
        taxaDeJuros = novaTaxa;
    }
}
