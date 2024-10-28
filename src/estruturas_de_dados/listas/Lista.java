package estruturas_de_dados.listas;

public interface Lista {

        void adicionar(int element);

        void adicionarNoIndice(int element, int index);

        void remover(int index);

        void trocar(int element, int index);

        public int pegar(int index);

        public int pegarTamanhoLista();

}
