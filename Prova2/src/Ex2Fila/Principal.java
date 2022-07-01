package Ex2Fila;

public class Principal {

    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();
        No novoElemento = new No("1");
        fila.enfileirar(novoElemento);
        novoElemento = new No("7");
        fila.enfileirar(novoElemento);
        fila.enfileirar(new No("2"));
        fila.imprimir();
        No removido = fila.desenfileirar();
        fila.imprimir();
        fila.enfileirar(new No("5"));
        fila.enfileirar(new No("3"));
        fila.enfileirar(new No("4"));
        fila.enfileirar(new No("8"));
        fila.enfileirar(new No("9"));
        fila.imprimir();

        removido = fila.desenfileirar();
        fila.imprimir();

    }
}
