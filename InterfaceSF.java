package pacote_SF;

import java.util.List;

public interface InterfaceSF {
	

	
	/*
	 Criação de uma diretoria e verifica se criou a diretoria ou não
	 (Assumimos que tem de ter um caminho absoluto e é Case sensitive)
	 
	 O parâmetro "caminho" significa o caminho onde a diretoria vai ser inserida na árvore
	 
	 */
	public boolean criarDiretoria(String caminho);
	
	/*
	 Criação do ficheiro
	 (Assumimos que tem de ter um caminho absoluto e é Case sensitive) 
	 
	 parâmetro "caminho" para indicar qual é o caminho onde vai parar o ficheiro 
	 
	 parâmetro "nomeficheiro" para indicar o nome do ficheiro
	 
	 parâmetro "conteudo" para escrever o texto dentro do ficheiro
	  
	 */
	public void criarFicheiro(String caminho, String nomeficheiro, String conteudo);
	
	/*
	 Faz a listagem das diretorias e ficheiros indicando o caminho da própria diretoria 
	 retornando assim uma lista de forma ordenada
	 (Assumimos que tem de ter um caminho absoluto e é Case sensitive)
	 
	 parâmetro "caminho" indica qual o caminho que o utilizador quer percorrer para fazer a listagem das diretorias 
	 
	 */
	public List<String> listar(String caminho);
	

	
	/*
	 Mostrar o conteúdo de um ficheiro 
	 (Assumimos que tem de ter um caminho absoluto e é Case sensitive)
	 
	 parâmetro "caminho" para indicar o caminho onde se encontra o ficheiro
	  parâmetro "nomeficheiro" para indicar qual é o ficheiro para mostrar o seu conteúdo
	  
	
	 */
	
	public String catFicheiro(String caminho, String nomeficheiro);
	
	/*
	 Acrescenta mais conteúdo ao próprio ficheiro que já continha um conteúdo original ou não 
	 (Assumimos que tem de ter um caminho absoluto e é Case sensitive)
	   
	   parâmetro "caminho" para indicar o caminho onde está o ficheiro
	   parâmetro "nomeficheiro" para indicar qual é o nome do ficheiro para mostrar o seu conteúdo
	   parâmetro "conteudo" para inserir conteúdo dentro de um ficheiro existente
	   
	 */
	public void acrescentarFicheiro(String caminho, String nomeficheiro, String conteudo);

	
}