package ex_cap4.classes_e_objetos;

import ex_cap4.classes_e_objetos.Desafio03.Calculadora;

public class Desafio03_Principal {
    public static void main(String[] args) {
        System.out.println("Cap 04 - Métodos com parâmetros");
        Calculadora calc1 = new Calculadora();

        calc1.N1 = 10;
        calc1.N2 = 12;

        calc1.soma();
        calc1.mostraResultado();

        calc1.subtracao();
        calc1.mostraResultado();

        calc1.divisao();
        calc1.mostraResultado();

        calc1.multiplicacao();
        calc1.mostraResultado();

    }
}
