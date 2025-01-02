package estruturas_de_dados.interfaces;

public interface InterfaceLista {

        void adicionar(int elemento);

        void adicionarNoIndice(int elemento, int index);

        void remover(int index);

        void trocar(int elemento, int index);

        public int pegar(int index);

        public int pegarTamanhoLista();

}
