package Ex3;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        lista.adicionar(new No("1", null, null));
        lista.adicionar(new No("2", null, null));
        lista.adicionar(new No("3", null, null));
        lista.adicionar(new No("4", null, null));

        lista.print();

        lista.remove(2);
        lista.print();

    }
}
