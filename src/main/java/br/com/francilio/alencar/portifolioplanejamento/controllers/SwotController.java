package br.com.francilio.alencar.portifolioplanejamento.controllers;

import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.swot.SwotDTO;
import br.com.francilio.alencar.portifolioplanejamento.services.PlanejamentoService;
import br.com.francilio.alencar.portifolioplanejamento.services.SwotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("swot")
@CrossOrigin("*")

public class SwotController {


    @Autowired
    SwotService swotService;

    @GetMapping("/{id_swot}")
    public ResponseEntity select(@PathVariable Long id_swot){

        return ResponseEntity.ok(swotService.selectSwot(id_swot)) ;
    }

    @PostMapping("/nova")
    public ResponseEntity inserir(@RequestBody SwotDTO swotDTO, UriComponentsBuilder uriBuilder){
        return swotService.insertSwot(swotDTO, uriBuilder);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody SwotDTO swotDTO){
        return swotService.updateSwot(swotDTO);
    }


}
