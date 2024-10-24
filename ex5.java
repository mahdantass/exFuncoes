//Nome: Marcella Dantas Silva Souza; RA: 1143058002; Curso: Analise e desenvolvimento de sistemas; Turno: Manhã
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Digite um número entre 1 e 7");
	    int diaSemanaEntrada = entrada.nextInt();
	    System.out.println(exibirDiaSemana(diaSemanaEntrada));
	}
	
	public static String exibirDiaSemana(int diaSemana){
	    switch(diaSemana){
	        case 1: 
	            return "Domingo";
	        case 2:
	            return "Segunda-feira";
	        case 3:
	            return "Terça-feira";
	        case 4: 
	            return "Quarta-feira";
	        case 5:
	            return"Quinta-feira";
	        case 6:
	            return "Sexta-feira";
	        case 7:
	            return "Sábado";
	        default:
	            return "Dia da semana inválido";
	       
	    }
	    
	}
}