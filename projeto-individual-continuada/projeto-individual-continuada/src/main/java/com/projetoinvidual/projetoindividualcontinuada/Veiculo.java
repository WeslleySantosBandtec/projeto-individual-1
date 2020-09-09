package com.projetoinvidual.projetoindividualcontinuada;

public abstract class  Veiculo {

    private String nome;
    private Double valor;
    private Double distanciaPercorrida;
    private Integer tempo;

    public Veiculo(String nome, Double valor, Double distanciaPercorrida, Integer tempo) {
        this.nome = nome;
        this.valor = valor;
        this.distanciaPercorrida = distanciaPercorrida;
        this.tempo = tempo;
    }

    public abstract Double velocidademedia ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(Double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }
}

