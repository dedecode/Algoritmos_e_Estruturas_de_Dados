package estruturas_de_dados.listas;

public class ArrayList implements Lista{

    private int tamanho;//representa o numero de elementos dentro do array
    public int capacidade = 10;//representa o tamnho do array
    private int[] elementos = new int[capacidade];

    //Métodos de ArrayList (puxei automaticamente da assinatura da interface "Lista").
    private void garantirCapacidade(){
        if (this.tamanho == this.capacidade){
          this.capacidade = this.capacidade * 2;
          int[] novoArray = new int[this.capacidade];
          for(int i = 0; i < this.tamanho; i++){
            novoArray[i] = this.elementos[i];
          }
          this.elementos = novoArray;
        }
    }

    @Override
    public void adicionar(int element) {
    if(this.tamanho == this.capacidade){
            garantirCapacidade();
        }
        this.elementos[this.tamanho] = element;
        this.tamanho++;
    }

    @Override
    public void adicionarNoIndice(int element, int index) {
        if(index < 0 || index >= this.tamanho){
            throw new RuntimeException("Indice inválido: " + index);
        }
        if(this.tamanho == this.capacidade){
        garantirCapacidade();
    }
        for(int i = this.tamanho - 1; i >= index; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[index] = element;
        tamanho++;
    }

    
    @Override
    public void remover(int index) {
        if(index < 0 || index >= this.tamanho){
            throw new RuntimeException("Indice inválido: " + index);
        }
        int[] novoArray = new int[this.capacidade];
        int j = 0;
        for(int i = 0; i < this.tamanho; i++){
            if(i != index) {
                novoArray[j] = this.elementos[i];
                j++;
            }
        }
        this.elementos = novoArray;
        this.tamanho--;
    }

    @Override
    public void trocar(int element, int index) {
        if(index < 0 || index >= this.tamanho){
            throw new RuntimeException("Indice inválido: " + index);
        }
        this.elementos[index] = element;
    }

    @Override
    public int pegar(int index) {
        if(index < 0 || index >= this.tamanho){
            throw new RuntimeException("Indice inválido: " + index);
        }
        return this.elementos[index];
    }

    @Override
    public int pegarTamanhoLista() {

        return this.tamanho;
    }

    public void mostrarLista(){
        System.out.print("[ ");
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.elementos[i]);
            if (i < this.tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

    }

}
