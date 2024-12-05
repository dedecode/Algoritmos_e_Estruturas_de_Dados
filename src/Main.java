import estruturas_de_dados.fila.FilaSimples;
import estruturas_de_dados.listas.ArrayList;
import estruturas_de_dados.listas.ListaLigada;
import estruturas_de_dados.pilha.PilhaLigada;

public class Main {
    public static void main(String[] args) {
       
        FilaSimples fila = new FilaSimples();
        fila.enfileirar(0);
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.mostrarFila();
        System.out.println(fila.estaVazia());
        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.mostrarFila();
        System.out.println(fila.desenfileirar());
        fila.mostrarFila();
        fila.desenfileirar();
        fila.mostrarFila();
        

        }
}
