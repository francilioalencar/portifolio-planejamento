package br.com.francilio.alencar.portifolioplanejamento.repositories;

import br.com.francilio.alencar.portifolioplanejamento.model.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository <Empresa, Long> {
}
