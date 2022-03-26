
public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capaciodade) {
		elementos = new String[capaciodade];
		tamanho = 0;

	}

	/*
	 * public void adiciona(String elemento) {
	 * for(int i=0; i < elementos.length; i++){
	 * if(elementos[i] == null) {
	 * elementos[i] = elemento;
	 * break;
	 * }
	 * }
	 * }
	 */

	/*
	 * public void adiciona(String elemento) {
	 * if(tamanho < elementos.length) {
	 * elementos[tamanho] = elemento;
	 * tamanho ++;
	 * }else {
	 * throw new Exception("vetor esta cheio!!");
	 * }
	 * }
	 */

	// adiciona o lemento no final vetor
	public boolean adiciona(String elemento) {
		this.aumentarTamanho();
		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}

	public int tamanho() {

		return tamanho;
	}

	public boolean adicionar(int posicao, String elemento) throws IllegalAccessException {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAccessException("Posicao Invalida!");
		}
		this.aumentarTamanho();
		for (int i = tamanho - 1; i >= posicao; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;

		return true;
	}

	public void remover(int posicao) throws IllegalAccessException {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAccessException("Posicao Invalida!");
		}

		for (int i = posicao; i < tamanho - 1; i++) {
			elementos[i] = elementos[i + 1];
		}
		tamanho--;
	}

	private void aumentarTamanho() {
		if (tamanho == elementos.length) {
			String[] elementosNovos = new String[elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}
	}

	public String busca(int posicao, String elemento) throws IllegalAccessException {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalAccessException("Posicao invalida!");

		}

		return elementos[posicao];
	}

	public int busca(String elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {

		StringBuffer s = new StringBuffer();
		s.append("[");
		for (int i = 0; i < tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}

		if (tamanho > 0) {
			s.append(elementos[tamanho - 1]);
		}

		s.append("]");
		return s.toString();
	}

}
