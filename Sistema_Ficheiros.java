package pacote_SF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sistema_Ficheiros {

	 NoSistema raiz;
	
	/*
	 Inicializa o Sistema de Ficheiros com uma nova diret�ria vazia chama raiz.
	  
	 */
	public Sistema_Ficheiros() {
		raiz = new NoSistema(" ",true);
	}
	
	

	
	/*
	 Cria��o de uma diret�ria vazia com um caminho absoluto
	 
	 O par�metro "caminho" vai servir para separar os caminhos do dir�torio
	
	 */
	
	public boolean Criardiretoria(String caminho) {
		//Verifica se a raiz da pasta est� bem criada e assume que as letras s�o todas min�sculas 
		//e � um caminho absoluto
		if(caminho == null|| caminho.isEmpty() || caminho.equals("/") || !caminho.startsWith("/")) {
			return false;
		}
		
		String[] tokens = caminho.split("/"); //Este token vai servir para separar os caminhos por "/"
		NoSistema atual= raiz;
		boolean criado = false;
		for(int i=1; i<tokens.length; i++ ) {
			//Aqui verifica se o diret�rio estiver com uma barra cria um novo diret�rio
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
