package Ex5;

public class No {

    private int dado;

    private No ant;

    private No prox;

    public No(int dado, No ant, No prox) {
        this.dado = dado;
        this.ant = ant;
        this.prox = prox;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
