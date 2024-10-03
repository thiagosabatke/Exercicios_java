package ex_cap4.classes_e_objetos.classes_Retorno.Desafio01;

public class Calculadora {

    public double N1, N2, Resultado;

    public double soma(double N1, double N2){
        this.N1 = N1;
        this.N2 = N2;
        this.Resultado = this.N1 + this.N2;
        return Resultado;
    }

    public double subtracao(double N1, double N2){
        this.N1 = N1;
        this.N2 = N2;
        this.Resultado = this.N1 - this.N2;
        return Resultado;
    }

    public double multiplicacao(double N1, double N2){
        this.N1 = N1;
        this.N2 = N2;
        this.Resultado = this.N1 * this.N2;
        return Resultado;
    }
    public double divisao(double N1, double N2) {
        this.N1 = N1;
        this.N2 = N2;
        this.Resultado = this.N1 / this.N2;
        return Resultado;
    }
}
