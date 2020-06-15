package pacote_SF;

import java.util.List;

public interface InterfaceSF {
	

	
	/*
	 Cria��o de uma diretoria e verifica se criou a diretoria ou n�o
	 (Assumimos que tem de ter um caminho absoluto e � Case sensitive)
	 
	 O par�metro "caminho" significa o caminho onde a diretoria vai ser inserida na �rvore
	 
	 */
	public boolean criarDiretoria(String caminho);
	
	/*
	 Cria��o do ficheiro
	 (Assumimos que tem de ter um caminho absoluto e � Case sensitive) 
	 
	 par�metro "caminho" para indicar qual � o caminho onde vai parar o ficheiro 
	 
	 par�metro "nomeficheiro" para indicar o nome do ficheiro
	 
	 par�metro "conteudo" para escrever o texto dentro do ficheiro
	  
	 */
	public void criarFicheiro(String caminho, String nomeficheiro, String conteudo);
	
	/*
	 Faz a listagem das diretorias e ficheiros indicando o caminho da pr�pria diretoria 
	 retornando assim uma lista de forma ordenada
	 (Assumimos que tem de ter um caminho absoluto e � Case sensitive)
	 
	 par�metro "caminho" indica qual o caminho que o utilizador quer percorrer para fazer a listagem das diretorias 
	 
	 */
	public List<String> listar(String caminho);
	

	
	/*
	 Mostrar o conte�do de um ficheiro 
	 (Assumimos que tem de ter um caminho absoluto e � Case sensitive)
	 
	 par�metro "caminho" para indicar o caminho onde se encontra o ficheiro
	  par�metro "nomeficheiro" para indicar qual � o ficheiro para mostrar o seu conte�do
	  
	
	 */
	
	public String catFicheiro(String caminho, String nomeficheiro);
	
	/*
	 Acrescenta mais conte�do ao pr�prio ficheiro que j� continha um conte�do original ou n�o 
	 (Assumimos que tem de ter um caminho absoluto e � Case sensitive)
	   
	   par�metro "caminho" para indicar o caminho onde est� o ficheiro
	   par�metro "nomeficheiro" para indicar qual � o nome do ficheiro para mostrar o seu conte�do
	   par�metro "conteudo" para inserir conte�do dentro de um ficheiro existente
	   
	 */
	public void acrescentarFicheiro(String caminho, String nomeficheiro, String conteudo);

	
}