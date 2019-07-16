public class Jogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		jogador1.setJogada(JogadaEnum.TESOURA);
		jogador2.setJogada(JogadaEnum.PEDRA);
		
		jokenpo(jogador1, jogador2);
	}

	public static void jokenpo(Jogador j1, Jogador j2) {
		if (j1.getJogada() == j2.getJogada()) {
			System.out.println("EMPATE!");
		}else if(j1.getJogada() == JogadaEnum.PAPEL && j2.getJogada() == JogadaEnum.PEDRA) {
			System.out.println("JOGADOR 1 GANHOU!");
		}else if(j1.getJogada() == JogadaEnum.PEDRA && j2.getJogada() == JogadaEnum.TESOURA) {
			System.out.println("JOGADOR 1 GANHOU!");
		}else if(j1.getJogada() == JogadaEnum.TESOURA && j2.getJogada() == JogadaEnum.PAPEL) {
			System.out.println("JOGADOR 1 GANHOU!");
		}else {
			System.out.println("JOGADOR 2 GANHOU!");
		}
	}
}
