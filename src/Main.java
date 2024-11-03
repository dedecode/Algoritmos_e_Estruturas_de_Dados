import estruturas_de_dados.listas.ArrayList;
import estruturas_de_dados.listas.ListaLigada;

public class Main {
    public static void main(String[] args) {
        // Criação de uma nova lista ligada
        ListaLigada lista = new ListaLigada();
                
        // Teste: adicionar elementos ao final da lista
        lista.adicionar(5);
        lista.adicionar(10);
        lista.adicionar(15);
        System.out.print("Após adicionar 5, 10 e 15: ");
        lista.mostrarLista();  // Esperado: [ 5, 10, 15 ]
        
        // Teste: adicionar elemento em um índice específico
        lista.adicionarNoIndice(20, 1); // Insere 20 na posição 1
        System.out.print("Após adicionar 20 no índice 1: ");
        lista.mostrarLista();  // Esperado: [ 5, 20, 10, 15 ]
        
        // Teste: pegar elemento de um índice
        int elemento = lista.pegar(2); // Deveria retornar 10
        System.out.println("Elemento no índice 2: " + elemento); // Esperado: 10
        
        // Teste: remover elemento de um índice
        lista.remover(1); // Remove o elemento no índice 1 (20)
        System.out.print("Após remover o índice 1: ");
        lista.mostrarLista();  // Esperado: [ 5, 10, 15 ]
        
        // Teste: adicionar e remover no início
        lista.adicionarNoIndice(3, 0); // Adiciona 3 no índice 0
        System.out.print("Após adicionar 3 no início: ");
        lista.mostrarLista();  // Esperado: [ 3, 5, 10, 15 ]
        
        lista.remover(0); // Remove o elemento no índice 0 (3)
        System.out.print("Após remover o índice 0: ");
        lista.mostrarLista();  // Esperado: [ 5, 10, 15 ]
        
        // Teste: pegar tamanho da lista
        int tamanho = lista.pegarTamanhoLista();
        System.out.println("Tamanho da lista: " + tamanho); // Esperado: 3

        lista.mostrarLista();

        lista.adicionar(20);
        lista.adicionar(25);
        lista.mostrarLista();
        lista.trocar(99, 4);
        lista.mostrarLista();
        /*ListaLigada flavioCaçaRato = new ListaLigada();
        flavioCaçaRato.adicionar(0);
        flavioCaçaRato.adicionar(1);
        flavioCaçaRato.adicionar(3);
        flavioCaçaRato.adicionar(4);
        flavioCaçaRato.adicionarNoIndice(2, 2);
        flavioCaçaRato.adicionarNoIndice(-1, 0);
        flavioCaçaRato.adicionarNoIndice(5, 6);
        flavioCaçaRato.mostrarLista();*/
        /*for (int i = 0; i < flavioCaçaRato.pegarTamanhoLista(); i++) {
            System.out.println(flavioCaçaRato.pegar(i));
        }
        System.out.println("tamanho da lista: "+flavioCaçaRato.pegarTamanhoLista());
        System.out.println("Lista após remoção: ");
        flavioCaçaRato.remover(0);
        for (int i = 0; i < flavioCaçaRato.pegarTamanhoLista(); i++) {
            System.out.println(flavioCaçaRato.pegar(i));
        }
        System.out.println("tamanho da lista: "+flavioCaçaRato.pegarTamanhoLista());
        System.out.println("Lista após remoção: ");
        flavioCaçaRato.remover(5);
        flavioCaçaRato.remover(4);
        for (int i = 0; i < flavioCaçaRato.pegarTamanhoLista(); i++) {
            System.out.println(flavioCaçaRato.pegar(i));
        }
        System.out.println("tamanho da lista: "+flavioCaçaRato.pegarTamanhoLista());
        System.out.println("teste remoção lista vazia: ");
        int n = 0;  
        do{
            flavioCaçaRato.remover(0);
            System.out.println("tamanho da lista: "+flavioCaçaRato.pegarTamanhoLista());
            n++;
        }while(n<12);
        System.out.println("saí do loop.");*/
         }
}
