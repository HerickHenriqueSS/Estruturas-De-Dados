package Ex4;

public class No {

    private int data;
    private No prox;

    public No(int data) {
        this.data = data;
    }

    public No(int data, No prox) {
        this.data = data;
        this.prox = prox;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
