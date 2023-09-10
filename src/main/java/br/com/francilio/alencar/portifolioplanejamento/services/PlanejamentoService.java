package br.com.francilio.alencar.portifolioplanejamento.services;

import br.com.francilio.alencar.portifolioplanejamento.model.empresa.Empresa;
import br.com.francilio.alencar.portifolioplanejamento.model.empresa.EmpresaDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoModel;
import br.com.francilio.alencar.portifolioplanejamento.repositories.EmpresaRepository;
import br.com.francilio.alencar.portifolioplanejamento.repositories.PlanejamentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class PlanejamentoService {


    @Autowired
    PlanejamentoRepository planejamentoRepository;

    public String teste(){
        return "Retorno service";
    }


    @Transactional
    public ResponseEntity insertPlanejamento(PlanejamentoDTO planejamentoDTO, UriComponentsBuilder uriBuilder){
        var planejamentoModel  =   new PlanejamentoModel(planejamentoDTO);
        var uri = uriBuilder.path("/{id}").buildAndExpand(planejamentoModel.getId_plano()).toUri();
        planejamentoRepository.save(planejamentoModel);
        return  ResponseEntity.created(uri).body( new PlanejamentoDTO( planejamentoModel ));
    }

    @Transactional
    public ResponseEntity updatePlanejamento(PlanejamentoDTO planejamento_p){
        var planejamento  =   new PlanejamentoModel(planejamento_p);
        planejamentoRepository.save(planejamento);
        return  ResponseEntity.ok( new PlanejamentoDTO(planejamento));
    }


    public ResponseEntity selectPlanejamento(Long id_plano){

        return  ResponseEntity.ok( new PlanejamentoDTO( planejamentoRepository.getReferenceById(id_plano)   ));
    }


}
