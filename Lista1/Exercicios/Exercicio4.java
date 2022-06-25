package Exercicios;

import estruturas.Lista;

public class Exercicio4 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        try {
            lista.removePrimeiro();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(lista);

    }
}
