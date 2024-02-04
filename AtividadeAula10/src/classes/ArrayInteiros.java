package classes;

import java.util.ArrayList;

/*Pensar & Responder
Sabemos que existem algumas maneiras de armazenar uma coleção de objetos e existem várias classes do Java Collections Framework,
que armazenam esses objetos, entre elas a classe ArrayList. Diante disso, desenvolva uma classe em Java que cria uma lista de números inteiros,
recebe os números digitados pelo usuário e ao final, mostra os números armazenados e a soma total desses números.*/

import java.util.Scanner;

public class ArrayInteiros {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Instancia um objeto da classe Scanner para receber valores digitados pelo usuário
		Scanner tec = new Scanner(System.in);
		
		// Tratamento de erros caso o usuário não digite um número
		try {

			// Solicita ao usuário a quantidade de números que ele deseja somar
			System.out.print("Quantos números você quer somar?");

			// Recebe o valor digitado como string para evitar bugs na execução da aplicação
			String quantidadeNumeros = tec.nextLine();

			// Converte o valor digitado em Int
			int n = Integer.parseInt(quantidadeNumeros);

			for (int i = 0; i < n; i++) {
				
				// Tratamento de erros caso o usuário não digite um número
				try {
					
					// Solicita ao usuaário que digite um número
					System.out.print("Digite o " + (i + 1) + "º número: ");
					numeros.add(tec.nextInt());
					
					// Em caso de erros retorna uma informação sobre o erro tratado para o usuário
				} catch (Exception e) {
					System.out.println("Você não digitou um número válido, rode a aplicação novamente!");
					System.exit(0);
				}

			}
			// Encerra a instância de tec
			tec.close();
			
		// Em caso de erros retorna uma informação sobre o erro tratado para o usuário
		} catch (Exception e) {
			System.out.println("Você não digitou um número válido, rode a aplicação novamente!");
			System.exit(0);
		}

		// Processamento de dados, retorna a lista de valores digitigados e armazenados na lista e faz a soma dos mesmos
		int soma = 0;
		for (int i : numeros) {
			System.out.println(i);
			soma += i;
		}
		System.out.println("A soma dos números digitados é: " + soma);

	}

}
