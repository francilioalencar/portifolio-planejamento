package br.com.francilio.alencar.portifolioplanejamento.controllers;

import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoDTO;
import br.com.francilio.alencar.portifolioplanejamento.services.PlanejamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("planejamento")
@CrossOrigin("*")

public class PlanejamentoController {


    @Autowired
    PlanejamentoService planejamentoService;

    @GetMapping("/{id_planejamento}")
    public ResponseEntity select(@PathVariable Long id_planejamento){

        return ResponseEntity.ok(planejamentoService.selectPlanejamento(id_planejamento)) ;
    }

    @PostMapping("/nova")
    public ResponseEntity inserir(@RequestBody PlanejamentoDTO planejamento_p, UriComponentsBuilder uriBuilder){
        return planejamentoService.insertPlanejamento(planejamento_p, uriBuilder);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody PlanejamentoDTO planejamentoDTO){
        return planejamentoService.updatePlanejamento(planejamentoDTO);
    }


}
