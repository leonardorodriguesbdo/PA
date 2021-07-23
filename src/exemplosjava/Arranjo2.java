package exemplosjava;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Leonardo
 * Implemente um programa que crie uma lista de arrays que guarde nomes de alunos da turma. 
 * Ao executar o programa será pedido o nome do aluno e este deve ser checado se existe no array 
 * emitindo uma mensagem de sucesso ou falha. 
 */
public class Arranjo2 {
    public static void main(String[] args){
        //Inicializa o arrays com os nomes da turma
        String[] nomes = {"Jaime","Marcos","Ruth","Ivan","Emilly","Raiana",
                            "Leila","Débora","Éric","Adriano"};
        
        //inicializo a variavel como se o nome não existisse;
        String msg = "FALHA";
        
        //inicializa a classe scanner para capturar informações do teclado
        Scanner entrada= new Scanner(System.in); 
        System.out.print("Entre com seu nome: ");
        String n = entrada.nextLine();  //guarda na var. n o nome digitado pelo usuário

        //Pesquisa no array até encontrar (Foreach)
        for(String nome: nomes){
            //checa se o nome que vem do vetor nomes é igual 
            //o nome digitado guardado na variável n
            if (nome.equals(n)){ 
                msg = "Sucesso"; //altera a mensagem de FALHA para SUCESSO
                break; //sai da repetição se achar o nome
            }
        }
        //imprime a mensagem
        System.out.println("Mensagem: " + msg);
    }
}
