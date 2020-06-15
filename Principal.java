package pacote_SF;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceSF sf = new Sistema_Ficheiros();
		 
		/*
		 Serviu para criar diretorias 
		 
		 */
		System.out.println( sf.criarDiretoria("/cteste"));
		 
		 System.out.println( sf.criarDiretoria("/cteste/utilizador1/utilizador4"));
	        
		 System.out.println( sf.criarDiretoria("/cteste/utilizador2/utilizador3"));
		 
		 System.out.println( sf.criarDiretoria("/cteste/utilizador5"));
		 
		 
		
			/*
		 Serviu para criar ficheiros 
		 
		 */
		 sf.criarFicheiro("/cteste", "teste.txt", "Teste de verificar o conteudo do texto!!");
		 
		 sf.criarFicheiro("/cteste/utilizador1/utilizador4", "teste2.txt", "2º teste para verificar se o cat vai buscar informação a este ficheiro");
		 
		 
			/*
		 Serviu para ver o conteudo dos ficheiros
		 
		 */
		 
		 System.out.println(sf.catFicheiro("/cteste", "teste.txt"));
		 
		 System.out.println(sf.catFicheiro("/cteste/utilizador1/utilizador4", "teste2.txt"));
		 
		 
			/*
		 Serviu para fazer a listagem
		 
		 */
		 System.out.println(sf.listar("/cteste/utilizador1/utilizador4"));
		 
			/*
		 Serviu para acrescentar mais conteúdo ao ficheiro já existente
		 
		 */
		 sf.acrescentarFicheiro("/cteste/utilizador1/utilizador4", "teste2.txt", " Teste para verificar se acrescentou este texto ao ficheiro teste2.txt");
		 
			/*
		 Serviu para verificar o conteúdo adicional tinha sido implementado corretamente
		 
		 */
		 System.out.println(sf.catFicheiro("/cteste/utilizador1/utilizador4", "teste2.txt"));
		 
			/*
		 Serviu para fazer a listagem da raiz
		 
		 */
		
		 System.out.println(sf.listar("/cteste"));
	
	}

}
