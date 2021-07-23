package exemplosjava;
import java.util.*;
/**
 * @author Leonardo
 * Escreva um programa em java, que gere um número aleatório de 0 a 99
 * (este número não pode ser visualizado pelo usuário) e permita ao usuário digitar um número 
 * até acertar o valor gerado:
 */
public class Repeticao2 {
    public static void main(String[] args){
        
        //inicializa o gerador de nr aleatório
        Random rnd = new Random();
        int x = rnd.nextInt(99); //gera o nr. aleatório
        
        //inicializa a classe scanner para capturar informações do teclado
        Scanner entrada= new Scanner(System.in); 
        //Utilizando o laço for para interagir sempre com o usuário        
        while(true){
            System.out.print("Entre com um valor de 0 a 99 : ");
            int n = entrada.nextInt();
            
            if (n == x){//se o nr digitado for igual ao gerado
                System.out.println("Parabens! Você acertou...");
                break;  //interrompe a repetição
            }else if (n < x){//se o nr digitado for menor que o gerado
                System.out.println("Digite um valor MAIOR");
            }else{//se o nr for maior que o gerado
                System.out.println("Digite um valor MENOR");
            }
        }
    }
}
