package pacote_SF;

import java.util.List;

public interface InterfaceSF {
	
	/*
		Vai servir para inserir a raiz
		
		O parâmetro "m" significa o tamanho, em x bytes, do espaço do disco a alocar
	 */
	public NoSistema SistemaFicheiros(int m);
	
	/*
	 Criação de um diretório na raiz
	 
	 O parâmetro "nome" significa o nome que a diretoria(pasta) vai receber
	 */
	public NoSistema Criardiretoria(String[] nome);
	
	/*
	 Criação do ficheiro 
	 
	 parametro "caminho" para indicar qual é o caminho onde vai parar o ficheiro 
	 (assumitos que é um caminho absoluto)
	 
	 parametro "nome" para indicar o nome do ficheiro
	 
	 parametro "k" para indicar o tamanho do ficheiro a criar (em KB)
	 
	 parametro "texto" para escrever o texto dentro do ficheiro
	  
	 */
	public NoSistema Criarficheiro(String[] caminho, String nome, int k, String texto);
	
	/*
	 Fazer a listagem das diretorias e ficheiros indicando o caminho da diretoria 
	 returnando assim uma lista de forma ordenada
	 
	 parametro "caminho" indica o caminho que o utilizador quer ver para fazer a listagem
	 
	 */
	public List<String> listar(String[] caminho);
	
	/*
	 Eliminar um ficheiro
	 
	  parametro "nome" para indicar o caminho absoluto para o nome do ficheiro e eliminar de seguida
	  Retorna null se o ficheiro indicado pelo utilizador  não existir
	 
	 */
	
	public NoSistema removerfich(String[] nome);
	
	/*
	 Eliminar um diretorio
	 
	  parametro "nome" para indicar o caminho absoluto para o nome do diretório e 
	  eliminar se a diretória(pasta) estiver nula, ou seja, retorna null se a pasta estiver vazia.
	  Retorna uma exceção se a pasta não estiver vazia
	  
	  
	 */
	
	public NoSistema removerpasta(String[] nome);
	
	/*
	 Mostrar o contéudo de um ficheiro 
	 
	  parametro "caminho" para indicar o caminho onde está o ficheiro
	  parametro "nomeFicheiro" para indicar qual é o ficheiro a mostrar o seu conteúdo
	
	 */
	
	public NoSistema catFicheiro(String[] caminho, String nomeficheiro);
	

}
