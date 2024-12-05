package estruturas_de_dados.fila;

public interface Fila {
    
        void enfileirar(int elemento);
    
        Integer desenfileirar();
   
        int olharFrente();
    
        boolean estaVazia();
    
        int tamanho(); 

}
