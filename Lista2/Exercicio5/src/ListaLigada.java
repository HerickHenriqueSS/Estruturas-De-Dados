public class ListaLigada<T> {
    
    private No cauda;
    private No cabeca;
    private int tamanhao;

    public void adicionar(No novoElemento) {
        if (cabeca == null) {
            this.cabeca = novoElemento;
            this.cauda = cabeca;
            tamanhao++;
        } else {
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }
    }
    
    public void imprimir() {
        No aux = cabeca;
        while(aux != null) {
            System.out.print(aux.getDado() + " -> ");
            aux = aux.getProx();
        }
        System.out.println("Fim\n\n");
    }


}
