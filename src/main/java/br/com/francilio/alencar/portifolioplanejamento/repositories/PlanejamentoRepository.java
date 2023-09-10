package br.com.francilio.alencar.portifolioplanejamento.repositories;

import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanejamentoRepository extends JpaRepository <PlanejamentoModel, Long> {
}
