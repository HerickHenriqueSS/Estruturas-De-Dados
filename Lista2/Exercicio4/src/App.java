public class App {
    public static void main(String[] args) throws Exception {
        /* Adicionando livros */
        /* Utilizando metodo empilhar */
        Pilha<Livros> pilha = new Pilha<>(1);
        pilha.empilhar(new Livros("Teste1", "0000 - 1111 - 2222 - 3333", "01/02/2003"+"\n", "Nome1"));

        pilha.empilhar(new Livros("Teste2", "1111 - 2222 - 3333 - 4444", "Uzam Bolt"+"\n", "Nome2"));

        pilha.empilhar(new Livros("Teste3", "3333 - 4444 - 5555 - 6666", "03/04/2004"+"\n", "Nome3"));

        pilha.empilhar(new Livros("Teste4", "4444 - 5555 - 6666 - 7777", "04/05/2005"+"\n", "Nome4"));

        pilha.empilhar(new Livros("Teste5", "5555 - 6666 - 7777 - 8888", "05/06/2006"+"\n", "Nome5"));

        pilha.empilhar(new Livros("Teste6", "6666 - 7777 - 8888 - 9999", "06/07/2007"+"\n", "Nome6"));

       /*  Metodo topo */
        System.out.println("Livro do topo é: " + pilha.topo());
        System.out.println("==================================");
        /* Metodo desempilhar */
        System.out.println(pilha.toString());
        System.out.println("==================================");
        System.out.println("Valor a ser desempilhado: " + pilha.desempilhar());
        System.out.println("Pilha após o metodo desempilhar: " + pilha.toString());
        System.out.println(pilha.tamanho());




    }
}
