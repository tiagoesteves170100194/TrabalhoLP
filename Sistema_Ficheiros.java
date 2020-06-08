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
	
	/*
	 
	 */
	
}
