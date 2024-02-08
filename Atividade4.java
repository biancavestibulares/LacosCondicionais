package aula3;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício 3 - Lista condicional SWITCH
		
		//Variáveis
		float num1, num2;
		int operacao;
		Scanner leia = new Scanner(System.in);
		
		//Recebendo os valores das variáveis
		System.out.println("Digite o 1° número: ");
		num1 = leia.nextFloat();
		System.out.println("Digite o 2° número: ");
		num2 = leia.nextFloat();
		
		System.out.println("-- Digite 1 para SOMAR --");
		System.out.println("-- Digite 2 para SUBTRAIR --");
		System.out.println("-- Digite 3 para MULTIPLICAR --");
		System.out.println("-- Digite 4 para DIVIDIR --");
		operacao = leia.nextInt(); //Lendo a opção selecionada
		
		//Criando casos para as operações
		switch (operacao) {
		case 1:
			float soma = (num1 + num2);
			System.out.println(num1 + " + " + num2 + " = " + soma);
			break;
		case 2:
			float subtracao = (num1 - num2);
			System.out.println(num1 + " - " + num2 + " = " + subtracao);
			break;
		case 3:
			float multiplicacao = (num1 * num2);
			System.out.println(num1 + " x " + num2 + " = " + multiplicacao);
			break;
		case 4:
			float divisao = (num1 / num2);
			System.out.println(num1 + " / " + num2 + " = " + divisao);
			break;
		default:
			System.out.println("Opção Inválida! Escolha uma opção entre 1-4");
			break; //Finaliza o SWITCH
		}

	}

}
