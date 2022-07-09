package com.workspace.br.classes;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "{" +
                "nome:'" + nome + '\'' +
                ", genero:'" + genero + '\'' +
                ", tempoEpisodio:" + tempoEpisodio +
                '}';
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return Objects.equals(getNome(), serie.getNome()) && Objects.equals(getGenero(), serie.getGenero()) && Objects.equals(getTempoEpisodio(), serie.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }

    @Override
    public int compareTo(Serie e) {
        return this.getGenero().compareTo(e.getGenero());
    }
}
