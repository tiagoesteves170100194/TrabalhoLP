package pacote_SF;

import java.util.List;

public interface InterfaceSF {
	
	/*
		Vai servir para  inserir a raiz
		
		
	 */
	public void SistemaFicheiros();
	
	/*
	 Realiza uma pesquisa pela diretória  e returna
	 uma referencia para a diretória se existir ou nulo se não existir
	 
	 */
	//public NoSistema Pesquisadiretoria(String nomepasta);
	
	/*
	 Criação de uma diretória e verifica se criou a diretória ou não
	 
	 O parâmetro "caminho" significa o nome que a diretoria(pasta) vai receber
	 
	 */
	
	
	public boolean Criardiretoria(String caminho);
	
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
	public List<String> listar(String caminho);
	
	/*
	 Eliminar um ficheiro
	 
	  parametro "nome" para indicar o caminho absoluto para o nome do ficheiro e eliminar de seguida
	  Retorna null se o ficheiro indicado pelo utilizador  não existir
	 
	 */
	
	public NoSistema removerfich(String[] nome);
	
	/*
	 Eliminar uma pasta
	 
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
	
	public NoSistema catFicheiro(String caminho, String nomeficheiro);
	
	/*Acrescenta mais conteudo ao ficheiro original*/
	public NoSistema acrescentarficheiro(String caminho, String nomeficheiro, String conteudo);

	
}
