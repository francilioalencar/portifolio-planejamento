package br.com.francilio.alencar.portifolioplanejamento.repositories;

import br.com.francilio.alencar.portifolioplanejamento.model.planejamento.PlanejamentoModel;
import br.com.francilio.alencar.portifolioplanejamento.model.swot.SwotModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwotRepository extends JpaRepository <SwotModel, Long> {
}
