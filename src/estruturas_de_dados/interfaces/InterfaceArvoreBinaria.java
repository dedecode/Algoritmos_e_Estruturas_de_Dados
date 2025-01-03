package estruturas_de_dados.interfaces;

public interface InterfaceArvoreBinaria extends InterfaceArvore {

    void percursoPreOrdem();
    
    void percursoEmOrdem();
    
    void percursoPosOrdem();

    int getFilhoEsquerda();

    int getFilhoDireita();

}
