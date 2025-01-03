package estruturas_de_dados.fila;

import estruturas_de_dados.interfaces.InterfaceFila;

public class FilaSimples implements InterfaceFila {
   //Fila simples Ligada
   private No frente; //frente da fila
   private No fim; //final da fila (nenhuma função implementada)
   private int tamanho; 

    public class No{
        private int valor;
        private No proximo;
        No(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    }

    //método para verificar se a fila está vazia
    private void verificarFila(){
        if(this.frente == null){
            throw new RuntimeException("Fila vazia!");
        }
    }



    // offer() ou add() Adiciona um elemento no fim da fila(pode retornar boolean ou exception a depender do método).
    @Override
    public void enfileirar(int elemento) {
        No novoNo = new No(elemento);
        if(this.frente == null){
            this.frente = novoNo;
            this.fim = novoNo;
        }else{
            No atual = this.frente;
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
            this.fim = novoNo;
        }
        this.tamanho++;
    }
    // remove() ou poll() Remove o elemento da frente da fila e o retorna.
    @Override
    public Integer desenfileirar() {
        verificarFila();
        this.frente = this.frente.proximo;
        this.tamanho--;
        if(this.frente == null){
            return null;
        }
        return this.frente.valor;
    }

    @Override
    public boolean estaVazia() {
        boolean vazio = false;
        if(this.frente == null){
            vazio = true;
        }
        return vazio;
    }

    @Override
    public int olharFrente() {
        return this.frente.valor;
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    public void mostrarFila() {
        System.out.print("[ ");
        No atual = frente;
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
