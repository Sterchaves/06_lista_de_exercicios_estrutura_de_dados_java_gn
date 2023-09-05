package lista_de_exercicio_estrutura_de_dados;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Atividade2_Pilha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int number;
		String name;
		
		while(true) {
            System.out.println("\n1. Adicionar um novo livro na pilha. Deve solicitar o nome do livro.");
            System.out.println("\n2. Listar todos os livros da Pilha");
            System.out.println("\n3. Retirar um livro da pilha");
            System.out.println("\n0. O programa deve ser finalizado");
            
			System.out.println("\nEntre com a opção desejada: ");
			number = scanner.nextInt();		
			scanner.nextLine();
			
			switch(number) {
			case 0:
				System.out.println("\nPrograma finalizado!");
				break
				;
			case 1:
				System.out.println("\nDigite o nome: ");
				name = scanner.nextLine();
				pilha.add(name);
				System.out.println("\nPilha: " + pilha);
				System.out.println("\nLivro adicionado");
				break;
			
			case 2:
                if (pilha.isEmpty()) {
                    System.out.println("\nA Pilha está vazia.");
                } else {
                    System.out.println("\nLista de Livros na Pilha: " + pilha);
                }
				break;
			
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia.");
				}else {	
					System.out.println("\nPilha: " + pilha.remove(0));
					System.out.println("\nUm Livro foi retirado da pilha!");
				}		
				break;
				
			default:
                System.out.println("\nOpção inválida. Tente novamente.");
			}
	
		}
	}
}
