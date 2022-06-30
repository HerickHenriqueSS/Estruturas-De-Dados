public class App {
    public static void main(String[] args) throws Exception {

        /* Lista 2 / Exercicio 3 - Fila com priorirade */
        FilaComPrioridade<Contato> fila = new FilaComPrioridade<>();
        fila.enfileirar(new Contato("Altair", "3251-0000", 2));
        fila.enfileirar(new Contato("Herick", "3251-0001", 1));
        fila.enfileirar(new Contato("Kennes", "3251-0002", 3));
        fila.enfileirar(new Contato("Astolfo", "3251-0004", 1));
        
        System.out.println(fila);

    }  
}
