package pacote_SF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sistema_Ficheiros implements InterfaceSF {

	 NoSistema raiz;
	
	/*
	 Inicializa o Sistema de Ficheiros com uma nova diretoria vazia chamada raiz.
	  
	 */
	public Sistema_Ficheiros() {
		raiz = new NoSistema(" ",true);
	}
		
	/*
	 Criação de uma diretória vazia com um caminho absoluto
	 

	
	 */
	
	public boolean criarDiretoria(String caminho) {
		//Verifica se a raiz da diretoria está bem criada e assume que as letras são todas minúsculas 
		//e se é um caminho absoluto
		
		if(caminho == null|| caminho.isEmpty() || caminho.equals("/") || !caminho.startsWith("/")) {
			return false;
		}
		
		String[] tokens = caminho.split("/"); //Este token vai servir para separar os caminhos por "/"
		NoSistema atual= raiz; //Assume inicialmente como a raiz
		boolean criado = false; //Esta variável boolean vai verificar se a diretoria foi criada com sucesso ou não
		//Este vai servir para fazer a incrementação das "/"
		for(int i=1; i<tokens.length; i++ ) {
			//Aqui diz se o HashMap do getFilho, em que o atual é a raiz, não for a chave da raiz então podemos criar mais diretorias
			if(!atual.getFilho().containsKey(tokens[i])) {
				atual.getFilho().put(tokens[i],new NoSistema(tokens[i], true));
				criado=true;
			}
			atual= atual.getFilho().get(tokens[i]); //De seguida vai extrair a chave que foi criada da diretoria
		}
		return criado; //retorna a diretoria criada
		
		
	}
	
	/*
	 Serve para a fazer a listagem do conteúdo presente
	
	 */
	 public List<String> listar(String caminho){
	       List<String> lista = new ArrayList<>(); //Cria-se uma variável chamada "lista" para fazer a listagem das diretorias e ficheiros
	       NoSistema atual = irDiretoriaAtual(caminho); //Vai servir para percorrer todos as diretorias para fazer a listagem
	       lista.addAll(atual.getFilho().keySet()); //Aqui vai adicionar à lista todas as chaves que foram criadas com as diretorias e ficheiros com o keySet()  
	       Collections.sort(lista); //Chama-se a classe Collections para ordenar a lista de forma ascendente
	       return lista; //Retorna a lista de forma ordenada
	 }
	 /*Serve para verificar se o diretório atual é válido ou não, sendo este, um método recursivo

	  */
	   private  NoSistema irDiretoriaAtual(String caminho) {
		   //Aqui faz uma validação se o caminho criado foi feito com sucesso
	       if(caminho == null || caminho.isEmpty() || caminho.equals("/") || !caminho.startsWith("/")) {
	           throw new IllegalArgumentException("Caminho inválido. Por favor forneça um caminho absoluto válido");
	       }
	       NoSistema atual = raiz;
	       String[] tokens = caminho.split("/");
	       for(int i=1; i<tokens.length; i++){
	    	   //Aqui verifica se o caminho percorrido para uma diretoria não tiver uma chave criada então lança uma validação para fornecer um caminho absoluto válido
	           if(!atual.getFilho().containsKey(tokens[i])){
	               throw new IllegalArgumentException("Caminho inválido. Por favor forneça um caminho absoluto válido");
	           }
	           atual = atual.getFilho().get(tokens[i]); //De seguida vai trazer o caminho da diretoria atual 
	       }
	       return atual; //Retorna a diretoria atual
	   }
	   
	   /*Serve para verificar se o caminho é válido senão for o ficheiro não é encontrado
	     
	    */
	   public void acrescentarFicheiro(String caminho, String nomeficheiro, String conteudo){
	       
		   if(caminho == null || caminho.isEmpty() || caminho.equals("/") || !caminho.startsWith("/")) {
	           throw new IllegalArgumentException("Caminho inválido. Por favor forneça um caminho absoluto válido");
	       }
	       NoSistema atual = irDiretoriaAtual(caminho).getFilho().get(nomeficheiro); //Aqui para adicionar mais conteúdo ao ficheiro temos de percorrer o caminho da diretoria, ir buscar o HashMap que é o getFilho e trazer o nome do ficheiro
	       
	       //Se o ficheiro que o utilizador procurar não existir para acrescentar mais conteudo então manda uma validação a dizer "Ficheiro não encontrado"
	       if(atual==null){
	               throw new IllegalArgumentException("Ficheiro não encontrado");
	       }
	       atual.conteudo.append(conteudo); //Se existir esse ficheiro adiciona o contéudo que queremos adicionar ao ficheiro
	   }
	   /*Serve para criar um ficheiro e depois verificar o caminho para ver se está tudo bem*/
	   public void criarFicheiro(String caminho, String nomeficheiro, String conteudo){
		  
		   NoSistema atual = irDiretoriaAtual(caminho);  
		   //Aqui vai verificar se existir a chave desse ficheiro vai acrescentar ao ficheiro existente o contéudo adicional ao original
		     if(atual.getFilho().containsKey(nomeficheiro)){
		    	 acrescentarFicheiro(caminho, nomeficheiro, conteudo);
		    //Senão cria um novo ficheiro
		     }else{
		        atual.getFilho().put(nomeficheiro, new NoSistema(nomeficheiro, false));
		        acrescentarFicheiro(caminho, nomeficheiro, conteudo);
		     }
	   }
	   /*Serve para fazer a pesquisa do nome do ficheiro, para ver o seu conteudo*/
	   public String catFicheiro(String caminho, String nomeficheiro) {
		   NoSistema atual = irDiretoriaAtual(caminho); //Aqui vai ao caminho onde está localizado o mesmo para ir ao ficheiro
	       return atual.getFilho().get(nomeficheiro).conteudo.toString(); //Aqui vai extrair o conteúdo do ficheiro
	   }

}