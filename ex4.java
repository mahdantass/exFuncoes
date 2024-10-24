//Nome: Marcella Dantas Silva Souza; RA: 1143058002; Curso: Analise e desenvolvimento de sistemas; Turno: Manhã
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Digite um número inteiro");
	    int numeroInteiroEntrada = entrada.nextInt();
	    
	    if(isPar(numeroInteiroEntrada)){
         System.out.println("Número par");   
        }
        else{
         System.out.println("Número ímpar");    
        }
	    
	  
	}
	
	public static boolean isPar(int numeroInteiro){
        return numeroInteiro%2 == 0;
        
       
	}
}