package Exercicios;

import estruturas.Lista;

public class Exercicio5 {
    public static void main(String[] args) {
        Lista<String> lista =new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        System.out.println(lista);
        lista.limpar();
        System.out.println(lista);

    }
}
