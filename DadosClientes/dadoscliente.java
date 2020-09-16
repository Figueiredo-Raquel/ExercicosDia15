package DadosClientes;

public class dadoscliente {
	
	
	/*Crie uma classe cliente e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto cliente, 
	 * defina as instancias deste objeto e apresente as informações 
	 * deste objeto no console.*/
	

	public String nomeCliente;
	public int idadeCliente;
	public char sexoCliente;
    
	public void mostraSexo()
	{
		if(sexoCliente == 'M') 
		{
		System.out.printf("Cliente do sexo %c :",sexoCliente);
	
		}
		else if(sexoCliente == 'F') 
		{
			System.out.printf("Cliente do sexo %c :",sexoCliente);
		}
	}
	
		public void mostraidadeCliente()
		{
			if(sexoCliente=='M') 
			{
				System.out.printf("O cliente tem %d anos:",idadeCliente);
			}
			else if(sexoCliente=='F')
			{
				System.out.printf("A cliente tem %d anos :",idadeCliente);
			}
		}
	}
	
	
