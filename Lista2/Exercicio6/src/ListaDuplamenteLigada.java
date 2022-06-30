public class ListaDuplamenteLigada {

    private No cabeca;
    private No cauda;

    public void adicionar(No novoElemento) {
        if(this.cabeca == null) {
            this.cabeca = novoElemento;
            this.cauda = this.cabeca;
        }else {
            this.cauda.setProx(novoElemento);
            novoElemento.setAnt(this.cauda);
            this.cauda = novoElemento;
        }
    }

    public void removerUltimo() {
        if (cauda.getProx() == null) {
            cauda.setDado(null);
        }
    }

    public void imprimir() {
        No aux = this.cabeca;
        while(aux != null){
            String dado = aux.getDado();
            System.out.print(dado + "->");
            aux = aux.getProx();
        }
        System.out.print("Fim\n\n");
    }
}
