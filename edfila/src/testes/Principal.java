package testes;

import estruturados.*;

public class Principal {
    public static void main(String[] args) throws Exception {

        Fila<String> fila = new Fila<>();

        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");
        fila.enfileirar("E");
        System.out.println("A fila esta vazia? " + fila.estaVazia());
        System.out.printf("A tamanho da fila é %s \n", fila.tamanho());
        System.out.println(fila);
        System.out.println("O primeiro elemento é: ");

    }
}
