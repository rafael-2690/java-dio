package edu.rafael.projetoBanco;

public class Banco {
    double valor = 2452.56;

    public void Depositar(int deposito){
        valor = valor + deposito;
    }
    public void Sacar(int sacado){
        if(sacado<valor){
            valor = valor - sacado;
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
}
