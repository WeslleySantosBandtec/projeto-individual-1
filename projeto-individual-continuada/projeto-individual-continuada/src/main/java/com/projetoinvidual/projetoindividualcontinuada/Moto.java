package com.projetoinvidual.projetoindividualcontinuada;

public class Moto extends Veiculo {

    public Moto(String nome, Double valor, Double distanciaPercorrida, Integer tempo) {
        super(nome, valor, distanciaPercorrida, tempo);
    }

    @Override
    public Double velocidademedia() {
        return getTempo() / getDistanciaPercorrida();
    }
}