package Ex2Lista;

import java.util.ArrayList;

public class ListaDinamica {

    public static void main(String[] args) {
        ArrayList<Integer> ListaDinamica = new ArrayList<Integer>();
        ListaDinamica.add(1);
        ListaDinamica.add(7);
        ListaDinamica.add(2);
        System.out.println(ListaDinamica);

        ListaDinamica.remove(0);
        System.out.println(ListaDinamica);

        ListaDinamica.add(5);
        ListaDinamica.add(3);
        ListaDinamica.add(4);
        ListaDinamica.add(8);
        ListaDinamica.add(9);
        System.out.println(ListaDinamica);

        ListaDinamica.remove(6);
        System.out.println(ListaDinamica);

    }

}
