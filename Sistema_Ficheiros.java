package pacote_SF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sistema_Ficheiros {

	 NoSistema raiz;
	
	/*
	 Inicializa o Sistema de Ficheiros com uma nova diretória vazia chama raiz.
	  
	 */
	public Sistema_Ficheiros() {
		raiz = new NoSistema(" ",true);
	}
		
	/*
	 Criação de uma diretória vazia com um caminho absoluto
	 
	 O parâmetro "caminho" vai servir para separar os caminhos do dirétorio
	
	 */
	
	public boolean Criardiretoria(String caminho) {
		//Verifica se a raiz da pasta está bem criada e assume que as letras são todas minúsculas 
		//e é um caminho absoluto
		if(caminho == null|| caminho.isEmpty() || caminho.equals("/") || !caminho.startsWith("/")) {
			return false;
		}
		
		String[] tokens = caminho.split("/"); //Este token vai servir para separar os caminhos por "/"
		NoSistema atual= raiz;
		boolean criado = false;
		for(int i=1; i<tokens.length; i++ ) {
			//Aqui verifica se o diretório estiver com uma barra cria um novo diretório
			if(atual.getFilho().containsKey(tokens[i])) {
				atual.getFilho().put(tokens[i],new NoSistema(tokens[i], true));
				criado=true;
			}
			atual= atual.getFilho().get(tokens[i]);
		}
		return criado;
		
		
	}
	
	/*Serve para a fazer a listagem do conteudo presente
	 O parâmetro caminho serve para indicar o caminho atual para fazer
	 a respetiva listagem*/
	 public List<String> listar(String caminho){
	       List<String> lista = new ArrayList<>();
	       NoSistema atual = irdiretorioatual(caminho);
	       lista.addAll(atual.getFilho().keySet());
	       Collections.sort(lista);
	       return lista;
	 }
	 /*Serve para verificar se o diretório atual é válido ou não, sendo este, um método recursivo*/
	   private  NoSistema irdiretorioatual(String caminho) {
	       if(caminho == null || caminho.isEmpty() || caminho.equals("/") || !caminho.startsWith("/")) {
	           throw new IllegalArgumentException("Caminho inválido. Por favor fornece um caminho absoluto válido");
	       }
	       NoSistema atual = raiz;
	       String[] tokens = caminho.split("/");
	       for(int i=1; i<tokens.length; i++){
	           if(!atual.getFilho().containsKey(tokens[i])){
	               throw new IllegalArgumentException("Caminho inválido. Por favor fornece um caminho absoluto válido");
	           }
	           atual = atual.getFilho().get(tokens[i]);
	       }
	       return atual;
	   }
	   /*Serve para verificar se o caminho é válido senão for o ficheiro não é encontrado*/
	   public void acrescentarficheiro(String caminho, String nomeficheiro, String conteudo){
	       if(caminho == null || caminho.isEmpty() || caminho.equals("/") || !caminho.startsWith("/")) {
	           throw new IllegalArgumentException("Caminho inválido. Por favor fornece um caminho absoluto válido");
	       }
	       NoSistema atual = irdiretorioatual(caminho).getFilho().get(nomeficheiro);
	       if(atual==null){
	               throw new IllegalArgumentException("Ficheiro não encontrado");
	       }
	       atual.conteudo.append(conteudo);
	   }
	   /*Serve para criar um ficheiro e depois verificar o caminho para ver se está tudo bem*/
	   public void Criarficheiro(String caminho, String nomeficheiro, String conteudo){
		   NoSistema atual = irdiretorioatual(caminho);
		     if(atual.getFilho().containsKey(nomeficheiro)){
		    	 acrescentarficheiro(caminho, nomeficheiro, conteudo);
		     }else{
		        atual.getFilho().put(nomeficheiro, new NoSistema(nomeficheiro, false));
		        acrescentarficheiro(caminho, nomeficheiro, conteudo);
		     }
	   }
	   /*Serve para fazer a pesquisa do nome do ficheiro, para ver o seu conteudo*/
	   public String catFicheiro(String caminho, String nomeficheiro) {
		   NoSistema atual = irdiretorioatual(caminho);
	       return atual.getFilho().get(nomeficheiro).conteudo.toString();
	   }
}
