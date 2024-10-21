package ex_cap6.p20241015.manipArrays;
import java.util.Scanner;
import java.util.Arrays;

public class DesafiosArrays {

    //resolução do desafio2
    public void desafio2(){
        System.out.println("Desafio 2");
        String[] nomeFunc = new String[4];
        String[] cidadeNascFunc = new String[4];

        //inicializando arrays
        nomeFunc[0] = "Jose";
        nomeFunc[1] = "Juliano";
        nomeFunc[2] = "Luiz";
        nomeFunc[3] = "Ana";

        cidadeNascFunc[0] = "Joao Pessoa";
        cidadeNascFunc[1] = "Curitiba";
        cidadeNascFunc[2] = "Natal";
        cidadeNascFunc[3] = "Florianopolis";

        //declaranco e inicializando o array
        double[] salarioFunc = {1000.00, 1200.00, 3500.00, 5000.00};


        int i = 0;
        while (i < nomeFunc.length) {
            System.out.println("Nome do funcionario: " + nomeFunc[i] + " ,Nasceu em: " + cidadeNascFunc[i] + " ,Salário é: " + salarioFunc[i]);
            i++;
        }
    }

    //resolução do desafio3
    public void desafio3(){
        System.out.println("Desafio 3");
        Scanner sc = new Scanner(System.in);
        String[] nomeFunc = new String[4];
        String[] cidadeNascFunc = new String[4];
        double[] salarioFunc = new double[4];

        // Capturando dados dos funcionários
        for (int i = 0; i < nomeFunc.length; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ": ");
            nomeFunc[i] = sc.nextLine();

            System.out.println("Digite a cidade de nascimento do funcionário " + nomeFunc[i] + ": ");
            cidadeNascFunc[i] = sc.nextLine();

            System.out.println("Digite o salário do funcionário " + nomeFunc[i] + ": ");
            salarioFunc[i] = sc.nextDouble();
        }

        // Exibindo os dados usando loop for
        System.out.println("\nDados dos funcionários:");
        for (int i = 0; i < nomeFunc.length; i++) {
            System.out.println("Nome: " + nomeFunc[i] + ", Cidade: " + cidadeNascFunc[i] + ", Salário: " + salarioFunc[i]);
        }
        sc.close();
    }

    public void desafio4(){
        System.out.println("Desafio 04");
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[4];
        double[] Notas1Bim = new double[4];
        double[] Notas2Bim = new double[4];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.nextLine();

            System.out.println("Digite a nota do 1º Bimestre " + (i + 1) + ": ");
            Notas1Bim[i] = sc.nextDouble();

            System.out.println("Digite a nota do 2º Bimestre " + (i + 1) + ": ");
            Notas2Bim[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Resultado:");
        for(int i = 0; i < alunos.length; i++){
            double media = (Notas1Bim[i] + Notas2Bim[i]) / 2;
            String status;

            if (media >= 6){
                status = "Aprovado";
            } else if (media >= 4) {
                status = "Recuperação";
            } else {
                status = "Reprovado";
            }

            System.out.printf("Aluno: %s | Média: %.2f | Status: %s%n", alunos[i], media, status);
        }
        sc.close();
    }

    public void desafio5(){
        System.out.println("Desafio 5");
        Scanner sc = new Scanner(System.in);

        String[][] funcionario = new String[4][3];

        for (int i = 0; i < funcionario.length; i++) {
            System.out.println("Nome: " );
            funcionario[i][0] = sc.nextLine();

            System.out.println("Cargo: ");
            funcionario[i][1] = sc.nextLine();

            System.out.println("Salário: ");
            funcionario[i][2] = sc.nextLine();
        }
        System.out.println("Dados:");
        for (int i = 0; i < funcionario.length; i++) {
            System.out.println("Nome: " + funcionario[i][0] + ", Cargo: " + funcionario[i][1] + ", Salário: " + funcionario[i][2]);
        }
        sc.close();
    }

    public void ordenarArray(){
        double[] numeros = {5,3,8,1,2};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    public void desafio7(){
        System.out.println("Desafio 7");
        Scanner sc = new Scanner(System.in);

        String[] nomeCidade = new String[4];

        for (int i = 0; i < nomeCidade.length; i++) {
            System.out.println("Digite o nome do cidade " + (i + 1) + ": ");
            nomeCidade[i] = sc.nextLine();
        }

        Arrays.sort(nomeCidade);
        System.out.println("Ordem alfabetica: ");
        for (String cidade : nomeCidade) {
            System.out.println(cidade);
        }

        String[] cidadesInvertidas = new String[nomeCidade.length];
        for (int i = 0; i < nomeCidade.length; i++) {
            cidadesInvertidas[i] = nomeCidade[nomeCidade.length - 1 - i];
        }


        System.out.println("Cidades invertidas:");
        for (String cidade : cidadesInvertidas) {
            System.out.println(cidade);
        }
        sc.close();
    }

    public int desafio8(String nomeFuncionario) {
        System.out.println("Desafio 08");
        String[] funcionarios = {"Jose", "Juliano", "Luiz", "Ana"};


        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].equalsIgnoreCase(nomeFuncionario)) {
                return i;
            }
        }
        return -1;
    }
}
