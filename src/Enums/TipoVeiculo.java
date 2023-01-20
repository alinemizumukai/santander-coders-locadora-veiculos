package Enums;

public enum TipoVeiculo {

    PEQUENO(1,"Carro Pequeno", 100.0),
    MEDIO(2, "Carro Médio", 150.0),
    SUV(3, "SUV", 200.0);

    private int opcao;
    private String label;

    private double precoBase;

    private TipoVeiculo(int opcao, String label, double precoBase){
        this.opcao = opcao;
        this.label = label;
        this.precoBase = precoBase;
    }

    public int getOpcao() {
        return opcao;
    }

    public String getLabel() {
        return label;
    }

    public double getPrecoBase() {
        return precoBase;
    }

}
