package Ex5;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        /* Scanner leitor = new scanner(int); */
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        int i = 0;
        int contador = 10;
        int variavel;

        while (i <= 9) {
            String janela = JOptionPane.showInputDialog(null, "insira" + contador + "numero", "Insert",
                    JOptionPane.INFORMATION_MESSAGE);
            variavel = Integer.parseInt(janela);

            lista.adicionar(new No(variavel, null, null));
            contador--;
            i++;
        }
        lista.print();
    }
}
