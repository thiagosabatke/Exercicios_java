package ex_cap2;

public class Exercicio_4 {
    public static void main(String[] args){
        double massa_kg = 10;
        double altura_metro = 500;
        double tempo_seg = 1;

        double forca_hp = (massa_kg * altura_metro / tempo_seg) / 745.6999;
            
            System.out.println("força necessaria em cavalos: " + forca_hp);
    }
}
