package ex_cap2;

public class Exercicio_2 {
    public static void main(String[] args){

        double prova_teorica1 = 5;
        double prova_pratica1 = 7;
        double integrada1 = 1;
        double aep1 = 1;

        double prova_teorica2 = 1;
        double prova_pratica2 = 2;
        double integrada2 = 1;
        double aep2 = 1;

        double nota_1bim = prova_pratica1 + prova_teorica1 + integrada1 + aep1;

            System.out.println("Nota do 1º bimestre: " + nota_1bim);

        double nota_2bim = prova_pratica2 + prova_teorica2 + integrada2 + aep2;

            System.out.println("Nota do 2º bimestre: " + nota_2bim);

        double media = (nota_1bim + nota_2bim) / 2;

            System.out.println("Média: " + media);
    }
}