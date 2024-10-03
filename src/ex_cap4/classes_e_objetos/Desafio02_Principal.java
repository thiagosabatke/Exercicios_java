package ex_cap4.classes_e_objetos;

import ex_cap4.classes_e_objetos.Desafio02.contaBancaria;

public class Desafio02_Principal {

    public static void main(String[] args) {

        contaBancaria conta1 = new contaBancaria();
        conta1.titular = "Carlos";
        conta1.saldo = 1000.0;
        conta1.exibirSaldo();

        contaBancaria conta2 = new contaBancaria();
        conta2.titular = "Maria";
        conta2.saldo = 2000.0;
        conta2.exibirSaldo();

        contaBancaria.atualizarTaxaDeJuros(0.07);
        System.out.println("Nova taxa de juros: " + contaBancaria.taxaDeJuros);

        conta1.atualizaSaldos();
        conta2.atualizaSaldos();
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
