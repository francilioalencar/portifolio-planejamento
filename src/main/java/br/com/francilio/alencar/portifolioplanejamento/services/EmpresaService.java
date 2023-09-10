package br.com.francilio.alencar.portifolioplanejamento.services;

import br.com.francilio.alencar.portifolioplanejamento.model.empresa.Empresa;
import br.com.francilio.alencar.portifolioplanejamento.model.empresa.EmpresaDTO;
import br.com.francilio.alencar.portifolioplanejamento.repositories.EmpresaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class EmpresaService {


    @Autowired
    EmpresaRepository empresaRepository;

    public String teste(){
        return "Retorno service";
    }


    @Transactional
    public ResponseEntity insertEmpresa(EmpresaDTO empresa_p, UriComponentsBuilder uriBuilder){
        var empesa  =   new Empresa(empresa_p);
        var uri = uriBuilder.path("/empresa/{id}").buildAndExpand(empesa.getId_empresa()).toUri();
        empresaRepository.save(empesa);
        return  ResponseEntity.created(uri).body( new EmpresaDTO( empesa ));
    }

    @Transactional
    public ResponseEntity updateEmpresa(EmpresaDTO empresa_p){
        var empesa  =   new Empresa(empresa_p);
        empresaRepository.save(empesa);
        return  ResponseEntity.ok( new EmpresaDTO( empesa ));
    }


    public ResponseEntity selectEmpresa(Long id_empresa){

        return  ResponseEntity.ok( new EmpresaDTO( empresaRepository.getReferenceById(id_empresa)   ));
    }


}
