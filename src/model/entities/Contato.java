package model.entities;

import java.util.Objects;

public class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Contato setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getNumero() {
        return numero;
    }

    public Contato setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNumero(), contato.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }

    @Override
    public String toString() {
        return "Contato: " + "nome " + nome + ", numero = " + numero;
    }
}
