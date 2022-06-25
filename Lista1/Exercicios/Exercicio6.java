package Exercicios;

import classes.Contato;
import estruturas.Lista;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Lista<Contato> lista = new Lista<>(20);
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            System.out.println("Nome: ");
            String nome = entrada.next();
            System.out.println("Telefone: ");
            String telefone = entrada.next();
            System.out.println("Email: ");
            String email = entrada.next();
            Contato c = new Contato(nome, telefone, email);
            lista.adiciona(c);
        }
        System.out.println(lista);
    }
}
