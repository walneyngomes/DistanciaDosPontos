import java.util.ArrayList;

public class Grafico {
	public static final int TAM_ARRAY=2;
	Ponto[] pontos = new Ponto[TAM_ARRAY];
	static int pos = 0;

	public Ponto[] getPontos() {
		return pontos;
	}

	public void setPontos(Ponto[] pontos) {
		this.pontos = pontos;
	}

	public void addPonto(Ponto p) {
		pontos[pos] = p;
		pos++;
	}

	public double distanciaCalcular() {
		return Math.sqrt(distanciaX() + distanciaY() + distanciaZ());
	}

	private double distanciaX() {
		return (this.pontos[1].getEixoX() - this.pontos[0].getEixoX())
				* (this.pontos[1].getEixoX() - this.pontos[0].getEixoX());

	}

	private double distanciaY() {
		return (this.pontos[1].getEixoY() - this.pontos[0].getEixoY())
				* (this.pontos[1].getEixoY() - this.pontos[0].getEixoY());

	}

	private double distanciaZ() {
		return (this.pontos[1].getEixoZ() - this.pontos[0].getEixoZ())
				* (this.pontos[1].getEixoZ() - this.pontos[0].getEixoZ());

	}

}
