package ex_cap2;

public class Exercicio_7 {
    public static void main(String[] args){
    
        int idadeAnos = 18;
        int idadeMeses = 5;
        int idadeDias = 28;

        int anos_to_dias = idadeAnos * 365;
        int meses_to_dias = idadeMeses * 30;
        int idade_em_dias = anos_to_dias + meses_to_dias + idadeDias;

        System.out.println("Anos: " + idadeAnos);
        System.out.println("Meses: " + idadeMeses);
        System.out.println("Dias: " + idadeDias);
        System.out.println("Idade em dias: " + idade_em_dias);

    }
}
