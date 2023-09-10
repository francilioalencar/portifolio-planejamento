package br.com.francilio.alencar.portifolioplanejamento.controllers;

import br.com.francilio.alencar.portifolioplanejamento.model.empresa.EmpresaDTO;
import br.com.francilio.alencar.portifolioplanejamento.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("empresa")
@CrossOrigin("*")

public class EmpresaController {


    @Autowired
    EmpresaService empresaService;

    @GetMapping("/{id_empresa}")
    public ResponseEntity select(@PathVariable Long id_empresa){

        return ResponseEntity.ok(empresaService.selectEmpresa(id_empresa)) ;
    }

    @PostMapping("/nova")
    public ResponseEntity inserir(@RequestBody EmpresaDTO empresa_p, UriComponentsBuilder uriBuilder){
        return empresaService.insertEmpresa(empresa_p, uriBuilder);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody EmpresaDTO empresa_p){
        return empresaService.updateEmpresa(empresa_p);
    }


}
