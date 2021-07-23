package exemplosjava;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Leonardo
 * Aprimore o programa do exercício 2 para permitir que: Caso
 * não exista o nome no array envie uma mensagem na tela e permita a inclusão
 * deste nome. Imprimindo novamente na tela o array. 
 */
public class Arranjo3 {
    public static void main(String[] args){
        //Inicializa o arrays com os nomes da turma
        //Obs.: o array tem posições a mais para guardar os nomes que não existem
        String[] nomes = new String[15];
        nomes[0] = "Jaime";
        nomes[1] = "Marcos";
        nomes[2] = "Ruth";
        nomes[3] = "Ivan";
        nomes[4] = "Emilly";
        nomes[5] = "Raiana";
        nomes[6] = "Leila";
        nomes[7] = "Débora";
        nomes[8] = "Éric";
        nomes[9] = "Adriano";
        
        //inicializa a classe scanner para capturar informações do teclado
        Scanner entrada= new Scanner(System.in); 
        System.out.print("Entre com seu nome: ");
        String n = entrada.nextLine(); //guarda na var. n o nome digitado pelo usuário

        //Pesquisa no array até encontrar
        for(int i=0; i < nomes.length; i++){
            if (nomes[i] != null){ //Evitar o erro de checagem quando o valor o array é nulo
                if (nomes[i].equals(n)){ //checa se o nome que vem do vetor é igual o nome digitado
                    System.out.println("Sucesso. Nome encontrado");
                    break; //sai da repetição
                }
            }else{ //Na primeira posição com valor null o nome é adicionado
                System.out.println("Nome não Encontrado. Ele será adicionado no Array");
                nomes[i] = n;
                break;
            }
        }
        
        //imprime a lista de nomes
        for(String t: nomes){  //foreach
            if (t != null) //tratamento para não imprimir os valores null
                System.out.println("nome  = " + t);
        }
    }
}
