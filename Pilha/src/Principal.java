public class Principal {
    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>();

        System.out.println("Pilha");
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        pilha.empilhar("E");
        pilha.empilhar("F");
        System.out.println(pilha.topo());
        System.out.println(pilha);
    }

}