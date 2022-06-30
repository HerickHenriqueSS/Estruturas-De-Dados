public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada<>();
        lista.adicionar(new No("1", null));
        lista.adicionar(new No("4", null));
        lista.adicionar(new No("7", null));
        lista.adicionar(new No("9", null));
        lista.imprimir();
    }
}
