import java.util.*;

public class Soma{
     public static void main(String[] args){
        //declaração de variáveis
        int n1, n2, resultado; 
     
        //inicializa a classe scanner para capturar informações do teclado
        Scanner entrada = new Scanner(System.in);
        //Imprimir na tela a pergunta
        System.out.println("Entre com o primeiro valor: ");
        //atribuir a variável n1 o valor digitado pelo usuário
        n1 = entrada.nextInt();
        System.out.println ("Entre com o segundo valor: ");
        n2= entrada.nextInt();

        //calcula a soma ds variáveis
        resultado = n1 + n2;

        //Apresenta na tela o resultado
        System.out.println("A soma dos números é: " + resultado);
     }

}
