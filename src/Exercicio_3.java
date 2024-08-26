public class Exercicio_3 {
    public static void main(String[] args){
        double gasto_alimentacao_diario = 50;
        double gasto_transporte_diario = 12.5;

        double gasto_mensal = (gasto_alimentacao_diario * 30) + (gasto_transporte_diario * 30);

        System.out.println("Gasto total mensal: " + gasto_mensal);
    }
}
