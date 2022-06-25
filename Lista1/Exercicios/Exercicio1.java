package Exercicios;

import estruturas.Lista;

import java.util.ArrayList;

public class Exercicio1 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("C"));
    }
}
