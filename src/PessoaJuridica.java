import Interfaces.Cliente;

public class PessoaJuridica implements Cliente {

    private static final double PORCENTAGEM_DESCONTO = 0.10;
    private String cnpj;
    private String empresa;

    public PessoaJuridica(String cnpj, String empresa) {
        this.empresa = empresa;
        this.cnpj = cnpj;
    }

    @Override
    public double retornarDesconto(int dias) {
        return dias > 3 ? PORCENTAGEM_DESCONTO : 0.00;
    }

    @Override
    public String toString() {
        return String.format("[ Tipo = Pessoa Jurídica | CNPJ = %s | Empresa = %s ]", cnpj, empresa);
    }
}
