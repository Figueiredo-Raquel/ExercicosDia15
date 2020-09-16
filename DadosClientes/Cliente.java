package DadosClientes;


import java.util.Locale;
import java.util.Scanner;

public class Cliente {
	
	/*Crie uma classe cliente e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto cliente, 
	 * defina as instancias deste objeto e apresente as informações 
	 * deste objeto no console.*/

	public static void main (String args[]) {
	 
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		dadoscliente cliente = new dadoscliente();
		
		
		System.out.println("Digite seu nome: ");
		cliente.nomeCliente=ler.next().toUpperCase();
		ler.nextLine();
		System.out.println("Digite a sua idade: ");
		cliente.idadeCliente=ler.nextInt();
		ler.nextLine();
		System.out.println("Digite o seu sexo [M] ou [F]: ");
		cliente.sexoCliente=ler.next().charAt(0);
		ler.nextLine();
		
		cliente.mostraidadeCliente();
		cliente.mostraSexo();
		
		
		
	ler.close();	
	}
}
