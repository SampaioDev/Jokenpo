import java.util.List;

public class Jogador {
	private JogadaEnum jogada;
	private List<String> historico;
	
	public JogadaEnum getJogada() {
		return jogada;
	}
	public void setJogada(JogadaEnum jogada) {
		this.jogada = jogada;
	}
	public List<String> getHistorico() {
		return historico;
	}
	public void setHistorico(List<String> historico) {
		this.historico = historico;
	}
	
	
}
