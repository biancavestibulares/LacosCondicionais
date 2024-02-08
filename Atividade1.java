package aula3;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício 2 - Lista condicional IF
		
		//Variáveis
		int numero;
		Scanner leia = new Scanner(System.in);
		
		//Recebendo o valor da variável 'numero'
		System.out.println("Digite um número: ");
		numero = leia.nextInt(); //Define o número escrito como valor da variável
		
		//Execução do método IF
		if((numero >= 0) && (numero % 2 == 0)) { //% calcula o resto da divisão, e não o resultado
			System.out.println("O número " + numero + " é par e positivo!");
		} else if((numero < 0) && (numero % 2 == 0)) {
			System.out.println("O número " + numero + " é par e negativo!");
		} else if((numero >= 0) && (numero % 2 == 1)) {
			System.out.println("O número " + numero + " é ímpar e positivo!");
		} else {
			System.out.println("O número " + numero + " é ímpar e negativo!");
		}

	}

}
