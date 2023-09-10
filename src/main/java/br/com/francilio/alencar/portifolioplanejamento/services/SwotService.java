package br.com.francilio.alencar.portifolioplanejamento.services;

import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoModel;
import br.com.francilio.alencar.portifolioplanejamento.model.swot.SwotDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.swot.SwotModel;
import br.com.francilio.alencar.portifolioplanejamento.repositories.PlanejamentoRepository;
import br.com.francilio.alencar.portifolioplanejamento.repositories.SwotRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SwotService {


    @Autowired
    SwotRepository swotRepository;

    public String teste(){
        return "Retorno service";
    }


    @Transactional
    public ResponseEntity insertSwot(SwotDTO swotDTO, UriComponentsBuilder uriBuilder){
        var swot  =   new SwotModel(swotDTO);
        var uri = uriBuilder.path("/{id}").buildAndExpand(swot.getId_swot()).toUri();
        swotRepository.save(swot);
        return  ResponseEntity.created(uri).body( new SwotDTO( swot ));
    }

    @Transactional
    public ResponseEntity updateSwot(SwotDTO swot_p){
        var swot  =   new SwotModel(swot_p);
        swotRepository.save(swot);
        return  ResponseEntity.ok( new SwotDTO(swot));
    }


    public ResponseEntity selectSwot(Long id_swot){

        return  ResponseEntity.ok( new SwotDTO( swotRepository.getReferenceById(id_swot)   ));
    }


}
