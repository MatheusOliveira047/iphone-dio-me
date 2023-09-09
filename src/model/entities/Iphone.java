package model.entities;

import model.interfaces.NavegadoInternet;
import model.interfaces.ReprodutorMusical;

public class Iphone extends Telefone implements ReprodutorMusical, NavegadoInternet {

    public Iphone(Integer numero) {
        super(numero);
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Pagina Web: " + pagina);

    }


    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atulizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Pagina anterior");
    }

    @Override
    public void avacarPagina() {
        System.out.println("Proxima pagina");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando " + musica);

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        tocar(musica);
    }
}
