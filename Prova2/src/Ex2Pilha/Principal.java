package Ex2Pilha;

public class Principal {

    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        No novoElemento = new No("1");
        pilha.empilhar(novoElemento);
        novoElemento = new No("7");
        pilha.empilhar(novoElemento);
        pilha.empilhar(new No("2"));
        pilha.imprimir();

        No removido = pilha.desempilhar();
        pilha.imprimir();

        pilha.empilhar(new No("5", null));
        pilha.empilhar(new No("3", null));
        pilha.empilhar(new No("4", null));
        pilha.empilhar(new No("8", null));
        pilha.empilhar(new No("9", null));
        removido = pilha.desempilhar();
        pilha.imprimir();

    }
}
