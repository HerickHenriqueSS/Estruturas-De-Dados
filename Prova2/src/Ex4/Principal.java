package Ex4;

public class Principal {

    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        No novoElemento = new No(4);
        pilha.empilhar(novoElemento);
        novoElemento = new No(2, null);
        pilha.empilhar(novoElemento);
        pilha.empilhar(new No(4));
        pilha.empilhar(new No(6));
        pilha.empilhar(new No(8));
        pilha.empilhar(new No(9));
        pilha.empilhar(new No(12));
        pilha.empilhar(new No(13));
        pilha.empilhar(new No(15));
        pilha.empilhar(new No(20, null));
        pilha.imprimir();

    }
}
