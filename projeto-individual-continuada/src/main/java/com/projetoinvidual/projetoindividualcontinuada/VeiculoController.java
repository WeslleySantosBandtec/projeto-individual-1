package com.projetoinvidual.projetoindividualcontinuada;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

//@RestController
//@RequestMapping("/veiculos")

public class VeiculoController {

    private List<Carro> listaCarro = new ArrayList<>();
    private List<Moto> listaMoto = new ArrayList<>();
    private List<Veiculo> listaVeiculo = new ArrayList<>();


    @GetMapping("carro/consultarCarro")
    public List<Carro> getCarro() {
        return listaCarro;
    }

    @GetMapping("moto/consultarMoto")
    public List<Moto> getListaMoto() {
        return listaMoto;
    }

    @GetMapping("carro/consultarCarro/{indice}")
    public Carro recuperarCarro(@PathVariable Integer indice) {
        return listaCarro.get(indice - 1);
    }

    @GetMapping("moto/consultarMoto/{indice}")
    public Moto recuperarMoto(@PathVariable Integer indice) {
        return listaMoto.get(indice - 1);
    }

    @PostMapping("carro/cadastrarCarro")
    public void cadastrarCarro(@RequestBody Carro carro1) {
        listaCarro.add(carro1);
    }

    @PostMapping("moto/cadastrarMoto")
    public void cadastrarMoto(@RequestBody Moto moto1) {
        listaMoto.add(moto1);
    }

    @DeleteMapping("carro/deletarCarro{indice}")
    public void deletarCarro(@PathVariable Integer indice) {
        listaCarro.remove(indice - 1);
    }

    @DeleteMapping("/deletarMoto/{indice]")
    public void deletarMoto(@PathVariable Integer indice) {
        listaMoto.remove(indice - 1);
    }

   
}
