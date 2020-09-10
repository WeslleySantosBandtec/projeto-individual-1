package com.projetoinvidual.projetoindividualcontinuada;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController2 {

    List<Veiculo> listaVeiculos = new ArrayList<>();

    // URL: veiculos/cadastrar/carros
    // cadastrar carro
    @PostMapping("/cadastrar/carros")
    public ResponseEntity cadastrarCarro(@RequestBody Carro carro1) {
        listaVeiculos.add(carro1);
        return ResponseEntity.created(null).build();
    }

    // vaiculos/cadastrar/motos
    // cadastrar motos
    @PostMapping("/cadastrar/motos")
    public ResponseEntity cadastrarMoto(@RequestBody Moto moto1) {
        listaVeiculos.add(moto1);
        return ResponseEntity.created(null).build();
    }

    // veiculos/mostrar/tudo
    // mostrar tudo
    @GetMapping("/mostrar/tudo")
    public ResponseEntity mostrar() {
        if (!listaVeiculos.isEmpty()) {
            return ResponseEntity.ok(listaVeiculos);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    // veiculos/mostrar/ {indice}
    // mostrar item especifico
    @GetMapping("/mostrar/{indice}")
    public ResponseEntity mostrarItem(@PathVariable Integer indice) {
        if (!listaVeiculos.isEmpty()) {
            return ResponseEntity.ok(listaVeiculos.get(indice - 1));
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    // veiculos/deletar/{indice}
    // Deletar
    @DeleteMapping("/deletar/{indice}")
    public ResponseEntity deletar(@PathVariable Integer indice) {
        if (listaVeiculos.size() >= indice) {
            listaVeiculos.remove(indice - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


//    // veiculos/calcular/distancia/percorrida
//    @GetMapping("/calcular/distancia/percorrida")
//    public ResponseEntity mostrarDistancia() {
////        Double acumulador = 0.0;
////        if (!listaVeiculos.isEmpty()) {
////            for (Veiculo v : listaVeiculos) {
////                acumulador += v.getDistanciaPercorrida();
////                return  ResponseEntity.ok(acumulador);
////            }
////        } else {
////            return ResponseEntity.noContent().build();
////        }
////        return ResponseEntity.noContent().build();
////    }


}
