package pacote_SF;

import java.util.List;

public interface InterfaceSF {
	
	/*
		Vai servir para  inserir a raiz
		
		
	 */
	public void SistemaFicheiros();
	
	/*
	 Realiza uma pesquisa pela diret�ria  e returna
	 uma referencia para a diret�ria se existir ou nulo se n�o existir
	 
	 */
	//public NoSistema Pesquisadiretoria(String nomepasta);
	
	/*
	 Cria��o de uma diret�ria e verifica se criou a diret�ria ou n�o
	 
	 O par�metro "caminho" significa o nome que a diretoria(pasta) vai receber
	 
	 */
	
	
	public boolean Criardiretoria(String caminho);
	
	/*
	 Cria��o do ficheiro 
	 
	 parametro "caminho" para indicar qual � o caminho onde vai parar o ficheiro 
	 (assumitos que � um caminho absoluto)
	 
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
	public List<String> listar(String caminho);
	
	/*
	 Eliminar um ficheiro
	 
	  parametro "nome" para indicar o caminho absoluto para o nome do ficheiro e eliminar de seguida
	  Retorna null se o ficheiro indicado pelo utilizador  n�o existir
	 
	 */
	
	public NoSistema removerfich(String[] nome);
	
	/*
	 Eliminar uma pasta
	 
	  parametro "nome" para indicar o caminho absoluto para o nome do diret�rio e 
	  eliminar se a diret�ria(pasta) estiver nula, ou seja, retorna null se a pasta estiver vazia.
	  Retorna uma exce��o se a pasta n�o estiver vazia
	  
	  
	 */
	
	public NoSistema removerpasta(String[] nome);
	
	/*
	 Mostrar o cont�udo de um ficheiro 
	 
	  parametro "caminho" para indicar o caminho onde est� o ficheiro
	  parametro "nomeFicheiro" para indicar qual � o ficheiro a mostrar o seu conte�do
	
	 */
	
	public NoSistema catFicheiro(String caminho, String nomeficheiro);
	
	/*Acrescenta mais conteudo ao ficheiro original*/
	public NoSistema acrescentarficheiro(String caminho, String nomeficheiro, String conteudo);

	
}
