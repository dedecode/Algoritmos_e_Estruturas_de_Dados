import estruturas_de_dados.listas.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList pipicoMatador = new ArrayList();
        pipicoMatador.adicionar(0);
        pipicoMatador.adicionar(1);
        pipicoMatador.adicionar(2);
        pipicoMatador.adicionar(3);
        pipicoMatador.adicionar(4);
        pipicoMatador.adicionar(5);
        pipicoMatador.adicionar(6);
        pipicoMatador.adicionar(7);
        pipicoMatador.mostrarLista();
        pipicoMatador.adicionarNoIndice(30,4);
        pipicoMatador.mostrarLista();
        pipicoMatador.adicionarNoIndice(30,6);
        pipicoMatador.mostrarLista();
        pipicoMatador.remover(4);
        pipicoMatador.mostrarLista();
        pipicoMatador.remover(5);
        pipicoMatador.mostrarLista();
        System.out.println(pipicoMatador.pegarTamanhoLista());
        //System.out.println(pipicoMatador.pegar(7));
        //pipicoMatador.trocar(20,2);
        for(int i=8; i <= 200; i++){
            pipicoMatador.adicionar(i);
        }
        pipicoMatador.mostrarLista();
        System.out.println(pipicoMatador.capacidade);
        }
}
