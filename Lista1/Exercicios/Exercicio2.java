package Exercicios;

import estruturas.Lista;


public class Exercicio2 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        System.out.println("ultima o ocorrência do A " + lista.ultimaOcorrencia("A"));
        System.out.println("ultima o ocorrência do B " + lista.ultimaOcorrencia("B"));
        System.out.println("ultima ocorrência do C " + lista.ultimaOcorrencia("C"));
    }
}
