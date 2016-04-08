package Model;

public class Mensagem {
 
	private int idMensagem;
	 
	private String conteudo;
	 
	private int dataEnvio;
	 
	private int dataRecebimento;
	 
	private int dataVisualizacao;
	 
	private Chat chat;
	 
	private Arquivo arquivo;
	 
	public boolean enviarMensagem() {
		return false;
	}
	 
	public void excluirMensagem() {
	 
	}
	 
	public boolean receberMensagem() {
		return false;
	}
	 
	public void visualizarMensagem() {
	 
	}
	 
	public boolean definirSpam() {
		return false;
	}
	 
}
 
