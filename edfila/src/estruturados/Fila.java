package estruturados;

@SuppressWarnings("unchecked")
public class Fila<T> {

    protected T[] elementos;
    protected int tamanho;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;

    }

    public Fila() {
        this(10);
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public boolean enfileirar(T elemento) {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean enfileirar(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("posição invalida!");
        }
        aumentarCapacidade();

        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public T espiar() {
        if (estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileirar() {
        final int POS = 0;

        if (estaVazia()) {
            return null;
        }
        T elementoRemovido = this.elementos[POS];

        for (int i = 0; i < tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];

        }
        this.tamanho--;

        return elementoRemovido;
    }

    public int tamanho() {
        return this.tamanho;

    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");

        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);

        }
        s.append("]");

        return s.toString();
    }

    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];

            }
            this.elementos = elementosNovos;
        }
    }
}