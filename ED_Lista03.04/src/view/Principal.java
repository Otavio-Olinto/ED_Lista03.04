/*
 *  Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número 
inteiro, converta para binário. Entrada limitada a 2000. 
 */

package view;

import java.util.Scanner;
import controller.Binario;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe Binario
		Binario metodo = new Binario();
		
		// Criando o método de leitura com o Scanner
		Scanner ler = new Scanner(System.in);
		
		int num = -1;
		
		do {
			System.out.print("Qual número deseja converter para binário (de 0 a 2000): ");
			num = Integer.parseInt(ler.nextLine());
		}while(num<0 || num>2000);
		
		System.out.println("O número "+num+" em binário é: "+metodo.converter(num));
		
		ler.close();

	}

}
