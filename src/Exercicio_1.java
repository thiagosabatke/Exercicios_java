public class Exercicio_1 {
    public static void main(String[] args){

        double T_Celsius = 25;
        double T_Fahrenheit, T_Kelvin, T_Reaumur, T_Rankine;

        //calcula a temperatura 
        T_Fahrenheit = T_Celsius * 1.8 + 32;
        T_Kelvin = T_Celsius + 273.15;
        T_Reaumur = T_Celsius * 0.8;
        T_Rankine = T_Celsius * 1.8 + 459.67;

        System.out.println("Exercicio 1");

        System.out.println("Temperatura Fahrenheit " + T_Fahrenheit);
        System.out.println("Temperatura Kelvin " + T_Kelvin);
        System.out.println("Temperatura Reamur " + T_Reaumur);
        System.out.println("Temperatura Rankine " + T_Rankine);
    }
}