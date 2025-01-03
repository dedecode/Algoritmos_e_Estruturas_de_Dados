import estruturas_de_dados.arvore.ArvoreBuscaBinaria;
import estruturas_de_dados.fila.FilaSimples;
import estruturas_de_dados.listas.ArrayList;
import estruturas_de_dados.listas.ListaLigada;
import estruturas_de_dados.pilha.PilhaLigada;

public class Main {
    public static void main(String[] args) {
       
        ArvoreBuscaBinaria bst = new ArvoreBuscaBinaria();
        bst.adicionar(30);
        bst.adicionar(20);
        bst.adicionar(10);
        bst.adicionar(25);
        bst.adicionar(50);
        bst.adicionar(35);
        bst.adicionar(60);
        bst.percursoEmOrdem();
        bst.percursoPosOrdem();
        System.out.println(bst.contem(30));
        System.out.println(bst.contem(3));
        bst.remover(60);
        bst.percursoPreOrdem();
        System.out.println();
        bst.percursoEmOrdem();
        bst.remover(30);
        System.out.println();
        bst.percursoEmOrdem();

    }
}
