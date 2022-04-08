package testes;

import Classes.Paciente;
import estruturados.FilaComPrioridade;

public class PrincipalFilaPrioridade {
    public static void main(String[] args) {

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileirar(new Paciente("A", 2));
        fila.enfileirar(new Paciente("B", 1));
        fila.enfileirar(new Paciente("D", 1));
        fila.enfileirar(new Paciente("C", 3));
        fila.enfileirar(new Paciente("F", 2));

        System.out.println(fila);

    }
}
