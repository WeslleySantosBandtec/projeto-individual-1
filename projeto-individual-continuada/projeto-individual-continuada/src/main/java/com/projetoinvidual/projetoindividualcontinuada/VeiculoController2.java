package com.projetoinvidual.projetoindividualcontinuada;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController2 {

    List<Veiculo> listaVeiculos = new ArrayList<>();

    // cadastrar carro
    @PostMapping("/cadastrar/carros")
    public ResponseEntity cadastrarCarro(@RequestBody Carro carro1) {
        listaVeiculos.add(carro1);
        return ResponseEntity.created(null).build();
    }

    // cadastrar motos
    @PostMapping("/cadastrar/motos")
    public ResponseEntity cadastrarMoto(@RequestBody Moto moto1) {
        listaVeiculos.add(moto1);
        return ResponseEntity.created(null).build();
    }

    // mostrar tudo
    @GetMapping("/mostrar/tudo")
    public ResponseEntity mostrar() {
        if (!listaVeiculos.isEmpty()) {
            return ResponseEntity.ok(listaVeiculos);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    // mostrar item especifico
    @GetMapping("/mostrar/{indice}")
    public ResponseEntity mostrarItem(@PathVariable Integer indice) {
        if (!listaVeiculos.isEmpty()) {
            return ResponseEntity.ok(listaVeiculos.get(indice - 1));
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    // Deletar
    @DeleteMapping("/deletar/{indice}")
    public ResponseEntity deletar (@PathVariable Integer indice) {
        if (listaVeiculos.size() >= indice){
            listaVeiculos.remove(indice -1);
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }


}
