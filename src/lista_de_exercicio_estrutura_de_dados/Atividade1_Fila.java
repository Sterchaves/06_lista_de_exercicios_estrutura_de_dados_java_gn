package lista_de_exercicio_estrutura_de_dados;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1_Fila {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int number;
		String name;
		
		while(true) {
            System.out.println("1. Adicionar pessoa à fila");
            System.out.println("2. Listar pessoas na fila");
            System.out.println("3. Remover pessoa da fila");
            System.out.println("0. Sair");
            
			System.out.println("Entre com a opção desejada: ");
			number = scanner.nextInt();		
			scanner.nextLine();
			
			switch(number) {
			case 0:
				System.out.println("Programa finalizado!");
				break
				;
			case 1:
				System.out.println("\nDigite o nome: ");
				name = scanner.nextLine();
				fila.add(name);
				System.out.println("Cliente Adicionado");
				break;
			
			case 2:
                if (fila.isEmpty()) {
                    System.out.println("A fila está vazia.");
                } else {
                    System.out.println("Pessoas na fila: " + fila);
                }
				break;
			
			case 3:
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia");
				}else {	
					System.out.println("Pessoas na fila: " + fila.remove());
				}		
				break;
				
			default:
                System.out.println("Opção inválida. Tente novamente.");
			}
	
		}
}
}
