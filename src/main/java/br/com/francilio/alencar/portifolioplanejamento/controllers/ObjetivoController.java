package br.com.francilio.alencar.portifolioplanejamento.controllers;

import br.com.francilio.alencar.portifolioplanejamento.model.objetivos.ObjetivoDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoDTO;
import br.com.francilio.alencar.portifolioplanejamento.services.ObjetivoService;
import br.com.francilio.alencar.portifolioplanejamento.services.PlanejamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("objetivo")
@CrossOrigin("*")

public class ObjetivoController {


    @Autowired
    ObjetivoService objetivoService;

    @GetMapping("/{id_objetivo}")
    public ResponseEntity select(@PathVariable Long id_objetivo){

        return ResponseEntity.ok(objetivoService.selectObjetivo(id_objetivo)) ;
    }

    @PostMapping("/nova")
    public ResponseEntity inserir(@RequestBody ObjetivoDTO objetivoDTO, UriComponentsBuilder uriBuilder){
        return objetivoService.insertObjetivo(objetivoDTO, uriBuilder);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody ObjetivoDTO objetivoDTO){
        return objetivoService.updateObjetivo(objetivoDTO);
    }


}
