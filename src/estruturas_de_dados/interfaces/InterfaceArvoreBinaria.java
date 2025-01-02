package estruturas_de_dados.interfaces;

public interface InterfaceArvoreBinaria extends InterfaceArvore {

    void inserirEsquerda(int valor);

    void inserirDireita(int valor);

    int getFilhoEsquerda();

    int getFilhoDireita();

}
