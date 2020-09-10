package com.projetoinvidual.projetoindividualcontinuada;

public class Moto extends Veiculo {

    public Moto(String nome, Double valor, Double distanciaPercorrida, Integer tempo) {
        super(nome, valor, distanciaPercorrida, tempo);
    }

    @Override
    public Double converterTempo() {
        return getTempo() / 60.0;
    }

    @Override
    public Double velocidadeMedia() {
        return getTempo() / getDistanciaPercorrida();
    }
}