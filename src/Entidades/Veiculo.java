package Entidades;

import Enums.TipoVeiculo;

public class Veiculo {

    private TipoVeiculo tipoVeiculo;
    private String placa;

    public Veiculo(String placa, TipoVeiculo tipoVeiculo) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    @Override
    public String toString() {
        return String.format("[ Tipo = %s | Placa = %s | Preço Base (diária) = R$ %.2f ]",
                tipoVeiculo.getLabel(), placa, tipoVeiculo.getPrecoBase());
    }
}
