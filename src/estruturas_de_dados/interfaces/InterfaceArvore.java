package estruturas_de_dados.arvore;

public interface arvore {
    	// Adiciona um elemento na árvore
	public void adicionar(int element);
	
	// Verifica se um elemento está presente na árvore
	public boolean contem(int element);
	
	// Remove um elemento da árvore
	public void remover(int element);

}
