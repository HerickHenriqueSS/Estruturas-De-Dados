package Exercicios;

import estruturas.Pilha;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero inteiro: ");
            int numero = entrada.nextInt();
            if(numero % 2 == 0){
                pilha.empilhar(numero);
            }else{
                if(pilha.estaVazia()){
                    System.out.println("Pilha está vazia");
                }else{
                    pilha.desempilhar();
                }
            }
        }
        while (!pilha.estaVazia()){
            System.out.println(pilha.desempilhar());
        }
    }
}
