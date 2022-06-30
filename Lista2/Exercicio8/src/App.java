public class App {
    public static void main(String[] args) throws Exception {
        PilhaDinamica pilha = new PilhaDinamica();
        pilha.empilhar(new No("Altair", null));
        pilha.print();
        System.out.println(pilha);
    }
}
