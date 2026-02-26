package controller;

public class Binario {

	public Binario() {
		super();
	}
	
	public String converter(int num) {
		
		String valor="0";
		
		// Por se tratar de número binários(0 ou 1), a condição de parada será quando o número 
		// trbalhado ser menor que 2.
		if(num<2) {
			valor=Integer.toString(num);
			return valor;
		}
		
		valor=Integer.toString(num%2);
		
		// Para converter um inteiro para binário é feito a divisão por 2 e pegamos o resto
		// E seguindo este padrão até termos um número menor que 2. Portanto não necessitamos
		// Da parte fracionária, já que foi adcionada em "valor" anteriormente.
		// A conversão considera o último valor como mais significativo
		// Logo a ordem deve ser como a última chamada da função como prioritária
		return converter(num/2)+valor;
	}

}
