package Exercicios;

import classes.Contato;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        LinkedList<Contato> lista = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String nome = entrada.next();
            System.out.println("Telefone: ");
            String telefone = entrada.next();
            System.out.println("Email: ");
            String email = entrada.next();
            Contato c = new Contato(nome, telefone, email);
            lista.add(c);
        }
        System.out.println(lista);
    }
}
