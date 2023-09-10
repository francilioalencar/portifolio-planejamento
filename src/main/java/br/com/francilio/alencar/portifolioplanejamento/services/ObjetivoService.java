package br.com.francilio.alencar.portifolioplanejamento.services;

import br.com.francilio.alencar.portifolioplanejamento.model.objetivos.ObjetivoDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.objetivos.ObjetivoModel;
import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoDTO;
import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoModel;
import br.com.francilio.alencar.portifolioplanejamento.repositories.ObjetivoRepository;
import br.com.francilio.alencar.portifolioplanejamento.repositories.PlanejamentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ObjetivoService {


    @Autowired
    ObjetivoRepository objetivoRepository;

    public String teste(){
        return "Retorno service";
    }


    @Transactional
    public ResponseEntity insertObjetivo(ObjetivoDTO objetivoDTO, UriComponentsBuilder uriBuilder){
        var objetivo  =   new ObjetivoModel(objetivoDTO);
        var uri = uriBuilder.path("/{id}").buildAndExpand(objetivo.getId_objetivo()).toUri();
        objetivoRepository.save(objetivo);
        return  ResponseEntity.created(uri).body( new ObjetivoDTO( objetivo ));
    }

    @Transactional
    public ResponseEntity updateObjetivo(ObjetivoDTO objetivo_p){
        var objetivo  =   new ObjetivoModel(objetivo_p);
        objetivoRepository.save(objetivo);
        return  ResponseEntity.ok( new ObjetivoDTO(objetivo));
    }


    public ResponseEntity selectObjetivo(Long id_objetivo){

        return  ResponseEntity.ok( new ObjetivoDTO( objetivoRepository.getReferenceById(id_objetivo)   ));
    }


}
