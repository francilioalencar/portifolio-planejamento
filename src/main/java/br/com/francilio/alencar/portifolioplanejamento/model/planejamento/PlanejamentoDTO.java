package br.com.francilio.alencar.portifolioplanejamento.model.planejamento;

public record PlanejamentoDTO(

        Long id_plano,
        Long id_empresa,
        String ds_plano,
        String ds_ano_inicio,
        String nr_perido,
        String ds_tipo_periodo


) {

    public PlanejamentoDTO(PlanejamentoModel planejamento){

        this(
                planejamento.getId_plano(),
                planejamento.getId_empresa(),
                planejamento.getDs_plano(),
                planejamento.getDs_ano_inicio(),
                planejamento.getNr_perido(),
                planejamento.getDs_tipo_periodo()


        );

    }

}
