package pacote_SF;

import java.util.HashMap;

public class NoSistema {
	
	//Atributos
	    private String nomeficheiro; //Identifica o nome do ficheiro
	    boolean Verificar; //Verifica se � um ficheiro ou uma diretoria
	    HashMap<String, NoSistema> filhos; //Serve para verificar o nome do diretorio/ficheiro
	    StringBuffer conteudo; //serve para ver o conte�do do ficheiro
	    

	    //Getters e Setters
	    
	    
	    public String getNomeficheiro() {
			return nomeficheiro;
		}



		public void setNomeficheiro(String nomeficheiro) {
			this.nomeficheiro = nomeficheiro;
		}
		


 
		public HashMap<String, NoSistema> getFilho() {
			return filhos;
		}



		public boolean isVerificar() {
			return Verificar;
		}



		public void setVerificar(boolean verificar) {
			Verificar = verificar;
		}


		public StringBuffer getConteudo() {
			return conteudo;
		}



		public void setConteudo(StringBuffer conteudo) {
			this.conteudo = conteudo;
		}


		//Construtores	
		public NoSistema(String nomeficheiro, boolean Verificar){
	        this.nomeficheiro = nomeficheiro;
	        this.filhos = new HashMap<>();
	        this.Verificar= Verificar;
	        //Aqui verifica se n�o � uma diretoria, assume que � um ficheiro e pode escrever conte�do
	        if(!this.Verificar){ 
	            this.conteudo = new StringBuffer();
	        }
	        
	    }







		
		
	}
