package br.com.francilio.alencar.portifolioplanejamento.repositories;

import br.com.francilio.alencar.portifolioplanejamento.model.objetivos.ObjetivoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjetivoRepository extends JpaRepository <ObjetivoModel, Long> {
}
