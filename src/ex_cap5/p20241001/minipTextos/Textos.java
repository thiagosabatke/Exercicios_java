package ex_cap5.p20241001.minipTextos;

public class Textos {
    String Texto;

    public int verificarComprimento(String Texto){
        int comprimentoTexto;
        this.Texto = Texto;
        comprimentoTexto = Texto.length();
        return comprimentoTexto;
    }

    public boolean compararStrings(String T1, String T2){
        boolean R;
        R = T1.equals(T2);
        return R;
    }

    public String concatenarTextos(String T1, String T2){
        String Result;
        T1 = T1.concat(" ");
        Result = T1.concat(T2);
        return Result;
    }

    public void acessaCaracteres(String Texto, char x){
        int contador = 0;
        for (int i = 0; i < Texto.length(); i++){
            char letra = Texto.charAt(i);
            if (letra == x){
                contador++;
            }
            System.out.println(letra);
        }
    }
}

