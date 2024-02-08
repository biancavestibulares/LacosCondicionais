package aula3;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício 3 - Lista condicional IF
		
		//Variáveis
		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao;
		Scanner leia = new Scanner(System.in);
		
		//Recebendo os valores das variáveis
		System.out.println("Digite seu nome: ");
		nomeDoador = leia.next();
		System.out.println("Digite sua idade: ");
		idadeDoador = leia.nextInt();
		System.out.println("Essa é a sua primeira vez doando sangue? Responda com 'true' para sim ou 'false' para não: ");
		primeiraDoacao = leia.nextBoolean();
		
		//Execução do método IF
		if((idadeDoador >= 18 && idadeDoador <= 69) && ((!(primeiraDoacao)) || idadeDoador < 60)) { //(!(primeiraDoacao)) vai inverter o valor do boolean!
		//Recebemos ele como um true, mas o doador com +60 só doa se for false! Por isso o uso do !
			System.out.println(nomeDoador + " está apto(a/e) para doar sangue!");
		} else {
			System.out.println(nomeDoador + " não está apto(a/e) para doar sangue!");
		}

	}

}
