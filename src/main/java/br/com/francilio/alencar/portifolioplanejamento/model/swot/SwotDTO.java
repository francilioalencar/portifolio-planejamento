package br.com.francilio.alencar.portifolioplanejamento.model.swot;

public record SwotDTO(

        Long id_swot,
        Long id_planejamento,
        Long id_empresa,
        Long id_objetivo,
        String ds_swot,
        String ie_relevancia,
        String ie_desempenho

) {
    public SwotDTO(SwotModel swot) {
        this(
                swot.getId_swot(),
                swot.getId_planejamento(),
                swot.getId_empresa(),
                swot.getId_objetivo(),
                swot.getDs_swot(),
                swot.getIe_relevancia(),
                swot.getIe_desempenho()
        );

    }
}
