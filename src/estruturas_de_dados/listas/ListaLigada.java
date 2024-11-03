package estruturas_de_dados.listas;

public class ListaLigada /*implements Lista */ {
    private No head;   
    private int tamanho;

    private class No{
        int valor;
        No proximo;
    
        No(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    }
    public void adicionar(int elemento) {
        No novoNo = new No(elemento);
       if(head == null){ //se a lista estiver vazia meu novo nó será a head.
            head = novoNo; 
        }
        else{
            No atual = head;//variavel atual do tipo nó foi criada como guia para encontrar o ultimo elemento da lista.
            while (atual.proximo != null){//enquanto atual.proximo for diferente de nulo atual receberá referencia do nó seguinte.
                atual = atual.proximo;//atual "recebe" o ultimo nó da lista.
            } 
            atual.proximo = novoNo;//o novo nó criado pelo usuário será colocado na ultima posição.
        }
    tamanho++;//apos essa adição o atributo tamanho da lista deve aumentar.
    }
    public void adicionarNoIndice(int elemento, int index){
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        No atual = head;
        No novoNo = new No(elemento);
        if(index == 0){
            novoNo.proximo = head;
            head = novoNo;
        }else{
            for(int i = 0; i < index - 1; i++){
            atual = atual.proximo; 
            } 
        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
        }tamanho++;
        }
    public int pegar(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        No atual = head;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    public int pegarTamanhoLista() {
        return tamanho;
    }
}
