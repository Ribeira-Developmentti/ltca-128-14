package gerador;

import java.util.ArrayList;
import java.util.List;

import modelo.Matriz;
import modelo.Volante;
import util.Util;

public class GeradorCasaEmpate {
	
	private List<Matriz> matrizes;
	
	public GeradorCasaEmpate() {
		super();
		this.matrizes = carregarMatrizes();
	}


	public List<Volante> casaEmpate(String[] definicao){
		List<Volante> listaVolantesCasaEmpate = new ArrayList<>();
		
		for(Matriz m : this.matrizes) {
			listaVolantesCasaEmpate.add(gerarVolante(definicao, m.getPalpites()));
		}
		
		return listaVolantesCasaEmpate;
	}
	
	
	public Volante gerarVolante(String[] definicao, String[] matriz) {
		int contMatriz = 0;
		int contVolante = 0;
		Volante volante = new Volante();
		volante.setId(Util.id + "");
		
		for(String escolha : definicao) {
			if(escolha.equalsIgnoreCase("d")) {
					volante.getPalpites()[contVolante] = matriz[contMatriz];
					contMatriz++;
					contVolante++;
			} else {
				volante.getPalpites()[contVolante] = escolha;
				contVolante++;
			}
		}
		
		Util.id++;
		return volante;
	}
	
	public List<Matriz> carregarMatrizes() {
		List<Matriz> matrizesGeradas = new ArrayList<>();
		
		String[] jogo01 = { "1", "x" };
		String[] jogo02 = { "1", "x" };
		String[] jogo03 = { "1", "x" };
		String[] jogo04 = { "1", "x" };
		String[] jogo05 = { "1", "x" };
		String[] jogo06 = { "1", "x" };
		String[] jogo07 = { "1", "x" };

		for (String p01 : jogo01) {
			for (String p02 : jogo02) {
				for (String p03 : jogo03) {
					for (String p04 : jogo04) {
						for (String p05 : jogo05) {
							for (String p06 : jogo06) {
								for (String p07 : jogo07) {
									String[] matriz = {p01 ,p02, p03, p04, p05, p06, p07};
									matrizesGeradas.add(new Matriz(matriz));
								}
							}
						}
					}
				}
			}
		}
		
		return matrizesGeradas;
	}
}
