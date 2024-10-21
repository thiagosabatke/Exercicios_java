package ex_cap6.p20241015.Exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class ListaExercicios {

    public void exe01(){
        System.out.println("Exercicio 01");
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor: ");
            array[i] = sc.nextInt();
        }
        int soma = 0;
        System.out.println("Resultado: ");
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("soma: " + soma);

        sc.close();
    }

    public void exe02(){
        System.out.println("Exercicio 02");
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor: ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Menor e Maior: ");
        System.out.print(array[0]);
        System.out.print(" e ");
        System.out.print(array[array.length-1]);

        sc.close();
    }

    public void exe03(){
        System.out.println("Exercicio 03");
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor: ");
            array[i] = sc.nextInt();
        }
        int par = 0;
        int impar = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                par++;
            }
            else {
                impar++;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);

        sc.close();
    }

    public void exe04(){
        System.out.println("Exercicio 04");
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor: ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Array: " + Arrays.toString(array));

        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - i - 1];
        }
        System.out.println("Invertido: " + Arrays.toString(arrayInvertido));

        sc.close();
    }

    public void exe05(){
        System.out.println("Exercicio 05");
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        sc.close();
    }

    public void exe06(){
        System.out.println("Exercicio 06");
        Scanner sc = new Scanner(System.in);
        int[] array = {4, 8, 9, 10, 5, 1};

        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Digite um valor para buscar : ");
        int valor = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Número " + valor + " encontrado");
        } else {
            System.out.println("Número " + valor + " não encontrado");
        }
        sc.close();
    }

    public void exe07(){
        System.out.println("Exercicio 07");
        int[] array = new int[4];
        int[] arrayDuplicada = new int[array.length * 2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            arrayDuplicada[i] = array[i];
            arrayDuplicada[i + array.length] = array[i];
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Duplicada: " + Arrays.toString(arrayDuplicada));

        sc.close();
    }

    public void exe08(){
        System.out.println("Exercicio 08");
        int[] array = {1,2,3,4,4,8,8,9};
        int[] resultado = new int[array.length];
        int tam = 0;

        for (int i = 0; i < array.length; i++) {
            boolean encontrado = false;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                resultado[tam++] = array[i];
            }
        }
        int[] ArraySemDuplicado = new int[tam];
        for (int i = 0; i < tam; i++) {
            ArraySemDuplicado[i] = resultado[i];
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Array sem duplicado: " + Arrays.toString(ArraySemDuplicado));
    }

    public void exe09(){
        System.out.println("Exercicio 09");
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor: ");
            array[i] = sc.nextInt();
            soma += array[i];
        }

        double media = soma / array.length;
        System.out.println("Media: " + media);
        
        sc.close();
    }

    public void exe10() {
        System.out.println("Exercicio 10");
        int[][] matriz = {{1, 2, 3, 4}, {9, 8, 7, 6}};

        int[][] transposta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

        System.out.println("Transposta: ");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j]);
                if (j < transposta[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
