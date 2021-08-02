/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosjava;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Calculadora {
    public static void main(String[] args){
        int opcao;  //guarda a opção digitada pelo usuario
        double valor1, valor2; //guarda os valores digitados pelo usuário
        Scanner ent = new Scanner(System.in);        
        //Mantém o programa em repetição até que seja digitado o numero 9
        do{
            opcao = MostraMenu(); //Exibe o menu da calculadora e a operação a ser executada
            if(opcao != 9){ //Opção para finalizar o programa
                //Determina qual operação será realizada
                switch(opcao){
                    case 1:
                        System.out.print("Digite um valor 1: ");
                        valor1 = ent.nextDouble();
                        System.out.print("Digite um valor 2: ");
                        valor2 = ent.nextDouble();
                        System.out.println("O resultado da soma é: " + soma(valor1, valor2));
                    break;
                    case 2:
                        System.out.print("Digite um valor 1: ");
                        valor1 = ent.nextDouble();
                        System.out.print("Digite um valor 2: ");
                        valor2 = ent.nextDouble();
                        System.out.println("O resultado da subtração é: " + subtracao(valor1, valor2));
                    break;
                    case 3:
                        System.out.print("Digite um valor 1: ");
                        valor1 = ent.nextDouble();
                        System.out.print("Digite um valor 2: ");
                        valor2 = ent.nextDouble();
                        System.out.println("O resultado da multiplicação é: " + multiplicacao(valor1, valor2));
                    break;
                    case 4:
                        System.out.print("Digite um valor 1: ");
                        valor1 = ent.nextDouble();
                        System.out.print("Digite um valor 2: ");
                        valor2 = ent.nextDouble();
                        System.out.println("O resultado da divisão é: " + divisao(valor1, valor2));
                    break;
                    default:
                        System.out.println("Desconhecido");
                    break;
                }
            }else{
                System.out.println("Programa finalizando!!!");    
            }
        }while(opcao != 9);
    }
    
    public static int MostraMenu(){  
        Scanner menu = new Scanner(System.in);
        System.out.println("#######################################");
        System.out.println("#####   Calculadora Eng. Minas    #####");
        System.out.println("#######################################"); 
        System.out.println("# 1 - Somar                           #");
        System.out.println("# 2 - Subtrair                        #");
        System.out.println("# 3 - Multiplicar                     #");
        System.out.println("# 4 - Dividir                         #");
        System.out.println("# 9 - Sair                            #");
        System.out.println("#######################################"); 
        System.out.print("Opção: ");
        return Integer.parseInt(menu.nextLine());
    }
    
    //Executa a soma e retorna o resultado. A função recebe como parametro 
    //os dois valores digitados pelo usuário
    public static double soma(double v1, double v2){
        return v1 + v2;
    }
    //Executa a subtração e retorna o resultado. A função recebe como parametro 
    //os dois valores digitados pelo usuário
    public static double subtracao(double v1, double v2){
        return v1 - v2;
    }
    //Executa a multiplicação e retorna o resultado. A função recebe como parametro 
    //os dois valores digitados pelo usuário
    public static double multiplicacao(double v1, double v2){
        return v1 * v2;
    }
    //Executa a divisão e retorna o resultado. A função recebe como parametro 
    //os dois valores digitados pelo usuário
    public static double divisao(double v1, double v2){
        return v1 / v2;
    }
}
