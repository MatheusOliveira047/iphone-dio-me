package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Telefone {
    private Integer numero;
    private List<Contato> contatos;

    public Telefone(Integer numero) {
        this.numero = numero;
        this.contatos = new ArrayList<>();
    }

    public void ligar(Integer numero){
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender(){
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz(String msg){
        System.out.println("Deixando mensagem");
        System.out.println(msg);
    }

    public void adicionarContato(String nome, Integer numero){
        contatos.add(new Contato(nome,numero));
    }

    public void removerContato(Integer numero){
        contatos.removeIf(contato -> Objects.equals(contato.getNumero(), numero));
    }

    public List<Contato> acharContatoNome(String nome){
        List<Contato> contatosEncontrados = new ArrayList<>();
        for(Contato c : contatos){
            if(Objects.equals(c.getNome(), nome)){
                contatosEncontrados.add(c);
            }
        }

        return contatosEncontrados;
    }

    public Contato acharContatoNumero(Integer numero){
        Contato contatosEncontrado = null;
        for(Contato c : contatos){
            if(Objects.equals(c.getNumero(), numero)){
                contatosEncontrado = c;
                break;
            }
        }

        return contatosEncontrado;
    }


}
