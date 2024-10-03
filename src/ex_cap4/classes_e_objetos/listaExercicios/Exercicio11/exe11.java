package ex_cap4.classes_e_objetos.listaExercicios.Exercicio11;

public class exe11 {
    public void MaiorMenor(int num1,int num2, int num3){
        int maior = num1;
        int menor = num1;

        if(num2 > maior){
            maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }

        if (num2 < menor){
            menor = num2;
        }
        if (num3 < menor){
            menor = num3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é : " + menor);
    }
}
