package exemplosjava;
import java.util.*;
/**
 * @author Leonardo
 * Escreva um programa que leia um conjunto de N valores reais
 * e utilizar uma função para exibí-los em ordem inversa à que foi dada.
 */
public class Arranjo5 {
    public static void main(String[] args){
        //Inicializa o arrays com os nomes da turma
        int[] numeros = new int[10];
        int[] inverso = new int[10];
                
        //inicializa a classe scanner para capturar informações do teclado
        Scanner entrada= new Scanner(System.in); 
        for (int i=0; i<numeros.length; i++){
            System.out.print("Entre com o valor " + (i+1) + ": ");
            //guarda no array o valor digitado
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("entrada: " + Arrays.toString(numeros));
        
        for(int x = 0; x < numeros.length; x++){ //percorre todos os elementos do array de entrada
            //preenche o array inverso de traz para frente
            inverso[(numeros.length-1)-x] = numeros[x];
        }
        
        //Imprime o array inverso no formato [1, 2, 3,...]
        String vetor = "[";
        for(int i=0; i<inverso.length; i++){
            if (i==inverso.length-1)
                vetor = vetor + inverso[i] + "]";
            else
                vetor = vetor + inverso[i] + ", ";
        }
        
        System.out.println("Entrada ordenada: " + vetor);
    }
}
