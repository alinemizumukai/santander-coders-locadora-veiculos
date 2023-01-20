import Interfaces.Cliente;

public class PessoaFisica implements Cliente {

    private static final double PORCENTAGEM_DESCONTO = 0.05;
    private String cpf;
    private String nome;

    public PessoaFisica(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public double retornarDesconto(int dias) {
        return dias > 5 ? PORCENTAGEM_DESCONTO : 0.00;
    }

    @Override
    public String toString() {
        return String.format("[ Tipo = Pessoa Física | CPF = %s | Nome = %s ]", cpf, nome);
    }
}
