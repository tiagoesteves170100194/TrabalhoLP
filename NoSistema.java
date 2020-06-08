package pacote_SF;

import java.util.HashMap;

public class NoSistema {
	
	//Atributos
	    private String nomeficheiro; //Identificar pelo nome do ficheiro
	    boolean Verificar; //Verificar se é um ficheiro ou uma pasta
	    HashMap<String, NoSistema> filhos; 
	    StringBuffer conteudo; //serve para ver o conteudo do ficheiro
	    
	    

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
	        //Aqui se verificar que não é uma pasta, assume que é ficheiro e pode escrever contéudo
	     if(!this.Verificar){ 
	            this.conteudo = new StringBuffer();
	        }
	        
	    }
		
		
	}
