package atividade_pilha;

import java.util.Scanner;

public class Aplicativo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PilhaAcao pilha = new PilhaAcao();
		
		while (true) {
			
			System.out.println("========================================");
			System.out.println("1 - Adicionar Número Inteiro");
			System.out.println("2 - Remover Número Recente");
			System.out.println("3 - Exibir Números");
			System.out.println("4 - 'Desfazer' Ação (Remover até 16 números)");
			System.out.println("0 - Sair");
			System.out.print("-> ");
			Scanner inputOpcao = new Scanner(System.in);
			int opcao = inputOpcao.nextInt();
			
			if (opcao == 0) {
				System.out.println("Até mais.");
				break;
			} else if (opcao == 1) {
				System.out.print("Insira o número que deseja adicionar: ");
				int adicionarNumero = input.nextInt();
				pilha.push(adicionarNumero);
			} else if (opcao == 2) {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
			    } else {
			    	System.out.print("Número removido: ");
			        int removerNumero = pilha.pop();
			        System.out.println(removerNumero);
			    }
			} else if (opcao == 3) {
				if (pilha.isEmpty()) {
			        System.out.println("A pilha está vazia");
			    } else {
			        System.out.println("Números dentro da pilha:");
			        for (int i = pilha.size() - 1; i >= 0; i--) {
			            int numeros = pilha.get(i);
			            System.out.println(numeros);
			        }
			    }
			} else if (opcao == 4) {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else if (pilha.size() < 16) {
					pilha.clear();
				} else {
					int desfazerQuantidade = 16;
					int contagem = 0;
					
					 while (!pilha.isEmpty() && contagem < desfazerQuantidade) {
				            int numero = pilha.pop();
				            contagem++;
				        }
					 
				}
				
			} else {
				System.out.println("Opção inválida, por favor, insira uma opção válida");
			}
			
		}
	}

}
