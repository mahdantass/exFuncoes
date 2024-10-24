//Nome: Marcella Dantas Silva Souza; RA: 1143058002; Curso: Analise e desenvolvimento de sistemas; Turno: Manhã
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int[] vetorNumeros = new int[5];
	    for(int i = 0; i < 5; i++){
	        System.out.println("Digite o valor nº " + (i + 1));
	        vetorNumeros[i] = entrada.nextInt();
	    }
	    
	    System.out.println("Este é o maior valor: " + obterMaximo(vetorNumeros));
	    System.out.println("Este é o menor valor: " + obterMinimo(vetorNumeros));
	    System.out.println("Este é o resultado: " + divisao(vetorNumeros));
	}
	public static int obterMaximo(int[] vetorNumerosMaximo){
	    int maior = 0;
	    for(int i = 0; i < 5; i++){
	        if(vetorNumerosMaximo[i] > maior){
	            maior = vetorNumerosMaximo[i];
	        }
	    }
	
	    return maior;
	}
	
	public static int obterMinimo(int[] vetorNumerosMinimo){
	    int menor = Integer.MAX_VALUE;
	    for(int i = 0; i < 5; i++){
	        if(vetorNumerosMinimo[i] < menor){
	            menor = vetorNumerosMinimo[i];
	        }
	    }
	
	    return menor;
	}

	public static double divisao(int[] vetorNumerosDivisao){
	   int maximo = obterMaximo(vetorNumerosDivisao); 
	   int minimo = obterMinimo(vetorNumerosDivisao);
	   return (maximo + minimo)/2;
	   
	}
}
