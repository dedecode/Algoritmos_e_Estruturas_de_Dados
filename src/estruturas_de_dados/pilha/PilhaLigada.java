package estruturas_de_dados.pilha;

import estruturas_de_dados.interfaces.InterfacePilha;

public class PilhaLigada implements InterfacePilha{
    private No topo;
    private int tamanho;
    
    private class No{
        int valor;
        No proximo;
        
        No(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    } 
    
    // push() adiciona um elemento no topo da pilha.
    @Override
    public void empilhar(int valor) {
    No novoNo = new No(valor);
    if(topo == null){
        topo = novoNo;
    }else{
        novoNo.proximo = topo;
        topo = novoNo;
    }
    this.tamanho++;
    }
    // pop() retira o elemento e retorna o seu valor.
    @Override
    public int desempilhar() {
        if (this.topo == null) {
			throw new RuntimeException("Pilha vazia!");
		}
        int valorTopo = topo.valor;
        topo = topo.proximo;
        this.tamanho--;
        return valorTopo;
    }
    // peek() verificar qual o elemento do topo sem remove-lo.
    @Override
    public int OlharTopo() {
        if (this.topo == null) {
			throw new RuntimeException("Pilha vazia!");
		}
        return topo.valor;
    }
    // isEmpty() verifica se a pilha está vazia.
    @Override
    public boolean estaVazia() {
        boolean vazio = false;
        if(topo == null){
            vazio = true;
        }
        return vazio;
    }
    // size() retorna o numero de elementos da pilha.
    @Override
    public int tamanho() {
        return this.tamanho;
    }

    // printa a lista no console.

    public void mostrarPilha() {
        System.out.print("[ ");
        No atual = topo;
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
