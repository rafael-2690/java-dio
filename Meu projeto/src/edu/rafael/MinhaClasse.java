package edu.rafael;
public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Rafael";
        String segundoNome = " Pereira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Nome do: " + primeiroNome + segundoNome;
    }
}
