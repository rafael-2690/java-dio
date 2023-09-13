package edu.rafael;

public class SwitchCase {
    public static void main(String[] args) {
        String tamanho = "P";
        String resutaldo = "";

        switch (tamanho){
            case "P":{
                resutaldo = "Pequeno";
                break;
            }
            case "M":{
                resutaldo = "Médio";
                break;
            }
            case "G":{
                resutaldo = "Grande";
                break;
            }
            default:{
                resutaldo = "indefinido";
            }
         }
       System.out.println("Seu tamanho é " + resutaldo);
        }     
    }
