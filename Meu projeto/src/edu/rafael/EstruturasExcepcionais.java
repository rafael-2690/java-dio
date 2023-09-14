package edu.rafael;

import java.util.Scanner;

public class EstruturasExcepcionais {
    public static void main(String[] args) {

    try{
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Sua altura é de: " + altura + " cm");


        }catch(java.util.InputMismatchException e){
            System.out.println("A idade e a altura precisam ser digitos.");
        }
    }
}
