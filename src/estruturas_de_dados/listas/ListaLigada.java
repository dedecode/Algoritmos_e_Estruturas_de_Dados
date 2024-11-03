package estruturas_de_dados.listas;

public class ListaLigada implements Lista{
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
            for(int i = 0; i < index - 1; i++){//objetivo: chegar no Nó anterior ao indice desejado.
            atual = atual.proximo; 
            } 
        novoNo.proximo = atual.proximo;//meu novo Nó irá apontar para o antigo Nó do indice escolhido.
        atual.proximo = novoNo;//o Nó anterior ao indice escolhido apontará para novo Nó.
        }tamanho++;
        }
    
    public void remover(int indice){
        if (indice < 0 || indice > (tamanho - 1)){
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        No atual = head;
        if (indice == 0){
            head = head.proximo;
        }else{
        for (int i = 0; i < indice - 1; i++){
            atual = atual.proximo;
        }
        atual.proximo = atual.proximo.proximo;
        }
        tamanho--;
    }
    
    public void trocar(int elemento, int indice){
        No atual = head;
        for(int i = 0; i < indice; i++){
            atual = atual.proximo;
        }
        atual.valor = elemento;
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

    public void mostrarLista(){
        System.out.print("[ ");
        No atual = head;
        while(atual != null){
            if(atual.proximo != null){
            System.out.print(atual.valor + ", ");
            }else{
                System.out.print(atual.valor);
            }
            atual = atual.proximo;
        }
        System.out.println(" ]");

    }
}
