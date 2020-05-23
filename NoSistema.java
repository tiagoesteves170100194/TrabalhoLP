package pacote_SF;
import java.util.HashMap;

public class NoSistema {
	
	//Atributos
	    private String nomeficheiro;
	    HashMap<String, NoSistema> filho;
	    boolean Diretorio; //determina se é ou não um diretório
	    StringBuffer conteudo; //serve para ver o conteudo do ficheiro
	    
	    

	    //Getters e Setters
	    
	    public String getNomeficheiro() {
			return nomeficheiro;
		}



		public void setNomeficheiro(String nomeficheiro) {
			this.nomeficheiro = nomeficheiro;
		}



		public HashMap<String, NoSistema> getFilho() {
			return filho;
		}



		public void setFilho(HashMap<String, NoSistema> filho) {
			this.filho = filho;
		}



		public boolean isDiretorio() {
			return Diretorio;
		}



		public void setDiretorio(boolean diretorio) {
			Diretorio = diretorio;
		}



		public StringBuffer getConteudo() {
			return conteudo;
		}



		public void setConteudo(StringBuffer conteudo) {
			this.conteudo = conteudo;
		}


		//Construtores
		public NoSistema(String nomeficheiro, boolean Diretorio){
	        this.nomeficheiro = nomeficheiro;
	        this.Diretorio = Diretorio;
	        this.filho = new HashMap<>();
	        
	        if(!this.Diretorio){
	            this.conteudo = new StringBuffer();
	        }
	    }
		
		
	}
