package br.com.francilio.alencar.portifolioplanejamento.model.objetivos;

public record ObjetivoDTO(
        Long id_objetivo,
        Long id_empresa,
        Long id_planejamento,
        String ds_objetivo,
        String ds_pronto

) {
    public ObjetivoDTO(ObjetivoModel objetivo) {

        this(
                objetivo.getId_objetivo(),
                objetivo.getId_empresa(),
                objetivo.getId_planejamento(),
                objetivo.getDs_objetivo(),
                objetivo.getDs_pronto()
        );
    }
}
