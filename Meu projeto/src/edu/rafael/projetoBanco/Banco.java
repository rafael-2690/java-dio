package edu.rafael.projetoBanco;

public class Banco {
    double valor = 2452.56;

    public void Depositar(double deposito){
        valor = valor + deposito;
    }
    public void Sacar(double sacado){
        if(sacado<valor){
            valor = valor - sacado;
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void Imprimir(){
        System.out.println(valor);
    }
    
}
