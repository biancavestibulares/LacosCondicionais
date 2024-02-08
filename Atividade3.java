package aula3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício 2 - Lista condicional SWITCH
		
		//Variáveis
		String nomeColaborador;
		int codigoCargoColaborador;
		float salario;
		Scanner leia = new Scanner(System.in);
		
		//Recebendo os valores das variáveis
		System.out.println("Digite o nome do colaborador: ");
		nomeColaborador = leia.next();
		System.out.println("Digite o código do colaborador (1-6): ");
		codigoCargoColaborador = leia.nextInt();
		System.out.println("Digite o salário do colaborador: ");
		salario = leia.nextFloat();
		
		//Declarando o reajuste
		float reajuste = 0f; //Inicialmente deve ser 0
		
		//Criando os casos com o método SWITCH
		switch (codigoCargoColaborador) { //O reajuste deve mudar de acordo com o código inserido
		case 1:
			reajuste = 0.10f; //Porcentagem do reajuste 1
			break;
		case 2:
			reajuste = 0.07f; 
			break;
		case 3:
			reajuste = 0.09f; 
			break;
		case 4:
			reajuste = 0.06f; 
			break;
		case 5:
			reajuste = 0.05f; 
			break;
		case 6:
			reajuste = 0.08f; 
			break;
		default:
			System.out.println("Opção Inválida! Escolha uma opção entre 1-6");
			return; //Impede que o código continue a partir daqui em caso de erro
		}
		
		//Agora podemos declarar o salário novo a partir dos 6 casos distintos
		float novoSalario = (salario + (reajuste * salario));
		
		//Saída
		System.out.println("O novo salário é equivalente à: R$" + novoSalario);

	}

}
