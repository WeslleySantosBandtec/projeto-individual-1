package com.projetoinvidual.projetoindividualcontinuada;

public class Carro extends Veiculo{

    public Carro(String nome, Double valor, Double distanciaPercorrida, Integer tempo) {
        super(nome, valor, distanciaPercorrida, tempo);
    }

    @Override
    public Double velocidademedia() {
        return getTempo() / getDistanciaPercorrida();
    }
}
