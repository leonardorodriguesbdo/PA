import java.util.*;
public class Fumante{
      public static void main(String[] args){
            //declaração das variáveis
	    int anos; //guarda o total de anos como fumante
            int nr_cigarro_dia; //guarda a quantidade de cigarros fumado por dia
            float valor_carteira; //guarda o valor de uma carteira
            float valor_total_gasto; //guarda o valor total gasto com cigarro
	
            //inicializa a classe scanner para capturar informações do teclado
            Scanner entrada= new Scanner(System.in); 

            //Imprimir na tela a pergunta
	    System.out.println("quantos anos como fumante?");
            //atribuir a variável anos o valor digitado pelo usuário
            anos = entrada.nextInt();
            System.out.println("quantos cigarros vc fuma por dia?");
            //atribuir a variável nr_cigarro_dia o valor digitado pelo usuário
            nr_cigarro_dia = entrada.nextInt();
            System.out.println("Qual o valor da carteira de cigarro?");
            //atribuir a variável valor_carteira o valor digitado pelo usuário
            valor_carteira = entrada.nextFloat();
            
            int total_dias = anos * 365; //calcula a quantidade de dias fumados e guarda numa nova variável total_dias
            int total_cig_dia = total_dias * nr_cigarro_dia; //calcula o total de cigarros fumado ao logo dos anos e guarda na variável total_cig_dia
            float total_cart_fumada = total_cig_dia/20; //calcula o total de carteiras fumadas
            
            //imprime na tela o resultado 
            System.out.println("Você gastou em reias: " + (total_cart_fumada * valor_carteira));

      }

}
