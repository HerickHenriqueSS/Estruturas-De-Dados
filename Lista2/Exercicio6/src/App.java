public class App {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        lista.adicionar(new No("10", null, null));
        lista.adicionar(new No("20", null, null));
        lista.adicionar(new No("30", null, null));
        lista.imprimir();
        System.out.println("===================");
        lista.removerUltimo();
        lista.imprimir();

    }
}
