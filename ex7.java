//Nome: Marcella Dantas Silva Souza; RA: 1143058002; Curso: Analise e desenvolvimento de sistemas; Turno: Manhã
import java.util.Scanner;

public class Main
{
	public static void main(String[] args){
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Digite um número inteiro");
	    int numeroFatorial = entrada.nextInt();
	    System.out.println("O fatorial do número é: " + calcularFatorial(numeroFatorial));
	} 
	
	public static int calcularFatorial(int numeroEntrada){
	    int valorTotal = 1;
	    for(int i = 1; i <= numeroEntrada; i++){
	        valorTotal = valorTotal * i;  
	    }
	    
	    return valorTotal;
	}
}