package Entidades;

import Interfaces.Cliente;

public class Aluguel {

    private Veiculo veiculo;
    private Cliente cliente;
    private int dias;

    public Aluguel(Veiculo veiculo, Cliente cliente, int dias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dias = dias;
    }

    public void calcularValorFinal(){
        double totalDiaria = calcularTotalBruto();
        double desconto = calcularTotalDesconto(totalDiaria);
        System.out.printf("\n.:: EXTRATO DA LOCAÇÃO ::." +
                        "\nCLIENTE = %s" +
                        "\nVEICULO = %s" +
                        "\nQUANTIDADE DE DIÁRIAS = %d" +
                        "\nTOTAL BRUTO = R$ %.2f" +
                        "\nDESCONTO = R$ %.2f" +
                        "\nVALOR TOTAL DO ALUGUEL = R$ %.2f\n", cliente, veiculo, dias, totalDiaria, desconto, (totalDiaria - desconto));
    }

    private double calcularTotalBruto(){
        return veiculo.getTipoVeiculo().getPrecoBase() * dias;
    }

    private double calcularTotalDesconto(double valor){
        return valor * cliente.retornarDesconto(dias);
    }
}
