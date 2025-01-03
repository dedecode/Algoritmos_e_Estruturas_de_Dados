package estruturas_de_dados.arvore;

import estruturas_de_dados.interfaces.InterfaceArvoreBinaria;

public class ArvoreBuscaBinaria implements InterfaceArvoreBinaria {

    private class No {
        int valor;
        No esquerdo, direito;

        public No(int valor) {
            this.valor = valor;
            esquerdo = null;
            direito = null;
        }
    }

    private No raiz;
    
    public ArvoreBuscaBinaria() {
        raiz = null;
    }

    @Override
    public void adicionar(int element) {
        raiz = adicionarRecursivo(raiz, element);
    }

    private No adicionarRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerdo = adicionarRecursivo(atual.esquerdo, valor);
        } else if (valor > atual.valor) {
            atual.direito = adicionarRecursivo(atual.direito, valor);
        }

        return atual;
    }

    @Override
    public boolean contem(int element) {
        return contemRecursivo(raiz, element);
    }

    private boolean contemRecursivo(No atual, int valor) {
        if (atual == null) {
            return false;
        }

        if (valor == atual.valor) {
            return true;
        }

        return valor < atual.valor ? contemRecursivo(atual.esquerdo, valor) : contemRecursivo(atual.direito, valor);
    }

    @Override
    public void remover(int element) {
        raiz = removerRecursivo(raiz, element);
    }

    private No removerRecursivo(No atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (valor == atual.valor) {
            if (atual.esquerdo == null && atual.direito == null) {
                return null;
            }

            if (atual.esquerdo == null) {
                return atual.direito;
            }

            if (atual.direito == null) {
                return atual.esquerdo;
            }

            int menorValor = encontrarMenorValor(atual.direito);
            atual.valor = menorValor;
            atual.direito = removerRecursivo(atual.direito, menorValor);
            return atual;
        }

        if (valor < atual.valor) {
            atual.esquerdo = removerRecursivo(atual.esquerdo, valor);
        } else {
            atual.direito = removerRecursivo(atual.direito, valor);
        }

        return atual;
    }

    private int encontrarMenorValor(No raiz) {
        return raiz.esquerdo == null ? raiz.valor : encontrarMenorValor(raiz.esquerdo);
    }

    @Override
    public int getFilhoEsquerda() {
        return raiz.esquerdo != null ? raiz.esquerdo.valor : -1;
    }

    @Override
    public int getFilhoDireita() {
        return raiz.direito != null ? raiz.direito.valor : -1;
    }

    @Override
    public void percursoPreOrdem() {
        percursoPreOrdemRecursivo(raiz);
}
// deixar mais bonitinho o print do percuso
private void percursoPreOrdemRecursivo(No atual) {
    if (atual != null) {
        System.out.print(atual.valor + " "); // Visita o nó
        percursoPreOrdemRecursivo(atual.esquerdo); // Percorre o filho esquerdo
        percursoPreOrdemRecursivo(atual.direito); // Percorre o filho direito
    }
}

    @Override
    public void percursoEmOrdem() {
        percursoEmOrdemRecursivo(raiz);
}

private void percursoEmOrdemRecursivo(No atual) {
    if (atual != null) {
        percursoEmOrdemRecursivo(atual.esquerdo); // Percorre o filho esquerdo
        System.out.print(atual.valor + " "); // Visita o nó
        percursoEmOrdemRecursivo(atual.direito); // Percorre o filho direito
    }
}

    @Override
    public void percursoPosOrdem() {
        percursoPosOrdemRecursivo(raiz);
}

private void percursoPosOrdemRecursivo(No atual) {
    if (atual != null) {
        percursoPosOrdemRecursivo(atual.esquerdo); // Percorre o filho esquerdo
        percursoPosOrdemRecursivo(atual.direito); // Percorre o filho direito
        System.out.print(atual.valor + " "); // Visita o nó
    }
}

}

