package edu.rafael;
import java.util.concurrent.ThreadLocalRandom;

public class EstruturasRepeticao {
    public static void main(String[] args) {
    //breack : serve para parar o ciclo.
    //continue : serve para redirecionar o ciclo.

        //String alunos[] = {"Rafael","Phelipe","Marcos","Mariana","Ivan","Manuella"};


        /*for(int x = 0; x <= alunos.length; x++){
            System.out.println("O aluno do indice x = " + x + " é " + alunos[x]);
        }*/

        double mesada = 50.0;

        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce>mesada){
                break;
            }
            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou sua mesada em doces.");

    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
