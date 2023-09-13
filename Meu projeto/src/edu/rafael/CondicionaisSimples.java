package edu.rafael;

public class CondicionaisSimples {
    public static void main(String[] args) {
       double nota = 5;
        String resultado = "";

       if(nota >= 7.0){

        resultado = "Aprovado";
       }
       else if(nota >= 5.0 && nota <=6.0){
        resultado = "Recuperacão";
       }
       else {
        resultado = "Reprovado";
       }
       System.out.println(resultado);
    }
}
