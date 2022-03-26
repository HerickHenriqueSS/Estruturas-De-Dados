import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		try {

			List<Contato> lista = new ArrayList<>();

			LinkedList<Contato> listaEncadeada = new LinkedList<>();

			/*
			 * Lista<Contato> lista = new Lista(3);
			 * Lista<String> lista2 = new Lista(10);
			 * Lista<Integer> lista3 = new Lista(10);
			 */
			Contato c1 = new Contato("C1", "333-3333", "irirriri@gmail.com");
			Contato c2 = new Contato("C2", "222-2222", "i@gmail.com");
			Contato c3 = new Contato("C3", "444-4444", "iriri@gmail.com");
			Contato c4 = new Contato("C4", "444-324234234", "MicaelForaDePosição@gmail.com");
			Contato c5 = new Contato("C5", "444-4242342342343242332423423423444", "iritaforadeposiçãori@gmail.com");

			listaEncadeada.add(c1);
			listaEncadeada.add(c3);
			listaEncadeada.add(1, c2);
			listaEncadeada.addFirst(c4);
			listaEncadeada.addLast(c5);
			// listaEncadeada.remove();
			// listaEncadeada.remove(2);
			listaEncadeada.remove(c5);
			// System.out.println(listaEncadeada.contains(c5));
			System.out.println(listaEncadeada);

			/*
			 * lista.add(c1);
			 * lista.add(c2);
			 * lista.add(0, c3);
			 * System.out.println(lista.contains(c3));
			 * System.out.println(lista.get(1));
			 * 
			 * System.out.println(lista);
			 * lista.isEmpty(); // true para vazio, false para cheio
			 * System.out.println("Tamanho = " + lista.size());
			 */
			/*
			 * lista.adiciona(c1);
			 * lista.adiciona(c2);
			 * lista.adiciona(c3);
			 * lista2.adiciona("A");
			 * lista3.adiciona(10);
			 * System.out.println(lista);
			 */

			/*
			 * VetorObjeto vetor = new VetorObjeto(3);
			 * Contato c1 = new Contato("C1", "333-3333", "irirriri@gmail.com");
			 * Contato c2 = new Contato("C2", "222-2222", "i@gmail.com");
			 * Contato c3 = new Contato("C3", "444-4444", "iriri@gmail.com");
			 * vetor.adiciona(c1);
			 * vetor.adiciona(c2);
			 * vetor.adiciona(c3);
			 * System.out.println(vetor);
			 */

			/*
			 * vetor.adiciona("B");
			 * vetor.adiciona("D");
			 * vetor.adiciona("E");
			 * vetor.adicionar(0, 1);
			 * vetor.adicionar(2, 212);
			 * System.out.println(vetor);
			 * vetor.remover(3);
			 * System.out.println(vetor);
			 */
			// System.out.println(vetor.busca(2));
			// System.out.println(vetor.busca("E"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
